
package com.example.vapeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;

import com.google.android.gms.common.SignInButton;

public class MainActivity extends AppCompatActivity
{
    private Button joinNowButton, loginButton;
    private Object MainActivity;

    @Override

    protected void onCreate(Bundle savedInstanceState)

    {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    joinNowButton = findViewById(R.id.main_join_now_btn);
    loginButton = findViewById(R.id.main_login_btn);


    loginButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            Intent intent = new Intent((Intent) MainActivity).this,LoginActivity.class);
            startActivity(intent);
        }
    });
};

    private class LoginActivity {
    }
}







