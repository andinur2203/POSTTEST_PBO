/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST4;

/**
 *
 * @author ASUS
 */
public class Riwayat_Vaksin extends Vaksin{
    // property
    private String lokasi_vaksinasi;
    private String tgl_vaksinasi;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Riwayat_Vaksin(String jenis_vaksin, int dosis, String tgl_vaksinasi, String lokasi_vaksinasi){
        super(jenis_vaksin, dosis);        
        this.tgl_vaksinasi = tgl_vaksinasi;
        this.lokasi_vaksinasi = lokasi_vaksinasi;
    }

    public String getLokasi_vaksinasi() {
        return lokasi_vaksinasi;
    }

    public void setLokasi_vaksinasi(String lokasi_vaksinasi) {
        this.lokasi_vaksinasi = lokasi_vaksinasi;
    }

    public String getTgl_vaksinasi() {
        return tgl_vaksinasi;
    }

    public void setTgl_vaksinasi(String tgl_vaksinasi) {
        this.tgl_vaksinasi = tgl_vaksinasi;
    }
    
    
}
