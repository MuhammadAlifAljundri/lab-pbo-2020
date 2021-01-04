public class Siswa2 {
    private int nrp;
    private String nama;

    public Siswa2()
    {
        this.nrp = 12345;
        this.nama = "nama default";
    }

    public Siswa2(int nrp, String nama)
    {
        this.nrp = nrp;
        this.nama = nama;
    }

    public void setNrp(int nrp)
    {
        this.nrp = nrp;
    }

    public int getNrp()
    {
        return this.nrp;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return this.nama;
    }

    public String toString()
    {
        return this.nrp + " " + this.nama;
    }
       
}
