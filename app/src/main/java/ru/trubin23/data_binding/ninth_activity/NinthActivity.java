package ru.trubin23.data_binding.ninth_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import ru.trubin23.data_binding.R;

public class NinthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        final EmployeeAdapter adapter = new EmployeeAdapter();

        final RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Oliver"));
        employees.add(new Employee("Jack"));
        employees.add(new Employee("Harry"));
        employees.add(new Employee("Jacob"));
        adapter.setData(employees);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final List<Employee> nextEmployees = new ArrayList<>();
                nextEmployees.add(new Employee("Amelia"));
                nextEmployees.add(new Employee("Olivia"));
                nextEmployees.add(new Employee("Isla"));
                nextEmployees.add(new Employee("Emily"));
                nextEmployees.add(new Employee("Poppy"));
                recyclerView.post(new Runnable() {
                    @Override
                    public void run() {
                        adapter.setData(nextEmployees);
                    }
                });
            }
        }).start();
    }
}
