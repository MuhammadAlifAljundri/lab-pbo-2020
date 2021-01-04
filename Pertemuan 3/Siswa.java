public class Siswa{
    private int nrp;
    private String nama;

    public Siswa(int nrpx, String namax)
    {
        nrp = nrpx;
        nama = namax;
    }

    public void setBrp(int nrpx)
    {
        nrp = nrpx;
    }

    public int getNrp()
    {
        return this.nrp;
    }

    public void setNama(String namax)
    {
        nama = namax;
    }

    public String getNama()
    {
        return this.nama;
    }
}