package com.lionindigital.myfoodstreet.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

//        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/OstrichSans-Black.otf");
//        mAppNameTextView.setTypeface(ostrichFont);


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
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

    //logout
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.action_logout) {
//            logout();
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }


    //logout functionality
//    private void logout() {
////        FirebaseAuth.getInstance().signOut();
//        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        startActivity(intent);
//        finish();
//    }

    // Click button action
//    @Override
//    public void onClick(View v) {
//
//        if(v == mFindRestaurantsButton) {
//            Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
//            startActivity(intent);
//        }
//
//        if (v == mSavedRestaurantsButton) {
//            Intent intent = new Intent(MainActivity.this, SavedRestaurantListActivity.class);
//            startActivity(intent);
//        }
//
//    }
}
