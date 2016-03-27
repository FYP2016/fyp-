package mmc.demo.monitormychlid;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class success extends AppCompatActivity implements View.OnClickListener {

    TextView loginLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        loginLink= (TextView) findViewById(R.id.loginLink);
        loginLink.setOnClickListener(this);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loginLink:
                Intent successIntent = new Intent(success.this, login.class);
                startActivity(successIntent);
                break;
        }

    }
}


