package dev.robertzuba;

public class App {
    public static void main(String[] args) {
        Car audi = Car.builder()
                .name("AUDI")
                .engine("1.8 ADR")
                .productionYear(1996)
                .build();
    }
}
