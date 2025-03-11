package com.duque.Main;

import java.util.Scanner;

import com.duque.Adaptee.Laptop;
import com.duque.Adaptee.Refrigirator;
import com.duque.Adaptee.SmartphoneCharger;
import com.duque.Adapter.LaptopAdapter;
import com.duque.Adapter.RefrigiratorAdapter;
import com.duque.Adapter.SmartphoneAdapter;
import com.duque.Interface.PowerOutlet;

public class MainSmartApp {

    Laptop laptop = new Laptop();
    PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
    Refrigirator ref = new Refrigirator();
    PowerOutlet refAdapter = new RefrigiratorAdapter(ref);
    SmartphoneCharger smartphone = new SmartphoneCharger();
    PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphone);

    public static void main(String[] args) {

            while (true) {
                System.out.println("Choose an option: ");
                System.out.println("1. Plug in Laptop");
                System.out.println("2. Plug in Refrigirator");
                System.out.println("3. Plug in Smartphone");
                System.out.println("4. Exit");
                System.out.print("Enter your option: ");
                MainSmartApp main = new MainSmartApp();
                Scanner sc = new Scanner(System.in);
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println(main.laptopAdapter.plugIn());
                        break;
                    case 2:
                        System.out.println(main.refAdapter.plugIn());
                        break;
                    case 3:
                        System.out.println(main.smartphoneAdapter.plugIn());
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
        }
    }
