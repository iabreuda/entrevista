package com.noah.animais.mamiferos;

import com.noah.animais.Animal;
import com.noah.animais.Sexo;
import com.noah.taxons.Classe;
import com.noah.taxons.Filo;
import com.noah.taxons.Reino;
import com.noah.taxons.SubFilo;

public class Mamifero implements Animal {

    public Mamifero(Sexo sexo) {
        this.sexo = sexo;
    }

    private Sexo sexo;

    public Reino getReino() {
        return Reino.ANIMAIS;
    }

    public SubFilo getSubFilo() {
        return SubFilo.VERTEBRADOS;
    }

    public Classe getClasse() {
        return Classe.MAMIFEROS;
    }

    public Filo getFilo() {
        return Filo.CORDADOS;
    }

    @Override
    public void definirSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public Sexo pegarSexo() {
        return sexo;
    }


}
