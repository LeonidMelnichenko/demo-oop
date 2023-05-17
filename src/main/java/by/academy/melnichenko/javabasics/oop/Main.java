package by.academy.melnichenko.javabasics.oop;
public class Main {
    public static void main(String[] args) {
        Wings wings1 = new Wings();
        wings1.typeWings = "Крылья для скоростного полёта";
        wings1.wingSurfaceArea = 123;
        wings1.wingspan = 120;

        Wings wings2 = new Wings();
        wings2.typeWings = "Эллиптические крылья";
        wings2.wingSurfaceArea = 1300;
        wings2.wingspan = 130;

        Beak beak1 = new Beak();
        beak1.beakType = "predatory";

        Beak beak2 = new Beak();
        beak2.beakType = "predatory";

        Bird hawk = new Bird();
        hawk.wings = wings2;
        hawk.beak = beak2;

        Bird falcon = new Bird();
        falcon.wings = wings1;
        falcon.beak = beak1;
    }
}
