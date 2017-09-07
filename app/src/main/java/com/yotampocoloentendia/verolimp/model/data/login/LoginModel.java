package com.yotampocoloentendia.verolimp.model.data.login;

import android.os.AsyncTask;

/**
 * Created by rchave on 6/09/2017.
 */

public class LoginModel implements ILoginModel {
    private  OnLoginSuccessListener listener;

    @Override
    public void login(String email, String password, OnLoginSuccessListener listener) {
        this.listener = listener;
        new UserLoginTask(email, password).execute((Void) null);
    }

    public class UserLoginTask extends AsyncTask<Void, Void, Boolean> {
        private final String mEmail;
        private final String mPassword;

        UserLoginTask(String email, String password) {
            mEmail = email;
            mPassword = password;
        }

        @Override
        protected Boolean doInBackground(Void... voids) {
            try {
                //Network access here call the service
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            return false;
        }

        @Override
        protected void onPostExecute(final Boolean success) {
            if (success)
                listener.onSuccess();
            else
                listener.onCredentialsError();
        }

        @Override
        protected void onCancelled() {
            listener.onCancelled();
        }

    }
}
