package com.yotampocoloentendia.verolimp.view.activities;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
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

    @BindView(R.id.btLogin)
    Button btLogin;
    @BindView(R.id.tvRegister)
    TextView tvRegister;
    @BindView(R.id.input_mail)
    EditText inputMail;
    @BindView(R.id.input_pass)
    EditText inputPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        tvRegister.setPaintFlags(tvRegister.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    @OnClick({R.id.btLogin, R.id.tvRegister})
    public void onViewClicked(View view) {
        loginPresenter = new LoginPresenter(inputMail.getText().toString(), inputPass.getText().toString());
        Intent intent;
        if (view.getId() == R.id.btLogin) {
            if (loginPresenter.signIn()) {
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("mail", inputMail.getText().toString());
                startActivity(intent);
            } else
                Toast.makeText(this, "Usuario y/o contraseña invalidos", Toast.LENGTH_SHORT).show();
        } else {
            intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
            //Toast.makeText(this, "Registrando nuevo usuario...", Toast.LENGTH_SHORT).show();
        }
    }


}
