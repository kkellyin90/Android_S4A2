package com.funapp.session4assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListCustom extends AppCompatActivity {
ListView list;
    String[] name = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7"};
    String[] phone = {"PhoneNumber1", "PhoneNumber2","PhoneNumber3", "PhoneNumber4", "PhoneNumber5","PhoneNumber6","PhoneNumber7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom);

        CustomAdapter adapter = new CustomAdapter(this, name, phone);

        list = (ListView)findViewById(R.id.listView);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Selecteditem = name[+position];

                Toast.makeText(ListCustom.this, Selecteditem, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
