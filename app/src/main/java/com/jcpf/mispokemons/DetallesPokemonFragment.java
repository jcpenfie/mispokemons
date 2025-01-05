package com.jcpf.mispokemons;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcpf.mispokemons.databinding.FragmentDetallesPokemonBinding;
import com.jcpf.mispokemons.databinding.FragmentPokedexBinding;


public class DetallesPokemonFragment extends Fragment {

    private FragmentDetallesPokemonBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDetallesPokemonBinding.inflate(inflater, container, false);

        binding.backDetailsButton.setOnClickListener(view ->{
            NavHostFragment.findNavController(this).navigateUp();
        });

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Recupera los argumentos y actualiza la UI
        Bundle args = getArguments();
        if (args != null) {
            //binding.image.setText(args.getString("name"));
            binding.name.setText(args.getString("name"));
            binding.indice.setText(args.getString("index"));
            binding.types.setText(args.getString("name"));
            binding.altura.setText(args.getString("name"));
            binding.peso.setText(args.getString("name"));
        }
    }
}