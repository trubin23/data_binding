package ru.trubin23.data_binding;

import android.util.Log;
import android.view.View;

public class MyHandler {

    private static final String TAG = MyHandler.class.getSimpleName();

    public void onUpdate(Employee employee){
        Log.d(TAG, "onUpdate");
    }

    public void onClick(View view){
        Log.d(TAG, "onClick");
    }
}
