package com.jcpf.mispokemons;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import com.jcpf.mispokemons.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    private ActivityMainBinding binding;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Para las pantallas con bordes redondos
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        if (navHostFragment != null) {
            navController = navHostFragment.getNavController();
            NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);
        }

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.mis_pokemons_menu) {
                navController.navigate(R.id.misPokemonsFragment);
                return true;
            } else if (item.getItemId() == R.id.pokedex_menu) {
                navController.navigate(R.id.pokedexFragment);
                return true;
            } else if (item.getItemId() == R.id.ajustes_menu) {
                navController.navigate(R.id.ajustesFragment);
                return true;
            }
            return false;
        });
    }

    //Método para manejar el click en el pokemon
    public void pokemonClicked(@NonNull PokemonData currentPokemon) {
        //Creamos un Bundle para pasar los datos al CharacterDetailFragment
        Bundle bundle = new Bundle();
        bundle.putString("name", currentPokemon.getName());
        bundle.putString("image", currentPokemon.getImage());
        bundle.putString("index", currentPokemon.getIndex());
        bundle.putString("types", currentPokemon.getTypes());
        bundle.putString("altura", currentPokemon.getHeight());
        bundle.putString("peso", currentPokemon.getWeight());

        navController.navigate(R.id.detallesPokemonFragment, bundle);
    }


}