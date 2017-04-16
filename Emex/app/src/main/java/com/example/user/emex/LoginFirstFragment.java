package com.example.user.emex;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * cass for first activity in login fragment
 */
public class LoginFirstFragment extends Fragment implements View.OnClickListener {

    private TextView tvDontHaveAccount;
    private TextView tvPasswordText;
    private TextView tvForgotPassword;
    private String str;
    private Button btnLogin;

    /**
     * constructor
     */
    public LoginFirstFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_first, container, false);
        init(view);

        return view;
    }

    /**
     * @param view view group of fragment
     */
    public void init(final View view) {
        tvDontHaveAccount = (TextView) view.findViewById(R.id.dont_have_account);
        str = "<font color='#51a7f9'>Dont have an account ? <big><b>Sign up</b></big></font>";
        tvDontHaveAccount.setText(Html.fromHtml(str));
        tvPasswordText = (TextView) view.findViewById(R.id.password_editText);
        btnLogin = (Button) view.findViewById(R.id.login_button);
        tvForgotPassword = (TextView) view.findViewById(R.id.forgot_password);
        btnLogin.setOnClickListener(this);
        tvDontHaveAccount.setOnClickListener(this);
        tvForgotPassword.setOnClickListener(this);


    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.login_button:

                Intent intent2 = new Intent(getActivity(), DrawerActivity.class);
                startActivity(intent2);

                break;
            case R.id.dont_have_account:
                Intent intent = new Intent(getActivity(), SignupActivity.class);
                startActivity(intent);
                break;
            case R.id.forgot_password:
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ToolbarFragment toolbarFragment = new ToolbarFragment();
                fragmentTransaction.replace(R.id.frag_container, toolbarFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            default:
                break;
        }
    }
}
