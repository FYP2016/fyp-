package mmc.demo.monitormychlid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display_call_log, display_messages, display_history, display_dictionary, display_location, display_add_child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        display_call_log = (TextView) findViewById(R.id.textView_call_log);
        display_messages = (TextView) findViewById(R.id.textView_messages);
        display_location = (TextView) findViewById(R.id.textView_location);
        display_history = (TextView) findViewById(R.id.textView_history);
        display_dictionary = (TextView) findViewById(R.id.textView_dictionary);
        display_add_child = (TextView) findViewById(R.id.textView_add_child);



        display_call_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call_intent = new Intent(MainActivity.this, call_logs.class);
                startActivity(call_intent);
            }


        });

        display_messages.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent messages_intent = new Intent(MainActivity.this, message_logs.class);
                startActivity(messages_intent);
            }

        });

        display_location.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent location_intent = new Intent(MainActivity.this, location.class);
                startActivity(location_intent);
            }

        });

        display_history.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent history_intent = new Intent(MainActivity.this, browsing_history.class);
                startActivity(history_intent);
            }

        });

        display_dictionary.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent dictionary_intent = new Intent(MainActivity.this, dictionary.class);
                startActivity(dictionary_intent);
            }

        });

        display_add_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent child_intent = new Intent(MainActivity.this, synchronization.class);
                startActivity(child_intent);
            }


        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

  /*  public void onBackPressed() {
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);

    }*/

}

