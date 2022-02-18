package com.cursoandroid.appaprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.cursoandroid.appaprendaingles.Fragment.BichosFragment;
import com.cursoandroid.appaprendaingles.Fragment.NumerosFragment;
import com.cursoandroid.appaprendaingles.Fragment.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        smartTabLayout = findViewById(R.id.SmartTabLayout);
        viewPager = findViewById(R.id.viewPager);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                       .add("Bichos", BichosFragment.class)
                       .add("Numeros", NumerosFragment.class)
                       .add("Vogais", VogaisFragment.class)
                .create()
                );
                viewPager.setAdapter(adapter);
                smartTabLayout.setViewPager(viewPager);
    }
}





