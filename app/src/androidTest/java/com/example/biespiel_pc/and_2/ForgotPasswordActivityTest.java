package com.example.biespiel_pc.and_2;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.supportsInputMethods;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Biespiel-PC on 1/25/2018.
 */
public class ForgotPasswordActivityTest extends ActivityInstrumentationTestCase2<ForgotPasswordActivity> {
    public ForgotPasswordActivityTest(String pkg, Class<ForgotPasswordActivity> activityClass) {
        super(pkg, activityClass);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testEmail(){
        EditText e = (EditText) getActivity().findViewById(R.id.forgotEmail);
        assertNotNull(e);
        onView(withId(R.id.forgotEmail)).check(matches(isDisplayed()));
    }
    @Test
    public void testSendEmailButton(){
        Button b = (Button) getActivity().findViewById(R.id.btnSendEmail);
        assertNotNull(b);
        onView(withId(R.id.btnSendEmail)).check(matches(isDisplayed()));
        onView(withId(R.id.btnSendEmail)).perform(click());
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}