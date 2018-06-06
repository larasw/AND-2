package com.example.biespiel_pc.and_2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class EditProfileTest extends ActivityInstrumentationTestCase2<EditProfileActivity> {

    public EditProfileTest() {
        super(EditProfileActivity.class);
    }
    @Override
    protected void setUp() throws Exception{
        super.setUp();
    }
    //test the initialization of the interface
    @SmallTest
    public void EditFullName(){
        EditText e = (EditText) getActivity().findViewById(R.id.editFullName);
        assertNotNull(e);
        onView(withId(R.id.editFullName)).check(matches(isDisplayed()));
    }

    public void EditUsername(){
        EditText e = (EditText) getActivity().findViewById(R.id.editUserName);
        assertNotNull(e);
        onView(withId(R.id.editUserName)).check(matches(isDisplayed()));
    }

    public void EditAge(){
        EditText e = (EditText) getActivity().findViewById(R.id.editAge);
        assertNotNull(e);
        onView(withId(R.id.editAge)).check(matches(isDisplayed()));
    }

    public void EditProfile(){
        EditText e = (EditText) getActivity().findViewById(R.id.editProfile);
        assertNotNull(e);
        onView(withId(R.id.editProfile)).check(matches(isDisplayed()));
    }

    public void testSaveButton(){
        Button b = (Button) getActivity().findViewById(R.id.profileSave);
        assertNotNull(b);
        onView(withId(R.id.profileSave)).check(matches(isDisplayed()));
        onView(withId(R.id.profileSave)).perform(click());
    }

    public void testCancelButton(){
        Button b = (Button) getActivity().findViewById(R.id.profileCancel);
        assertNotNull(b);
        onView(withId(R.id.profileCancel)).check(matches(isDisplayed()));
        onView(withId(R.id.profileCancel)).perform(click());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
