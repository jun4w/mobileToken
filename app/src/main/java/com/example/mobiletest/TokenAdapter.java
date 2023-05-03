package com.example.mobiletest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TokenAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<TokeneData> tokenArray;

    public TokenAdapter(Context context, ArrayList<TokeneData> data) {
        mContext = context;
        tokenArray = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return tokenArray.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public TokeneData getItem(int position) {
        return tokenArray.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.listviewtoken, null);

        ImageView token_img = (ImageView)view.findViewById(R.id.token_img);
        TextView enName = (TextView)view.findViewById(R.id.enName);
        TextView krName = (TextView)view.findViewById(R.id.krName);

        token_img.setImageResource(tokenArray.get(position).getToken_img());
        enName.setText(tokenArray.get(position).getEnName());
        krName.setText(tokenArray.get(position).getKrName());

        return view;
    }
}
