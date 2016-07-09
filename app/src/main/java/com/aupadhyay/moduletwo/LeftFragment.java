package com.aupadhyay.moduletwo;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LeftFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;

    public LeftFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static LeftFragment newInstance() {
        LeftFragment fragment = new LeftFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_left, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button redButton, greenButton, blueButton, yellowButton;

        redButton = (Button) view.findViewById(R.id.redButton);
        greenButton = (Button) view.findViewById(R.id.greenButton);
        blueButton = (Button) view.findViewById(R.id.blueButton);
        yellowButton = (Button) view.findViewById(R.id.yellowButton);

        redButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(int color) {
        if (mListener != null) {
            mListener.onFragmentInteraction(color);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.redButton:
                onButtonPressed(Color.RED);
                break;
            case R.id.greenButton:
                onButtonPressed(Color.GREEN);
                break;
            case R.id.blueButton:
                onButtonPressed(Color.BLUE);
                break;
            case R.id.yellowButton:
                onButtonPressed(Color.YELLOW);
                break;
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(int color);
    }
}
