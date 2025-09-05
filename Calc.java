import java.util.Scanner;
class Calc{
    public static void main(String[] args ){
        int Flag=0;
while( Flag != 1){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a= input.nextInt();
        System.out.println("Enter 2nd number:");
        int b= input.nextInt();
        System.out.println("Enter an operator:");
        char operator= input.next().charAt(0);
        if (operator == '+'){
            int c = a+b;
            System.out.println("The Addition of "+a+" and "+b+":"+c);
            System.out.println("Do you want to continue?(1-Yes or 0-No):");
            int choice= input.nextInt();
            if (choice == 1){
                Flag=0;
            }
            else if(choice == 0){
            Flag=1;
            }
            else{
                System.out.println("Invalid input(enter 1 or 0).");
            }
        }
        else if (operator == '-'){
            int c = a-b;
            System.out.println("The Subtraction of "+a+" and "+b+":"+c);
            System.out.println("Do you want to continue?(1-Yes or 0-No):");
            int choice= input.nextInt();
            if ( choice == 1 ){
                Flag=0;
            }
            else if(choice == 0){
            Flag=1;
            }
            else{
                System.out.println("Invalid input(enter 1 or 0).");
            }

        }
        else if (operator == '*'){
            int c = a*b;
            System.out.println("The Multiplication of "+a+" and "+b+":"+c);
            System.out.println("Do you want to continue?(1-Yes or 0-No):");
            int choice= input.nextInt();
            if ( choice == 1 ){
                Flag=0;
            }
            else if(choice == 0){
            Flag=1;
            }
            else{
                System.out.println("Invalid input(enter 1 or 0).");
            }

        }
        else if (operator == '/'){
            double c = (double)a/b;
            System.out.println("The Division of "+a+" and "+b+":"+c);
            System.out.println("Do you want to continue?(1-Yes or 0-No):");
            int choice= input.nextInt();
            if ( choice == 1){
                Flag=0;
            }
            else if(choice == 0){
            Flag=1;
            }
            else{
                System.out.println("Invalid input(enter 1 or 0).");
            }

        }
        else if (operator == '^'){
            double c = Math.pow(a,b);
            System.out.println("The Exponent of "+a+" and "+b+":"+c);
            System.out.println("Do you want to continue?(yes-1 or no-0):");

            int choice=input.nextInt();
            if ( choice == 1){
                Flag=0;
            }
            else if(choice == 0){
            Flag=1;
            }
            else{
                System.out.println("Invalid input(enter 1 or 0).");
            }
        }
        else if (operator == '%'){
            int c = a%b;
            System.out.println("The Modulo of "+a+" and "+b+":"+c);
            System.out.println("Do you want to continue?(1-Yes or 0-No):");
            int choice=input.nextInt();
            if ( choice == 1){
                Flag=0;
            }
            else if(choice == 0){
            Flag=1;
            }
            else{
                System.out.println("Invalid input(enter 1 or 0).");
            }
        }
        else{
            System.out.println("Enter Valid Input.");
        }
        }
    }
}
