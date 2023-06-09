package org.example;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println(list.stream().filter((Integer num) ->  (num != 20) && (num != 50) ).collect(Collectors.toList()));

        //System.out.println(list.stream().filter((Integer num) -> { (num != 20) && (num != 50); }).collect(Collectors.toList()));

        List<String> list2 = list.stream().map((x) -> "HelloWorld").collect(Collectors.toList());
        System.out.println(list.stream().reduce((a,b) -> a + b).stream().collect(Collectors.toList()));


























//        String pathToFord = "C:/Users/gmalyshev/Desktop/Ford.txt";
//        String pathToMazda = "C:/Users/gmalyshev/Desktop/Mazda.txt";
//        String pathToLada = "C:/Users/gmalyshev/Desktop/Lada.txt";
//
//        Path pathFord = Paths.get(pathToFord);
//        Path pathMazda = Paths.get(pathToMazda);
//        Path pathLada = Paths.get(pathToLada);
//
//        Scanner scanFord = null;
//        Scanner scanMazda = null;
//        Scanner scanLada = null;
//
//        try {
//            scanFord = new Scanner(pathFord);
//            scanMazda = new Scanner(pathMazda);
//            scanLada = new Scanner(pathLada);
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }
//
//        Ford ford = null;
//        Mazda mazda = null;
//        Lada lada = null;
//
//        //read Ford file and add to List
//        String[] allFordInfo = scanFord.nextLine().split(", ");
//        List<Ford> fordList = new ArrayList<>();
//        for (int i = 0; i < allFordInfo.length; i++) {
//            ford = new Ford(allFordInfo);
//            fordList.add(ford);
//        }
//
//        //read Mazda File and add to list
//        String[] allMazdaInfo = scanMazda.nextLine().split(", ");
//       List<Mazda> mazdaList = new ArrayList<>();
//        for (int i = 0; i < allMazdaInfo.length; i++) {
//            mazda = new Mazda(allMazdaInfo);
//            mazdaList.add(mazda);
//        }
//
//        //read Lada file and add to list
//        String[] allLadaInfo = scanLada.nextLine().split(", ");
//        List<Lada> ladaList = new ArrayList<>();
//        for (int i = 0; i < allLadaInfo.length; i++) {
//            lada = new Lada(allLadaInfo);
//            ladaList.add(lada);
//        }
//
//        ford.possibleToLiftWindows(fordList.get(0).getModel());
//        System.out.println();
//
//        mazda.possibleToLiftWindows(mazdaList.get(0).getModel());
//        System.out.println();
//
//        lada.possibleToLiftWindows(ladaList.get(0).getModel());
//        System.out.println();
//
//        ford.emergencyCase();
//        System.out.println();
//
//        mazda.emergencyCase();
//        System.out.println();
//
//        lada.emergencyCase();
//        System.out.println();
//
//        ford.startTheCar();
//        mazda.startTheCar();
//        lada.startTheCar();
//        System.out.println();
//
//        ford.countHowManyLitresWillBeConsumed(ford.getAverageConsumption(), 289746.34, 55.876);
//        mazda.countHowManyLitresWillBeConsumed(mazda.getAverageConsumption(), 77.0, 49.1);
//        lada.countHowManyLitresWillBeConsumed(lada.getAverageConsumption(), 0.2, 33.8);
//
//        System.out.println();
//
//        ford.possibleToDriveOutOfMud(fordList.get(1).getModel());
//        mazda.possibleToDriveOutOfMud(mazdaList.get(0).getModel());
//        lada.possibleToDriveOutOfMud(ladaList.get(0).getModel());
//
//        System.out.println();
//
//        ford.countUKDA(107, fordList.get(1).getEngineVolume(), 1056);
//        mazda.countUKDA(125, mazdaList.get(2).getEngineVolume(), 1023);
//        lada.countUKDA(141, ladaList.get(1).getEngineVolume(), 987);
//
//        System.out.println();





    }
}