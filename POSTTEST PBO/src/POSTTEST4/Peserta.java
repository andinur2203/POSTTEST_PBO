/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST4;

/**
 *
 * @author ASUS
 */

// class
public class Peserta {
    // property
    protected int usia;
    protected long NIK;
    protected String nama, jenis_kelamin, alamat;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Peserta(String nama, String jenis_kelamin, long NIK, int usia, String alamat){
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.NIK = NIK;
        this.usia = usia;
        this.alamat = alamat;
    }
    
    // OVERLOADING
    public Peserta(){
    }
    
    // SETTER & GETTER
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public long getNIK() {
        return NIK;
    }

    public void setNIK(long NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
