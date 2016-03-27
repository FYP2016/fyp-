package mmc.demo.monitormychlid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class add_words extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_words);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText add_words = (EditText) findViewById(R.id.editText_add_word);
        final Button add_bad = (Button) findViewById(R.id.button_add_bad);

        add_bad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (add_words.getText().length() == 0) {

                    Toast.makeText(getBaseContext(), "Oops!! you forgot to add word", Toast.LENGTH_LONG).show();

                } else
                    Toast.makeText(getBaseContext(), "Word successfully added to Bad Words!", Toast.LENGTH_LONG).show();
            }

        });

    }
}

