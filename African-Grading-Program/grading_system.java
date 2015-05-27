package grading_system;

 import java.util.Scanner;

 public class grading_system {

 public static void main(String[] args) 

 {

 Scanner user_input = new Scanner(System.in);

 String name;

 int mark;

 System.out.println("**********?******************************?******");
 System.out.println(" SIMPLE AFRICAN GRADING SYSTEM ");
 System.out.println("**********?******************************?********");
 System.out.println("");
 System.out.print(" PLEASE ENTER YOUR NAME : ");
 name = user_input.next();
 System.out.println("");
 System.out.println(" Welcome "+name.toUpperCase()+ " this is a simple Java program that ");
 System.out.println(" provides the Grade and interpretation of");
 System.out.println(" any given examination numerical marks");
 System.out.println("");
 System.out.println(" **PRESS ZERO TO EXIT");
 System.out.println("==========?==============================?==============================?===");

 do{

 System.out.print(" PLEASE ENTER EXAMINATION SCORE : ");
 mark = user_input.nextInt();

 if (mark >= 70 && mark <= 100)
 {
 System.out.println(" GRADE A");
 System.out.println(" INTERPRETATION : EXCELLENT ");
 System.out.println("");

 } else if (mark >= 65 && mark <= 69)
 {
 System.out.println(" GRADE A-");
 System.out.println(" INTERPRETATION : VERY GOOD ");
 System.out.println("");

 } else if (mark >= 60 && mark <= 64)
 {
 System.out.println(" GRADE B+");
 System.out.println(" INTERPRETATION : GOOD ");
 System.out.println("");

 } else if (mark >= 55 && mark <= 59)
 {
 System.out.println(" GRADE B");
 System.out.println(" INTERPRETATION : ABOVE AVERAGE ");
 System.out.println("");

 } else if (mark >= 50 && mark <= 54)
 {
 System.out.println(" GRADE b-");
 System.out.println(" INTERPRETATION : AVERAGE ");
 System.out.println("");

 } else if (mark >= 45 && mark <= 49)
 {
 System.out.println(" GRADE C+");
 System.out.println(" INTERPRETATION : PASS ");
 System.out.println("");

 } else if (mark >= 40 && mark <= 44)
 {
 System.out.println(" GRADE C");
 System.out.println(" INTERPRETATION : FAIL ");
 System.out.println("");

 } else if (mark >= 30 && mark <= 39)
 {
 System.out.println(" GRADE D");
 System.out.println(" INTERPRETATION : FAIL ");
 System.out.println("");

 } else if (mark < 30)
 {
 System.out.println(" GRADE F");
 System.out.println(" INTERPRETATION : YOU FAIL ");
 System.out.println("");
 } else
 {
 System.out.println(" INAPPROPRIATE INPUT");

 }

 } while (mark > 0);

 }
 }
