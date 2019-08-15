package com.developer.baitapgang.bai1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.developer.baitapgang.R;
import com.google.android.material.navigation.NavigationView;

public class Bai1 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        mDrawerLayout = findViewById(R.id.layout);
        fm = getSupportFragmentManager();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        FragmentTransaction ft_add = fm.beginTransaction();

        switch (menuItem.getItemId()){

            case R.id.home:
                ft_add.add(R.id.framlayout, new FragmentA());
                ft_add.commit();
                break;

            case R.id.second:

                ft_add.add(R.id.framlayout, new FragmentB());
                ft_add.commit();
                break;

        }

        mDrawerLayout.closeDrawer(Gravity.START);

        return true;
    }
}
