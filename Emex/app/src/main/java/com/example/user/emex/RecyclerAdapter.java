package com.example.user.emex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by user on 4/14/2017.
 */


public class RecyclerAdapter extends RecyclerView.Adapter {

    private Context context;

    /**
     * @param ctx context of activity
     */
    public RecyclerAdapter(final Context ctx) {
        context = ctx;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        if (viewType == 1) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.row1, parent, false);
            ViewHolder1 holder = new ViewHolder1(view);


            return holder;

        } else if (viewType == 2) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.row2, parent, false);
            ViewHolder2 holder = new ViewHolder2(view);


            return holder;

        } else if (viewType == 3) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.row3, parent, false);
            ViewHolder3 holder = new ViewHolder3(view);


            return holder;

        } else {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.row4, parent, false);
            ViewHolder4 holder = new ViewHolder4(view);


            return holder;

        }

    }


    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        switch (position) {
            case 0:
                ((ViewHolder1) holder).imageButton1.setBackgroundResource(R.drawable.networking_btn_states);
                ((ViewHolder1) holder).imageButton2.setImageResource(R.drawable.btn_online);
                ((ViewHolder1) holder).tvTitle.setText("Networking States");


                break;
            case 1:
                ((ViewHolder2) holder).imageButton1.setBackgroundResource(R.drawable.payment_button_states);

                ((ViewHolder2) holder).tvTitle.setText("Payment");
                break;
            case 2:
                ((ViewHolder2) holder).imageButton1.setBackgroundResource(R.drawable.jobhistorybtnstates);

                ((ViewHolder2) holder).imageButton1.setScaleType(ImageButton.ScaleType.FIT_START);
                ((ViewHolder2) holder).imageButton1.setAdjustViewBounds(true);
                ((ViewHolder2) holder).tvTitle.setText("Job History");
                break;

            case 3:
                ((ViewHolder2) holder).imageButton1.setBackgroundResource(R.drawable.emergency_btn_states);

                ((ViewHolder2) holder).imageButton1.setScaleType(ImageButton.ScaleType.FIT_START);
                ((ViewHolder2) holder).imageButton1.setAdjustViewBounds(true);
                ((ViewHolder2) holder).tvTitle.setText("Emergency");
                break;
            case 4:
                ((ViewHolder2) holder).imageButton1.setBackgroundResource(R.drawable.icon_help_normal);

                ((ViewHolder2) holder).imageButton1.setScaleType(ImageButton.ScaleType.FIT_START);
                ((ViewHolder2) holder).imageButton1.setAdjustViewBounds(true);
                ((ViewHolder2) holder).tvTitle.setText("Help");
                break;
            case 5:
                ((ViewHolder2) holder).imageButton1.setBackgroundResource(R.drawable.logout_btn_states);

                ((ViewHolder2) holder).imageButton1.setScaleType(ImageButton.ScaleType.FIT_START);
                ((ViewHolder2) holder).imageButton1.setAdjustViewBounds(true);
                ((ViewHolder2) holder).tvTitle.setText("Logout");
                break;
            case 6:

                ((ViewHolder3) holder).tvTitle.setText("Support via Call/Email");
                break;
            case 7:
                ((ViewHolder4) holder).imageButton1.setBackgroundResource(R.drawable.phone_btn_states);

                ((ViewHolder4) holder).imageButton1.setScaleType(ImageButton.ScaleType.FIT_START);
                ((ViewHolder4) holder).imageButton1.setAdjustViewBounds(true);
                ((ViewHolder4) holder).imageButton2.setBackgroundResource(R.drawable.mail_btn_states);

                ((ViewHolder4) holder).imageButton2.setScaleType(ImageButton.ScaleType.FIT_START);
                ((ViewHolder4) holder).imageButton2.setAdjustViewBounds(true);
                break;
            default:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    /**
     * class for first row of recycler view in menu of navigation drawer
     */
    public class ViewHolder1 extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageButton imageButton1;
        private ImageButton imageButton2;
        private TextView tvTitle;


        /**
         * @param itemView takes itemView
         */
        public ViewHolder1(final View itemView) {
            super(itemView);
            imageButton1 = (ImageButton) itemView.findViewById(R.id.row1_imgbtn1);
            imageButton2 = (ImageButton) itemView.findViewById(R.id.row1_imgbtn2);
            tvTitle = (TextView) itemView.findViewById(R.id.row1_tv);
        }


        @Override
        public void onClick(final View v) {
            int position = getAdapterPosition();

        }

        /**
         * @return return image button
         */
        public ImageButton getImageButton1() {
            return imageButton1;
        }

        /**
         * @param imageButton1 takes image button
         */
        public void setImageButton1(final ImageButton imageButton1) {
            this.imageButton1 = imageButton1;
        }

        /**
         * @return imagebutton
         */
        public ImageButton getImageButton2() {
            return imageButton2;
        }

        /**
         * @param imageButton2 takes the image button
         */
        public void setImageButton2(final ImageButton imageButton2) {
            this.imageButton2 = imageButton2;
        }

        /**
         * @return text view of title
         */
        public TextView getTvTitle() {
            return tvTitle;
        }

        /**
         * @param tvTitle set the textvie title
         */
        public void setTvTitle(final TextView tvTitle) {
            this.tvTitle = tvTitle;
        }

    }

    /**
     * class for all rows except last and last second in recycler view of navigation drawer
     */

    public class ViewHolder2 extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageButton imageButton1;
        private TextView tvTitle;

        /**
         * @param itemView takes itemview
         */

        public ViewHolder2(final View itemView) {
            super(itemView);
            imageButton1 = (ImageButton) itemView.findViewById(R.id.row2_imgbtn);
            imageButton1.setOnClickListener(this);
            tvTitle = (TextView) itemView.findViewById(R.id.row2_tv);
        }

        /**
         * @return image button
         */
        public ImageButton getImageButton1() {
            return imageButton1;
        }

        /**
         * @param imageButton1 takes image button
         */
        public void setImageButton1(final ImageButton imageButton1) {
            this.imageButton1 = imageButton1;
        }

        /**
         * @return text title
         */
        public TextView getTvTitle() {
            return tvTitle;
        }

        /**
         * @param tvTitle set text title
         */
        public void setTvTitle(final TextView tvTitle) {
            this.tvTitle = tvTitle;
        }


        @Override
        public void onClick(final View v) {
            int position = getAdapterPosition();
            if (position == 2) {
                ((DrawerActivity) context).jobFragment();

                ((DrawerActivity) context).closeDrawer();
            }
        }
    }

    /**
     * class for last second row in recycler view of navigation drawer
     */

    public class ViewHolder3 extends RecyclerView.ViewHolder {

        private TextView tvTitle;


        /**
         * @param itemView takes 3rd row itemview
         */
        public ViewHolder3(final View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.row3_tv);
        }

        /**
         * @return textviw title
         */
        public TextView getTvTitle() {
            return tvTitle;
        }

        /**
         * @param tvTitle set the title
         */
        public void setTvTitle(final TextView tvTitle) {
            this.tvTitle = tvTitle;
        }

    }

    /**
     * class for last row in navigation drawer
     */
    public class ViewHolder4 extends RecyclerView.ViewHolder {

        private ImageButton imageButton1;
        private ImageButton imageButton2;


        /**
         * @param itemView takes 4rt row item view
         */
        public ViewHolder4(final View itemView) {
            super(itemView);
            imageButton1 = (ImageButton) itemView.findViewById(R.id.row4_btn1);
            imageButton2 = (ImageButton) itemView.findViewById(R.id.row4_btn2);

        }

        /**
         * @return image button
         */
        public ImageButton getImageButton1() {
            return imageButton1;
        }

        /**
         * @param imageButton1 takes image button
         */
        public void setImageButton1(final ImageButton imageButton1) {
            this.imageButton1 = imageButton1;
        }

        /**
         * @return takes image button
         */
        public ImageButton getImageButton2() {
            return imageButton2;
        }

        /**
         * @param imageButton2 takes image button
         */
        public void setImageButton2(final ImageButton imageButton2) {
            this.imageButton2 = imageButton2;
        }

    }

    @Override
    public int getItemViewType(final int position) {
        if (position == 0) {
            return 1;
        } else if (position >= 1 && position <= 5) {
            return 2;
        } else if (position == 6) {
            return 3;
        } else {
            return 4;
        }

    }
}
