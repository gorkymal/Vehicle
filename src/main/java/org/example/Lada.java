package org.example;

import java.util.Scanner;

public class Lada extends Vehicle implements EmergencyCases {
    Scanner ladaScanner = new Scanner(System.in);

//    //public Lada(String[] allVehicleInfo) {
//        super(allVehicleInfo);
//    }

    @Override
    public void emergencyCase() {
        System.out.println("Anything happened? Type: ");
        String userFordText = ladaScanner.nextLine();
        if (userFordText.equalsIgnoreCase("Lada problem")) {
            System.out.println("Lada broke down");
        }
    }

    @Override
    void possibleToLiftWindows(String model) {
        System.out.println("Can I lift up the windows in " + model + " ?");
        String carWindowsLift = ladaScanner.nextLine();
        if (carWindowsLift.equalsIgnoreCase("You can")) {
            System.out.println("Lada has a system of windows pull-up and down.");
        }
        else if (carWindowsLift.equalsIgnoreCase("You can't")) {
            System.out.println("Lada has no system of pull up and down");
        }
    }
}
