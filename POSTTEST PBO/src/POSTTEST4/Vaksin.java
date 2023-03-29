/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST4;

/**
 *
 * @author ASUS
 */
public class Vaksin {
    // property
    private String jenis_vaksin;
    private int dosis;
    
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Vaksin(String jenis_vaksin, int dosis){
        this.jenis_vaksin = jenis_vaksin;
        this.dosis = dosis;
    }

    public String getJenis_vaksin() {
        return jenis_vaksin;
    }

    public void setJenis_vaksin(String jenis_vaksin) {
        this.jenis_vaksin = jenis_vaksin;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }
}
