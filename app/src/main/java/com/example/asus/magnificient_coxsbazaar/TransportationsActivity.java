package com.example.asus.magnificient_coxsbazaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TransportationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportations);
        TextView tv14 = (TextView) findViewById(R.id.introduction);
        TextView tv15 = (TextView) findViewById(R.id.byairtext);
        TextView tv16 = (TextView) findViewById(R.id.bybustext);
        DatabaseHandler db1 = new DatabaseHandler(this);


        Log.d("Inserting: ", "Inseting.....");

        Log.d("Reading: ", "Reading....");
        //Contact mycoContact=db.getSingetContact(1);
     /*   List<Contact> mycontactList = db.getAllContact();
        for (Contact mycoContact : mycontactList) {
            String result = "Id: " + mycoContact.getId() + " Name: " + mycoContact.getName() + " Phone No.: " + mycoContact.getContactNumber();

            Log.d("Name: ", result);
            tv.setText(result);


        }
*/
        Contact cn15=db1.getSingleContact(15);
        Contact cn16=db1.getSingleContact(16);
        Contact cn17=db1.getSingleContact(17);
        tv14.setText(cn15._name);
        tv15.setText(cn16._name);
        tv16.setText(cn17._name);
    }
}
