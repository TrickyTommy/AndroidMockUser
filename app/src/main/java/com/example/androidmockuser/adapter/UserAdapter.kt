package com.example.androidmockuser.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidmockuser.databinding.ItemUserBinding
import id.kharozim.androidmockuserapi.model.ResponseModel


class UserAdapter(private val context: Context) : RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    private var list = listOf<ResponseModel>()
    fun setData(data: List<ResponseModel>){
        this.list=data
        notifyDataSetChanged()
    }


    inner class ViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(result: ResponseModel) {
            binding.run {
                tvName.text = result.name.first
                tvCity.text = result.location.city
                tvPhone.text = result.phone
                Glide.with(binding.root).load(result.picture.medium).circleCrop().into(ivImage)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        return ViewHolder(ItemUserBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
    }

