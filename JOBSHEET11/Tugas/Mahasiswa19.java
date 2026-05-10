package JOBSHEET11.Tugas;

public class Mahasiswa19 {
    String nim, nama, jurusan;

    public Mahasiswa19(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println(nim + "\t" + nama + "\t" + jurusan);
    }
}