package com.example.demoswiper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Fragment> arrayList;
    MyFragementPagerAdapter fragementPagerAdapter;
    ViewPager vp;
    Button btnBack, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.viewPager1);
        btnBack = findViewById(R.id.buttonBack);
        btnNext = findViewById(R.id.buttonNext);

        FragmentManager fm = getSupportFragmentManager();

        arrayList = new ArrayList<Fragment>();
        arrayList.add(new Fragment1());
        arrayList.add(new Fragment2());
        fragementPagerAdapter = new MyFragementPagerAdapter(fm, arrayList);
        vp.setAdapter(fragementPagerAdapter);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(vp.getCurrentItem() > 0){
                    int prevPage = vp.getCurrentItem() - 1;
                    vp.setCurrentItem(prevPage, true);
                }

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int max = vp.getChildCount();
                if(vp.getCurrentItem() < max-1){
                    int nextPage = vp.getCurrentItem() + 1;
                    vp.setCurrentItem(nextPage, true);
                }
            }
        });
    }
}
