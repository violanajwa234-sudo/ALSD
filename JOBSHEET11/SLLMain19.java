package JOBSHEET11;

public class SLLMain19 {
    public static void main(String[] args) {

        SingleLinkedList19 sll = new SingleLinkedList19();

        Mahasiswa19 mhs1 = new Mahasiswa19("22212202", "Cintia", "3C", 3.5);
        Mahasiswa19 mhs2 = new Mahasiswa19("23212201", "Bimon", "2B", 3.8);
        Mahasiswa19 mhs3 = new Mahasiswa19("24212200", "Alvaro", "4A", 4.0);
        Mahasiswa19 mhs4 = new Mahasiswa19("22212201", "Sofia", "3D", 3.6);

        sll.addFirst(mhs1);
        sll.addLast(mhs4);
        sll.insertAfter("Cintia", mhs2);
        sll.insertAt(2, mhs3);

        System.out.println("data index 1 : ");
        sll.getData(0);;

        System.out.println("data mahasiswa an Bimon berada pada index : "+ sll.indexOf("Bimon"));

        System.out.println();

        sll.removeAt(2);
        sll.removeLast();
        sll.print();
        sll.removeFirst();
        sll.print();
    }
}