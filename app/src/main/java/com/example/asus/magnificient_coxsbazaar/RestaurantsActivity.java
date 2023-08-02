package com.example.asus.magnificient_coxsbazaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
       TextView T = (TextView) findViewById(R.id.efclive1);
        TextView T1 = (TextView) findViewById(R.id.koyla1);
        TextView T2 = (TextView) findViewById(R.id.mermaid1);
        TextView T3 = (TextView) findViewById(R.id.kfc1);
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
        Contact cn8=db1.getSingleContact(11);
        Contact cn9=db1.getSingleContact(12);
        Contact cn10=db1.getSingleContact(13);
        Contact cn11=db1.getSingleContact(14);
        T.setText(cn8._name);
        T1.setText(cn9._name);
        T2.setText(cn10._name);
        T3.setText(cn11._name);
    }
}
