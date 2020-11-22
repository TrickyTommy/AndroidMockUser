package com.example.androidmockuser.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.androidmockuser.R


class RegisterFragment : Fragment(), View.OnClickListener {
    var navController: NavController? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_register).setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when(v!!.id)
        {
            R.id.btn_register -> navController!!.navigate(R.id.action_registerFragment_to_mainFragment)
        }



    }

}