/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan46.tandanyakamu;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author  
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas:Tandanya Kamu
 */
public class PBO2_10118083_Latihan46_TandanyaKamu {

    private static int yearNow;
    public static int umur;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearNow);
        System.out.print("Masukan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        umur = age.hitungUmur();
        System.out.println("\n===== Hasil Perhitungan Umur =====");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari ini Tahun   : " + age.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah " + umur + " tahun");
        System.out.println("Tandanya Kamu    : " + age.tandanyaKamu(umur));                
    }
    
}
