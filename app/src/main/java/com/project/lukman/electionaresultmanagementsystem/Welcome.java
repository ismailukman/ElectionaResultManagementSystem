package com.project.lukman.electionaresultmanagementsystem;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;


public class Welcome extends ActionBarActivity {
    Button btn;
    TextView txtusername, txtPUuserId, txtPUId;
    EditText Username, PUuserId, PUId;
    public static final String PREFS_NAME = "MyPrefsFile";
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();

        btn = (Button) findViewById(R.id.button);
        txtusername = (TextView) findViewById(R.id.textView);
        txtPUuserId = (TextView) findViewById(R.id.textView2);
        txtPUId = (TextView) findViewById(R.id.textView3);
        Username = (EditText) findViewById(R.id.editText);
        PUuserId = (EditText) findViewById(R.id.editText2);
        PUId = (EditText) findViewById(R.id.editText3);

        String test = settings.getString("Name", "");
        if (test.equals("")) {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                SharedPreferences.Editor editor = settings.edit();
                String Name = Username.getText().toString();
                String HisId = PUuserId.getText().toString();
                String Id = PUId.getText().toString();


                if (Name.equals("") || HisId.equals("") || Id.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter your UserName, ID and PUId",
                            Toast.LENGTH_SHORT).show();

                } else {
                    editor.putString("Name", Name);
                    editor.putString("HisId", HisId);
                    editor.putString("Id", Id);
                    editor.commit();

                    Toast.makeText(getApplicationContext(), "Saved!",
                    Toast.LENGTH_SHORT).show();
                       Welcome.this.finish();
                    Intent i = new Intent(Welcome.this, Result.class);
                    startActivity(i);
                }
            }
        });

        }else {
            Welcome.this.finish();
            Intent j = new Intent(Welcome.this, Login.class);
            startActivity(j);
           }
    }




}
