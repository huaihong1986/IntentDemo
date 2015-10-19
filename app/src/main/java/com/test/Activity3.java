package com.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by hahong on 15-10-19.
 */
public class Activity3 extends Activity {

    private String TAG="activity3";
    public static final String ACTION = "Activity3.ShowImageActivity";
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        String data = getIntent().getStringExtra("data");
        String folderName = getIntent().getStringExtra("folderName");
        final String action = getIntent().getAction();
        Log.v(TAG, "activity3data=ACTION" + action);
        if (ACTION.equals(action)) {
            Intent intent = new Intent();
            intent.putExtra("data", data+"hello");
            intent.putExtra("folderName", folderName);

            setResult(RESULT_OK, intent);
            Log.v(TAG, "activity3data=" + data);
            finish();
        }
    }
    public static void actionLaunch(Context context,String data,String folderName) {
        Intent mIntent = new Intent(context,Activity3.class);
        mIntent.setAction("Activity3.ShowImageActivity");
        mIntent.putExtra("data",data);
        mIntent.putExtra("folderName", folderName);
        ((Activity) context).startActivityForResult(mIntent,2);
    }



}