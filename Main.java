package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        Product product=new Product("", 0, 0);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");

        String newName = sc.nextLine();
        product.setName(newName);

        System.out.print("Price: ");
        double newPrice =sc.nextDouble();
        product.setPrice(newPrice);

        System.out.print("Quantity in Stock: ");
        int newQuant=sc.nextInt();
        product.setQuantity(newQuant);


        System.out.println(product);
       // System.out.println(" "+product.getName()+" "+product.getPrice()+" "+ product.getQuantity());
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();//criar variavel para receber o valor que o user digitar
        product.addProducts(quantity);//passaremos o quantity como parametro no metodo
        // addproduct, para que seja feito a entrada no estoque e atualize
        //a quantidade do produto.

        System.out.println(product);

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity= sc.nextInt();
        product.removeProducts(quantity);

        System.out.println(product);

        sc.close();
        }
    }
