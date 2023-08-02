package com.example.asus.magnificient_coxsbazaar;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        TextView tv = (TextView) findViewById(R.id.introductionh);
        TextView tv1 = (TextView) findViewById(R.id.introtext);
        DatabaseHandler db = new DatabaseHandler(this);


       // Log.d("Inserting: ", "Inseting.....");

        Log.d("Reading: ", "Reading....");
        //Contact mycoContact=db.getSingetContact(1);
     /*   List<Contact> mycontactList = db.getAllContact();
        for (Contact mycoContact : mycontactList) {
            String result = "Id: " + mycoContact.getId() + " Name: " + mycoContact.getName() + " Phone No.: " + mycoContact.getContactNumber();

            Log.d("Name: ", result);
            tv.setText(result);


        }
*/
        Contact cn=db.getSingleContact(1);
        Contact cn1=db.getSingleContact(2);
        tv.setText(cn._name);
        tv1.setText(cn1._name);

    }

}
