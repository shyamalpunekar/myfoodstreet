package com.lionindigital.myfoodstreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final String TAG = MainActivity.class.getSimpleName();
    private Button mFindMyFoodStreet;
    private EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindMyFoodStreet = (Button)findViewById(R.id.inputButton);

            mFindMyFoodStreet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(MainActivity.this, "Hi!!!!!", Toast.LENGTH_LONG).show();
                    String location = mLocationEditText.getText().toString();
                    Log.d(TAG, location);
                    Intent intent = new Intent(MainActivity.this, FoodStreetActivity.class);
                    intent.putExtra("location",location);
                    startActivity(intent);
                }
            });
    }
}
