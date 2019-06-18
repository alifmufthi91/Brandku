package com.example.kienz.brandkuapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PostViewholder extends RecyclerView.ViewHolder {
    @BindView(R.id.imageView_explore_item_image)
    ImageView mEventImageView;
    @BindView(R.id.textView_explore_item_text)
    TextView mEventNameTextView;
    private Context mContext;
    private ArrayList<Post> mPosts = new ArrayList<>();


    public PostViewholder(View itemView, ArrayList<Post> postList) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mContext = itemView.getContext();
        mPosts = postList;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int itemPosition = getLayoutPosition();
//                Intent intent = new Intent(mContext, explore_detailActivity.class);
//                intent.putExtra("idDonasi",mDonasi.get(itemPosition).getId());
//                mContext.startActivity(intent);
            }
        });
    }

    public void bindEvent(Post event) {
        Picasso.get().load(event.getGambar()).into(mEventImageView);
        mEventNameTextView.setText(event.getJudul());
    }
}

