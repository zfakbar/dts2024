package com.pens.digitaltalent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    ListView lvItems;
    final String[] negara =
            {"Indonesia",
                    "Malaysia",
                    "Brunei Darussalam",
                    "Singapura",
                    "Thailand"
            };

    final String[] ibukota =
            {"Jakarta",
                    "Kuala Lumpur",
                    "Bandar Seri Begawan",
                    "Singapura",
                    "Bangkok"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvItems = findViewById(R.id.lvItems);

        ArrayAdapter<String> myList = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                negara);

        lvItems.setAdapter(myList);



        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getApplicationContext(),
                //        negara[position],
                //        Toast.LENGTH_LONG).show();

                //Intent myWeb = new Intent(Intent.ACTION_WEB_SEARCH);
                //myWeb.putExtra(SearchManager.QUERY,negara[position]);

                //startActivity(myWeb);


                Intent myActivityInfo = new Intent(getApplicationContext(),
                        InfoActivity.class);
                Bundle myBundle = new Bundle();
                myBundle.putString("Negara",negara[position]);
                myBundle.putString("IbuKota",ibukota[position]);
                myBundle.putInt("Posisi",position);

                myActivityInfo.putExtra("Bundle",myBundle);

                startActivity(myActivityInfo);
            }
        });

    }
}