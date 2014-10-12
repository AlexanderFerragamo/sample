import java.util.Scanner;

public class SquareRoot{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Input an integer: ");
      int int1 = scnr.nextInt();
      if (int1 > -1){
      System.out.println(Math.sqrt(int1));
      } else {
      System.out.println("Error!");
      }
      