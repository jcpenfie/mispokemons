package com.jcpf.mispokemons;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcpf.mispokemons.databinding.FragmentDetallesPokemonBinding;
import com.jcpf.mispokemons.databinding.FragmentPokedexBinding;


public class DetallesPokemonFragment extends Fragment {

    FragmentDetallesPokemonBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDetallesPokemonBinding.inflate(inflater, container, false);

        binding.backDetailsButton.setOnClickListener(this::goToMisPokemonsView);


        return binding.getRoot();
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_fragment, fragment);
        fragmentTransaction.commit();
    }
    private void goToMisPokemonsView(View view) {
        replaceFragment(new MisPokemonsFragment());
    }
}