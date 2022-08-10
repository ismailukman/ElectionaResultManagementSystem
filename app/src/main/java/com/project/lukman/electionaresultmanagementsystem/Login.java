package com.project.lukman.electionaresultmanagementsystem;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.widget.Toast;


public class Login extends ActionBarActivity {

    Button btn;
    TextView txt1, txt2, txt3;
    EditText edit1, edit2, edit3;
    public static final String PREFS_NAME = "MyPrefsFile";
    SharedPreferences sharedpreferences;
    String Name2, HisId2, Id2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btn = (Button) findViewById(R.id.button);
        edit1 = (EditText) findViewById(R.id.editText);
        edit2 = (EditText) findViewById(R.id.editText2);
        edit3 = (EditText) findViewById(R.id.editText3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                //SharedPreferences.Editor editor = settings.edit();

                String Name1 = edit1.getText().toString();
                String HisId1 = edit2.getText().toString();
                String Id1 = edit3.getText().toString();

                Name2 = settings.getString("Name", "");
                HisId2 = settings.getString("HisId", "");
                Id2 = settings.getString("Id", "");

                if((Name1.equals(Name2) && HisId1.equals(HisId2) && Id1.equals(Id2))  ){

                    if(Name1.equals("") || HisId1.equals("") || Id1.equals("")){
                        Toast.makeText(getApplicationContext(), "You are not Registered!",
                                Toast.LENGTH_SHORT).show();
                    }else {
                        Login.this.finish();
                        Intent i = new Intent(Login.this, Result.class);
                        startActivity(i);

                        Toast.makeText(getApplicationContext(), "Access Granted!!!",
                                Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(), "Please enter your correct UserName, ID and PUId",
                            Toast.LENGTH_SHORT).show();
                }


            }
        });


    }



}
