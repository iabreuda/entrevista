package com.noah.animais.peixes;

import com.noah.taxons.Classe;
import com.noah.taxons.Filo;
import com.noah.taxons.Reino;
import com.noah.taxons.SubFilo;

public class Peixe {
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
}
