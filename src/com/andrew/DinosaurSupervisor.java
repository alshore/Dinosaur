package com.andrew;

public class DinosaurSupervisor {

    public static void main(String[] args) {

        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur diplodicus = new Dinosaur();
        Dinosaur brontasaurus = new Dinosaur();

        t_rex.roar();
        velociraptor.roar();
        t_rex.murder();
        diplodicus.murder();
        brontasaurus.roar();
    }
}
