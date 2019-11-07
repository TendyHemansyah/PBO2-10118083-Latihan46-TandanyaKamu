/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan46.tandanyakamu;

/**
 *
 * @author  
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas: Tandanya Kamu
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private final String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        String ket;
        if (umur >= 0 && umur <= 5) ket = "LAGI LUCU-LUCUNYA";
        else if(umur < 5 && umur <= 10) ket = "MASIH ANAK-ANAK";
        else if(umur < 10 && umur <= 13) ket = "MASIH REMAJA";
        else if(umur < 13 && umur <= 19) ket = "ALAY";
        else if(umur < 19 && umur <= 29) ket = "LAGI GALAU NYARI JODOH";
        else if(umur < 29 && umur <= 35) ket = "LAGI SIBUK NYARI UANG";
        else if(umur < 35 && umur <= 10) ket = "SUDAH TUA";
        else ket = "TIDAK TERDETEKSI DI KEHIDUPAN";
        
        return ket + red;
    }

//    void getYearBirth(int nextInt) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
