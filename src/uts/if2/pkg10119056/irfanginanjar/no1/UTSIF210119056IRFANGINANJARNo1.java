/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119056.irfanginanjar.no1;

import java.util.Scanner;

/**
 * 
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan keterangan umur (tandanya kamu)
 */
public class UTSIF210119056IRFANGINANJARNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Age age=new Age(2000);
                age.setRed("\u001b[31m");
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(input.nextInt());
        System.out.print("=====Hasil Perhitungan Umur=====");
        System.out.println();
        age.setYearNow(2020);
        System.out.println("Tahun lahir anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        
        System.out.println();
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu "+age.getRed()+age.tandanyaKamu(age.hitungUmur()));
    }
    
}
