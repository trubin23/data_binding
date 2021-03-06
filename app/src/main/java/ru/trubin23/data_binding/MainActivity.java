package ru.trubin23.data_binding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ru.trubin23.data_binding.eighth_activity.EighthActivity;
import ru.trubin23.data_binding.fifth_activity.FifthActivity;
import ru.trubin23.data_binding.first_activity.FirstActivity;
import ru.trubin23.data_binding.fourth_activity.FourthActivity;
import ru.trubin23.data_binding.ninth_activity.NinthActivity;
import ru.trubin23.data_binding.second_activity.SecondActivity;
import ru.trubin23.data_binding.seventh_activity.SeventhActivity;
import ru.trubin23.data_binding.sixth_activity.SixthActivity;
import ru.trubin23.data_binding.third_activity.ThirdActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFirstButton(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void onClickSecondButton(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClickThirdButton(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void onClickFourthButton(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void onClickFifthButton(View view) {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void onClickSixthButton(View view) {
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }

    public void onClickSeventhButton(View view) {
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }

    public void onClickEighthButton(View view) {
        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }

    public void onClickNinthButton(View view) {
        Intent intent = new Intent(this, NinthActivity.class);
        startActivity(intent);
    }
}
