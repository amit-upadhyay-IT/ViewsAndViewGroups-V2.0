package com.aupadhyay.moduletwo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RightFragment extends Fragment {

    private static final String KEY = "key";

    public RightFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static RightFragment newInstance(int color) {
        RightFragment fragment = new RightFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY,color);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if(getArguments() != null)
        {
            int color = getArguments().getInt(KEY);

            switch (color)
            {
                case Color.RED:
                    view.findViewById(R.id.redView).setBackgroundColor(Color.RED);
                    break;
                case Color.GREEN:
                    view.findViewById(R.id.greenView).setBackgroundColor(Color.GREEN);
                    break;
                case Color.BLUE:
                    view.findViewById(R.id.blueView).setBackgroundColor(Color.BLUE);
                    break;
                case Color.YELLOW:
                    view.findViewById(R.id.yellowView).setBackgroundColor(Color.YELLOW);
                    break;
            }
        }
    }
}
