package com.example.androidmockuser.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidmockuser.R
import com.example.androidmockuser.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false).apply {
            showFragment(HomeFragment())

            bnvMain.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.navigation_home -> {
                        showFragment(HomeFragment())

                        return@setOnNavigationItemSelectedListener true

                    }
                    R.id.navigation_list -> {
                        showFragment(ListFragment())

                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.navigation_profile -> {
                        showFragment(ProfileFragment())

                        return@setOnNavigationItemSelectedListener true
                    }
                }
                false
            }

        }
        return binding.root
    }

    private fun showFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction().replace(R.id.fl_main, fragment).commit()
    }

}