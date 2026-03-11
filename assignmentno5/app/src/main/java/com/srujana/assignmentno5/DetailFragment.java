package com.srujana.assignmentno5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {

    TextView emailContent;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        emailContent = view.findViewById(R.id.emailContent);

        return view;
    }

    public void updateEmail(String email){
        emailContent.setText(email);
    }
}