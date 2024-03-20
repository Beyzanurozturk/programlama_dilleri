
package com.mycompany.gramer;

import java.util.Scanner;

public class Gramer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ozne = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
        String[] nesne = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma",
                            "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
        String[] yuklem = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};

        System.out.println("Cümlenizi Giriniz: ");
        String cumle = scanner.nextLine().trim();

        String[] kelimeler = cumle.split("\\s+");

        String ozneKontrol = kelimeler[0];
        boolean ozneVarMi = false ;
        for (String o : ozne) {
            if (o.equals(ozneKontrol)) {
                ozneVarMi = true;
                break;
            }
        }

        String nesneKontrol = kelimeler[1];
        boolean nesneVarMi = false;
        for (String n : nesne) {
            if (n.equals(nesneKontrol)) {
                nesneVarMi = true;
                break;
            }
        }

        String yuklemKontrol = kelimeler[2];
        boolean yuklemVarMi = false;
        for (String y : yuklem) {
            if (y.equals(yuklemKontrol)) {
                yuklemVarMi = true;
                break;
            }
        }

        if (ozneVarMi && nesneVarMi && yuklemVarMi) {
            System.out.println("Evet");
        } else {
            System.out.println("Hayır");
        }
    }
}
