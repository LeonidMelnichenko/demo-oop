package by.academy.melnichenko.javabasics.oop;

public class Main {
    public static void main(String[] args) {
        Wing wing1 = new Wing();
        wing1.typeWings = "Крылья для скоростного полёта";
        wing1.wingSurfaceArea = 123;
        wing1.wingspan = 120;

        Wing wing2 = new Wing();
        wing2.typeWings = "Эллиптические крылья";
        wing2.wingSurfaceArea = 1300;
        wing2.wingspan = 130;

        Beak beak1 = new Beak();
        beak1.beakType = "predatory";

        Beak beak2 = new Beak();
        beak2.beakType = "predatory";

        Bird hawk = new Bird();
        hawk.wing = wing2;
        hawk.beak = beak2;

        Bird falcon = new Bird();
        falcon.wing = wing1;
        falcon.beak = beak1;
    }
}
