package org.animal;

public class Owner {
    public static void main(String[] args) {
        Animal reptilianin = new Animal();
        reptilianin.speak();
        reptilianin.feed("mały żwir, piasek, gruby żwir, PiaSEk, uran, PIAseK, gwoździe", 5253);

        Food gruz = new Food("gruz", 69696);

        reptilianin.feed(gruz);

        Food paliwoRakietowe = new Food("paliwo rakietowe", 999999);

        reptilianin.feed(paliwoRakietowe);

        Food baterieLitowoJonowe = new Food("baterie litowo-jonowe", 12345);

        reptilianin.feed(baterieLitowoJonowe);

        Food zwir = new Food("żwir", 45342);

        reptilianin.feed(zwir);

        Food gwozdze = new Food("gwoździe", 69732);

        reptilianin.feed(gwozdze);

        Food PanzerkampfwagenVPanther = new Food("gwoździe", 69732);

        reptilianin.feed(gwozdze);
    }
}