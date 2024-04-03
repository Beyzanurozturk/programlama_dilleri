package com.mycompany.bagli_sirali;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Node {
    int value;
    int address;

    public Node(int value, int address) {
        this.value = value;
        this.address = address;
    }
}

public class Bagli_Sirali {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Dosya adı giriniz: ");
            String dosyaAdi = scanner.nextLine();
            File file = new File(dosyaAdi);
            scanner = new Scanner(file);

            int elemanSayisi = 0;
            while (scanner.hasNextInt()) {
                elemanSayisi++;
                scanner.nextInt();
            }

            int[] dizi = new int[elemanSayisi];
            scanner = new Scanner(file);
            int index = 0;
            System.out.println("Dosyadaki elemanlar:");
            while (scanner.hasNextInt()) {
                int eleman = scanner.nextInt();
                dizi[index++] = eleman;
                System.out.println(eleman);
            }
            System.out.println(); 

            
            Node[] nodes = new Node[elemanSayisi];
            for (int i = 0; i < elemanSayisi; i++) {
                nodes[i] = new Node(dizi[i], i);
            }

            for (int i = 0; i < elemanSayisi - 1; i++) {
                for (int j = 0; j < elemanSayisi - i - 1; j++) {
                    if (nodes[j].value > nodes[j + 1].value) {
                        Node temp = nodes[j];
                        nodes[j] = nodes[j + 1];
                        nodes[j + 1] = temp;
                    }
                }
            }


            System.out.println("Sıralanmış dizi:");
            for (Node node : nodes) {
                System.out.print(dizi[node.address] + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        }
    }
}
