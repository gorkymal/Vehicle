package org.example;

import java.util.Scanner;

public class Ford extends Vehicle implements EmergencyCases {
    Scanner fordScanner = new Scanner(System.in);

    public Ford() {
    }

    @Override
    public void emergencyCase() {
        System.out.println("Anything happened? Type: ");
        String userFordText = fordScanner.nextLine();
        if (userFordText.equalsIgnoreCase("Ford problem")) {
            System.out.println("Ford broke down");
        }
    }

    @Override
    void possibleToLiftWindows(String model) {
        System.out.println("Can I lift up the windows in " + model + "?");
        String carWindowsLift = fordScanner.nextLine();
        if (carWindowsLift.equalsIgnoreCase("You can")) {
            System.out.println("Ford has a system of windows pull-up and down.");
        }
        else if (carWindowsLift.equalsIgnoreCase("You can't")) {
            System.out.println("Ford has no system of pull up and down");
        }
    }
}
