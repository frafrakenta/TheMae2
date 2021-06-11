package com.example.themae


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        val appCompatEditText = onView(
allOf(withId(R.id.editTextUserid),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
2),
isDisplayed()))
        appCompatEditText.perform(click())
        
        pressBack()
        
        val materialButton = onView(
allOf(withId(R.id.btnNewAccount), withText("NewAccount"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
4),
isDisplayed()))
        materialButton.perform(click())
        
        val appCompatEditText2 = onView(
allOf(withId(R.id.NewID),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
0),
isDisplayed()))
        appCompatEditText2.perform(click())
        
        val appCompatEditText3 = onView(
allOf(withId(R.id.NewID),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
0),
isDisplayed()))
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard())
        
        val appCompatEditText4 = onView(
allOf(withId(R.id.NewName),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        appCompatEditText4.perform(replaceText("kenta "), closeSoftKeyboard())
        
        pressBack()
        
        val appCompatEditText5 = onView(
allOf(withId(R.id.NewName), withText("kenta "),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        appCompatEditText5.perform(replaceText("kenta "))
        
        val appCompatEditText6 = onView(
allOf(withId(R.id.NewName), withText("kenta "),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        appCompatEditText6.perform(closeSoftKeyboard())
        
        val appCompatEditText7 = onView(
allOf(withId(R.id.NewName), withText("kenta "),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        appCompatEditText7.perform(pressImeActionButton())
        
        val appCompatEditText8 = onView(
allOf(withId(R.id.NewPassword),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
3),
isDisplayed()))
        appCompatEditText8.perform(replaceText("1"), closeSoftKeyboard())
        
        val appCompatEditText9 = onView(
allOf(withId(R.id.NewPassword), withText("1"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
3),
isDisplayed()))
        appCompatEditText9.perform(pressImeActionButton())
        
        val materialButton2 = onView(
allOf(withId(R.id.btnRegister), withText("Register"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
2),
isDisplayed()))
        materialButton2.perform(click())
        
        val appCompatEditText10 = onView(
allOf(withId(R.id.editTextUserid),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
2),
isDisplayed()))
        appCompatEditText10.perform(click())
        
        val appCompatEditText11 = onView(
allOf(withId(R.id.editTextUserid),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
2),
isDisplayed()))
        appCompatEditText11.perform(replaceText("1"), closeSoftKeyboard())
        
        val appCompatEditText12 = onView(
allOf(withId(R.id.editTextUserid), withText("1"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
2),
isDisplayed()))
        appCompatEditText12.perform(pressImeActionButton())
        
        val appCompatEditText13 = onView(
allOf(withId(R.id.editTextPassword),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
3),
isDisplayed()))
        appCompatEditText13.perform(replaceText("1"), closeSoftKeyboard())
        
        val appCompatEditText14 = onView(
allOf(withId(R.id.editTextPassword), withText("1"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
3),
isDisplayed()))
        appCompatEditText14.perform(pressImeActionButton())
        
        val materialButton3 = onView(
allOf(withId(R.id.start_button), withText("LOGIN"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        materialButton3.perform(click())
        
        val materialButton4 = onView(
allOf(withId(R.id.btnMenuPost), withText("POST"),
childAtPosition(
childAtPosition(
withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
1),
1),
isDisplayed()))
        materialButton4.perform(click())
        
        val textInputEditText = onView(
allOf(withId(R.id.editTextTitle),
childAtPosition(
childAtPosition(
withClassName(`is`("com.google.android.material.textfield.TextInputLayout")),
0),
0),
isDisplayed()))
        textInputEditText.perform(click())
        
        val textInputEditText2 = onView(
allOf(withId(R.id.editTextTitle),
childAtPosition(
childAtPosition(
withClassName(`is`("com.google.android.material.textfield.TextInputLayout")),
0),
0),
isDisplayed()))
        textInputEditText2.perform(replaceText("japan"), closeSoftKeyboard())
        
        val textInputEditText3 = onView(
allOf(withId(R.id.editTextContent),
childAtPosition(
childAtPosition(
withClassName(`is`("com.google.android.material.textfield.TextInputLayout")),
0),
0),
isDisplayed()))
        textInputEditText3.perform(replaceText("kenta \n"), closeSoftKeyboard())
        
        pressBack()
        
        val materialButton5 = onView(
allOf(withId(R.id.btnPost), withText("POST"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
6),
isDisplayed()))
        materialButton5.perform(click())
        
        val materialButton6 = onView(
allOf(withId(R.id.postSearch), withText("Search"),
childAtPosition(
childAtPosition(
withClassName(`is`("android.widget.LinearLayout")),
0),
2),
isDisplayed()))
        materialButton6.perform(click())
        
        val appCompatEditText15 = onView(
allOf(withId(R.id.searchID),
childAtPosition(
childAtPosition(
withId(R.id.linearLayout),
1),
1),
isDisplayed()))
        appCompatEditText15.perform(click())
        
        val appCompatEditText16 = onView(
allOf(withId(R.id.searchID),
childAtPosition(
childAtPosition(
withId(R.id.linearLayout),
1),
1),
isDisplayed()))
        appCompatEditText16.perform(replaceText("1"), closeSoftKeyboard())
        
        val materialButton7 = onView(
allOf(withId(R.id.searchSearch), withText("Search"),
childAtPosition(
childAtPosition(
withId(R.id.linearLayout),
1),
2),
isDisplayed()))
        materialButton7.perform(click())
        
        pressBack()
        
        val materialButton8 = onView(
allOf(withId(R.id.btnLike), withText("Like"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
5),
isDisplayed()))
        materialButton8.perform(click())
        
        val materialButton9 = onView(
allOf(withId(R.id.btnViewHome), withText("Home"),
childAtPosition(
childAtPosition(
withClassName(`is`("android.widget.LinearLayout")),
0),
3),
isDisplayed()))
        materialButton9.perform(click())
        
        val materialButton10 = onView(
allOf(withId(R.id.btnMenuView), withText("VIEW"),
childAtPosition(
childAtPosition(
withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
2),
1),
isDisplayed()))
        materialButton10.perform(click())
        
        val materialButton11 = onView(
allOf(withId(R.id.btnViewHome), withText("Home"),
childAtPosition(
childAtPosition(
withClassName(`is`("android.widget.LinearLayout")),
0),
3),
isDisplayed()))
        materialButton11.perform(click())
        
        val materialButton12 = onView(
allOf(withId(R.id.btnMenuLike), withText("Like"),
childAtPosition(
childAtPosition(
withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
2),
2),
isDisplayed()))
        materialButton12.perform(click())
        }
    
    private fun childAtPosition(
            parentMatcher: Matcher<View>, position: Int): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
    }
