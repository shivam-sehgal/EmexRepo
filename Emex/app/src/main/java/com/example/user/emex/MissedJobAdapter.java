package com.example.user.emex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 4/15/2017.
 */

public class MissedJobAdapter extends RecyclerView.Adapter<MissedJobAdapter.ViewHolder> {
    private Context context;
    private ArrayList<MissedData> dataList;

    /**
     *
     * @param context takes context of drawer activity
     */
    public MissedJobAdapter(final Context context) {
        this.context = context;
        dataList = new ArrayList<MissedData>();
        MissedData missedData = new MissedData("14 June, 2016 04:23 PM", "5.6 km", "3846 W 38 Rd, Shiv Srishti Marg \n"
                + "Mumbai", "Silver Oks Hospital, Laxmi Nagar, \n"
                + "Mumbai", "₹ 1832.00");
        MissedData missedData2 = new MissedData("14 May, 2018 04:23 PM", "10.6 km", "3846 W 38 Rd, Shiv xfd Marg \n"
                + "Mumbai", "Silver Oks Hospital, Laxmi Nagar, \n"
                + "Mumbai", "₹ 2000.00");
        dataList.add(missedData);
        dataList.add(missedData2);

    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.missed_job_recycler_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.tvDate.setText(dataList.get(position).getDate());
        holder.tvDistance.setText(dataList.get(position).getDistance());
        holder.tvAdress1.setText(dataList.get(position).getAdress1());
        holder.tvAdress2.setText(dataList.get(position).getAdress2());
        holder.tvTotalAmount.setText(dataList.get(position).getAmount());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    /**
     * class to get views of recycler view row of missed job fragment
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvDate;
        private TextView tvDistance;
        private TextView tvAdress1;
        private TextView tvAdress2;
        private TextView tvTotalAmount;

        /**
         *
         * @param itemView view of row of recycler view of missed jobs fragment
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvDate = (TextView) itemView.findViewById(R.id.date_tv);
            tvDistance = (TextView) itemView.findViewById(R.id.distance_tv);
            tvAdress1 = (TextView) itemView.findViewById(R.id.adress_1);
            tvAdress2 = (TextView) itemView.findViewById(R.id.adress_2);
            tvTotalAmount = (TextView) itemView.findViewById(R.id.total_amount);

        }

    }
}
