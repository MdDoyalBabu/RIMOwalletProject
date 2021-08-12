package com.example.rimodesignpart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    private TextView phone,activeStatus,joiningDate,expireDate,nameCardHolder;
    private Button frontSize,backSize,addBalance,sendBalance,withdraw,transectionReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        init();

    }
    private void  init(){
        phone=findViewById(R.id.phoneNumber_id);
        activeStatus=findViewById(R.id.on_id);
        joiningDate=findViewById(R.id.joining_date_id);
        expireDate=findViewById(R.id.expire_date_id);
        nameCardHolder=findViewById(R.id.phoneNumber_id);

        frontSize=findViewById(R.id.frontSize_id);
        backSize=findViewById(R.id.backSide_id);
        addBalance=findViewById(R.id.add_balance_id);
        sendBalance=findViewById(R.id.send_balance_id);
        withdraw=findViewById(R.id.withdraw_id);
        transectionReport=findViewById(R.id.transection_report_id);

    }
}