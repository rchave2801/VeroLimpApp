package com.yotampocoloentendia.verolimp.presenter.login;

/**
 * Created by rchav on 8/28/2017.
 */

public class LoginPresenter implements ILoginPresenter {

    private String user;
    private String pass;

    public LoginPresenter (String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public boolean signIn() {
        if (user.equals("admin") && pass.equals("1234"))
            return true;
        else
            return false;

    }

    @Override
    public boolean signOut() {
        return true;
    }
}