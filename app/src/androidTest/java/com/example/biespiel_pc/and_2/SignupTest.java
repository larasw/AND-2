package com.example.biespiel_pc.and_2;
import android.support.test.filters.SmallTest;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.biespiel_pc.and_2.Model.SignUpModel;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by User on 22/01/2018.
 */

public class SignupTest extends ActivityInstrumentationTestCase2<SignUpActivity> {
    public SignupTest() {
        super(SignUpActivity.class);
    }

    @Override
    protected void setUp() throws Exception{
        super.setUp();
    }

    @SmallTest
    public void testUserName(){
        EditText e = (EditText) getActivity().findViewById(R.id.su_username);
        assertNotNull(e);
        onView(withId(R.id.su_username)).check(matches(isDisplayed()));
    }
    @SmallTest
    public void testFullName(){
        EditText e = (EditText) getActivity().findViewById(R.id.su_fullname);
        assertNotNull(e);
        onView(withId(R.id.su_fullname)).check(matches(isDisplayed()));
    }
    public void testEmail(){
        EditText e = (EditText) getActivity().findViewById(R.id.su_email);
        assertNotNull(e);
        onView(withId(R.id.su_email)).check(matches(isDisplayed()));
    }

    public void testAge(){
        EditText e = (EditText) getActivity().findViewById(R.id.su_age);
        assertNotNull(e);
        onView(withId(R.id.su_age)).check(matches(isDisplayed()));
        onView(withId(R.id.su_age)).perform(click());
    }

    public void testMale(){
        RadioButton e = (RadioButton) getActivity().findViewById(R.id.su_male);
        assertNotNull(e);
        onView(withId(R.id.su_male)).check(matches(isDisplayed()));
        onView(withId(R.id.su_male)).perform(click());
    }

    public void testFemale(){
        RadioButton e = (RadioButton) getActivity().findViewById(R.id.su_female);
        assertNotNull(e);
        onView(withId(R.id.su_female)).check(matches(isDisplayed()));
        onView(withId(R.id.su_female)).perform(click());
    }

    public void testPassword(){
        EditText e = (EditText) getActivity().findViewById(R.id.su_password);
        assertNotNull(e);
        onView(withId(R.id.su_password)).check(matches(isDisplayed()));
    }

    @Test
    public void testSignUPButton(){
        Button b = (Button) getActivity().findViewById(R.id.sign_up_button);
        assertNotNull(b);
        onView(withId(R.id.sign_up_button)).check(matches(isDisplayed()));
        onView(withId(R.id.sign_up_button)).perform(click());
    }

    public void testFullSignUp(){
        String tUsername,tFullname,tEmail,tGender,tAge,tPassword,tCoPass;
        tUsername = "test";
        tFullname = "test";
        tEmail = "test@test.com";
        tGender = "male";
        tAge = "12";
        tPassword = "testpassword";
        tCoPass = "testpassword";
        SignUpModel su = new SignUpModel(tUsername,tFullname,tEmail,tGender,tAge,tPassword,tCoPass);

        String tUsernametest,tFullnametest,tEmailtest,tGendertest,tAgetest,tPasswordtest,tCoPasstest;
         tUsernametest = su.getSuUsername();
        assertEquals(tUsername, tUsernametest);
         tFullnametest = su.getSuFullname();
        assertEquals(tFullname, tFullnametest);
         tEmailtest = su.getSuEmail();
        assertEquals(tEmail, tEmailtest);
         tGendertest = su.getSuGender();
        assertEquals(tGender, tGendertest);
         tAgetest = su.getSuAge();
        assertEquals(tAge, tAgetest);
         tPasswordtest = su.getSupassword();
        assertEquals(tPassword, tPasswordtest);
         tCoPasstest = su.getSucopass();
        assertEquals(tCoPass, tCoPasstest);
    }
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
