package com.example.userform;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
 
	EditText name, age, dob;
	Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        age=(EditText) findViewById(R.id.age);
        dob=(EditText) findViewById(R.id.dob);
        save=(Button) findViewById(R.id.save);
    }
    public void SaveData(View v)
    {
		System.out.println(name.getText().toString()+"\n" + age.getText().toString() + dob.getText().toString());
	}
}
