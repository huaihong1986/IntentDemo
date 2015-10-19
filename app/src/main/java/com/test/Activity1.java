package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Activity1 extends Activity {
	
	private String TAG="activity1";
  
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        Activity2.getImagePath(Activity1.this);

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
           String path = data.getExtras().getString("data");
            Log.v(TAG,"Activity1data="+path);
        }
    }


          
}