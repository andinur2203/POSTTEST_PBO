/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST4;

/**
 *
 * @author ASUS
 */
public class Anak extends Peserta{
    // property
    private String nama_ortu;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Anak(String nama, String jenis_kelamin, long NIK, int usia, String alamat, String nama_ortu) {
        super(nama, jenis_kelamin, NIK, usia, alamat);
        this.nama_ortu = nama_ortu;
    }

    public String getNama_ortu() {
        return nama_ortu;
    }

    public void setNama_ortu(String nama_ortu) {
        this.nama_ortu = nama_ortu;
    }
    
    // method
    @Override
    public void tambah_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-         DATA PESERTA VAKSIN ANAK DENGAN IDENTITAS       -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama            : " + this.nama.toUpperCase());
        System.out.println("   NIK             : " + this.NIK);
        System.out.println("   Nama Orang Tua  : " + this.nama_ortu);
        System.out.println("------------------------- Telah Berhasil Ditambahkan ! ---------------------------");
        System.out.println(" ");
    }
    
    @Override
    public void ubah_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-         DATA PESERTA VAKSIN ANAK DENGAN IDENTITAS       -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama            : " + this.nama.toUpperCase());
        System.out.println("   NIK             : " + this.NIK);
        System.out.println("   Nama Orang Tua  : " + this.nama_ortu);
        System.out.println("--------------------------- Telah Berhasil Diubah ! ------------------------------");
        System.out.println(" ");
    }
    
    @Override
        public void hapus_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-         DATA PESERTA VAKSIN ANAK DENGAN IDENTITAS       -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama            : " + this.nama.toUpperCase());
        System.out.println("   NIK             : " + this.NIK);
        System.out.println("   Nama Orang Tua  : " + this.nama_ortu);
        System.out.println("--------------------------- Telah Berhasil Dihapus ! -----------------------------");
        System.out.println(" ");
    }
}
