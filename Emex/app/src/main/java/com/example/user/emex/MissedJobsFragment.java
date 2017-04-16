package com.example.user.emex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * missed job fragment class
 */
public class MissedJobsFragment extends Fragment {

    private RecyclerView recyclerView;

    private MissedJobAdapter missedJobAdapter;

    /**
     * constructor empty
     */
    public MissedJobsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_missed_jobs, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        missedJobAdapter = new MissedJobAdapter(getActivity());
        recyclerView.setAdapter(missedJobAdapter);


        return view;
    }


}
