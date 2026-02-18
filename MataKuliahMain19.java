package JOBSHEET02;

public class MataKuliahMain19 {
   public MataKuliahMain19() {
   }

   public static void main(String[] args) {
      MataKuliah19 mataKuliahDefault = new MataKuliah19();
      MataKuliah19 mataKuliahKustom = new MataKuliah19("CS102", "Struktur Data", 4, 60);
      
      mataKuliahDefault.cetak();
      mataKuliahKustom.cetak();
      mataKuliahKustom.ubahSks(5);
      mataKuliahKustom.tambahJam(5);
      mataKuliahKustom.kurangiJam(10);
   }
}