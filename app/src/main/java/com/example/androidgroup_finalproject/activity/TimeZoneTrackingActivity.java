package com.example.androidgroup_finalproject.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.wear.widget.WearableRecyclerView;
import com.example.androidgroup_finalproject.adapter.TimeZoneAdapter;
import com.example.androidgroup_finalproject.databinding.ActivityTimeZoneTrackingBinding;
import java.util.Arrays;
import java.util.List;

public class TimeZoneTrackingActivity extends AppCompatActivity {

    private ActivityTimeZoneTrackingBinding binding;
    private WearableRecyclerView recyclerView;
    private TimeZoneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimeZoneTrackingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recyclerView = binding.recyclerViewTimeZones;

        // Sample data for time zones
        List<String> timeZones = Arrays.asList("UTC", "PST", "EST", "CST", "MST");

        // Set up the adapter
        adapter = new TimeZoneAdapter(timeZones);
        recyclerView.setAdapter(adapter);
    }
}
