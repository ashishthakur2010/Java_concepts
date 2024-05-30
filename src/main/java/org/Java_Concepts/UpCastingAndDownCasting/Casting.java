package org.Java_Concepts.UpCastingAndDownCasting;

public class Casting {
    public static void main(String[] args) {
        Animal animal = new Dog();
        //Animal animal1 = new Cat();
        doAnimalStuff(animal);
    }

    public  static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.eat();
        animal.sleep();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.growl();
            dog.eat();
      //      Webdriver driver;
      //      driver = new ChromeDriver();
      //      JavascriptExecutor js = (JavascriptExecutor) driver;
      //      js.getElements();
        }
        else if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.growl();
        }
    }
}
