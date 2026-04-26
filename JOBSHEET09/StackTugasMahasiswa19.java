package JOBSHEET09;

public class StackSurat19 {
    Surat19[] stack;
    int size;
    int top;

    public StackSurat19(int size) {
        this.size = size;
        stack = new Surat19[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Surat19 s) {
        if (!isFull()) {
            stack[++top] = s;
            System.out.println("Surat izin berhasil diterima.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Surat19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    void cari(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan: " 
                    + stack[i].idSurat + " milik " + stack[i].namaMahasiswa);
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}