package com.example.quiz_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quiz_app.AdapterClass.MyAdapter;
import com.example.quiz_app.databinding.FragmentHomeFragmentBinding;
import com.example.quiz_app.model.ModelClass;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

FragmentHomeFragmentBinding binding;
MyAdapter adapter;
ArrayList<ModelClass> list = new ArrayList<>();
    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding = FragmentHomeFragmentBinding.inflate(getLayoutInflater());

loadData();
        return  binding.getRoot();
    }

    private void loadData() {

        binding.recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        list.clear();

        list.add(new ModelClass("cate1","desp1"));
        list.add(new ModelClass("cate2","desp2"));
        list.add(new ModelClass("cate3","desp3"));
        list.add(new ModelClass("cate4","desp4"));
        list.add(new ModelClass("cate5","desp5"));
        adapter = new MyAdapter(getContext(),list);
        binding.recycleView.setAdapter(adapter);

    }


}