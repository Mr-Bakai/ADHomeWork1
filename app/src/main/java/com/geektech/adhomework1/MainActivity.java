package com.geektech.adhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private TextView info;
    private Button  btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etText1);
        password = findViewById(R.id.etText2);

         btn = findViewById(R.id.btn);
        info = findViewById(R.id.info);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String userName, String password) {

        if ((userName.equals("me")) && (password.equals("000"))) {

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            startActivity(intent);
        } else if (password.length() > 3) {
            info.setText("Password must contain 3 characters only");
        } else {
            info.setText("Wrong user name or password");
        }
    }
}
