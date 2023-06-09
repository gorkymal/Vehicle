package org.example;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.logging.Logger;

@Getter
@FieldDefaults (level = AccessLevel.PRIVATE)

public class Vehicle implements EmergencyCases {
    Scanner vehicleScan = new Scanner(System.in);

    String model;
    Integer amountOfWheels;
    Integer maximumSpeed;
    Integer amountOfDoors;
    Double engineVolume;
    Double averageConsumption;
    Boolean seatsHeating;
    Boolean autoStart;
    Boolean frontDrive;

//    public Vehicle(String[] allVehicleInfo) {
//        this.model = allVehicleInfo[0].trim();
//        this.amountOfWheels = Integer.valueOf(allVehicleInfo[1].trim());
//        this.maximumSpeed = Integer.valueOf(allVehicleInfo[2].trim());
//        this.amountOfDoors = Integer.valueOf(allVehicleInfo[3].trim());
//        this.engineVolume = Double.valueOf(allVehicleInfo[4].trim());
//        this.averageConsumption = Double.valueOf(allVehicleInfo[5].trim());
//        this.seatsHeating = Boolean.valueOf(allVehicleInfo[6].trim());
//        this.autoStart = Boolean.valueOf(allVehicleInfo[7].trim());
//        this.frontDrive = Boolean.valueOf(allVehicleInfo[8].trim());
//    }

    public Vehicle() {
    }

    @Override
     public void emergencyCase() {
        System.out.print("Anything happened? Type: ");
        String userText = vehicleScan.nextLine();

        if (userText.contains("break") || userText.contains("broke")) {
            System.out.println("No worries. Our master will arrive shortly!");
        }

        if (userText.contains("doesn't start") || userText.contains("not start")) {
            System.out.println("You need to buy a new battery :(");
        }
    }

    void countHowManyLitresWillBeConsumed(Double averageConsumption, Double distance, Double petrolPricePer100) {
        double part = distance / 100;
        double litresConsumed = part * averageConsumption;
        double totalPrice = litresConsumed * petrolPricePer100;
        System.out.print("Consumed amount of petrol is: " + String.format("%.2f", litresConsumed) + "\n");
        System.out.println("Total petrol price is: " + String.format("%.2f", totalPrice));
    }


    void possibleToDriveOutOfMud(String model) {
        String[] modelsOutOfMud = new String[]{"Explorer", "Focus", "CX-5", "Niva", "XRAY"};
        List<String> list = List.of(modelsOutOfMud);

        if (list.contains(model)) {
            System.out.println("ok");
        }
        else System.out.println("bad");
    }

    void countUKDA (Integer power, Double litres, Integer weight) {
        double ukda = (power * litres) / weight;
        System.out.println("The coefficient of the car dynamics is: " + String.format("%.2f", ukda));
    }

    void possibleToLiftWindows(String model) {
        System.out.println("Can I lift up the windows in " + model + " ?");
        String carWindowsLift = vehicleScan.nextLine();
        if (carWindowsLift.equalsIgnoreCase("You can")) {
            System.out.println("Vehicle has a system of windows pull-up and down.");
        }
        else if (carWindowsLift.equalsIgnoreCase("You can't")) {
            System.out.println("vehicle has no system of pull up and down");
        }
    }

}























