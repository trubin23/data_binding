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

    public void onEnabled(Employee employee, boolean enabled){
        Log.d(TAG, "----------");
        Log.d(TAG, "onEnabled: " + employee.toString());
        Log.d(TAG, "onEnabled: " + enabled);
        Log.d(TAG, "----------");
    }

    public void onEnabled(Employee employee){
        Log.d(TAG, "onEnabled");
    }

    public void onDisabled(Employee employee){
        Log.d(TAG, "onDisabled");
    }
}
