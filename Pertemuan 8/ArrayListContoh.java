import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Mahasiswa {
    String npm;
    String nama;
    int angkatan;

    Mahasiswa (String npm, String nama, int angkatan){
        this.npm = npm;
        this.nama = nama;
        this.angkatan = angkatan;
    }
}

public class ArrayListContoh {
    public static void main(String[] args) {
        //Membuat object dari kelas Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("1608107010021", "Fulan 21", 2016);
        Mahasiswa mhs2 = new Mahasiswa("1608107010002", "Fulan 2", 2016);
        Mahasiswa mhs3 = new Mahasiswa("1608107010046", "Fulan 46", 2016);
        //Membuat ArrayList
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        mahasiswa.add(mhs1);
        mahasiswa.add(mhs2);
        mahasiswa.add(mhs3);
        //Perulangan menggunakan Interface Iterator
        Iterator itr = mahasiswa.iterator();
        while (itr.hasNext()){
        Mahasiswa m = (Mahasiswa) itr.next();
        System.out.println(m.npm + " " + m.nama + " " + m.angkatan);
        }
    }
}