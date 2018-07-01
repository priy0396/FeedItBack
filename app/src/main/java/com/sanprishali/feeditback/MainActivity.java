package com.sanprishali.feeditback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin,buttonSignup;
    LinearLayout loginLayout,signupLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonSignup = (Button)findViewById(R.id.buttonSignup);
        loginLayout = (LinearLayout)findViewById(R.id.loginLayout);
        signupLayout = (LinearLayout)findViewById(R.id.signupLayout);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginLayout.setVisibility(View.INVISIBLE);
                signupLayout.setVisibility(View.VISIBLE);
            }
        });

        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginLayout.setVisibility(View.VISIBLE);
                signupLayout.setVisibility(View.INVISIBLE);
            }
        });
    }
}
