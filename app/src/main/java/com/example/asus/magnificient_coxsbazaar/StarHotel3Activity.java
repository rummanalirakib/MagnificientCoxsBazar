package com.example.asus.magnificient_coxsbazaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class StarHotel3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_hotel3);

        TextView tv2 = (TextView) findViewById(R.id.mishuk);
        TextView tv3 = (TextView) findViewById(R.id.oceanpalace);
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
        Contact cn3=db1.getSingleContact(3);
        Contact cn4=db1.getSingleContact(4);
        tv2.setText(cn3._name);
        tv3.setText(cn4._name);
    }
}
