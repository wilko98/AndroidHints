package com.example.wilko98.androidhints.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.wilko98.androidhints.R;

public class TopicsFragment extends Fragment {

    String[] topics = new String[]{"Android Studio shortcuts","Android Jetpak","Android Version","Java","Kotlin"};

    public static TopicsFragment newInstance() {
        Bundle args = new Bundle();
        TopicsFragment fragment = new TopicsFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_topics,container,false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View v, @Nullable Bundle savedInstanceState) {
        ArrayAdapter adapter = new ArrayAdapter<String>(getContext(),R.layout.li_topics,topics);
        ListView listView = (ListView) v.findViewById(R.id.topicsList);
        listView.setAdapter(adapter);
    }
}
