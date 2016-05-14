package com.example.user.login12;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void browser1(View View) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gmail.com"));
        startActivity(browserIntent);
    }
    public void browser2(View View) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(browserIntent);

    }
    public void browser3(View View) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
        startActivity(browserIntent);
    }

}
