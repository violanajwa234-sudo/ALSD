package Praktikum05;

public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    //konstruktor default
    Mahasiswa19() {

    }

    //konstruktor berparameter(dibuat ada ayang parameter inputnya sama ada yang tidak)
    Mahasiswa19(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}