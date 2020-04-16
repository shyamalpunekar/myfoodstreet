package com.lionindigital.myfoodstreet;

import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;


import static org.junit.Assert.assertTrue;

@Config( sdk = Build.VERSION_CODES.O_MR1)
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;
    private ActivityController<MainActivity> testActivity;

    @Before
    public void setUp(){
        activity = Robolectric.setupActivity(MainActivity.class);
        testActivity = Robolectric.buildActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent() {
        TextView appNameTextView = (TextView) activity.findViewById(R.id.appNameTextView);
        assertTrue("MyFoodStreet".equalsIgnoreCase(appNameTextView.getText().toString()));
    }
}
