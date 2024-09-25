package Toko;

import java.util.Scanner;

public class TesterInput {
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println(" ");
            System.out.print("CD / DVD : ");
            String pilihan = in.nextLine();

            System.out.print("Name : ");
            String name = in.nextLine();
            System.out.print("Number : ");
            int number = in.nextInt();
            System.out.print("Quantity : ");
            int quantity = in.nextInt();
            System.out.print("price : ");
            double price = in.nextDouble();

            if (pilihan.equalsIgnoreCase("CD")) {

                  System.out.println("Label : ");
                  String label = in.nextLine();
                  System.out.print("NumSong : ");
                  int NumSong = in.nextInt();
                  System.out.print("Artist : ");
                  String Artist = in.nextLine();
                  CD c1 = new CD(number, name, quantity, price, Artist, NumSong, label);
                  c1.print();

            } else if (pilihan.equalsIgnoreCase("DVD")) {
                  System.out.print("Length : ");
                  int length = in.nextInt();
                  System.out.println("Studio : ");
                  String Studio = in.nextLine();
                  System.out.println("Rating : ");
                  String Rating = in.nextLine();
                  DVD c2 = new DVD(number, name, quantity, price, length, Studio, Rating);
                  c2.print();
            }

            in.close();

      }

}