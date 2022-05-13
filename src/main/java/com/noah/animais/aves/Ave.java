package com.noah.animais.aves;

import com.noah.taxons.Classe;
import com.noah.taxons.Filo;
import com.noah.taxons.Reino;
import com.noah.taxons.SubFilo;

public class Ave {

    public Reino getReino() {
        return Reino.ANIMAIS;
    }

    public SubFilo getSubFilo() {
        return SubFilo.VERTEBRADOS;
    }

    public Classe getClasse() {
        return Classe.AVES;
    }

    public Filo getFilo() {
        return Filo.CORDADOS;
    }
}
