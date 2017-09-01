package com.yotampocoloentendia.verolimp.view.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.yotampocoloentendia.verolimp.R;
import com.yotampocoloentendia.verolimp.presenter.login.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    LoginPresenter loginPresenter;

    @BindView(R.id.input_user)
    EditText inputUser;
    @BindView(R.id.input_pass)
    EditText inputPass;
    @BindView(R.id.btLogin)
    Button btLogin;
    @BindView(R.id.tvRegister)
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btLogin, R.id.tvRegister})
    public void onViewClicked(View view) {
        loginPresenter = new LoginPresenter(inputUser.getText().toString(), inputPass.getText().toString());
        Intent intent = new Intent(this, MainActivity.class);
        if (view.getId() == R.id.btLogin) {
            if(loginPresenter.signIn()) {
                intent.putExtra("user", inputUser.getText().toString());
                startActivity(intent);
            }
            else
                Toast.makeText(this, "Usuario y/o contraseña invalidos", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Registrando nuevo usuario...", Toast.LENGTH_SHORT).show();
        }
    }


}
