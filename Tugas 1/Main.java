import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int a;
    int b;

    Bus busTransKoetaradja = new Bus();

    System.out.println("Selamat Datang di Bus Trans Koetaraja");
    System.out.println("MENU : ");
    System.out.println("1. Naikkan Penumpang");
    System.out.println("2. Turunkan Penumpang");
    System.out.println("3. Lihat Jumlah Penumpang");
    System.out.print("Masukan Pilihan Anda = ");
    Scanner userInput = new Scanner(System.in);
    a = userInput.nextInt();

    if(a == 1)
    {
        System.out.println("Silahkan isi");
        System.out.print("Nama : ");
        String nama = userInput.next();
        System.out.print("Umur : ");
        int umur = userInput.nextInt();
        System.out.print("Hamil (Y/N) : ");
        boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;
   
        Penumpang penumpang = new Penumpang(nama, umur, hamil);
        busTransKoetaradja.NaikPenumpang(penumpang);
        busTransKoetaradja.toString();
    }
    else if(a == 1){
        System.out.println("Nama : ");
        String nama = userInput.next();

        busTransKoetaradja.turunkanPenumpang(nama);
        busTransKoetaradja.toString();
    }else{
        busTransKoetaradja.toString();
    }

    }
}