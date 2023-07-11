package com.example.gods_diary1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class KorisnickiZahtjevTest {
    @Rule
    public ActivityScenarioRule<MainActivityPrice> activityRule = new ActivityScenarioRule<>(MainActivityPrice.class);


    @Test
    public void UnosiPrica()
    {
        String naslov = "Herkul";
        String tekst = "Herkul je lik iz rimske mitologije, pandan Heraklu u grckoj mitologiji";
        onView(withId(R.id.editTextHeader)).perform(click());
        onView(withId(R.id.editTextHeader)).perform(typeText (naslov));
        onView(withId(R.id.editText)).perform(click());
        onView(withId(R.id.editText)).perform(typeText (tekst));
        onView(withId(R.id.buttonInsert)).perform(click());



    }
}
