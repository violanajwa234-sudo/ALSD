package Praktikum05;

public class Dosen19 {
    String kode, nama;
    boolean jenisKelamin; // true = Laki-laki, false = Perempuan
    int usia;

    Dosen19(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println(kode + " | " + nama + " | " + jk + " | " + usia);
    }
}