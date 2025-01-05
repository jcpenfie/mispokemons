package com.jcpf.mispokemons;

/*
 * Objeto Pokemon para su definición de atributos con sus getters
 */
public class PokemonData {
    private final String image;
    private final String name;
    private final String index;
    private final String types;
    private final String height;
    private final String weight;

    public PokemonData(String image, String name, String index, String types, String height, String weight) {
        this.image = image;
        this.name = name;
        this.index = index;
        this.types = types;
        this.height = height;
        this.weight = weight;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getIndex() {
        return index;
    }

    public String getTypes() {
        return types;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }
}
