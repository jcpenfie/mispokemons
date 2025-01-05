package com.jcpf.mispokemons;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcpf.mispokemons.databinding.FragmentMisPokemonsBinding;

import java.util.ArrayList;

public class MisPokemonsFragment extends Fragment {

    private FragmentMisPokemonsBinding binding;
    private ArrayList<PokemonData> pokemons;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMisPokemonsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadPokemons();

        //Configuramos el RecyclerView
        PokemonRecyclerViewAdapter adapter = new PokemonRecyclerViewAdapter(pokemons, getActivity());
        binding.mispokemosnRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.mispokemosnRecyclerview.setAdapter(adapter);
    }

    //Método para cargar los datos de los personajes
    private void loadPokemons(){
        pokemons = new ArrayList<>();

        //Relleno los datos de los personajes
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
        pokemons.add(new PokemonData("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png","bulbasaur","1", "SS","22","33" ));
    }
}