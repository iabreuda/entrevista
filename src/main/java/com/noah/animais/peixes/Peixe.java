package com.noah.animais.peixes;

import com.noah.animais.Animal;
import com.noah.animais.Sexo;
import com.noah.taxons.Classe;
import com.noah.taxons.Filo;
import com.noah.taxons.Reino;
import com.noah.taxons.SubFilo;

public class Peixe implements Animal {

    private Sexo sexo;

    public Peixe(Sexo sexo) {
        this.sexo = sexo;
    }

    public Reino getReino() {
        return Reino.ANIMAIS;
    }

    public SubFilo getSubFilo() {
        return SubFilo.VERTEBRADOS;
    }

    public Classe getClasse() {
        return Classe.PEIXE;
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
