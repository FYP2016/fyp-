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
import android.widget.Toast;

public class register extends AppCompatActivity implements View.OnClickListener {

    Button bRegister;
    EditText etUsername, etPassword, etPhone_no;
    String username, password, phone_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bRegister = (Button) findViewById(R.id.bRegister);
        bRegister.setOnClickListener(this);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPhone_no = (EditText) findViewById(R.id.etPhone_no);
    }

    @Override
    public void onClick(View v) {

        if (etUsername.getText().length() == 0 || etPassword.getText().length() == 0 || etPhone_no.getText().length() == 0) {
            etUsername.setError("Fill in the field");
            etPassword.setError("Fill in the field");
            etPhone_no.setError("Fill in the field");
        } else {
            username = etUsername.getText().toString();
            password = etPassword.getText().toString();
            phone_no = etPhone_no.getText().toString();
            String method = "register";
            backgroundTask bTask = new backgroundTask(this);
            bTask.execute(method, username, password, phone_no);
            finish();
            startActivity(new Intent(getApplicationContext(), success.class));
        }
    }


}

