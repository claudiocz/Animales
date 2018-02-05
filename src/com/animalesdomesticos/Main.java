package com.animalesdomesticos;

public class Main {

    public static void main(String[] args) {
        AnimalDomestico g;
        AnimalDomestico p;
        Veterinario medico;

        g=new Gato("Mau","marron");
        p = new Perro("Copito", "mostaza", "Labrador");

        medico = new Veterinario(p);

        medico.curarAnimal();

        /*
        g.saludar();
        p.saludar();
        */


    }
}
