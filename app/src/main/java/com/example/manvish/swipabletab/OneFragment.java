package com.example.manvish.swipabletab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {


    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mm = inflater.inflate(R.layout.fragment_one, container, false);
        Button button = (Button) mm.findViewById(R.id.btn_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "hi", Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                getActivity().startActivity(new Intent(getActivity(),Main2Activity.class));
                return false;
            }
        });
        // Inflate the layout for this fragment
        return mm;
    }


}
