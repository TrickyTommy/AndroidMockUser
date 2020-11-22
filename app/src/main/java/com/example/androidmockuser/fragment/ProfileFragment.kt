package com.example.androidmockuser.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidmockuser.adapter.UserAdapter
import com.example.androidmockuser.clients.UserClient
import com.example.androidmockuser.databinding.FragmentProfileBinding
import com.example.androidmockuser.respons.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private val adapter by lazy { UserAdapter(requireContext()) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileBinding.inflate(inflater, container, false).apply {
            rvUsersFragment.adapter = adapter
            UserClient.userService.getAllUser().enqueue(object : Callback<UserResponse> {
                override fun onResponse(
                    call: Call<UserResponse>,
                    response: Response<UserResponse>
                ) {
                    if (response.isSuccessful && response != null) {
                        response.body()?.let {
                            adapter.setData(it.results)
                        }
                    }
                }

                override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })
        }
        // Inflate the layout for this fragment
        return binding.root
    }

}