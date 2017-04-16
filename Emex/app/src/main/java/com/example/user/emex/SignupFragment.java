package com.example.user.emex;

import android.content.Intent;
import android.os.Build;
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
import android.widget.ImageView;
import android.widget.TextView;

/**
 * class to show sign up page
 */
public class SignupFragment extends Fragment implements View.OnClickListener {

    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageButton btnBack;
    private String str;
    private int counter = 0;
    private TextView tvLongText;
    private ImageView imageView;
    private Button btnSignup;
    private final int sdkversion = 24;

    /**
     * EMPTY CONSTRUCTOR
     */
    public SignupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.signup_fragment_layout, container, false);
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
        imageView = (ImageView) view.findViewById(R.id.term_btn);
        imageView.setImageResource(R.drawable.btn_accepted_terms_normal);
        tvLongText = (TextView) view.findViewById(R.id.blue_tick_test);
        btnSignup = (Button) view.findViewById(R.id.continue_btn);
        btnSignup.setOnClickListener(this);
        tvTitle.setText("Signup");
        btnBack.setOnClickListener(this);
        str = "<font color='#9b9b9b'>I accept </font> <font color='#348cdf'><b><u>Terms of Service</u></b></font>"
                +
                "<font color='#9b9b9b'> and  </font><font color='#348cdf'><b><u>Privacy Policy</u></b></font>";
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
        imageView.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= sdkversion) {
            tvLongText.setText(Html.fromHtml(str, Html.FROM_HTML_MODE_LEGACY));

        } else {
            tvLongText.setText(Html.fromHtml(str));
        }


    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.back_btn:
                getFragmentManager().beginTransaction().remove(this).commit();

                break;
            case R.id.term_btn:
                if (counter == 0) {
                    imageView.setImageResource(R.drawable.btn_accepted_terms);
                    counter++;
                } else {
                    imageView.setImageResource(R.drawable.btn_accepted_terms_normal);
                    counter = 0;
                }
                break;
            case R.id.continue_btn:
                Intent intent = new Intent(getActivity(), DrawerActivity.class);
                startActivity(intent);
                getActivity().finish();
                break;
            default:
                break;


        }
    }
}
