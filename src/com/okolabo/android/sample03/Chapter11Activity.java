
package com.okolabo.android.sample03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Chapter11Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter11);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_sample:
                intent = new Intent(this, SampleActivity.class);
                startActivity(intent);
                break;

            case R.id.menu_chapter11:
                intent = new Intent(this, Chapter11Activity.class);
                startActivity(intent);
                break;

            case R.id.menu_chapter12:
                intent = new Intent(this, Chapter12Activity.class);
                startActivity(intent);
                break;

            case R.id.menu_chapter13:
                intent = new Intent(this, Chapter13Activity.class);
                startActivity(intent);
                break;

            case R.id.menu_chapter14:
                intent = new Intent(this, Chapter14Activity.class);
                startActivity(intent);
                break;
        }
        return true;
    }


}
