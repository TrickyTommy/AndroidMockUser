package com.example.androidmockuser.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.androidmockuser.R
import kotlinx.android.synthetic.main.fragment_register.it_email
import kotlinx.android.synthetic.main.fragment_register.it_password


class LoginFragment : Fragment(), View.OnClickListener {


    private lateinit var binding: LoginFragment
    var navController: NavController? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
        setView()
        setListener()
    }



    private fun setView(){
        (activity as AppCompatActivity).supportActionBar?.hide()
    }

    private fun setListener(){
        binding.it_email.addTextChangedListener(emailListener)
        binding.it_password.addTextChangedListener(passwordListener)
    }


    private val emailListener = object: TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }

        override fun afterTextChanged(s: Editable?) {
        }

        

    }

    private val passwordListener = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }

        override fun afterTextChanged(s: Editable?) {
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_login).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_register).setOnClickListener(this)

    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_login -> navController!!.navigate(R.id.action_loginFragment_to_mainFragment)
            R.id.btn_register -> navController!!.navigate(R.id.action_loginFragment_to_registerFragment)
        }


    }

}