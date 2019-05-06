package com.kosan.estertambunan.View.daily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kosan.estertambunan.Adapter.DailyAdapter;
import com.kosan.estertambunan.Model.DailyModel;
import com.kosan.estertambunan.R;

import java.util.ArrayList;

public class DailyFragment extends Fragment {


    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private RecyclerView mRecycleView2;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily, container, false);


        ArrayList<DailyModel> dailyModels = new ArrayList<>();
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 05:00 - 05:45 baca-baca"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 05:45 - 06:15 beli makan"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 06:15 - 07:00 Sarapan Pagi"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 07:00 - 15.15 Aktivitas Produktif"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 15:15 - 16.45 Istirahat"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 16:45 - 18.30 Aktivitas Produktif"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 18:30 - 19:30 Review Pembelajaran"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 19:30 - 22:00 Aktivitas Produktif / Santai Malam"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 22:00 - 04:00 Istirahat"));

        mRecycleView = view.findViewById(R.id.daily_id_r);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new DailyAdapter(dailyModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
        return view;
    }
}
