import java.util.Scanner;

public class Loop{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      int value3  = 0;
      double num3 = 0;
      System.out.println("This program answers questions you have about school.");
      System.out.println("For each question answer true or false.");
      System.out.println("Do you want to know about class times?");
      boolean times = scnr.nextBoolean();
      if (times) {
      System.out.println("is it a wednesday?");
      boolean wednesday = scnr.nextBoolean();
      if (wednesday){
      System.out.println("Is it block one?");
      boolean one1 = scnr.nextBoolean();
      if (one1){
      System.out.println("Class starts at 8:05");
      System.out.println("Class ends at 9:15");
      System.out.println("School ends at 2:10");
      }
      System.out.println("Is it block two?");
      boolean two1 = scnr.nextBoolean();
      if (two1){
      System.out.println("Class starts at 9:50");
      System.out.println("Class ends at 10:55");
      System.out.println("School ends at 2:10");
      }
      System.out.println("Is it block three?");
      boolean three1 = scnr.nextBoolean();
      if (three1){
      System.out.println("Class starts at 11:05");
      System.out.println("Class ends at 12:15");
      System.out.println("School ends at 2:10");
      }      
      System.out.println("Is it block four?");
      boolean four1 = scnr.nextBoolean();
      if (four1){
      System.out.println("Class starts at 1:05");
      System.out.println("Class ends at 2:10");
      }
      }  
      System.out.println("Is it a normal day?");
      boolean normalDay = scnr.nextBoolean();
      if (normalDay){    
      System.out.println("Is it block one?");
      boolean one2 = scnr.nextBoolean();
      if (one2){
      System.out.println("Class starts at 8:05");
      System.out.println("Class ends at 9:25");
      System.out.println("School ends at 3:05");
      }
      System.out.println("Is it block two?");
      boolean two2 = scnr.nextBoolean();
      if (two2){
      System.out.println("Class starts at 9:55");
      System.out.println("Class ends at 11:15");
      System.out.println("School ends at 3:05");
      }
      System.out.println("Is it block three?");
      boolean three2 = scnr.nextBoolean();
      if (three2){
      System.out.println("Class starts at 11:25");
      System.out.println("Class ends at 12:45");
      System.out.println("School ends at 3:05");
      }      
      System.out.println("Is it block four?");
      boolean four2 = scnr.nextBoolean();
      if (four2){
      System.out.println("Class starts at 1:45");
      System.out.println("Class ends at 3:05");
      }
      }
      }
      System.out.println("do you want to know about school days?");
      boolean days = scnr.nextBoolean();
      if (days){
      System.out.println("How many days are you into the school year?");
      int value1 = scnr.nextInt();
      value3 = value1 % 8;
         if (value3 == 0){
         value3 = value3 + 8;
         }
      System.out.print("Today is a day ");
      System.out.println(value3);
      }
      
      System.out.println("Do you want to know what class you have now?");
      boolean classes = scnr.nextBoolean();
      if (classes){
      System.out.println("Is it a day 1");
      boolean block1 = scnr.nextBoolean();
      if (block1){
      System.out.println("You have English then Math then Chinese then Java ");
      }
      System.out.println("Is it a day 2");
      boolean block2 = scnr.nextBoolean();
      if (block2){
      System.out.println("You have a World Civ then PE then Biology then Band");
      }
      System.out.println("Is it a day 3");
      boolean block3 = scnr.nextBoolean();
      if (block3){
      System.out.println("You have Geometry then Chinese then Java then English");
      }
      System.out.println("Is it a day 4");
      boolean block4 = scnr.nextBoolean();
      if (block4){
      System.out.println("You have Foundations then Biology then Band then World Civ");
      }
      System.out.println("Is it a day 5");
      boolean block5 = scnr.nextBoolean();
      if (block5){
      System.out.println("You have Chinese then Java then English then Geometry");
      }
      System.out.println("Is it a day 6");
      boolean block6 = scnr.nextBoolean();
      if (block6){
      System.out.println("You have Biology then Band then World Civ then PE ");
      }
      System.out.println("Is it a day 7");
      boolean block7 = scnr.nextBoolean();
      if (block7){
      System.out.println("You have Java then English then Geometry then Chinese");
      }
      System.out.println("Is it a day 8");
      boolean block8 = scnr.nextBoolean();
      if (block8){
      System.out.println("You have Band then World Civ then Foundations then Biology");
      }
      }
      System.out.println("Do you want to use a grade calculator?");
      boolean calc = scnr.nextBoolean();
      if (calc){
      System.out.println("Type in the over all points of the test of quiz.");
      double num1 = scnr.nextDouble();
      System.out.println("Type what you got on the test or quiz");
      double num2 = scnr.nextDouble();
      num3 = (num2 / num1);
      System.out.println(num3);
      }
      System.out.println("Have a nice day");
      }
      }
