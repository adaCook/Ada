package com.example.laicooper.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;



    public class MainActivity extends AppCompatActivity {
            EditText vHeight;
           EditText vWeight;
           Button submitButton;
            /** Called when the activity is first created. */
            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
//--- get views
                vHeight = (EditText) findViewById(R.id.height);
                vWeight = (EditText) findViewById(R.id.weight);
                submitButton = (Button) findViewById(R.id.submit);
            }
//            public void calcBMI(View view)
//            {
//                String height = vHeight.getText().toString();
//                String weight = vWeight.getText().toString();
//                Intent intent = new Intent(this, ReportActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putString("height", height);
//                bundle.putString("weight", weight);
//                intent.putExtras(bundle);
//                startActivity(intent);
//            }
            public void calcBMI(View v)
            {
                 String height = vHeight.getText().toString();
                 String weight = vWeight.getText().toString();
                 if (height.equals("") || weight.equals(""))
                 {
                     Toast.makeText(MainActivity.this, R.string.bmi_warning,
                     Toast.LENGTH_LONG).show();
                 }
                 else
                 {
                     Intent intent = new Intent(this, ReportActivity.class);
                     Bundle bundle = new Bundle();
                     bundle.putString("height", height);
                     bundle.putString("weight", weight);
                     intent.putExtras(bundle);
                     startActivity(intent);
                 }
            }
           public void aboutBMI(View view) {
               new AlertDialog.Builder(this)
                       .setTitle(R.string.about_button)
                       .setMessage(R.string.about_msg)
                       .setPositiveButton("OK",
                               new DialogInterface.OnClickListener() {
                                   public void onClick(
                                           DialogInterface dialoginterface, int i) {

                                   }
                               })
                       .show();
           }

           }

