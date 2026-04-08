package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            System.out.println("-------------------------");

            Mahasiswa19 m = new Mahasiswa19(nim, nama, kelas, ipk);
            list.tambah(m);

            System.out.println();
        }

        list.bubbleSort();
        list.tampil();

        System.out.println("=========================");
        System.out.println("Pencarian Data");
        System.out.println("=========================");
        System.out.println("Masukkan IPK mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = Double.parseDouble(sc.nextLine());

        System.out.println("=========================");
        System.out.println("menggunakan binary search");
        System.out.println("=========================");

        int posisi2 = list.findBinarySearch(cari, 0, n - 1);
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);

        sc.close();
    }
}