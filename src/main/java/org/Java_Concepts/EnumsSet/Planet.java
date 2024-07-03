package org.Java_Concepts.EnumsSet;

public enum Planet{
    mercury,
    venus,
    earth,
    mars,
    jupiter,
    saturn,
    uranus,
    neptune,
    pluto;
}

class MyPlanet {

    public static void main(String[] args){

        Planet planet = Planet.earth;
        //System.out.println(planet);
        canILiveHere(Planet.mars);
        canILiveHere(Planet.earth);

    }

    static void canILiveHere(Planet planet){
        switch (planet){
            case earth:
                System.out.println("you can Live here");
                break;
            default:
                System.out.println("you can't live here...yet!");
        }

    }
}
