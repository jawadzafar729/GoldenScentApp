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
import com.goldenscent.adaptor.LeftPanelAdapter;
import com.goldenscent.modal.MainCategory;

import java.util.ArrayList;
import java.util.List;


public class LeftListFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private LeftPanelAdapter mAdapter;
    private List<MainCategory> listMainCategories = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.left_list_frag,
                container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.leftRecyclerView);
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView(){
        mAdapter = new LeftPanelAdapter(getActivity(), listMainCategories);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }


    private void prepareMovieData() {

        MainCategory item = new MainCategory(getString(R.string.make_up),  R.drawable.make_up);
        listMainCategories.add(item);

        item = new MainCategory(getString(R.string.skin_care),  R.drawable.skin_care);
        listMainCategories.add(item);

        item = new MainCategory(getString(R.string.hair),  R.drawable.hair_care);
        listMainCategories.add(item);

        item = new MainCategory(getString(R.string.beauty_tool),  R.drawable.beauty_tool);
        listMainCategories.add(item);

        item = new MainCategory(getString(R.string.home_frag),  R.drawable.home_frag);
        listMainCategories.add(item);

        item = new MainCategory(getString(R.string.men),  R.drawable.mens);
        listMainCategories.add(item);

        item = new MainCategory(getString(R.string.gifts),  R.drawable.gift);
        listMainCategories.add(item);

        mAdapter.notifyDataSetChanged();
    }


}
