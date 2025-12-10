package com.asif.project;



import java.util.Scanner;

public class ShoppingMall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to South City");
        System.out.println("Please select the Customer Type to get additional Discount:");
        System.out.println("\t\t1) General Customer");
        System.out.println("\t\t2) Prime Customer");
        System.out.println("\t\t3) VIP Customer");

        Customer customer = null;

        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {

        // =================== CASE 1: For GENERAL Customer ======================
        case 1: {

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            customer = new GeneralCustomer(name);

            System.out.print("Enter number of items: ");
            int noOfItem = Integer.parseInt(sc.nextLine());

            double[] itemPrice = new double[noOfItem];

            System.out.println("Please Enter the item prices one by one:");

            for (int i = 0; i < itemPrice.length; i++) {

//                System.out.print((i + 1) + ") Item Name: ");
//                String itemName = sc.nextLine();

                System.out.print("Item Price: ");
                double itemPriceVal = Double.parseDouble(sc.nextLine());

                itemPrice[i] = itemPriceVal;
            }

            generateBill(customer, itemPrice);
            break;
        }

        // =================== CASE 2: For PRIME Customer =======================
        case 2: {

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            customer = new PrimeCustomer(name);

            System.out.print("Enter number of items: ");
            int noOfItem = Integer.parseInt(sc.nextLine());

            double[] itemPrice = new double[noOfItem];

            System.out.println("Please Enter the item prices one by one:");

            for (int i = 0; i < itemPrice.length; i++) {

//                System.out.print((i + 1) + ") Item Name: ");
//                String itemName = sc.nextLine();

                System.out.print("Item Price: ");
                double itemPriceVal = Double.parseDouble(sc.nextLine());

                itemPrice[i] = itemPriceVal;
            }

            generateBill(customer, itemPrice);
            break;
        }

        // =================== CASE 3: For VIP Customer =========================
        case 3: {

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            customer = new VIPCustomer(name);

            System.out.print("Enter number of items: ");
            int noOfItem = Integer.parseInt(sc.nextLine());

            double[] itemPrice = new double[noOfItem];

            System.out.println("Please Enter the item prices one by one:");

            for (int i = 0; i < itemPrice.length; i++) {

//                System.out.print((i + 1) + ") Item Name: ");
//                String itemName = sc.nextLine();

                System.out.print("Item Price: ");
                double itemPriceVal = Double.parseDouble(sc.nextLine());

                itemPrice[i] = itemPriceVal;
            }

            generateBill(customer, itemPrice);
            break;
        }

        default:
            System.out.println("Invalid Choice! Try again.");
        }

        sc.close();
    }

    // ========================= BILL GENERATOR ==========================
    public static void generateBill(Customer customer, double... prices) {
        customer.calculateBill(prices);
        customer.printDetails();
    }

}

