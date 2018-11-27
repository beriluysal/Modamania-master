package com.modart.modamania.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.modart.modamania.R;
import com.modart.modamania.model.TrendOneModel;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TrendOneAdapter extends RecyclerView.Adapter<TrendOneAdapter.ViewHolder>{


    private List<TrendOneModel> mData;
    private LayoutInflater mInflater;


    public TrendOneAdapter(List<TrendOneModel> mData, Context context) {
        this.mData = mData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.lay_trendone, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        TrendOneModel model = mData.get(position);
        viewHolder.username.setText(model.getUserImage());
        Picasso.get()
                .load(model.getUserImage())
                .into(viewHolder.userPhoto);


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView userPhoto;
        TextView username;




        ViewHolder(View v) {
            super(v);
            userPhoto = v.findViewById(R.id.img_trendPhoto);
            username = v.findViewById(R.id.txt_username);



        }


    }
}
