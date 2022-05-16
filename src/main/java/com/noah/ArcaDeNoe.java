package com.noah;

import com.noah.animais.Animal;
import com.noah.animais.Sexo;
import com.noah.animais.anfibios.Ra;
import com.noah.animais.anfibios.Salamandra;
import com.noah.animais.anfibios.Sapo;
import com.noah.animais.aves.Pombo;
import com.noah.arca.Arca;

public class ArcaDeNoe {
    public static void main(String[] args) {
        var raMacho = new Ra(Sexo.MACHO);
        var raFemea = new Ra(Sexo.FEMEA);
        var salamandraMacho = new Salamandra(Sexo.MACHO);
        var salamandraFemea = new Salamandra(Sexo.FEMEA);
        var sapoMacho = new Sapo(Sexo.MACHO);
        var sapoFemea = new Sapo(Sexo.FEMEA);

        // Noe nao precisa mais de animais que voem, ja que eles conseguem se virar
        //var pomboMacho = new Pombo(Sexo.MACHO);
        //var pomboFemea = new Pombo(Sexo.FEMEA);

        // Noe nao precisa tambem dos peixes pois o diluvio nao sera um grande problema
        //var atumMacho = new Atum(Sexo.MACHO);
        //var atumFemea = new Atum(Sexo.FEMEA);

        var arca = new Arca();
        arca.adicionarAnimal(raMacho);
        arca.adicionarAnimal(raFemea);
        arca.adicionarAnimal(salamandraFemea);
        arca.adicionarAnimal(salamandraMacho);
        arca.adicionarAnimal(sapoMacho);
        arca.adicionarAnimal(sapoFemea);

        for (Animal animal : arca.animais) {
            System.out.println(animal.getClass().getSimpleName() + " " + animal.pegarSexo().name());
        }
    }
}