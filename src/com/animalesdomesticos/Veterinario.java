package com.animalesdomesticos;

public class Veterinario {
    AnimalDomestico animal;

    public Veterinario(AnimalDomestico animal){
        this.animal = animal;

    }

    public void curarAnimal(){
        if (this.animal instanceof Gato){
            System.out.println("Estoy curando a un gato");
        }else
            System.out.println("Estoy curando a un Perro");
        this.animal.saludar();
    }
}
