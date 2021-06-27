package com.example.intern_task_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name, Branch, Year, Regd_no;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submit=(Button) findViewById(R.id.submit);
        Name=(EditText) findViewById(R.id.name);
        Branch=(EditText) findViewById(R.id.branch);
        Year=(EditText) findViewById(R.id.year);
        Regd_no=(EditText) findViewById(R.id.regd_no);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = Name.getText().toString();
                final String branch=Branch.getText().toString();
                final String year = Year.getText().toString();
                final String RegdNo = Regd_no.getText().toString();

                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(MainActivity.this, "Please Enter your name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(branch)) {
                    Toast.makeText(MainActivity.this, "Please Enter your branch", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(year)) {
                    Toast.makeText(MainActivity.this, "Please Enter year", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(RegdNo)) {
                    Toast.makeText(MainActivity.this, "Please Enter Registration number", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent=new Intent(MainActivity.this,show.class);
                intent.putExtra("keyname",name);
                intent.putExtra("keybranch",branch);
                intent.putExtra("keyyear",year);
                intent.putExtra("keyRegd_no",RegdNo);
                startActivity(intent);
            }
        });
    }
}