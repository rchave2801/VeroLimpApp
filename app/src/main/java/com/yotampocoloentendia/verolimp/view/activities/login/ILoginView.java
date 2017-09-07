package com.yotampocoloentendia.verolimp.view.activities.login;

/**
 * Created by rchave on 6/09/2017.
 */

public interface ILoginView {
    void showProgress(boolean showProgress);
    void credentialsError(String message);
    void successLogin();
}
