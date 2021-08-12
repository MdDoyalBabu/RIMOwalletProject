package com.example.rimodesignpart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button regBtn,selfiBtn,frontSideBtn,backSideBtn;
    private EditText nameAsNid,phone,retypePhone,password,retypePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        init();



        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,ProfileActivity.class));
            }
        });

    }

    private void init(){

        regBtn=findViewById(R.id.create_accout_id);
        frontSideBtn=findViewById(R.id.frontSide_id);
        backSideBtn=findViewById(R.id.backSide_id);
        selfiBtn=findViewById(R.id.selfi_id);

        phone=findViewById(R.id.phone_id);
        retypePhone=findViewById(R.id.retype_phone_id);
        password=findViewById(R.id.password_id);
        retypePassword=findViewById(R.id.retype_password_id);
    }
}