package com.example.signinactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.signinactivity.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "admin" && password == "1234") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

//package com.example.signinactivity
//
//import android.view.View
//
//fun main (){
//
//}
//
//fun Login(v : View){
//    if(et_id.text.toString() == "gjals912@naver.com" && et_password.text.toString() == "1234" &&
//                et_name.text.toString() == "허민" && et_age.text.toString() == "25")
//        Toast.makeText(context:this, text"로그인 성공!!") Toast.LENGTH_SHORT).show()
//
//    else Toast.makeText(context:this, text:"로그인 실패ㅜ"), Toast.LENGTH_SHORT).show()
//}


