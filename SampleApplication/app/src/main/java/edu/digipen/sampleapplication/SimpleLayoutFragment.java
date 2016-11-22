package edu.digipen.sampleapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SimpleLayoutFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleLayoutFragment extends Fragment {

    public final static String LAYOUT_ARG = "LAYOUT_ARG";

    private int mLayoutArg;

    public SimpleLayoutFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SimpleLayoutFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SimpleLayoutFragment newInstance(int layoutArg) {
        SimpleLayoutFragment fragment = new SimpleLayoutFragment();
        Bundle args = new Bundle();;
        args.putInt(LAYOUT_ARG, layoutArg);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mLayoutArg = getArguments().getInt(LAYOUT_ARG);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(mLayoutArg, container, false);
    }
}
