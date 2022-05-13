package com.noah.animais.anfibios;

import com.noah.taxons.Classe;
import com.noah.taxons.Filo;
import com.noah.taxons.Reino;
import com.noah.taxons.SubFilo;

public class Anfibio {

    public Reino getReino() {
        return Reino.ANIMAIS;
    }

    public SubFilo getSubFilo() {
        return SubFilo.VERTEBRADOS;
    }

    public Classe getClasse() {
        return Classe.ANFIBIOS;
    }

    public Filo getFilo() {
        return Filo.CORDADOS;
    }
}
