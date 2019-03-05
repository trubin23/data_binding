package ru.trubin23.data_binding.ninth_activity;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.LinkedList;
import java.util.List;

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivityNinthItemBinding;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeHolder> {

    private List<Employee> mItems = new LinkedList<>();

    @NonNull
    @Override
    public EmployeeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        ActivityNinthItemBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.activity_ninth_item, viewGroup, false);
        return new EmployeeHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeHolder holder, int position) {
        holder.bind(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public void setData(List<Employee> items) {
        mItems.clear();
        mItems.addAll(items);
        notifyDataSetChanged();
    }
}
