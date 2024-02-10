package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.util.logging.Logger

class LoginFragment : Fragment() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    companion object {
        private val logger = Logger.getLogger("MyLogger")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logger.info("On view created is called")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        logger.info("On create view is called")
        usernameEditText = view.findViewById(R.id.usernameEditText)
        passwordEditText = view.findViewById(R.id.passwordEditText)
        loginButton = view.findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            logger.info(usernameEditText.toString())
            logger.info( passwordEditText.toString())
            if (usernameEditText.toString() == "admin" && passwordEditText.toString() == "admin") {
                navigateToProductListPage()
                usernameEditText.text.clear()
                passwordEditText.text.clear()
            }else{
                Toast.makeText(context, "Incorrect Username/Password ", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    private fun navigateToProductListPage(){

    }

    override fun onStart() {
        super.onStart()
        logger.info("On start is called")
    }

    override fun onResume() {
        super.onResume()
        logger.info("On resume is called")

    }

    override fun onDestroy() {
        super.onDestroy()
        logger.info("On destroy is called")
    }

}