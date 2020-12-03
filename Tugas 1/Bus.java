import java.util.ArrayList;

import java.util.*;

public class Bus{
    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangPrioritas;
    private ArrayList<Penumpang> semuaPenumpang;
    

    public Bus()
    {
        penumpangBiasa = new ArrayList<Penumpang>();
        penumpangPrioritas = new ArrayList<Penumpang>();
        semuaPenumpang = new ArrayList<Penumpang>();
    }

    public ArrayList<Penumpang> getPenumpangBiasa()
    {
        for(Penumpang penumpang : penumpangBiasa)
        {
            penumpang.getNama();
        }
        return  penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas()
    {
        for(Penumpang penumpang : penumpangPrioritas){
            penumpang.getNama();
        }return penumpangPrioritas;
    } 

    public int getJumlahPenumpangBiasa()
    {
        int banyak = penumpangBiasa.size();
        System.out.println("Banyak penumpang biasa = " +banyak);
        return banyak;
    }

    public int getJumlahPenumpangPrioritas()
    {
        int banyak = penumpangPrioritas.size();
        System.out.println("Banyak penumpang prioritas = " +banyak);
        return banyak;
    }

    public ArrayList<Penumpang> semuaPenumpang()
    {
        semuaPenumpang = penumpangBiasa;
        semuaPenumpang.addAll(penumpangPrioritas);
        System.out.println("Semua Penumpang : ");

        for(Penumpang penumpang : semuaPenumpang)
        {
            System.out.print(penumpang.getNama()+ ", ");
        }
        return semuaPenumpang;
    } 

    public int getJumlahSemuaPenumpang()
    {
        return penumpangBiasa.size() + penumpangPrioritas.size();
    }

    public boolean NaikPenumpang(Penumpang penumpang)
    {
        if((penumpangPrioritas.size() < 1) && (penumpang.getUmur()<10 || penumpang.getUmur() > 60) || (penumpang.getHamil() == true)){
            System.out.println("Penumpang Prioritas bernama " +penumpang.getNama()+ " Telah Berhasil Ditambahkan");
            
            return penumpangPrioritas.add(penumpang);
        }else if(penumpangBiasa.size() <= 4)
        {
            System.out.println("Penumpang Biasa Bernama " +penumpang.getNama()+ " Telah Berhasil Ditambahkan");
            return penumpangBiasa.add(penumpang);
        }else
        {
            System.out.println("Penumpang yang bernama " +penumpang.getNama()+ " Gagal untuk");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama)
    {
        for(int i=0; i < penumpangBiasa.size(); i++ )
        {
            if(nama.equals(penumpangBiasa.get(i).getNama()))
            {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang Biasa bernama " +nama+ "Telah berhasil diturunkan");
                return penumpangBiasa.equals(nama);
            }
        }

        for(int j=0; j < penumpangPrioritas.size(); j++)
        {
            if(nama.equals(penumpangPrioritas.get(j).getNama()))
            {
                penumpangPrioritas.remove(j);
                System.out.println("Penumpang Prioritas bernama " +nama+ "Telah berhasil diturunkan");
                return penumpangPrioritas.equals(nama);
            }
        } 

        for(int k = 0; k < semuaPenumpang.size(); k++)
        {
            if((nama != (penumpangBiasa.get(k).getNama()) || (nama != penumpangPrioritas.get(k).getNama())))
            {
                System.out.println("Penumpang Tersebut Tidak Ada Didaftar");
                return false;
            }
        }
        return penumpangPrioritas.equals(nama);
    }
 
    public String toString()
    {
        String hasil1 = " ";
        String hasil2 = " ";
        System.out.println("");

        for(Penumpang penumpang : penumpangBiasa)
        {
            hasil1 += penumpang.getNama().toString();
        }

        for(Penumpang penumpang : penumpangPrioritas)
        {
           hasil2 += penumpang.getNama().toString();
        }

        if(penumpangBiasa.isEmpty() == true)
        {
            System.out.println("Daftar Nama Penumpang Biasa = KOSONG");
        }else
        {
            System.out.println("Daftar Nama Penumpang Biasa = " +hasil1);
        }

        if(penumpangPrioritas.isEmpty() == true)
        {
            System.out.println("Daftar Nama Penumpang Prioritas = KOSONG");
        }else
        {
            System.out.println("Daftar Nama Penumpang Prioritas = " +hasil2);
        }
        System.out.println("Jumlah Semua Penumpang = " +getJumlahSemuaPenumpang());
        return "daftar1 nama penumpang biasa = " +hasil1+ "daftar1 nama penumpang prioritas = " +hasil2+ "jmlh semua penumpang = " +getJumlahSemuaPenumpang()+ "\n";
    }    
}