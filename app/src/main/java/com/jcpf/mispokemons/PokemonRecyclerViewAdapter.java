package com.jcpf.mispokemons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcpf.mispokemons.databinding.MispokemonsCardviewBinding;


import java.util.List;

/*
 * Adaptador de la app
 */
public class PokemonRecyclerViewAdapter extends RecyclerView.Adapter<PokemonViewHolder>{
    private final List<PokemonData> pokemons;
    private final Context context;

    public PokemonRecyclerViewAdapter (List<PokemonData> pokemons, Context context){
        this.pokemons = pokemons;
        this.context = context;
    }


    //Método para crear el el ViewHolder
    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MispokemonsCardviewBinding binding = MispokemonsCardviewBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false
        );
        return new PokemonViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        PokemonData currentPokemon = this.pokemons.get(position);
        holder.bind(currentPokemon);

        //Manejar evento click de los items
        holder.itemView.setOnClickListener(view -> itemClicked(currentPokemon));
    }

    private void itemClicked(PokemonData currentPokemon) {
        ((MainActivity) context).pokemonClicked(currentPokemon);
    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }
}
