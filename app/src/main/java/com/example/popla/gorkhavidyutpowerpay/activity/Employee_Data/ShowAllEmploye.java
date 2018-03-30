package com.example.popla.gorkhavidyutpowerpay.activity.Employee_Data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.popla.gorkhavidyutpowerpay.PowerApplication;
import com.example.popla.gorkhavidyutpowerpay.R;
import com.example.popla.gorkhavidyutpowerpay.db.DaoSession;
import com.example.popla.gorkhavidyutpowerpay.db.Employee;

import java.util.ArrayList;
import java.util.List;

public class ShowAllEmploye extends AppCompatActivity {

    ListView listView;
    List<String> ename;
    List<String> edesig;
    List<String> eid;
    String a;
    EmployeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_employe);
        listView = (ListView) findViewById(R.id.list_view);
        ename = new ArrayList<String>();
        edesig = new ArrayList<String>();
        eid = new ArrayList<String>();
        get_name_desig();
       // int i=0;
        adapter = new EmployeeAdapter(getApplicationContext(),R.layout.activity_all_employee_layouts);
        listView.setAdapter(adapter);
     //  for(String names : ename)
     //   {
            for(int i=0;i<ename.size();i++)
            {
                EmployeeDataProvider dataProvider = new EmployeeDataProvider(ename.get(i), edesig.get(i),eid.get(i));
                adapter.add(dataProvider);
               // i++;
            }
//        }

        //Toast.makeText(this,edesig[0],Toast.LENGTH_LONG).show();
    }
    private void get_name_desig()
    {
        DaoSession daoSession = ((PowerApplication)getApplication()).getDaoSession();
        List <Employee> list= daoSession.getEmployeeDao().loadAll();
        for(int i=0;i<list.size();i++)
        {


          ename.add(list.get(i).getEmp_name());
            eid.add(list.get(i).getEmp_email_id());
          edesig.add(list.get(i).getEmp_designation());

        }
     //  ename[1] = list.get(0).getEmp_name();
       //a = list.get(0).getEmp_name();
        //int s = list.size();
       // String s1=String.valueOf(s);
       // a = ename[0];
      // Toast.makeText(this,ename.get(0),Toast.LENGTH_LONG).show();

    }



}
