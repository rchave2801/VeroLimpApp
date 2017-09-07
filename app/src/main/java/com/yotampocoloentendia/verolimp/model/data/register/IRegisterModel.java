package com.yotampocoloentendia.verolimp.model.data.register;

import com.yotampocoloentendia.verolimp.model.pojo.User;

/**
 * Created by rchave on 6/09/2017.
 */

public interface IRegisterModel {

    interface OnSignUpSuccessListener {
        void onCancelled();
        void onDataError();
        void onSuccess();
    }

    void signUp(User user, OnSignUpSuccessListener listener);
}
