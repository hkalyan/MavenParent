package com.hari.maven_test.test;

import com.hari.maven_test.MainActivity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

public class MavenTest extends ActivityUnitTestCase<MainActivity> {

	// Activity of the Target application
	MainActivity mainActivity;
	
	// TextView of the MainActivity to be tested
    TextView tvHello;
	public MavenTest() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		// Starts the MainActivity of the target application
			startActivity(new Intent(getInstrumentation().getTargetContext(), MainActivity.class), null, null);
			
			// Getting a reference to the MainActivity of the target application
			mainActivity = (MainActivity)getActivity();
			
			// Getting a reference to the TextView of the MainActivity of the target application 
	        tvHello = (TextView) mainActivity.findViewById(com.hari.maven_test.R.id.welcomeTxt);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@SmallTest
	public void testPreConditions(){
		// The actual text displayed in the textview
        String actual=tvHello.getText().toString();  
        
        // The expected text to be displayed in the textview 
        String expected = "Hello worldfff!";
        
        // Check whether both are equal, otherwise test fails
        assertEquals(expected,actual );         
	}

}
