// File for your Coder Cafe code!

import java.util.Scanner;
import java.time.LocalDate;

public class CoderCafe {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("* * * * ** * * * * * * * * * * * * * * * * *");
        System.out.println("*" + "\t\t"  + "Welcome to Zoe's Coder Cafe" + "\t\t\t" + "*" );

        LocalDate myObj = LocalDate.now();
        System.out.println("*" + "\t\t\t\t\t" + myObj + "\t\t\t\t" + "*");

        // amount of drinks
        int matchaLatte = 2;
        int icedLatte = 4;
        int cappuccino = 3;
        int hotChocolate = 1;
        double numberofItems = matchaLatte + icedLatte + cappuccino + hotChocolate;

        // prices of drinks
        double priceofMatcha = 4.50;
        double priceofLatte = 5.30;
       double priceofCappuccino = 3.75;
       double priceofhotChocolate = 4.80;


                // printed out value of matcha
                double finalprintofMatcha = matchaLatte * priceofMatcha;
                System.out.printf("*" + "\t\t\t" + "Matcha Latte" +  "\t\t" + "$" + "%.2f", finalprintofMatcha);
                System.out.println("\t\t" + "*");

                // printed out value of latte
                double finalprintofLatte = icedLatte * priceofLatte;
                System.out.printf("*" + "\t\t\t" + "Iced Latte" +  "\t\t\t" + "$" + "%.2f", finalprintofLatte);
                System.out.println("\t\t" + "*");

                // printed out value of cappuccino
                double finalprintofCappuccino = cappuccino * priceofCappuccino;
                System.out.println("*" + "\t\t\t" + "Cappuccino" +  "\t\t\t" + "$" + finalprintofCappuccino +  "\t\t*");

                // printed out value of hot choc
                double finalprintofhotChocolate = hotChocolate * priceofhotChocolate;
                System.out.printf("*" + "\t\t\t" + "Hot Chocolate" +  "\t\t" + "$" + "%.2f",finalprintofhotChocolate);

                System.out.println("\t\t" + "*");
                System.out.println("*" + "\t\t\t\t\t\t\t\t\t\t\t" + "*" );

                // printed out value of subtotal
                double subtotal = finalprintofMatcha + finalprintofLatte + finalprintofCappuccino + finalprintofhotChocolate;
                System.out.println("*" + "\t\t\t" + "Subtotal" +  "\t\t\t" + "$" + subtotal + "\t\t" + "*");

                // printed out value of sales tax
                double salesTax = subtotal * .08875;
                double salesT = (int) (salesTax * 100) / 100.0;
                System.out.printf("*"+ "\t\t\t" + "Sales Tax\t\t\t$ %.2f",salesT);
                System.out.println("\t\t" + "*");

                // printed out value of service fee
                double serviceFee = 1.21;
                        System.out.println("*"+"\t\t\t" + "Service Fee\t\t\t$" + serviceFee+ "\t\t" + "*");

                // coder cafe fee
                double codercafeFee = (int) (subtotal * numberofItems) / 100.0;

                        System.out.printf("*"+"\t\t\t" + "Coder Cafe Fee \t\t$" + "%.2f", codercafeFee);
                        System.out.println("\t\t" + "*");

                        // overall total fee
        double overallTotal = subtotal + salesTax + serviceFee + codercafeFee;
                System.out.printf("*"+"\t\t\t" + "Overall Total\t\t$" + "%.2f", overallTotal);
            System.out.println("\t\t" + "*");
        System.out.println("*" + "\t\t\t\t\t\t\t\t\t\t\t" + "*");

        System.out.println("*"+ "\t\t\t Thank you for ordering!"+ "\t\t" + "*");
        System.out.println("* * * * ** * * * * * * * * * * * * * * * * *");
        }
}



