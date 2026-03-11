package com.srujana.assignmentno5;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class InboxFragment extends Fragment {

    OnEmailSelectedListener callback;

    String[] emails = {
            "Meeting at 10 AM",
            "Assignment Submission",
            "Project Discussion",
            "Workshop Invitation",
            "Exam Time Table"
    };

    public interface OnEmailSelectedListener {
        void onEmailSelected(String email);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (OnEmailSelectedListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inbox, container, false);

        ListView listView = view.findViewById(R.id.emailList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.email_item,
                R.id.emailText,
                emails
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
            callback.onEmailSelected(emails[position]);
        });

        return view;
    }
}