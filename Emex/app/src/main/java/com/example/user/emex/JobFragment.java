package com.example.user.emex;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JobFragment extends Fragment implements View.OnClickListener {

    private ViewPager viewPager;
    private ViewPageAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageButton btnDrawer;

    /**
     * constructor of fragment
     */
    public JobFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_job, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        toolbar = (Toolbar) view.findViewById(R.id.my_toolbar);
        tvTitle = (TextView) toolbar.findViewById(R.id.title_text);
        btnDrawer = (ImageButton) toolbar.findViewById(R.id.back_btn);
        btnDrawer.setImageResource(R.drawable.btn_menu);
        btnDrawer.setOnClickListener(this);

        tvTitle.setText("Job History");
        viewPagerAdapter = new ViewPageAdapter(getFragmentManager());
        viewPagerAdapter.addData(new JobHistory(), "Job History");
        viewPagerAdapter.addData(new MissedJobsFragment(), "Missed Jobs");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        setViewPagerListener();
        return view;
    }

    /**
     * to perform action according to opened fragment in view pager
     */
    public void setViewPagerListener() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                if (position == 1) {
                    setFragmentTitleText("Missed Jobs");

                } else {
                    setFragmentTitleText("Job History");
                }
            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });

    }

    /**
     * @param str takes string
     */
    public void setFragmentTitleText(final String str) {
        tvTitle.setText(str);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.back_btn:
                ((DrawerActivity) getActivity()).getDrawerLayout().openDrawer(GravityCompat.START);
                //getFragmentManager().beginTransaction().remove(this).commit();
                break;
            default:
                break;
        }
    }
}
