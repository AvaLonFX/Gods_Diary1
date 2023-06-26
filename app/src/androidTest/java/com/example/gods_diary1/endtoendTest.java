package com.example.gods_diary1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class endtoendTest {
    @Rule
    public ActivityScenarioRule<MainActivity4> activityRule = new ActivityScenarioRule<>(MainActivity4.class);

    @Test
    public void KorisnickiTok()


    {

        onView(withId(R.id.imageButton2)).perform(scrollTo());
        onView(withId(R.id.imageButton2)).perform(click());
        onView(withId(R.id.imageButton)).perform(click());
        onView(withId(R.id.imageButton3)).perform(scrollTo());
        onView(withId(R.id.imageButton3)).perform(click());
        onView(withId(R.id.imageButton)).perform(click());
        onView(withId(R.id.imageButton4)).perform(scrollTo());
        onView(withId(R.id.imageButton4)).perform(click());
        onView(withId(R.id.imageButton)).perform(click());
        onView(withId(R.id.imageButton5)).perform(scrollTo());
        onView(withId(R.id.imageButton5)).perform(click());
        onView(withId(R.id.imageButton)).perform(click());
        onView(withId(R.id.imageButton6)).perform(scrollTo());
        onView(withId(R.id.imageButton6)).perform(click());
        onView(withId(R.id.imageButton)).perform(click());
        onView(withId(R.id.imageButton1)).perform(click());














    }



}
