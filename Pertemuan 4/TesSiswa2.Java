public class TesSiswa2{

    public static void main(String[] ar){
        Siswa2 s = new Siswa2();
        Siswa2 ss = new Siswa2(8030001, "Upin");

        //ini akan menimbulkan error
        //Siswa sss = new Siswa(8030002);
        System.out.println(s);
        System.out.println(ss);
    }
}