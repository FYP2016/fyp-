package mmc.demo.monitormychlid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class call_logs extends Activity {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] call_log = {"Caller Name & Phone No.", "Caller Name & Phone No.",
            "Caller Name & Phone No.", "Caller Name & Phone No.", "Caller Name & Phone No."};


    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_logs);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_home);

        listView = (ListView)findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, call_log);
        listView.setAdapter(adapter);

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call_intent = new Intent(call_logs.this, MainActivity.class);
                startActivity(call_intent);
            }


        });

    }

}

