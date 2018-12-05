package com.example.arief.recycleviewinfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
    View view;
    private RecyclerView myrecycleview;
    private List<Contact>listContact;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listContact = new ArrayList<>();
        listContact.add(new Contact("arief","089679189576",R.drawable.ic_people_black_24dp));
        listContact.add(new Contact("arief","089679189576",R.drawable.ic_people_black_24dp));
        listContact.add(new Contact("arief","089679189576",R.drawable.ic_people_black_24dp));
    }

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.contact_fragment,container,false);
        myrecycleview = view.findViewById(R.id.contact_recycleview);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(getContext(),listContact);
        myrecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycleview.setAdapter(recycleViewAdapter);
        return view;
    }
}
