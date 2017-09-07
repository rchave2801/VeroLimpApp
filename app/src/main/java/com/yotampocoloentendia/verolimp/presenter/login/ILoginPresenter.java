package com.yotampocoloentendia.verolimp.presenter.login;

/**
 * Created by rchav on 8/30/2017.
 */

public interface ILoginPresenter {

    void signIn(String email, String password);
    void signOut(String email);
}
