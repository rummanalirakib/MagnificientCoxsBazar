package com.example.asus.magnificient_coxsbazaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomepageActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        this.Database();
        Button but1= (Button) findViewById(R.id.enjoyyourtrip);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, OptionpageActivity.class );

                startActivity(intent);
            }
        });
        Button but2= (Button) findViewById(R.id.aboutus);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, AboutUsActivity.class );

                startActivity(intent);
            }
        });
    }
    public void  Database ()
    {
        DatabaseHandler db1 = new DatabaseHandler(this);


        Log.d("Inserting: ", "Inseting.....");
        db1.addContact(new Contact("কক্সবাজার অথবা ৭৫ মাইল বীচ, Koksbajar, Koksbazar or Kokshbajar) is a town, a fishing port and district headquarters in Bangladesh. The beach in Cox's Bazar is an unbroken 120 km (75 mi) sandy sea beach with a gentle slope, is the world's longest.[2][3][4] It is located 150 km (93 mi) south of the industrial port Chittagong. Cox's Bazar is also known by the name Panowa, whose literal translation means yellow flower Its other old name was Palongee.\"\n", "0"));
        db1.addContact(new Contact("The modern Cox's Bazar derives its name from Captain Hiram Cox (died 1799), an officer of the British East India Company. Cox was appointed Superintendent of Palongkee outpost after Warren Hastings became Governor of Bengal. Captain Cox was specially mobilised to deal with a century-long conflict between Arakan refugees and local Rakhains. He embarked upon the task of rehabilitating refugees in the area and made significant progress. Captain Cox died in 1799 before he could finish his work. To commemorate his role in rehabilitation work, a market was established and named Cox's Bazar (Cox's Bazaar Market) after him."
                , "1"));


        db1.addContact(new Contact("Hotel Mishuk: Address: Cox's Bazar, Bangladesh Phone: +880 1715-946471 Price:15$ Laid-back hotel featuring airy rooms and suites, some with a/c, plus an international restaurant.", "2"));
        db1.addContact(new Contact("Ocean Palace Hotel: Address: 15/A, Block-C, Kolatoli Beach Road, Cox's Bazar., New Beach Rd, Cox's Bazar 4700, Bangladesh Phone: +880 341-52460 price: 13$ Unfussy rooms and plush suites in a laid-back hotel with a pair of restaurants and free breakfast."
                , "3"));

        db1.addContact(new Contact("Hotel Coastal Peace:\n" +
                "Address: Plot # 6, Block # B., Cox's Bazar, Bangladesh\n" +
                "Phone: +880 1755-521726\n" +
                "Price:28$\n" +
                "Low-key lodging offering complimentary Wi-Fi and breakfast, plus rooftop dining and a cafe.", "013"));
        db1.addContact(new Contact("Sea Crown:\n" +
                "                Address: Cox's Bazar, Bangladesh\n" +
                "Phone: +880 2-55068951\n" +
                "price: 26$\n" +
                "Unfussy quarters, some with kitchenettes, in a relaxed hotel offering complimentary breakfast."
                , "01345"));
        db1.addContact(new Contact("Hotel Kollol:\n" +
                "               Address: Laboni Beach Rd, Cox's Bazar, Bangladesh\n" +
                "Phone: +880 1717-255258\n" +
                "Relaxed hotel featuring an international restaurant and bay views, plus an outdoor pool and a gym."
                , "013456"));

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


        db1.addContact(new Contact("EFC Live Fish Restaurant:\n" +
                "\n" +
                "Rating:4.2\n" +
                "Address: Cox's Bazar, Bangladesh\n" +
                "Hours: Open today · 9AM–11:30PM\n" +
                "Phone: +880 1747-394802", "013"));
        db1.addContact(new Contact("Koyla Restaurant:\n" +
                "\n" +
                "Rating:4.3\n" +
                "Address: Cox's Bazar, Bangladesh\n" +
                "Hours: Open today · 8AM–12AM\n" +
                "Phone: +880 1796-669699", "01345"));
        db1.addContact(new Contact("Mermaid Café:\n" +
                "\n" +
                "Rating:4.2\n" +
                "Restaurant\n" +
                "Address: Cox's Bazar, Bangladesh\n" +
                "Hours: Open today · 8AM–11:30PM\n" +
                "Phone: +880 1841-416461"
                , "013456"));
        db1.addContact(new Contact("KFC Restaurant:\n" +
                "\n" +
                "Rating: 4.0\n" +
                "Fast-food chain known for its buckets of fried chicken, plus wings and sides.\n" +
                "Address: Kalatoli Road,, New Beach Rd, Cox's Bazar, Bangladesh\n" +
                "Hours: Open today · 11AM–11PM\n" +
                "Phone: +880 341-52448","01234567"));

        db1.addContact(new Contact("Cox's Bazar is the prime beach and tourist town in Bangladesh, situated alongside the beach of the Bay of Bengal, beside the Indian ocean, having unbroken 120 Kilometer golden sand beach, reachable through motor transport alongside the wavy water . This town is situated in the Chittagong Division in south-eastern Bangladesh, beside 'Myanmar (Burma)'\n" +
                "Located about 150 km south of Chittagong Metropolitan city, Cox's Bazar is connected both by air and road with the capital of Bangladesh, Dhaka and the prime port city Chittagong.", "013"));
        db1.addContact(new Contact("Daily non-stop flights are available from Chittagong and Dhaka on United Airways, Regent, Bangladesh Biman or Novo Air. The journey by plane takes 60 minutes and the fare is BD taka.6000.00 and 3500.00 one way from Dhaka and Chittagong respectievly.", "01345"));
        db1.addContact(new Contact("By bus it will take about 10-12 hours from Dhaka and 4-5 hours from Chittagong. The private AC Bus line named 'Greenline', 'Soudia', 'Hanif','TR Travels' 'Shamoli' and 'Amader Baghdad' are available from Dhaka and Chittagong. AC bus will take BDT 1400-1800 from Dhaka to Cox'sbazar. Moreover, many non-AC services are also available from Dhaka and Chittagong costing from BD taka.350.00-750.00(from Dhaka) or BD taka 200.00-360.00 (from Chittagong).\n" +
                "The main bus terminal is a few kilometers east of the central town area, about a 15-20 minute / Tk 100-120 by electric bike known as 'Easy Bike' or CNG auto ride. Local buses head to Chittagong (Tk 120, 4 hours) and Teknaf (Tk 70, 3 hours).\n" +
                "The private bus companies have offices near 'Hotel Sea Queen' on the main road, and also down in the hotel-motel zone. During the tourist season bus tickets goes scarcity requires advance ticketing to avoid delayed staying. Better to book immediately on arrival."
                , "013456"));

        Log.d("Reading: ", "Reading....");

    }

}
