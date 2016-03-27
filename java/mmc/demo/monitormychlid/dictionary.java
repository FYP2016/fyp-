package mmc.demo.monitormychlid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class dictionary extends AppCompatActivity {

    TextView display_dictionary, display_good_words, display_bad_words, display_words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_home);
        display_dictionary = (TextView) findViewById(R.id.textView_dictionary);
        display_good_words = (TextView) findViewById(R.id.textView_good_words);
        display_bad_words = (TextView) findViewById(R.id.textView_bad_words);
        display_words = (TextView) findViewById(R.id.textView_words);

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call_intent = new Intent(dictionary.this, MainActivity.class);
                startActivity(call_intent);
            }


        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent plusIntent= new Intent(dictionary.this, add_words.class);
                startActivity(plusIntent);
            }
        });

    }

}
