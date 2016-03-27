package mmc.demo.monitormychlid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener{

Button bLogin;
    TextView registerLink;
   public EditText  etUserId, etPassword;
   public String id, password;
    RadioButton  rdParent, rdChild;
    RadioGroup rg;

        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);


            etUserId = (EditText) findViewById(R.id.etUserId);
            etPassword = (EditText) findViewById(R.id.etPassword);
            registerLink = (TextView) findViewById(R.id.registerLink);
            bLogin = (Button) findViewById(R.id.bLogin);


            registerLink.setOnClickListener(this);
            bLogin.setOnClickListener(this);
            // selectItem();
        }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.registerLink:
                Intent registerIntent = new Intent(login.this, register.class);
                startActivity(registerIntent);
                break;
            case R.id.bLogin:
                if (etUserId.getText().length() == 0 || etPassword.getText().length() == 0) {
                    etUserId.setError( "Fill in the field" );
                    etPassword.setError("Fill in the field");}
                else{
                    id = etUserId.getText().toString();
                    password = etPassword.getText().toString();
                    String method = "login";
                    backgroundTask bTask = new backgroundTask(this);
                    bTask.execute(method, id, password);
                }

                break;

                }
        }
    }
