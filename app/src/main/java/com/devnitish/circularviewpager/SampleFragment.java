package com.devnitish.circularviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment extends Fragment {

    int no;

    public SampleFragment() {
        // Required empty public constructor
    }

    public SampleFragment(int no){
        this();
       this.no = no;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sample, container, false);
        TextView text = view.findViewById(R.id.text);
        text.setText(""+no);

        return view;
    }




}
