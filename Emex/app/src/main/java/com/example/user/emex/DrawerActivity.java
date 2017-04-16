package com.example.user.emex;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * activity for opening drawer etc
 */
public class DrawerActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recyclerView;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageButton btnDrawer;

    private JobFragment jobFragment;

    /**
     * @param savedInstanceState takes instance state
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        tvTitle = (TextView) toolbar.findViewById(R.id.title_text);
        tvTitle.setText("DrawerActivity");
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this);
        recyclerView.setAdapter(recyclerAdapter);


        btnDrawer = (ImageButton) toolbar.findViewById(R.id.back_btn);
        btnDrawer.setImageResource(R.drawable.btn_menu);
        btnDrawer.setOnClickListener(this);


    }

    /**
     * to start job fragment
     */
    public void jobFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        jobFragment = new JobFragment();
        toolbar.setVisibility(View.GONE);
        fragmentTransaction.replace(R.id.nav_frag_container, jobFragment);
        fragmentTransaction.commit();


    }

    /**
     * to close the opened navigation drawer
     */
    public void closeDrawer() {
        drawerLayout.closeDrawers();


    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.back_btn:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            default:
                break;
        }
    }

    /**
     * @return drawer layout object
     */
    public DrawerLayout getDrawerLayout() {
        return drawerLayout;
    }

}
