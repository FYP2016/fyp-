package mmc.demo.monitormychlid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sync extends AppCompatActivity implements View.OnClickListener{

    Button bSync;
    TextView bWait;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bSync = (Button) findViewById(R.id.bSync);
        bSync.setOnClickListener(this);
        bWait = (TextView) findViewById(R.id.bWait);

    }

    @Override
    public void onClick(View v)
    {
        String method = "sync";
        backgroundTask bTask = new backgroundTask(this);
        bTask.execute(method);
        //startActivity(new Intent(this,synchronization.class));
    }
}