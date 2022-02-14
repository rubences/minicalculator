  import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to My Calculator");
    System.out.println("--------------------------");
    Scanner keyboardInput = new Scanner(System.in);
System.out.print("Enter a number:");
double num1 = keyboardInput.nextDouble();
System.out.print("Enter a operator:");
String op = keyboardInput.next();
System.out.print("Enter another number:");
double num2 = keyboardInput.nextDouble();
String iOP = "Invalid operator";
if(op.equals("+")){
System.out.println(num1+num2);
}else if(op.equals("-")){
System.out.println(num1-num2);
}else if(op.equals("/")){
System.out.println(num1/num2);
}else if(op.equals("*")){
System.out.println(num1*num2);
}else{
System.out.println(iOP);
System.out.println("Thank You For Using Calculator");
  }
}
}