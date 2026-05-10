package JOBSHEET11.Tugas;

public class QueueLinkedList19 {
    Node19 front;
    Node19 rear;
    int size;
    int max;

    public QueueLinkedList19(int max) {
        this.max = max;
        size = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa19 data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            Node19 newNode = new Node19(data);

            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            size++;
            System.out.println(data.nama + " berhasil masuk antrian");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa dipanggil : ");
            front.data.tampilData();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terdepan : ");
            front.data.tampilData();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling akhir : ");
            rear.data.tampilData();
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi Antrian : ");
            Node19 temp = front;

            while (temp != null) {
                temp.data.tampilData();
                temp = temp.next;
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang mengantre : " + size);
    }
}