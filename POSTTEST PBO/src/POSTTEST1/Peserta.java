/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST1;

/**
 *
 * @author ASUS
 */

// class
public class Peserta {
    // property
    int usia, dosis;
    long NIK;
    String nama, jenis_kelamin, alamat, jenis_vaksin;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Peserta(String nama, String jenis_kelamin, long NIK, int usia, String alamat, String jenis_vaksin, int dosis){
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.NIK = NIK;
        this.usia = usia;
        this.alamat = alamat;
        this.jenis_vaksin = jenis_vaksin;
        this.dosis = dosis;
    }
    
    // method
    public void tambah_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-           DATA PESERTA VAKSIN DENGAN IDENTITAS         -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama : " + this.nama.toUpperCase());
        System.out.println("   NIK  : " + this.NIK);
        System.out.println("------------------------- Telah Berhasil Ditambahkan ! ---------------------------");
        System.out.println(" ");
    }
    
    public void ubah_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-           DATA PESERTA VAKSIN DENGAN IDENTITAS         -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama : " + this.nama.toUpperCase());
        System.out.println("   NIK  : " + this.NIK);
        System.out.println("--------------------------- Telah Berhasil Diubah ! ------------------------------");
        System.out.println(" ");
    }
    
        public void hapus_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-           DATA PESERTA VAKSIN DENGAN IDENTITAS         -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama : " + this.nama.toUpperCase());
        System.out.println("   NIK  : " + this.NIK);
        System.out.println("--------------------------- Telah Berhasil Dihapus ! -----------------------------");
        System.out.println(" ");
    }
}
