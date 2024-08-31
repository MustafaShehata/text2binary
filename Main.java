import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String userText = userInput();
    String binary = text2binary(userText);

    System.out.println("text2binary: " + binary);
  }

  public static String userInput() {
    Scanner in = new Scanner(System.in);
    System.out.print("Welcome to text2binary converter!\nCould you enter your text? ");
    String str = in.nextLine();
    return str;
  }

  public static String text2binary(String text) {
    String binary = "";

    for(int i=0; i<text.length(); ++i) {
      char c = text.charAt(i);
      int b = c; // type casting [ Implicit type casting \ widening type casting(from char to int) ]
      binary += Integer.toBinaryString(b) + " ";
    }
    return binary;
  }

}