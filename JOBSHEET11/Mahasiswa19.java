package JOBSHEET11;

public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa19(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.printf("%-10s %-15s %-5s %.1f\n",
                nama, nim, kelas, ipk);
    }
}