package mmc.demo.monitormychlid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class synchronization extends AppCompatActivity {

    TextView  display_child_id;
    EditText  enter_child_id;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synchronization);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageView = (ImageView) findViewById(R.id.imageView_sync);

        display_child_id = (TextView) findViewById(R.id.textView_child_id);
        enter_child_id = (EditText) findViewById(R.id.editText_cid);

        Button ok_button = (Button) findViewById(R.id.button_ok);

        ok_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent syncIntent = new Intent(synchronization.this, choose_kid.class);
                startActivity(syncIntent);

            }


        });



    }

}
