package com.example.biespiel_pc.and_2;
import android.support.test.filters.SmallTest;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Yogesh Chaudhary
 */

public class LoginTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    public LoginTest() {
        super(LoginActivity.class);
    }
    @Override
    protected void setUp() throws Exception{
        super.setUp();
    }
    //test the initialization of the interface
    @SmallTest
    public void testPassword(){
        EditText e = (EditText) getActivity().findViewById(R.id.loginpassword);
        assertNotNull(e);
        onView(withId(R.id.loginpassword)).check(matches(isDisplayed()));
    }
    @SmallTest
    public void testEmail(){
        EditText e = (EditText) getActivity().findViewById(R.id.loginemail);
        assertNotNull(e);
        onView(withId(R.id.loginemail)).check(matches(isDisplayed()));
    }
    public void testSignInButton(){
        Button b = (Button) getActivity().findViewById(R.id.btnsignin);
        assertNotNull(b);
        onView(withId(R.id.btnsignin)).check(matches(isDisplayed()));
        onView(withId(R.id.btnsignin)).perform(click());
    }
    public void testSignUpButton(){
        Button b = (Button) getActivity().findViewById(R.id.btnsignup);
        assertNotNull(b);
        onView(withId(R.id.btnsignup)).check(matches(isDisplayed()));
        onView(withId(R.id.btnsignup)).perform(click());
    }
    public void testForgotPasswordButton(){
        TextView b = (TextView) getActivity().findViewById(R.id.btnForgotPass);
        assertNotNull(b);
        onView(withId(R.id.btnForgotPass)).check(matches(isDisplayed()));
        onView(withId(R.id.btnForgotPass)).perform(click());
    }
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
