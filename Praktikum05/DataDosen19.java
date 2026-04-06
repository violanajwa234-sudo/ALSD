package Praktikum05;

public class DataDosen19 {
    Dosen19[] dataDosen19 = new Dosen19[10];
    int idx = 0;

    void tambah(Dosen19 dsn) {
        if (idx < dataDosen19.length) {
            dataDosen19[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen19[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen19[j].usia > dataDosen19[j + 1].usia) {
                    Dosen19 temp = dataDosen19[j];
                    dataDosen19[j] = dataDosen19[j + 1];
                    dataDosen19[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen19[j].usia > dataDosen19[max].usia) {
                    max = j;
                }
            }
            Dosen19 temp = dataDosen19[max];
            dataDosen19[max] = dataDosen19[i];
            dataDosen19[i] = temp;
        }
    }
}