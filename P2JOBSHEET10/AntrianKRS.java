package P2JOBSHEET10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahDilayani = 0;
    int maksDilayani = 30;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println("Mahasiswa masuk antrian.");
    }
    public void panggil2Mahasiswa() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }
        if (jumlahDilayani >= maksDilayani) {
            System.out.println("DPA sudah mencapai batas pelayanan.");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa m = data[front];
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
            m.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 antrian.");
            return;
        }

        System.out.println("2 Mahasiswa Terdepan:");
        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDilayani() {
        return jumlahDilayani;
    }

    public int sisaBelumDilayani() {
        return maksDilayani - jumlahDilayani;
    }
}