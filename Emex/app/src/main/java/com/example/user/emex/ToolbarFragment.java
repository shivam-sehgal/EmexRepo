package com.example.user.emex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * class to handle forgot password
 */
public class ToolbarFragment extends Fragment implements View.OnClickListener {
    private Toolbar toolbar;
    private TextView tvTitle;
    private TextView tvLongText;
    private String str;
    private ImageButton btnBack;
    private Button btnContinue;

    /**
     * empty constructor
     */
    public ToolbarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_toolbar, container, false);
        init(view);
        return view;
    }

    /**
     * @param view initialize the view
     */
    public void init(final View view) {
        toolbar = (Toolbar) view.findViewById(R.id.my_toolbar);
        tvTitle = (TextView) toolbar.findViewById(R.id.title_text);
        btnBack = (ImageButton) toolbar.findViewById(R.id.back_btn);
        btnContinue = (Button) view.findViewById(R.id.continue_btn);
        tvLongText = (TextView) view.findViewById(R.id.my_long_text);
        tvTitle.setText("Forgot Password");
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
        str = "please enter your mobile number<br /> to reset your password";
        tvLongText.setText(Html.fromHtml(str));
        btnBack.setOnClickListener(this);
        btnContinue.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.back_btn:
                getFragmentManager().popBackStackImmediate();
                break;
            case R.id.continue_btn:
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                ResetPasswordFragment resetPasswordFragment = new ResetPasswordFragment();
                fragmentTransaction.replace(R.id.frag_container, resetPasswordFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            default:
                break;
        }
    }
}



