package com.example.mobiletest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FraNft extends Fragment {

    ArrayList<NftData> nftDataList;
    private ListView listView;
    private static NftAdapter myAdapter;
    public static FraNft newInstance(int number) {
        FraNft FraToken = new FraNft();
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
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fra_nft, container, false);

        //리스트 뷰 연결

        nftDataList = new ArrayList<NftData>();


        nftDataList.add(new NftData(R.drawable.nft_simg_01, "ETH"));
        nftDataList.add(new NftData(R.drawable.nft_simg_02, "TRON"));
        nftDataList.add(new NftData(R.drawable.nft_simg_03, "FON"));

        ListView listView = (ListView)rootView.findViewById(R.id.listViewNft);
        myAdapter = new NftAdapter(getContext(),nftDataList);
        listView.setAdapter(myAdapter);

        return rootView;
        // return LayoutInflater.from(inflater.getContext()).inflate(R.layout.fra_nft, container, false);
    }


}
