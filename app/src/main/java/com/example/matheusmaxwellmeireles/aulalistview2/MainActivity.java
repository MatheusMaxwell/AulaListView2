package com.example.matheusmaxwellmeireles.aulalistview2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView listView;
    ArrayList<Integer> listImages;
    ArrayList<String>  listCars;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        listImages = new ArrayList<>();
        listCars = new ArrayList<>();

        listImages = getListImages();
        listCars = getListCars();

        myAdapter = new MyAdapter(MainActivity.this, listImages, listCars);

        listView.setAdapter(myAdapter);


    }

    public ArrayList<Integer> getListImages() {
        listImages = new ArrayList<>();

        listImages.add(R.drawable.fiatlogo);
        listImages.add(R.drawable.volkslogo);
        listImages.add(R.drawable.fiatlogo);
        listImages.add(R.drawable.chevroletlogo);
        listImages.add(R.drawable.teslalogo);

        return listImages;
    }

    public ArrayList<String> getListCars() {
        listCars = new ArrayList<>();

        listCars.add("Uno");
        listCars.add("Gol");
        listCars.add("Palio");
        listCars.add("Celta");
        listCars.add("T1");

        return listCars;
    }
}
