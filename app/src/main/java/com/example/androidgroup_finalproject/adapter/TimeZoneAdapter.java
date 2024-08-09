package com.example.androidgroup_finalproject.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.androidgroup_finalproject.databinding.ItemTimeZoneBinding;
import java.util.List;

public class TimeZoneAdapter extends RecyclerView.Adapter<TimeZoneAdapter.TimeZoneViewHolder> {

    private final List<String> timeZoneList;

    public TimeZoneAdapter(List<String> timeZoneList) {
        this.timeZoneList = timeZoneList;
    }

    @NonNull
    @Override
    public TimeZoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemTimeZoneBinding binding = ItemTimeZoneBinding.inflate(inflater, parent, false);
        return new TimeZoneViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeZoneViewHolder holder, int position) {
        String timeZone = timeZoneList.get(position);
        holder.binding.textTimeZoneName.setText(timeZone);
    }

    @Override
    public int getItemCount() {
        return timeZoneList.size();
    }

    static class TimeZoneViewHolder extends RecyclerView.ViewHolder {
        final ItemTimeZoneBinding binding;

        TimeZoneViewHolder(@NonNull ItemTimeZoneBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
