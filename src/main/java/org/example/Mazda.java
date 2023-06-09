package org.example;

import java.util.Scanner;

public class Mazda extends Vehicle implements EmergencyCases {
    Scanner mazdaScanner = new Scanner(System.in);
//    public Mazda(String[] allVehicleInfo) {
//        super(allVehicleInfo);
//    }

    @Override
    public void emergencyCase() {
        System.out.println("Anything happened? Type: ");
        String userFordText = mazdaScanner.nextLine();
        if (userFordText.equalsIgnoreCase("Mazda problem")) {
            System.out.println("Mazda broke down");
        }
    }

    @Override
    void possibleToLiftWindows(String model) {
        System.out.println("Can I lift up the windows in " + model + " ?");
        String carWindowsLift = mazdaScanner.nextLine();
        if (carWindowsLift.equalsIgnoreCase("You can")) {
            System.out.println("Mazda has a system of windows pull-up and down.");
        }
        else if (carWindowsLift.equalsIgnoreCase("You can't")) {
            System.out.println("Mazda has no system of pull up and down");
        }
    }
}
