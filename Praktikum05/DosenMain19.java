package Praktikum05;
import java.util.Scanner;

public class DosenMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 list = new DataDosen19();

        int pilih;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda -> Tertua)");
            System.out.println("4. Sorting DSC (Tertua -> Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    Dosen19 d = new Dosen19(kode, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();

                case 3:
                    list.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC");
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;
            }

        } while (pilih != 5);
    }
}