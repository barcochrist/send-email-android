package com.programacionmaster.sendemail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CredentialActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private Button buttonCompose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credential);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonCompose = findViewById(R.id.buttonCompose);

        //TODO Validate mandatory fields
        buttonCompose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectToMainActivity();
            }
        });
    }

    private void redirectToMainActivity() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("recipientEmail", editTextEmail.getText().toString());
        intent.putExtra("recipientPassword", editTextPassword.getText().toString());
        startActivity(intent);
    }
}