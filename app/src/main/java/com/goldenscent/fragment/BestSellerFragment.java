package com.goldenscent.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goldenscent.R;
import com.goldenscent.adaptor.BestSellerAdapter;
import com.goldenscent.modal.ItemModal;

import java.util.ArrayList;
import java.util.List;


public class BestSellerFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private BestSellerAdapter mAdapter;
    private List<ItemModal> listMainCategories = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.best_list_frag,
                container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView(){
        mAdapter = new BestSellerAdapter(getActivity(), listMainCategories);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }


    private void prepareMovieData() {

        ItemModal item = new ItemModal("",  R.drawable.product_perfume, "Prada","Candy", "356 SR", "320 SR");
        listMainCategories.add(item);

        item = new ItemModal("",  R.drawable.product_perf_dolce, "Dolce & Gababana S...","The One and text goes here until it br...", "356 SR", "");
        listMainCategories.add(item);

        item = new ItemModal("",  R.drawable.product_perfume_three, "Aigner","N. 1", "356 SR", "");
        listMainCategories.add(item);

        mAdapter.notifyDataSetChanged();
    }


}
