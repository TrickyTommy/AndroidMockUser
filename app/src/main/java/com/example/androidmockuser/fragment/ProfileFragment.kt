package com.example.androidmockuser.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidmockuser.OnCustomScroll
import com.example.androidmockuser.adapter.UserAdapter
import com.example.androidmockuser.clients.UserClient
import com.example.androidmockuser.databinding.FragmentProfileBinding
import com.example.androidmockuser.respons.UserResponse
import id.kharozim.androidmockuserapi.model.ResponseModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private val adapter by lazy { UserAdapter(requireContext()) }
    private var page = 1
    private var list = mutableListOf<ResponseModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileBinding.inflate(inflater, container, false).apply {
            rvUsersFragment.adapter = adapter
            rvUsersFragment.layoutManager?.let {
                rvUsersFragment.addOnScrollListener(object : OnCustomScroll(it, 3) {
                    override fun onLoadMore(page: Int, totalItemsCount: Int) {
                        if (page <= 10) {
                            loadMore()
                        }
                    }
                })
            }


        }

        getAllUsers()

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun getAllUsers(){
        binding.pbLoading.visibility = View.VISIBLE

        UserClient.userService.getAllUser(page = page).enqueue(object : Callback<UserResponse> {
            override fun onResponse(
                call: Call<UserResponse>,
                response: Response<UserResponse>
            ) {
                if (response.isSuccessful && response != null) {
                    response.body()?.let {
                        adapter.setData(it.results as MutableList<ResponseModel>)
                    if (page == 1){
                        adapter.list = it.results.toMutableList()

                    }else{
                        adapter.addUsers(it.results)
                    }
                        binding.pbLoading.visibility = View.GONE

                        list.addAll(it.results)

                        page++

                    }
                }
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                if (page > 1) binding.pbLoading.visibility = View.GONE

                t.printStackTrace()

                Toast.makeText(
                    requireContext(),
                    t.message ?: "Oops something went wrong",
                    Toast.LENGTH_SHORT
                ).show()            }
        })
    }
    private fun loadMore() {
        getAllUsers()
    }


}