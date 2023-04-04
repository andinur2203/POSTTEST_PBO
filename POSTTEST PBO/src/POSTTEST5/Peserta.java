/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST5;

/**
 *
 * @author ASUS
 */

// ABSTRACT CLASS
public abstract class Peserta {
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
    
    // ABSTRACT METHOD
    public abstract void tambah_data();
    public abstract void ubah_data();
    public abstract void hapus_data();
}
