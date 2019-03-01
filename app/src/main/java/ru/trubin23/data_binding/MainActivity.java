package ru.trubin23.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import ru.trubin23.databinding.databinding.ActivityFirstBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityFirstBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void onClickFirstButton(View view) {
        Log.d("MainActivity", "FirstButton");
    }

    public void onClickSecondButton(View view) {
        Log.d("MainActivity", "SecondButton");
    }
}
