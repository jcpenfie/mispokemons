package com.jcpf.mispokemons;

import androidx.recyclerview.widget.RecyclerView;

import com.jcpf.mispokemons.databinding.MispokemonsCardviewBinding;

/*
 * Creación del binding para los personajes
 */
public class PokemonViewHolder  extends RecyclerView.ViewHolder{
    private final MispokemonsCardviewBinding binding;

    public PokemonViewHolder(MispokemonsCardviewBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind (PokemonData pokemon){
        binding.name.setText(pokemon.getName());
        //binding.image.setText(pokemon.getImage());
        binding.executePendingBindings(); //Para aplicar los cambios de inmediato
    }
}
