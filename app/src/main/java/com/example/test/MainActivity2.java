package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String message;
        message=extras.getString("EXTRA_MESSAGE");
//        System.out.println(message);
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
        RequestQueue requestQueue;
        String API_KEY="6fb015a987474e7d9eb5ee7ff92f90c1";
//        http://newsapi.org/v2/everything?q=tesla&from=2021-01-07&sortBy=publishedAt&apiKey=6fb015a987474e7d9eb5ee7ff92f90c1
        String url ="http://newsapi.org/v2/everything?q=tesla&from=2021-01-07&sortBy=publishedAt&"+ API_KEY;
        JsonObjectRequest jsonArrayRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray= response.getJSONArray("articles");
                    for(int i= 0 ; i<jsonArray.length();i++ ){

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                    error.printStackTrace();
            }
        });

    }
}