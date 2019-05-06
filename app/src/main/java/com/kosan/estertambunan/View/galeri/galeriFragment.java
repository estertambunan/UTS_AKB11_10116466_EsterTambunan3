package com.kosan.estertambunan.View.galeri;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.kosan.estertambunan.Adapter.GalleryAdapter;
import com.kosan.estertambunan.Model.GalleryModel;
import com.kosan.estertambunan.R;

import java.util.ArrayList;

public class galeriFragment extends Fragment {
    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_galeri, container, false);

  ArrayList<GalleryModel> galleryModels = new ArrayList<>();
        galleryModels.add(new GalleryModel(R.drawable.profile_picture));
        galleryModels.add(new GalleryModel(R.drawable.profile_picture));
        galleryModels.add(new GalleryModel(R.drawable.img_8940));
        galleryModels.add(new GalleryModel(R.drawable.img_3));


        mRecycleView = view.findViewById(R.id.recyclerViewGrid);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getActivity(),3);
        mAdapter = new GalleryAdapter(galleryModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
        return view;
    }

}
