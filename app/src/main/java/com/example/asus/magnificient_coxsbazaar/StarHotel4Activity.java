package com.example.asus.magnificient_coxsbazaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class StarHotel4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_hotel4);


        TextView tv4 = (TextView) findViewById(R.id.coastal1);
        TextView tv5 = (TextView) findViewById(R.id.seacrown1);
        TextView tv6= (TextView) findViewById(R.id.kollol1);
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
        Contact cn5=db1.getSingleContact(5);
        Contact cn6=db1.getSingleContact(6);
        Contact cn7=db1.getSingleContact(7);
        tv4.setText(cn5._name);
        tv5.setText(cn6._name);
        tv6.setText(cn7._name);
    }
}
