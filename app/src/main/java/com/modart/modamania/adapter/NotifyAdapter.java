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

public class NotifyAdapter extends RecyclerView.Adapter<NotifyAdapter.ViewHolder> {


    private List<TrendOneModel> mData;
    private LayoutInflater mInflater;

    public NotifyAdapter(List<TrendOneModel> mData, Context context) {
        this.mData = mData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.card_notify, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        TrendOneModel model = mData.get(position);
        viewHolder.message.setText(model.getUsername());
        Picasso.get()
                .load(model.getUserImage())
                .resize(100,100)
                .centerCrop()
                .into(viewHolder.userPhoto);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView userPhoto;
        TextView message;




        ViewHolder(View v) {
            super(v);
            userPhoto = v.findViewById(R.id.img_notify);
            message = v.findViewById(R.id.txt_notify);



        }


    }
}
