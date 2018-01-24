package com.ramadan_apps.recyclerviewanimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  RecyclerView recyclerView;
    private List<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        movies = new ArrayList<>();
        movies.add(new Movie("movie1",R.drawable.img2));
        movies.add(new Movie("movie2",R.drawable.im3));
        movies.add(new Movie("movie3",R.drawable.images));
        movies.add(new Movie("movie4",R.drawable.img2));
        movies.add(new Movie("movie5",R.drawable.im3));
        movies.add(new Movie("movie6",R.drawable.images));
        movies.add(new Movie("movie7",R.drawable.img2));
        movies.add(new Movie("movie8",R.drawable.im3));
        movies.add(new Movie("movie9",R.drawable.images));
        movies.add(new Movie("movie10",R.drawable.img2));
        movies.add(new Movie("movie11",R.drawable.im3));
        movies.add(new Movie("movie12",R.drawable.images));
        movies.add(new Movie("movie13",R.drawable.img2));
        movies.add(new Movie("movie14",R.drawable.im3));
        movies.add(new Movie("movie15",R.drawable.images));

        GPAdapter adapter = new GPAdapter(getApplicationContext() , movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}
