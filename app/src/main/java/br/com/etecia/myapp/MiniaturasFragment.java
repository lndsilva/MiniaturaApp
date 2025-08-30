package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class MiniaturasFragment extends Fragment {
    RecyclerView idRecyclerViewMiniatura;
    List<Miniatura> lstMiniatura;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_miniaturas, container, false);

        //você vai codificar a partir daqui.

        return view;
    }
}