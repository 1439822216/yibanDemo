package com.example.yibandemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.yibandemo.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText login_user;
    private EditText login_passwd;
    private TextView login_nouser;
    private Button login_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        login_user = (EditText) findViewById(R.id.login_user);
        login_passwd = (EditText) findViewById(R.id.login_passwd);
        login_nouser = (TextView) findViewById(R.id.login_nouser);
        login_login = (Button) findViewById(R.id.login_login);
        login_nouser.setOnClickListener(this);
        login_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_login:
                Intent intent1 = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.login_nouser:
                Intent intent2 = new Intent(LoginActivity.this,RegActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
