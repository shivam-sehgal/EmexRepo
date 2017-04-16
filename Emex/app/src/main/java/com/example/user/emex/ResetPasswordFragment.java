package com.example.user.emex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * classs to reset password
 */
public class ResetPasswordFragment extends Fragment implements View.OnClickListener {
    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageButton btnBack;

    /**
     * empty constructor
     */
    public ResetPasswordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reset_password, container, false);
        init(view);
        return view;
    }

    /**
     * @param view initializes the view
     */
    public void init(final View view) {
        toolbar = (Toolbar) view.findViewById(R.id.my_toolbar);
        tvTitle = (TextView) toolbar.findViewById(R.id.title_text);
        btnBack = (ImageButton) toolbar.findViewById(R.id.back_btn);
        tvTitle.setText("Reset Password");
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.back_btn:
                getFragmentManager().popBackStackImmediate();
                break;
            default:
                break;

        }
    }
}
