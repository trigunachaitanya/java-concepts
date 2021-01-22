package com.core.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LbylEafp {
  public static void main(String[] q) {
    getIntLbyl();
    getIntEafp1();
    getIntEafp2();
    System.out.println("[divideLbyl]value is :" + divideLbyl(3, 0));
    System.out.println("[divideEafp]value is :" + divideEafp());
  }

  //Look Before You Leap
  private static int getIntLbyl() {

    Scanner s = new Scanner(System.in);
    boolean isValid = true;
    System.out.println("[getIntLbyl] Please enter an integer ");
    String input = s.next();

    for (int i = 0; i < input.length(); i++) {
      if (!Character.isDigit(input.charAt(i))) {
        isValid = false;
        break;
      }
    }
    if (isValid) {
      return Integer.parseInt(input);
    }
    return 0;
  }

  //Easier to Ask Forgiveness than Permission
  private static int getIntEafp1() {

    Scanner s = new Scanner(System.in);
    System.out.println("[getEafp1] Please enter an integer");
    try {
      int input = s.nextInt();
      return input;
    }
    catch (InputMismatchException e) {
      System.out.println("Invalid integer input.");
      return 0;
    }
  }

  //Easier to Ask Forgiveness than Permission
  private static int getIntEafp2() {

    Scanner s = new Scanner(System.in);
    System.out.println("[getEafp2] Please enter an integer");
    try {
      String input = s.next();
      return Integer.parseInt(input);
    }
    catch (NumberFormatException e) {
      System.out.println("Invalid integer input.");
      return 0;
    }
  }

  private static int divideLbyl(int first, int second) {
    if (second != 0) {
      return first / second;
    }
    return 0;
  }

  private static int divideEafp() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first integer value");
    int first = scanner.nextInt();
    System.out.println("Enter second integer value");
    int second = scanner.nextInt();

    try {
      return first / second;
    }
    catch (ArithmeticException e) {
      System.out.println("Exception occurred while dividing");
      return 0;
    }
  }

}
