package com.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Activity2 extends Activity {

	private String TAG = "activity2";
    private String child = "childStr";
    private String folderName = "folderNameStr";
    public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
        Activity3.actionLaunch(Activity2.this, child, folderName);
	}
    public static void getImagePath(Context context) {
        Intent intent = new Intent(context,Activity2.class);
        ((Activity) context).startActivityForResult(intent,1);
    }



    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK){
            String datastr = data.getExtras().getString("data");
            Log.v(TAG,"Activity2data="+datastr);
            setResult(RESULT_OK, data);
        }
        super.onActivityResult(requestCode, resultCode, data);
        finish();   //finish应该写到这个地方
    }


}
