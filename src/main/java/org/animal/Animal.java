package org.animal;

public class Animal {
    String species;
    int age = 69;
    long dlugi;
    boolean isAlive = true;
    boolean isHungry = true;
    int caloriesToFULL;
    char character;
    float unoszenie;
    double podwojny;
    long caloriesCounter = 0L;


    public void speak() {
        System.out.println("---OOBAMAobamaaObAmmaA---");
        species = "Reptilianin";
        System.out.println("Hellooo, my name is OBAMUS z gatunku " + species);
    }

    //alt + insert -> dodaje konstruktor
    public void feed(String food) {
        System.out.println("OBAMUUS ZJEŚĆ" + food);

    }
    public void feed(String food, int amount) {
        System.out.println("OBAMUS ZJEŚĆ: " + food + " W ILOŚCI: " + amount);

    }
    public void feed(Food food){
        if (food.FoodType.equals("jakieś gówno")){
            System.out.println("zeżarłem Panzerkampfwagen V Panther, czas na śmierć");
            isAlive = false;
        }
        if (isAlive){
            System.out.println("Jem sobie: " + food.FoodType + "która ma: " + food.calories + "kalorii");
            caloriesCounter += food.calories;
            System.out.println("Dziś zeżorłem" + caloriesCounter + "kalorii");
        }else {
        System.out.println("Wreszcie zdechł");
        }

    }
}
