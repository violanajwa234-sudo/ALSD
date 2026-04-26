package JOBSHEET09;

import java.util.Scanner;

public class SuratDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat19 stack = new StackSurat19(5);

        int pilih;

        do {
            System.out.println("\n--- Menu Surat Izin ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin Berdasarkan Nama");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();

                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (Sakit/Izin): ");
                    String jenisStr = sc.nextLine();
                    char jenis = jenisStr.charAt(0);

                    System.out.print("Durasi Izin (hari): ");
                    int durasi = sc.nextInt();

                    Surat19 s = new Surat19(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat19 proses = stack.peek(); // tidak dihapus
                    if (proses != null) {
                        System.out.println("Surat " + proses.idSurat + 
                            " milik " + proses.namaMahasiswa + " telah divalidasi.");
                    } else {
                        System.out.println("Tidak ada surat");
                    }
                    break;

                case 3:
                    Surat19 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir: " 
                            + lihat.namaMahasiswa + " (" + lihat.idSurat + ")");
                    } else {
                        System.out.println("Tidak ada surat");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;
            }

        } while (pilih != 0);
    }
}