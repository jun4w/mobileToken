package com.example.mobiletest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager2 viewPager2;

    ArrayList<TokeneData> movieDataList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout =(TabLayout) findViewById(R.id.tab_main);


        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(FraToken.newInstance(0));
        fragments.add(FraNft.newInstance(1));

        viewPager2 = (ViewPager2) findViewById(R.id.vp2_main);

        Vp2AdapterMain vp2AdapterMain = new Vp2AdapterMain(this,fragments);
        viewPager2.setAdapter(vp2AdapterMain);

        final List<String> tabElement = Arrays.asList("토큰","NFT");

        //tabLyout와 viewPager 연결
        new TabLayoutMediator(mTabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                TextView textView = new TextView(MainActivity.this);
                textView.setText(tabElement.get(position));
                tab.setCustomView(textView);
            }
        }).attach();








    }





}