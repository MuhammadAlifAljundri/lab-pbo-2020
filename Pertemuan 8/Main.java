import java.util.HashMap;
import java.util.Map;

class Buku {
    int id;
    String nama, pengarang, publisher;
    int jumlah;

    public Buku(int id, String nama, String pengarang, String publisher, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.pengarang = pengarang;
        this.publisher = publisher;
        this.jumlah = jumlah;
    }
}

public class Main {
    public static void main(String[] args) {
        //Membuat map Buku
        Map<Integer, Buku> map=new HashMap<Integer, Buku>();
        //Membuat objek Buku
        Buku b1=new Buku(101,"Design Patterns: Elements of Reusable ObjectOriented Software","Erich Gamma","Addison-Wesley Professional",8);
        Buku b2=new Buku(102,"Problem Frames: Analysing & Structuring
        Software Development Problems","Michael Jackson","Addison-WesleyProfessional",4);
        Buku b3=new Buku(103,"Software Architecture in Practice","LenBass","Addison-Wesley Professional",6);
        //Menambahkan Buku ke map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Proses Traversing map
        for(Map.Entry<Integer, Buku> entry:map.entrySet()){
        int key=entry.getKey();
        Buku b=entry.getValue();
        System.out.println(key+" Details:");
        System.out.println(b.id+" "+b.nama+" "+b.pengarang+" "+b.publisher+" "+b.jumlah);
    }
  }
} 
