package com.example.popla.gorkhavidyutpowerpay.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.popla.gorkhavidyutpowerpay.PowerApplication;
import com.example.popla.gorkhavidyutpowerpay.R;
import com.example.popla.gorkhavidyutpowerpay.db.Bill_details;
import com.example.popla.gorkhavidyutpowerpay.db.DaoSession;

import java.util.ArrayList;
import java.util.List;

public class BillDetailss extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_detailss);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<String> input = new ArrayList<>();
        DaoSession daoSession = ((PowerApplication)getApplication()).getDaoSession();

        List <Bill_details> list= daoSession.getBill_detailsDao().loadAll();

        Toast.makeText(this, list.get(0).getCurrent_read(), Toast.LENGTH_LONG).show();

        for (int i = 0; i < list.size(); i++) {

            input.add(list.get(i).getK_no());
            input.add(list.get(i).getPrevious_read());
            input.add(list.get(i).getCurrent_read());


        }




       /*
        for (int i = 0; i < 100; i++) {
            input.add("Test" + i);
        }// define an adapter

*/
        mAdapter = new MyAdapter(input);
        recyclerView.setAdapter(mAdapter);
    }

    }



//vvkjkbjv


