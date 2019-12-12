package com.example.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.esoftwarica.ui.dashboard.DashboardFragment;
import com.example.esoftwarica.ui.home.HomeFragment;
import com.example.esoftwarica.ui.home.HomeViewModel;

public class LoginActivity extends AppCompatActivity {

    Button btnlogin;
    EditText etusrname, etpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = findViewById(R.id.button);
        etusrname = findViewById(R.id.editText3);
        etpwd = findViewById(R.id.editText);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwd = etpwd.getText().toString();
                String usr = etusrname.getText().toString();
                if (usr.equals("admin") && passwd.equals("admin")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
