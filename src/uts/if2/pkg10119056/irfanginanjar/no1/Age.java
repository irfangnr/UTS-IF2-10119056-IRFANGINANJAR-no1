/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119056.irfanginanjar.no1;

/**
 *
 * @author ACER
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;
    
    Age(int yearNow){
        this.yearNow=yearNow;
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
    public void setYearNow(int yearNow) {
        this.yearNow = yearNow;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }
    
    public int hitungUmur(){
        return yearNow-yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        
        String tanda = null;
        if(umur>=0 && umur<=5){
             tanda="LAGI LUCU LUCU NYA";
        }else if(umur>5 && umur<=10){
            tanda="MASIH ANAK-ANAK";
        }else if(umur>10 && umur<=13){
            tanda="MASIH REMADJA";
        }else if(umur>13 && umur<=19){
            tanda="ALAY";
        }else if(umur>19 && umur<=29){
            tanda="LAGI GALAU NYARI JODOH";
        }else if(umur>29 && umur<=35){
            tanda="LAGI SIBUK NYARI UANG";
        }else if(umur>35 && umur<=150){
            tanda="SUDAH TUA";
        }else if(umur>150){
             tanda="TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        return tanda;
    }
}
