package com.jcpf.mispokemons;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.jcpf.mispokemons.databinding.FragmentAjustesBinding;
import com.jcpf.mispokemons.databinding.FragmentMisPokemonsBinding;
import com.jcpf.mispokemons.databinding.SwitchItemBinding;

import java.util.Objects;


public class AjustesFragment extends Fragment {
    
    FragmentAjustesBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentAjustesBinding.inflate(inflater, container, false);

        //Idioma
        binding.ajustesView.getMenu().getItem(1).setOnMenuItemClickListener(item -> cambiarIdiomas());


        // todo: eliminar mis pokemons


        //Acerca de...
        binding.ajustesView.getMenu().getItem(3).setOnMenuItemClickListener(item -> infoClicked());

        //Cerrar sesión
        binding.ajustesView.getMenu().getItem(4).setOnMenuItemClickListener(item -> cerrarSesion());


        return binding.getRoot();
    }



    private boolean cambiarIdiomas() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle(R.string.idioma)
                .setSingleChoiceItems(R.array.idiomas_array, 0,(dialog, which) -> {
                    // Obtengo el array de idiomas desde los recursos
                    String[] idiomas = getResources().getStringArray(R.array.idiomas_array);

                    // TODO: cambio de idioma
                    // Mostrar un mensaje con el idioma seleccionado
                    Toast.makeText(getContext(), R.string.cambiar_message, Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                });
        AlertDialog dialog = builder.create();
        dialog.show();
        return true;
    }

    private boolean cerrarSesion() {
        // 1. Instanciamos el AlertDialog con su constructor.
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        // 2. Añdimos lo que va a mostrar.
        builder.setMessage(R.string.cerrar_message).setTitle(R.string.cerrar_sesi_n)
                .setPositiveButton(R.string.aceptar, (dialog, id) -> {
                    //todo: cerrar sesión
                    Toast.makeText(getContext(), "Se ha cerrado la sesión", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton(R.string.cancelar, (dialog, id) -> {
                });
        // 3. Creamos el AlertDialog.
        AlertDialog dialog = builder.create();
        //4. Lo mostramos
        dialog.show();
        return true;
    }

    private boolean infoClicked() {
        // 1. Instanciamos el AlertDialog con su constructor.
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        // 2. Añdimos lo que va a mostrar.
        builder.setMessage(R.string.dialog_message).setTitle(R.string.acerca_de);
        // 3. Creamos el AlertDialog.
        AlertDialog dialog = builder.create();
        //4. Lo mostramos
        dialog.show();
        return true;
    }


}