package com.example.user.emex;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * activity to handle sign up
 */
public class SignupActivity extends AppCompatActivity {
    private View view;
    private FragmentManager fragmentManager;
    private android.support.v4.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        init();
    }

    /**
     * to initalize views
     */
    public void init() {
        view = findViewById(R.id.signup_fragment_container);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        SignupFragment signupFragment = new SignupFragment();
        fragmentTransaction.add(R.id.signup_fragment_container, signupFragment);
        fragmentTransaction.commit();

    }


    @Override
    public void finish() {
        super.finish();
    }


}

