package com.example.asus.magnificient_coxsbazaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class StarHotel5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_hotel5);
        TextView tv7 = (TextView) findViewById(R.id.longbeach11);
        TextView tv8 = (TextView) findViewById(R.id.seagull11);
        TextView tv9 = (TextView) findViewById(R.id.royaltulip11);
        DatabaseHandler db1 = new DatabaseHandler(this);


    /*    Log.d("Inserting: ", "Inseting.....");

        db1.addContact(new Contact("Long Beach Hotel:\n" +
                "Address: 14 Kalatoli, Cox's Bazar, Bangladesh\n" +
                "Phone: +880 341-51843\n" +
                "Price:60$\n" +
                "Warm rooms in a relaxed hotel featuring an outdoor pool, a fitness centre and a restaurant.", "11"));
        db1.addContact(new Contact("Seagull Hotel:\n" +
                "                 Address: Cox's Bazar, Bangladesh\n" +
                "Phone: +880 341-62480 ext. 90\n" +
                "price: 50$\n" +
                "Overlooking the Bay of Bengal, this sleek hotel with a smoked-glass facade is a minutes' walk through trees to Cox's Bazar Beach, and 11 minutes on foot from cricket at Sheikh Kamal International Stadium.\n" +
                "\n" +
                "Bright, relaxed rooms feature free Wi-Fi, cable TV and minifridges. Suites add separate living rooms and balconies. Most offer ocean views, and 1 has a glass-roof living/dining area. Room service is available 24/7.\n" +
                "\n" +
                "Breakfast and parking are complimentary. There are 6 restaurants and bars, including a rooftop Italian eatery, and a bar beside an outdoor pool. There's also a spa and direct access to a private beach."
                , "22"));
        db1.addContact(new Contact("Royal Tulip Sea Beach Hotel:\n" +
                "                Address: Jaliapalong Inani Ukhia 4750, Coxs Bazar 4750, Bangladesh\n" +
                "Phone: +880 1844-016001\n" +
                "price: 109$\n" +
                "Refined beach resort with warm rooms and suites, some with bay views, plus 2 pools and 5 restaurants."
                , "33"));

        Log.d("Reading: ", "Reading....");
        //Contact mycoContact=db.getSingetContact(1);
     /*   List<Contact> mycontactList = db.getAllContact();
        for (Contact mycoContact : mycontactList) {
            String result = "Id: " + mycoContact.getId() + " Name: " + mycoContact.getName() + " Phone No.: " + mycoContact.getContactNumber();

            Log.d("Name: ", result);
            tv.setText(result);


        }
*/
       Contact cn8=db1.getSingleContact(8);
        Contact cn9=db1.getSingleContact(9);
        Contact cn10=db1.getSingleContact(10);
        tv7.setText(cn8._name);
        tv8.setText(cn9._name);
        tv9.setText(cn10._name);
    }
}
