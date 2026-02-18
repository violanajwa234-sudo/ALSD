package JOBSHEET02;

public class DosenMain19 {
   public DosenMain19() {
   }

   public static void main(String[] args) {
      Dosen19 dosenDefault = new Dosen19();
      Dosen19 dosenKustom = new Dosen19("L002", "Prof. Johnson", false, "2015", "Rekayasa Perangkat Lunak");
      
      dosenDefault.cetak();
      dosenKustom.cetak();
      dosenKustom.ubahStatusAktif(true);
   }
}