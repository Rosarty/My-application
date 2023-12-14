package app;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two parameters for Device :");
        double param1 = scanner.nextDouble();
        double param2 = scanner.nextDouble();
        Device deviceA = new DeviceA(param1, param2);
        System.out.println("Result from Device A: " + Rounder.roundValue(deviceA.getResult()));
        Device deviceB = new DeviceB(param1, param2);
        System.out.println("Result from Device B: " + Rounder.roundValue(deviceB.getResult()));

        scanner.close();
    }
}
