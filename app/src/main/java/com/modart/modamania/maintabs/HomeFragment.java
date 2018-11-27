package com.modart.modamania.maintabs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.modart.modamania.R;
import com.modart.modamania.adapter.HomeFeedAdapter;
import com.modart.modamania.model.HomeFeedModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {


    public HomeFragment(){

    }

    HomeFeedAdapter adapter;
    ArrayList<HomeFeedModel> feedModels = new ArrayList<>();


    int p1,p2,p3,p4,p5,p6,p7;

    Context context;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.lay_home,container,false);
        ButterKnife.bind(this,v);

       // int resourceId = this.getResources().getIdentifier("nameOfResource", "id", context.getPackageName());
        p1 = this.getResources().getIdentifier("p1", "drawable", context.getPackageName());
        p2 = this.getResources().getIdentifier("p2", "drawable", context.getPackageName());
        p3 = this.getResources().getIdentifier("p3", "drawable", context.getPackageName());
        p4 = this.getResources().getIdentifier("p4", "drawable", context.getPackageName());
        p5 = this.getResources().getIdentifier("p5", "drawable", context.getPackageName());
        p6 = this.getResources().getIdentifier("p6", "drawable", context.getPackageName());
        p7 = this.getResources().getIdentifier("p7", "drawable", context.getPackageName());



        fillPosts();



        LinearLayoutManager layoutManager
                = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());

        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new HomeFeedAdapter(feedModels,context);

        recyclerView.setAdapter(adapter);

        return v;

    }



    private void fillPosts(){

        feedModels.add(new HomeFeedModel(p1,"Merhaba",p2,"2 Gün Önce","picasso",
                "2K","231","4K",false,false));
        feedModels.add(new HomeFeedModel(p2,"Merhaba",p3,"2 Gün Önce","picasso",
                "2K","231","4K",false,false));
        feedModels.add(new HomeFeedModel(p3,"Merhaba",p4,"2 Gün Önce","picasso",
                "2K","231","4K",false,false));
        feedModels.add(new HomeFeedModel(p4,"Merhaba",p5,"2 Gün Önce","picasso",
                "2K","231","4K",false,false));
        feedModels.add(new HomeFeedModel(p5,"Merhaba",p6,"2 Gün Önce","picasso",
                "2K","231","4K",false,false));
        feedModels.add(new HomeFeedModel(p6,"Merhaba",p7,"2 Gün Önce","picasso",
                "2K","231","4K",false,false));
        feedModels.add(new HomeFeedModel(p7,"Merhaba",p1,"2 Gün Önce","picasso",
                "2K","231","4K",false,false));



    }



}
