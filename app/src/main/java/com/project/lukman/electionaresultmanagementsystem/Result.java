package com.project.lukman.electionaresultmanagementsystem;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Result extends ActionBarActivity {
    //WifiInfo info;
    //WifiManager manager;
    Button btn1;
    TextView tag1,text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28;
    EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9,edit10,edit11,edit12,edit13,edit14,edit15,edit16,edit17,edit18,edit19,edit20,edit21,edit22,edit23,edit24,edit25,edit26,edit27,edit28;
    String fone, tag, message,Name4,PUId4,Id4,address,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,e25,e26,e27,e28;
    //String phoneNo="08136605722";
    //String phoneNo="08058917365";
    Spinner spin, fon;
    public static final String PREFS_NAME = "MyPrefsFile";
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        e1 = "0";e2 = "0";e3 = "0";e4 = "0";e5 = "0";e6 = "0";e7 = "0";e8 = "0";e9 = "0";e10 = "0";
        e11 = "0";e12 = "0";e13 = "0";e14 = "0";e15 = "0";e16 = "0";e17 = "0";e18 = "0";e19 = "0";
        e20 = "0";e21 = "0";e22 = "0";e23 = "0";e24 = "0";e25 = "0";e26 = "0";e27 = "0";e28 = "0";


        tag1 = (TextView) findViewById(R.id.textView29);
        text1 = (TextView) findViewById(R.id.textView4);
        text2 = (TextView) findViewById(R.id.textView5);
        text3 = (TextView) findViewById(R.id.textView6);
        text4 = (TextView) findViewById(R.id.textView7);
        text5 = (TextView) findViewById(R.id.textView8);
        text6 = (TextView) findViewById(R.id.textView9);
        text7 = (TextView) findViewById(R.id.textView010);
        text8 = (TextView) findViewById(R.id.textView011);
        text9 = (TextView) findViewById(R.id.textView012);
        text10 = (TextView) findViewById(R.id.textView013);
        text11 = (TextView) findViewById(R.id.textView014);
        text12 = (TextView) findViewById(R.id.textView015);
        text13 = (TextView) findViewById(R.id.textView016);
        text14 = (TextView) findViewById(R.id.textView017);
        text15 = (TextView) findViewById(R.id.textView018);
        text16 = (TextView) findViewById(R.id.textView019);
        text17 = (TextView) findViewById(R.id.textView020);
        text18 = (TextView) findViewById(R.id.textView021);
        text19 = (TextView) findViewById(R.id.textView022);
        text20 = (TextView) findViewById(R.id.textView023);
        text21 = (TextView) findViewById(R.id.textView024);
        text22 = (TextView) findViewById(R.id.textView025);
        text23 = (TextView) findViewById(R.id.textView026);
        text24 = (TextView) findViewById(R.id.textView027);
        text25 = (TextView) findViewById(R.id.textView028);
        text26 = (TextView) findViewById(R.id.textView029);
        text27 = (TextView) findViewById(R.id.textView030);
        text28 = (TextView) findViewById(R.id.textView031);

        btn1 = (Button) findViewById(R.id.button2);
        spin = (Spinner) findViewById(R.id.spinner);
        fon = (Spinner) findViewById(R.id.spinner1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              for(int i=1;i<29;i++) {
                  String hold = "e"+i;
                  if (hold == null || hold == "") {
                      hold = "0";
                  }
              }

                //e1 = "0";e2 = "0";e3 = "0";e4 = "0";e5 = "0";e6 = "0";e7 = "0";e8 = "0";e9 = "0";e10 = "0";
                //e11 = "0";e12 = "0";e13 = "0";e14 = "0";e15 = "0";e16 = "0";e17 = "0";e18 = "0";e19 = "0";
                //e20 = "0";e21 = "0";e22 = "0";e23 = "0";e24 = "0";e25 = "0";e26 = "0";e27 = "0";e28 = "0";



                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                SharedPreferences.Editor editor = settings.edit();

                //WifiManager manager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                //WifiInfo info = manager.getConnectionInfo();

                Name4 = settings.getString("Name", "");
                PUId4 = settings.getString("HisId", "");
                Id4 = settings.getString("Id", "");
               /* boolean state = manager.isWifiEnabled();
                if("False".equals(state)) {
                    manager.setWifiEnabled(true);
                     address = info.getMacAddress();
                }else{
                     address = info.getMacAddress();
                }*/

                //Toast.makeText(getApplicationContext(), address, Toast.LENGTH_SHORT).show();
                tag = String.valueOf(spin.getSelectedItem());
                fone = String.valueOf(fon.getSelectedItem());

                message = Name4+" "+PUId4+" "+Id4+" "+"Election Tag:"+tag+" "+"A:"+e1+" "+"AA:"+e2+" "+"ACD:"+e3+" "+"ACPN:"+e4+" "+"AD:"+e5+" "+"ADC:"+e6+" "+"APA:"+e7+" "+"APC:"+e8+" "+"APGA:"+e9+" "+"CPP:"+e10+" "+"DPP:"+e11+" "+"FRESH:"+e12+" "+"HDP:"+e13+" "+"ID:"+e14+" "
                        +"KP:"+e15+" "+"LP:"+e16+" "+"MPPP:"+e17+" "+"NCP:"+e18+" "+"NNPP:"+e19+" "+"PDC:"+e20+" "+"PDM:"+e21+" "+"PDP:"+e22+" "+"PPA:"+e23+" "+"PPN:"+e24+" "+"SDP:"+e25+" "+"UDP:"+e26+" "+"UPN:"+e27+" "+"UPP:"+e28+" ";
                if( tag.equals("Select") || fone.equals("Select")  ){
                    Toast.makeText(getApplicationContext(), "Please select a valid election tag or a phone number!",
                            Toast.LENGTH_SHORT).show();
                }else{
                    sendSMS(fone, message);
                    //getContentResolver().delete(Uri.parse("content://sms/outbox"), "address = ? and body = ?", new String[]{fone, message});
                   // Toast.makeText(getApplicationContext(), "A:"+e1+" "+"AA:"+e2+" "+"ACD:"+e3+" "+"ACPN:"+e4+" "+"AD:"+e5+" "+"ADC:"+e6+" "+"APA:"+e7+" "+"APC:"+e8,
                           // Toast.LENGTH_SHORT).show();
                }

            }
        });

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for A");
                builder.setIcon(R.drawable.a);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e1 = input.getText().toString();
                        try{
                            if(!e1.equals("Vote Count") || !e1.equals("0") || !e1.equals("")){
                                text1.setText(""+Integer.parseInt(e1));
                            }else{
                                if(e1.equals("0")){
                                    text1.setText("0");

                                }else{
                                    text1.setText("Vote Count");

                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text1.setText("Vote Count");
                            e1="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for AA");
                builder.setIcon(R.drawable.aa);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e2 = input.getText().toString();
                        try{
                            if(!e2.equals("Vote Count") || !e2.equals("0") || !e2.equals("")){
                                text2.setText(""+Integer.parseInt(e2));
                            }else{
                                if(e2.equals("0")){
                                    text2.setText("0");

                                }else{
                                    text2.setText("Vote Count");

                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text2.setText("Vote Count");
                            e2="0";
                        }finally {
                            dialog.cancel();

                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for ACD");
                builder.setIcon(R.drawable.acd);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e3 = input.getText().toString();
                        try{
                            if(!e3.equals("Vote Count") || !e3.equals("0") || !e3.equals("")){
                                text3.setText(""+Integer.parseInt(e3));
                            }else{
                                if(e3.equals("0")){
                                    text3.setText("0");

                                }else{
                                    text3.setText("Vote Count");

                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text3.setText("Vote Count");
                            e3="0";
                        }finally {
                            dialog.cancel();

                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for ACPN");
                builder.setIcon(R.drawable.acpn);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e4 = input.getText().toString();
                        try{
                            if(!e4.equals("Vote Count") || !e4.equals("0") || !e4.equals("")){
                                text4.setText(""+Integer.parseInt(e4));
                            }else{
                                if(e4.equals("0")){
                                    text4.setText("0");

                                }else{
                                    text4.setText("Vote Count");

                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text4.setText("Vote Count");
                            e4="0";
                        }finally {
                            dialog.cancel();

                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for AD");
                builder.setIcon(R.drawable.ad);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e5 = input.getText().toString();
                        try{
                            if(!e5.equals("Vote Count") || !e5.equals("0") || !e5.equals("")){
                                text5.setText(""+Integer.parseInt(e5));
                            }else{
                                if(e5.equals("0")){
                                    text5.setText("0");

                                }else{
                                    text5.setText("Vote Count");

                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text5.setText("Vote Count");
                            e5="0";
                        }finally {
                            dialog.cancel();

                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for ADC");
                builder.setIcon(R.drawable.adc);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e6 = input.getText().toString();
                        try{
                            if(!e6.equals("Vote Count") || !e6.equals("0") || !e6.equals("")){
                                text6.setText(""+Integer.parseInt(e6));
                            }else{
                                if(e6.equals("0")){
                                    text6.setText("0");
                                }else{
                                    text6.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text6.setText("Vote Count");
                            e6="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for APA");
                builder.setIcon(R.drawable.apa);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e7 = input.getText().toString();
                        try{
                            if(!e7.equals("Vote Count") || !e7.equals("0") || !e7.equals("")){
                                text7.setText(""+Integer.parseInt(e7));
                            }else{
                                if(e7.equals("0")){
                                    text7.setText("0");
                                }else{
                                    text7.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text7.setText("Vote Count");
                            e7="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for APC");
                builder.setIcon(R.drawable.apc);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e8 = input.getText().toString();
                        try{
                            if(!e8.equals("Vote Count") || !e8.equals("0") || !e8.equals("")){
                                text8.setText(""+Integer.parseInt(e8));
                            }else{
                                if(e8.equals("0")){
                                    text8.setText("0");
                                }else{
                                    text8.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text8.setText("Vote Count");
                            e8="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for APGA");
                builder.setIcon(R.drawable.apga);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e9 = input.getText().toString();
                        try{
                            if(!e9.equals("Vote Count") || !e9.equals("0") || !e9.equals("")){
                                text9.setText(""+Integer.parseInt(e9));
                            }else{
                                if(e9.equals("0")){
                                    text9.setText("0");
                                }else{
                                    text9.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text9.setText("Vote Count");
                            e9="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for CPP");
                builder.setIcon(R.drawable.cpp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e10 = input.getText().toString();
                        try{
                            if(!e10.equals("Vote Count") || !e10.equals("0") || !e10.equals("")){
                                text10.setText(""+Integer.parseInt(e10));
                            }else{
                                if(e10.equals("0")){
                                    text10.setText("0");
                                }else{
                                    text10.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text10.setText("Vote Count");
                            e10="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for DPP");
                builder.setIcon(R.drawable.dpp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e11 = input.getText().toString();
                        try{
                            if(!e11.equals("Vote Count") || !e11.equals("0") || !e11.equals("")){
                                text11.setText(""+Integer.parseInt(e11));
                            }else{
                                if(e11.equals("0")){
                                    text11.setText("0");
                                }else{
                                    text11.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text11.setText("Vote Count");
                            e11="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for FRESH");
                builder.setIcon(R.drawable.fesh);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e12 = input.getText().toString();
                        try{
                            if(!e12.equals("Vote Count") || !e12.equals("0") || !e12.equals("")){
                                text12.setText(""+Integer.parseInt(e12));
                            }else{
                                if(e12.equals("0")){
                                    text12.setText("0");
                                }else{
                                    text12.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text12.setText("Vote Count");
                            e12="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for HDP");
                builder.setIcon(R.drawable.hdc);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e13 = input.getText().toString();
                        try{
                            if(!e13.equals("Vote Count") || !e13.equals("0") || !e13.equals("")){
                                text13.setText(""+Integer.parseInt(e13));
                            }else{
                                if(e13.equals("0")){
                                    text13.setText("0");
                                }else{
                                    text13.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text13.setText("Vote Count");
                            e13="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for ID");
                builder.setIcon(R.drawable.id);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e14 = input.getText().toString();
                        try{
                            if(!e14.equals("Vote Count") || !e14.equals("0") || !e14.equals("")){
                                text14.setText(""+Integer.parseInt(e14));
                            }else{
                                if(e14.equals("0")){
                                    text14.setText("0");
                                }else{
                                    text14.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text14.setText("Vote Count");
                            e14="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for KP");
                builder.setIcon(R.drawable.kp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e15 = input.getText().toString();
                        try{
                            if(!e15.equals("Vote Count") || !e15.equals("0") || !e15.equals("")){
                                text15.setText(""+Integer.parseInt(e15));
                            }else{
                                if(e15.equals("0")){
                                    text15.setText("0");
                                }else{
                                    text15.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text15.setText("Vote Count");
                            e15="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for LP");
                builder.setIcon(R.drawable.lp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e16 = input.getText().toString();
                        try{
                            if(!e16.equals("Vote Count") || !e16.equals("0") || !e16.equals("")){
                                text16.setText(""+Integer.parseInt(e16));
                            }else{
                                if(e16.equals("0")){
                                    text16.setText("0");
                                }else{
                                    text16.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text16.setText("Vote Count");
                            e16="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for MPPP");
                builder.setIcon(R.drawable.mppp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e17 = input.getText().toString();
                        try{
                            if(!e17.equals("Vote Count") || !e17.equals("0") || !e17.equals("")){
                                text17.setText(""+Integer.parseInt(e17));
                            }else{
                                if(e17.equals("0")){
                                    text17.setText("0");
                                }else{
                                    text17.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text17.setText("Vote Count");
                            e17="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for NCP");
                builder.setIcon(R.drawable.ncp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e18 = input.getText().toString();
                        try{
                            if(!e18.equals("Vote Count") || !e18.equals("0") || !e18.equals("")){
                                text18.setText(""+Integer.parseInt(e18));
                            }else{
                                if(e18.equals("0")){
                                    text18.setText("0");
                                }else{
                                    text18.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text18.setText("Vote Count");
                            e18="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for NNPP");
                builder.setIcon(R.drawable.nnpp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e19 = input.getText().toString();
                        try{
                            if(!e19.equals("Vote Count") || !e19.equals("0") || !e19.equals("")){
                                text19.setText(""+Integer.parseInt(e19));
                            }else{
                                if(e19.equals("0")){
                                    text19.setText("0");
                                }else{
                                    text19.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text19.setText("Vote Count");
                            e19="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for PDC");
                builder.setIcon(R.drawable.pdc);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e20 = input.getText().toString();
                        try{
                            if(!e20.equals("Vote Count") || !e20.equals("0") || !e20.equals("")){
                                text20.setText(""+Integer.parseInt(e20));
                            }else{
                                if(e20.equals("0")){
                                    text20.setText("0");
                                }else{
                                    text20.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text20.setText("Vote Count");
                            e20="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for PDM");
                builder.setIcon(R.drawable.pdm);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e21 = input.getText().toString();
                        try{
                            if(!e21.equals("Vote Count") || !e21.equals("0") || !e21.equals("")){
                                text21.setText(""+Integer.parseInt(e21));
                            }else{
                                if(e21.equals("0")){
                                    text21.setText("0");
                                }else{
                                    text21.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text21.setText("Vote Count");
                            e21="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for PDP");
                builder.setIcon(R.drawable.pdp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e22 = input.getText().toString();
                        try{
                            if(!e22.equals("Vote Count") || !e22.equals("0") || !e22.equals("")){
                                text22.setText(""+Integer.parseInt(e22));
                            }else{
                                if(e22.equals("0")){
                                    text22.setText("0");
                                }else{
                                    text22.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text22.setText("Vote Count");
                            e22="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for PPA");
                builder.setIcon(R.drawable.ppa);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e23 = input.getText().toString();
                        try{
                            if(!e23.equals("Vote Count") || !e23.equals("0") || !e23.equals("")){
                                text23.setText(""+Integer.parseInt(e23));
                            }else{
                                if(e23.equals("0")){
                                    text23.setText("0");
                                }else{
                                    text23.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text23.setText("Vote Count");
                            e23="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for PPN");
                builder.setIcon(R.drawable.ppn);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e24 = input.getText().toString();
                        try{
                            if(!e24.equals("Vote Count") || !e24.equals("0") || !e24.equals("")){
                                text24.setText(""+Integer.parseInt(e24));
                            }else{
                                if(e24.equals("0")){
                                    text24.setText("0");
                                }else{
                                    text24.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text24.setText("Vote Count");
                            e24="0";
                        }finally {
                            dialog.cancel();
                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for SDP");
                builder.setIcon(R.drawable.sdp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e25 = input.getText().toString();
                        try{
                            if(!e25.equals("Vote Count") || !e25.equals("0") || !e25.equals("")){
                                text25.setText(""+Integer.parseInt(e25));
                            }else{
                                if(e25.equals("0")){
                                    text25.setText("0");
                                }else{
                                    text25.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text25.setText("Vote Count");
                            e25="0";
                        }finally {
                            dialog.cancel();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for UDP");
                builder.setIcon(R.drawable.udp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e26 = input.getText().toString();
                        try{
                            if(!e26.equals("Vote Count") || !e26.equals("0") || !e26.equals("")){
                                text26.setText(""+Integer.parseInt(e26));
                            }else{
                                if(e26.equals("0")){
                                    text26.setText("0");
                                }else{
                                    text26.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text26.setText("Vote Count");
                            e26="0";
                        }finally {
                            dialog.cancel();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for UPN");
                builder.setIcon(R.drawable.upn);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e27 = input.getText().toString();
                        try{
                            if(!e27.equals("Vote Count") || !e27.equals("0") || !e27.equals("")){
                                text27.setText(""+Integer.parseInt(e27));
                            }else{
                                if(e27.equals("0")){
                                    text27.setText("0");
                                }else{
                                    text27.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text27.setText("Vote Count");
                            e27="0";
                        }finally {
                            dialog.cancel();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        text28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Result.this);
                builder.setTitle("vote count for UPP");
                builder.setIcon(R.drawable.upp);
                final EditText input = new EditText(Result.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        e28 = input.getText().toString();
                        try{
                            if(!e28.equals("Vote Count") || !e28.equals("0") || !e28.equals("")){
                                text28.setText(""+Integer.parseInt(e28));
                            }else{
                                if(e28.equals("0")){
                                    text28.setText("0");
                                }else{
                                    text28.setText("Vote Count");
                                }
                            }
                        }catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Please Only Integer Characters are Allowed", Toast.LENGTH_SHORT).show();
                            text28.setText("Vote Count");
                            e28="0";
                        }finally {
                            dialog.cancel();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });



    }

    //---sends a SMS message to another device---

    private void sendSMS(String phoneNo, String message) {
        SmsManager sms1 = SmsManager.getDefault();
        ArrayList<String> parts= sms1.divideMessage(message);
        int numParts = parts.size();

        String SENT = "SMS_SENT";
        String DELIVERED = "SMS_DELIVERED";

        ArrayList<PendingIntent> sentIntents = new ArrayList<PendingIntent>();
        ArrayList<PendingIntent> deliveryIntents = new ArrayList<PendingIntent>();

        for (int i = 0; i < numParts; i++) {

            sentIntents.add(PendingIntent.getBroadcast(this, 0, new Intent(SENT), 0));
            deliveryIntents.add(PendingIntent.getBroadcast(this, 0, new Intent(DELIVERED), 0));
        }
        //PendingIntent pi = PendingIntent.getActivity(this, 0,
        // new Intent(this, Main.class), 0);
        //SmsManager sms = SmsManager.getDefault();
        // sms.sendTextMessage(phoneNo, null, message, null, null);

        //PendingIntent sentPI = PendingIntent.getBroadcast(this, 0, new Intent(SENT), 0);
        //PendingIntent deliveredPI = PendingIntent.getBroadcast(this, 0, new Intent(DELIVERED), 0);

        //---when the SMS has been sent---
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context arg0, Intent arg1) {
                switch (getResultCode()) {
                    case Activity.RESULT_OK:
                        Toast.makeText(getBaseContext(), "SMS sent",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        Toast.makeText(getBaseContext(), "Generic failure",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_NO_SERVICE:
                        Toast.makeText(getBaseContext(), "No service",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_NULL_PDU:
                        Toast.makeText(getBaseContext(), "Null PDU",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_RADIO_OFF:
                        Toast.makeText(getBaseContext(), "Radio off",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        }, new IntentFilter(SENT));


        //---when the SMS has been delivered---
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context arg0, Intent arg1) {
                switch (getResultCode()) {
                    case Activity.RESULT_OK:
                        Toast.makeText(getBaseContext(), "SMS delivered",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case Activity.RESULT_CANCELED:
                        Toast.makeText(getBaseContext(), "SMS not delivered",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        }, new IntentFilter(DELIVERED));

        // sms1.sendMultiPartTextMessage(mDestAddr,null, parts, sentIntents, deliveryIntents);
        // sms1.sendTextMessage(phoneNo, null, message, sentPI, deliveredPI);
        sms1.sendMultipartTextMessage(fone, null, parts, sentIntents, deliveryIntents);
    }
}
