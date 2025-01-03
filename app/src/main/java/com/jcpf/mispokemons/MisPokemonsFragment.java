package com.jcpf.mispokemons;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcpf.mispokemons.databinding.FragmentMisPokemonsBinding;

public class MisPokemonsFragment extends Fragment {

    FragmentMisPokemonsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMisPokemonsBinding.inflate(inflater, container, false);

        binding.showDetailsButton.setOnClickListener(this::goToDetailsView);


        return binding.getRoot();
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_fragment, fragment);
        fragmentTransaction.commit();
    }
    private void goToDetailsView(View view) {
        replaceFragment(new DetallesPokemonFragment());
    }
}