package com.yotampocoloentendia.verolimp.model.data.login;

/**
 * Created by rchave on 6/09/2017.
 */

public interface ILoginModel {

    interface OnLoginSuccessListener {
        void onCancelled();
        void onCredentialsError();
        void onSuccess();
    }

    void login(String email, String password, OnLoginSuccessListener listener);
}
