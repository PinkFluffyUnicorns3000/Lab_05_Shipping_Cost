/*
class ShippingTax
main()
    Double priceOfOrder
    Double total
    output “What is the price of your order?”
    input priceOfOrder
    if priceOfOrder >= 100 then
        output “Your shipping cost is free so your total is “ +
           priceOfOrder
    else
        shippingTax = priceOfOrder * 0.02
        total = priceOfOrder + shippingTax
        total = round(total * 100) /100.00
        output “Your shipping cost is “ + shippingCost +
            “ so your total is”  + total
        endIf
    return
EndClass
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double priceOfOrder = 0.0;
        double shippingTax = 0.0;
        double taxRate = 0.02;
        System.out.print("What is the price of your order ");
        if(in.hasNextDouble()){
            priceOfOrder = in.nextDouble();
            priceOfOrder = Math.round(priceOfOrder * 100.00) / 100.00;
            in.nextLine();
        }
        if(priceOfOrder >= 100){
            System.out.println("Your shipping cost is free so your total is " + priceOfOrder + " dollars.");
        } else {
            shippingTax = priceOfOrder * taxRate;
            shippingTax = Math.round(shippingTax * 100.0) / 100.00;
            priceOfOrder = priceOfOrder + shippingTax;
            System.out.println("The shipping tax on your order was " + shippingTax + " dollars so your grand total is "+
                    priceOfOrder + " dollars.");
        }
    }
}