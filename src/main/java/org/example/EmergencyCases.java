package org.example;

@FunctionalInterface
interface EmergencyCases {

    void emergencyCase();

    default void startTheCar() {
        System.out.println("The car has started!");
    }
}

