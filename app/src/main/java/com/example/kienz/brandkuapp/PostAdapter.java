package com.example.kienz.brandkuapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostViewholder> {
    private ArrayList<Post> mPosts = new ArrayList<>();
    private Context mContext;


    public PostAdapter(Context context, ArrayList<Post> donasi) {
        mContext = context;
        mPosts = donasi;

    }


    @Override
    public PostViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_explore_items, parent, false);
        PostViewholder viewHolder = new PostViewholder(view, mPosts);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PostViewholder holder, int position) {
        holder.bindEvent(mPosts.get(position));
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }


}