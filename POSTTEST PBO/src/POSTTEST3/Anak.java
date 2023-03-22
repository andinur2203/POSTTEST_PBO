/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST3;

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
}
