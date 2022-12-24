/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Kii
 */
public class Generic2 {

    static class Mahasiswa<A,B> {

        A nama;
        B daftarMatkul;
       

    }

    public static void main(String[] args) {
        ArrayList<Mahasiswa<String, ArrayDeque<String>>> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total Data Mahasiswa: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Masukan Nama Mahasiswa : ");
            Mahasiswa<String, ArrayDeque<String>> mahasiswa = new Mahasiswa<>();
            mahasiswa.nama = scanner.nextLine();
            mahasiswa.daftarMatkul= new ArrayDeque<>();
            System.out.println("Masukan Total Matkul : ");
            int m = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < m; j++) {
                System.out.print("Nama Matkul : ");
                String matkul = scanner.nextLine();
                mahasiswa.daftarMatkul.add(matkul);
            }
            daftarMahasiswa.add(mahasiswa);
        }
        System.out.println("Output DATA");
        System.out.println("===========================");
        for (int i = 0; i < n; i++) {
            Mahasiswa<String, ArrayDeque<String>> mahasiswa = daftarMahasiswa.get(i);
            System.out.println("Nama Mahasiswa : " + mahasiswa.nama);
            System.out.println("Matkul: " + mahasiswa.daftarMatkul.stream().collect(Collectors.joining(", ")));
        }

    }
}
