package com.example.logoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView sign_up_text=findViewById(R.id.sign_up_tv2);
        EditText fname=findViewById(R.id.fname_et);
        EditText lname=findViewById(R.id.lname_et);
        final EditText passward=findViewById(R.id.passward_et);
        CheckBox checkBox=findViewById(R.id.chk);
        EditText email=findViewById(R.id.email_et);
        EditText phone=findViewById(R.id.phone_et);
        Button register=findViewById(R.id.register_button);
        TextView have_account=findViewById(R.id.have_account_tv);
        TextView sign_in=findViewById(R.id.sign_in_tv);
        Button explore=findViewById(R.id.explore_btn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this,"add to database",Toast.LENGTH_SHORT).show();
            }
        });
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(RegisterActivity.this,HomeActivity.class);
                startActivity(intent);            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    passward.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }
                else{
                    passward.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });
    }
}
