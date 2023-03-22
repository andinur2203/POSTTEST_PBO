/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST3;

/**
 *
 * @author ASUS
 */
public class Dewasa extends Peserta{
    // property
    private String no_telp;
    private String email;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Dewasa(String nama, String jenis_kelamin, long NIK, int usia, String alamat, String no_telp, String email) {
        super(nama, jenis_kelamin, NIK, usia, alamat);
        this.no_telp = no_telp;
        this.email = email;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
