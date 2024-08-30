import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    /*
      Scanner sc = new Scanner(System.in);

      System.out.println("Hi, Man!\nCould you enter your Text (separated by space)?");
      String in = sc.nextLine();

      char symbol='a';

      int binary = symbol;

      String b = Integer.toBinaryString(binary);

      System.out.println("The Binary: " + b);

      String something = "Hi Man!";
    */

    String message = "Hello, World!";

    System.out.println("message: " + message);

    // String space = " ";
    String binary = "";

    for(int i=0; i<message.length(); ++i) {
      char c = message.charAt(i);
      int b = c;
      binary += Integer.toBinaryString(b) + " ";
      // if(c == ' ') {
      //   binary += space;
      // }

    }


    System.out.println("Binary: " + binary);


    // for(int i=0; i<something.length()-1; ++i) {


    // }


    //int binary = symbol;


    //System.out.println(binary); // 97

  }
}

/*
  Binary
  char => Decimal => Binary
  B    => 66      =>
  i    => 105     =>
  n    => 110     =>
  a    => 97      =>
  r    => 114     =>
  y    => 121     =>
*/