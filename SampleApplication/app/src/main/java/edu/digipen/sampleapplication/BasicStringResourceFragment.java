package edu.digipen.sampleapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lukepowell on 6/15/16.
 */
public class BasicStringResourceFragment extends Fragment {

    private TextView mLivesRemaining;

    public static Fragment newInstance() {
        return new BasicStringResourceFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.basic_strings, container, false);
        mLivesRemaining = (TextView) view.findViewById(R.id.livesRemaining);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        mLivesRemaining.setText(getString(R.string.lives_remaining,10,getResources().getQuantityString(R.plurals.lives,1,1)));
    }
}
