package com.java.problems;

public class RunLengthEncoding {

  public static void main(String q[]) {

    //Example: Run length Encoding of aaaabbccca is 4a2b3c1a
    String stringToEncode = "aaaabbcccaaaaafgdwew";

    System.out.println(calculateRunLengthEncoding(stringToEncode));
  }


  private static String calculateRunLengthEncoding(String stringToEncode) {

    //check input
    if (stringToEncode != null && stringToEncode.isEmpty()) {
      return "";
    }
    char[] inputChars = stringToEncode.toCharArray();
    StringBuilder stringBuilder = new StringBuilder();
    char prevChar = 0;
    int counter = 1;

    //iterate over input
    for (Character c : inputChars) {

      if (c == prevChar) {
        counter++;
      }
      else if (prevChar != 0) {
        stringBuilder.append(counter).append(prevChar);
        counter = 1;
      }
      prevChar = c;
    }
    return stringBuilder.append(counter).append(prevChar).toString();
  }
}
