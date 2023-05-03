package com.example.mobiletest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NftAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<NftData> nftArray;

    public NftAdapter(Context context, ArrayList<NftData> data) {
        mContext = context;
        nftArray = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return nftArray.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public NftData getItem(int position) {
        return nftArray.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.listviewnft, null);

        ImageView nftImage = (ImageView)view.findViewById(R.id.nftImage);
        TextView title = (TextView)view.findViewById(R.id.title01);


        nftImage.setImageResource(nftArray.get(position).getNftImg());
        title.setText(nftArray.get(position).getTitle());


        return view;
    }
}
