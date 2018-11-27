package com.modart.modamania.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.modart.modamania.R;
import com.modart.modamania.model.HomeFeedModel;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeFeedAdapter extends RecyclerView.Adapter<HomeFeedAdapter.ViewHolder> {



    private List<HomeFeedModel> mData;
    private LayoutInflater mInflater;



    public HomeFeedAdapter(List<HomeFeedModel> mData, Context context) {
        this.mData = mData;
        this.mInflater = LayoutInflater.from(context);
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.card_homefeed, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HomeFeedModel model = mData.get(position);
        holder.username.setText(model.getUsername());
        holder.commentCount.setText(model.getCommentCount());
        holder.likeCount.setText(model.getLikeCount());
        holder.createdDate.setText(model.getDate());
        holder.viewedCount.setText(model.getViewedCount());
        holder.title.setText(model.getTitle());




        Picasso.get()
                .load(model.getPostImage())
                .resize(300,225)
                .centerCrop()
                .into(holder.postImage);

        Picasso.get()
                .load(model.getUserImage())
                .resize(100,100)
                .centerCrop()
                .into(holder.userPhoto);


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView userPhoto;
        ImageView postImage;
        TextView username;
        TextView createdDate;
        TextView title;
        TextView likeCount;
        TextView commentCount;
        TextView viewedCount;



        ViewHolder(View v) {
            super(v);
            userPhoto = itemView.findViewById(R.id.img_profile);
            postImage = itemView.findViewById(R.id.img_post);
            username = itemView.findViewById(R.id.txt_username);
            createdDate = itemView.findViewById(R.id.txt_createddate);
            title = itemView.findViewById(R.id.txt_title);
            likeCount = itemView.findViewById(R.id.txt_likeCount);
            commentCount = itemView.findViewById(R.id.txt_commentCount);
            viewedCount = itemView.findViewById(R.id.txt_viewedCount);


        }


    }
}
