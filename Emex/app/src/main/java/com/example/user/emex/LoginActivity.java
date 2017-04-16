package com.example.user.emex;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * to handle login screens
 */
public class LoginActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private View fragmentContainer;
    private android.support.v4.app.FragmentTransaction fragmentTransaction;
    private LoginFirstFragment loginFirstFragment;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    /**
     * to initialize views
     */
    public void init() {
        fragmentManager = getSupportFragmentManager();
        fragmentContainer = (View) findViewById(R.id.frag_container);
        fragmentTransaction = fragmentManager.beginTransaction();
        loginFirstFragment = new LoginFirstFragment();
        fragmentTransaction.add(R.id.frag_container, loginFirstFragment);
        fragmentTransaction.commit();
    }
}
