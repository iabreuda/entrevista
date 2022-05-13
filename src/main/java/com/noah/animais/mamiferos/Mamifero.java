package com.noah.animais.mamiferos;

import com.noah.taxons.Classe;
import com.noah.taxons.Filo;
import com.noah.taxons.Reino;
import com.noah.taxons.SubFilo;

public class Mamifero {
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
}
