package com.wob.wob;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;

import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;



import com.wob.wob.API.YoutubeApi;
import com.wob.wob.adapters.ItemAdapter;

import com.wob.wob.model.Item;
import com.wob.wob.model.YoutubeModel;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    ItemAdapter itemAdapter = null;
    RecyclerView.LayoutManager layoutManager;
    String API = "https://www.googleapis.com";
    final RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(API).build();
    YoutubeApi youtubeApi = restAdapter.create(YoutubeApi.class);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new ItemAdapter(new ArrayList<Item>()));
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        if (getIntent() != null) {
            handleIntent(getIntent());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));

        return true;
    }


    @Override
    protected void onNewIntent(Intent intent) {
        handleIntent(intent);
    }

    private void handleIntent(Intent intent){
        if(Intent.ACTION_SEARCH.equals(intent.getAction())){
            String query = intent.getStringExtra(SearchManager.QUERY);
            youtubeApi.searchVideo("snippet", query, "AIzaSyCbVpdEl54qfWVa3oPN93Wn_JfR5li5HV8", new Callback<YoutubeModel>() {
                @Override
                public void success(YoutubeModel youtubeModel, Response response) {
                    itemAdapter = new ItemAdapter(youtubeModel.getItems());
                    recyclerView.setAdapter(itemAdapter);
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                }
            });

        }
    }
}
