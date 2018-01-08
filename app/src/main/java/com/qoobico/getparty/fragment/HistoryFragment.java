package com.qoobico.getparty.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qoobico.getparty.R;
import com.qoobico.getparty.adapter.EventListAdapter;
import com.qoobico.getparty.dto.EventDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George Omega on 08.01.2018.
 */

public class HistoryFragment extends AbstractTabFragment {
    private static final int LAYOUT= R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_History));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(LAYOUT,container,false);
        RecyclerView rv=(RecyclerView) view.findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new EventListAdapter(CreateMockEventListData()));
        return this.view;
    }

    private List<EventDTO> CreateMockEventListData() {
        List<EventDTO> data=new ArrayList<>();
        data.add(new EventDTO("Item 1"));
        data.add(new EventDTO("Item 2"));
        data.add(new EventDTO("Item 3"));
        data.add(new EventDTO("Item 4"));
        data.add(new EventDTO("Item 5"));
        data.add(new EventDTO("Item 6"));
        data.add(new EventDTO("Item 7"));
        data.add(new EventDTO("Item 8"));
        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
