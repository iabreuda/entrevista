package com.noah.arca;

import com.noah.animais.Animal;
import java.util.ArrayList;
import java.util.List;

public class Arca {

    public List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }
}
