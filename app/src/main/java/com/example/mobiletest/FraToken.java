package com.example.mobiletest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FraToken extends Fragment {


    ArrayList<TokeneData> tokenDataList;
    private ListView listView;
    private static TokenAdapter myAdapter;
    public static FraToken newInstance(int number) {
        FraToken FraToken = new FraToken();
        Bundle bundle = new Bundle();
        bundle.putInt("number", number);
        FraToken.setArguments(bundle);
        return FraToken;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            int num = getArguments().getInt("number");
        }


    }




    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fra_token, container, false);

        //리스트 뷰 연결

        tokenDataList = new ArrayList<>();


        tokenDataList.add(new TokeneData(R.drawable.tokenimg_01, "ETH","이더리움2"));
        tokenDataList.add(new TokeneData(R.drawable.tokenimg_02, "TRON","테더"));
        tokenDataList.add(new TokeneData(R.drawable.tokenimg_03, "FON","이더리움"));

        ListView listView = (ListView)rootView.findViewById(R.id.listViewToken);
         myAdapter = new TokenAdapter(getContext(),tokenDataList);
        listView.setAdapter(myAdapter);

        return rootView;

    }






}
