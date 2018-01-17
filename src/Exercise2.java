/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naim's
 */
import java.util.Scanner;
public class Exercise2 {
public static void main(String[]args){
Scanner input = new Scanner(System.in);

 double A;
 double B;
double tambah;
double tolak;
double darab;
double bahagi;

System.out.print("Masukkan nombor A :");
A=input.nextDouble();
System.out.print("masukkan nombor B :");
B=input.nextDouble();

tambah=(A+B);
tolak=(A-B);
darab=(A*B);
bahagi=(A/B);

System.out.println("Hasil tambah A dan B :"+tambah);
System.out.println("Hasil tolak A dan B :"+tolak);
System.out.println("Hasil darab A dan B :"+darab);
System.out.println("Hasil bahagi A dan B :"+bahagi);

}
    
}
