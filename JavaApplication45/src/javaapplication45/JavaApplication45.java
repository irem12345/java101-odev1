/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author İrem Serra
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int matematik;
        int fizik;
        int kimya;
        int turkce;
        int tarih;
        int müzik;

        Scanner scn = new Scanner(System.in);

        
        System.out.print("Matematik notunuz: ");
        matematik = scn.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = scn.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = scn.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = scn.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = scn.nextInt();

        System.out.print("Müzik notunuz: ");
        müzik = scn.nextInt();

    
        int toplam = matematik + fizik + kimya + turkce + tarih + müzik;
        double ortalama = toplam / 6;

    
        System.out.println("Not ortalamanız : " + ortalama);

        System.out.println(ortalama >= 60 ? "Geçtiniz :)" : "Kaldınız ");

    }

}
