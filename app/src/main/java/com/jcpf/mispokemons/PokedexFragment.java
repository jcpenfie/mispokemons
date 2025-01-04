package com.jcpf.mispokemons;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcpf.mispokemons.databinding.FragmentMisPokemonsBinding;
import com.jcpf.mispokemons.databinding.FragmentPokedexBinding;


public class PokedexFragment extends Fragment {

    FragmentPokedexBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentPokedexBinding.inflate(inflater, container, false);

        //binding.showDetailsButton.setOnClickListener(this::goToDetailsView);


        return binding.getRoot();
    }
}