package com.adulks.mytemplate;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.adulks.mytemplate.adapter.ListAdapter;
import com.adulks.mytemplate.model.ListModel;
import com.adulks.mytemplate.nav_drawer.NavigationDrawerCallbacks;
import com.adulks.mytemplate.nav_drawer.NavigationDrawerFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    NavigationDrawerFragment mNavigationDrawerFragment;
    Toolbar mToolbar;
    ListAdapter adapter;
    ArrayList<ListModel> list = new ArrayList<>();
    ListView daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        daftar = (ListView) findViewById(R.id.myDaftar);

        mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);

        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();


        adapter = new ListAdapter(this, list,getResources());
        daftar.setAdapter(adapter);
        setDaftar();
    }

    void setDaftar(){
        for(int i = 0 ;i<10;i++){
            final ListModel lm = new ListModel();
            list.add(lm);
        }

        adapter.notifyDataSetChanged();
    }

}
