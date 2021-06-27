package com.example.intern_task_0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class show extends AppCompatActivity {
    TextView Name, Branch, Year, Regd_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Name=(TextView) findViewById(R.id.name);
        Branch=(TextView) findViewById(R.id.branch);
        Year=(TextView) findViewById(R.id.year);
        Regd_no=(TextView) findViewById(R.id.regd_no);

        Name.setText(getIntent().getStringExtra("keyname"));
        Branch.setText(getIntent().getStringExtra("keybranch"));
        Year.setText(getIntent().getStringExtra("keyyear"));
        Regd_no.setText(getIntent().getStringExtra("keyRegd_no"));
    }
}