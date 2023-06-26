package com.example.gods_diary1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class mediumTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule2 = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void TestRegister() {
        String tekst = "zzzz";
        String tekst1 = "ooooo";
        String tekst2 = "abcd@gmail.com";

        onView(withId(R.id.registerButton)).perform(click());
        onView(withId(R.id.editTextUsername)).perform(click());
        onView (withId(R.id.editTextUsername)).perform(typeText (tekst));
        onView(withId(R.id.editTextPassword)).perform(click());
        onView (withId(R.id.editTextPassword)).perform(typeText (tekst1));
        onView(withId(R.id.editTextEmail)).perform(click());
        onView (withId(R.id.editTextEmail)).perform(typeText (tekst2));
        onView(withId(R.id.buttonRegister)).perform(click());

    }


    @Test
    public void TestLogin()
    {
        String tekst = "zzzz";
        String tekst1 = "ooooo";
        onView(withId(R.id.usernameEditText)).perform(click());
        onView (withId(R.id.usernameEditText)).perform(typeText (tekst));
        onView(withId(R.id.passwordEditText)).perform(click());
        onView (withId(R.id.passwordEditText)).perform(typeText (tekst1));
        onView(withId(R.id.loginButton)).perform(click());
    }


}
