package com.lionindigital.myfoodstreet.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lionindigital.myfoodstreet.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.inputButton) Button mFindMyFoodStreet;
    @BindView(R.id.locationEditText) EditText mLocationEditText;

    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/OstrichSans-Black.otf");
        mAppNameTextView.setTypeface(ostrichFont);


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
