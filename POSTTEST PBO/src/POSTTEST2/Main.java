/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POSTTEST2;

/**
 *
 * @author ASUS
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    
    static ArrayList<Peserta> peserta = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        salam_pembuka();
        while (true) {
            System.out.println("==================================================================================");
            System.out.println("|+-+-+-+-+-+-      PROGRAM PENDATAAN PESERTA VAKSINASI COVID-19      -+-+-+-+-+-+|");
            System.out.println("==================================================================================");
            System.out.println("                   1. Tambah Data Peserta Vaksinasi   [CREATE]");
            System.out.println("                   2. Tampil Data Peserta Vaksinasi   [READ]");
            System.out.println("                   3. Ubah   Data Peserta Vaksinasi   [UPFATE]");
            System.out.println("                   4. Hapus  Data Peserta Vaksinasi   [DELETE]");
            System.out.println("                   5. Exit");
            System.out.println("==================================================================================");
            System.out.print("                               Masukan Pilihan Anda : ");
            int pilihan = Integer.parseInt(br.readLine());
            System.out.println("==================================================================================");
            System.out.println(" ");
            switch (pilihan) {
                case 1:
                    tambah_peserta();
                    break;
                case 2:
                    tampil_peserta();
                    break;
                case 3:
                    edit_peserta();
                    break;
                case 4:
                    hapus_peserta();
                    break;
                case 5:
                    salam_penutup();
                    System.exit(0);
                default:
                    System.out.println("\n ------------------ Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------\n");
                    break;
            }
        }
    }
    
    public static void salam_pembuka() throws IOException{
        System.out.println("==================================================================================");
	System.out.println("||                                 SELAMAT DATANG                               ||");
	System.out.println("||                                                                              ||");
	System.out.println("||                                       DI                                     ||");
	System.out.println("||                                                                              ||");
	System.out.println("||                 PROGRAM PENDATAAN PESERTA VAKSINASI COVID-19                 ||");
	System.out.println("==================================================================================");
        System.out.println(" ");
    }
    
    public static void tambah_peserta() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-       MENU TAMBAH DATA PESERTA VAKSINASI COVID-19      -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.print("Masukkan Nama Lengkap           : ");
        String addnama = br.readLine();
        System.out.print("Masukkan Jenis Kelamin          : ");
        String addJK = br.readLine();
        System.out.print("Masukkan NIK                    : ");
        long addNIK;
        addNIK = Long.parseLong(br.readLine());
        System.out.print("Masukkan Usia                   : ");
        int addusia = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Alamat                 : ");
        String addalamat = br.readLine();
        System.out.print("Masukkan Jenis Vaksin           : ");
        String addJV = br.readLine();
        System.out.print("Masukkan Dosis Terakhir (1/2/3) : ");
        int adddosis = Integer.parseInt(br.readLine());
        System.out.println("==================================================================================");
        System.out.println(" ");
        Peserta pstBaru = new Peserta(addnama, addJK, addNIK, addusia, addalamat, addJV, adddosis); 
        // add == menambahkan data ke array list
        peserta.add(pstBaru);

        //pemanggilan method tambah data
        pstBaru.tambah_data();
    }
 
    // ENCAPSULASI (Penggunaan GETTER untuk mengambil data)
    public static void tampil_peserta() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-       MENU TAMPIL DATA PESERTA VAKSINASI COVID-19      -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        if (peserta.isEmpty()){
            System.out.println("--------------------- Data Peserta Vaksinasi COVID-19 Kosong ! ------------------");
            System.out.println(" ");
        } else {
            /// size == ukuran / panjang array list
            for (int i = 0; i < peserta.size(); i++) {
                System.out.println("Peserta Vaksin ke - " + (i+1));
                System.out.println("==================================================================================");
                //karena index itu 0 maka ditambah 1
                // get == mengambil data dari array list
                System.out.println("Nama Lengkap   : " + peserta.get(i).getNama().toUpperCase());
                System.out.println("Jenis Kelamin  : " + peserta.get(i).getJenis_kelamin().toUpperCase());
                System.out.println("NIK            : " + peserta.get(i).getNIK());
                System.out.println("Usia           : " + peserta.get(i).getUsia() + " Tahun");
                System.out.println("Alamat         : " + peserta.get(i).getAlamat().toUpperCase());
                System.out.println("Jenis Vaksin   : " + peserta.get(i).getJenis_vaksin().toUpperCase());
                System.out.println("Dosis Terakhir : " + peserta.get(i).getDosis());
                System.out.println("==================================================================================");
                System.out.println(" ");
            }
        }
        
    }
    
    public static void edit_peserta() throws IOException{

        tampil_peserta();
        
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-        MENU UBAH DATA PESERTA VAKSINASI COVID-19       -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.print("Masukkan Data Peserta ke - ");
        int index = Integer.parseInt(br.readLine());
        System.out.println("==================================================================================");
        System.out.print("Masukkan Nama Lengkap           : ");
        String setNAMA = br.readLine();
        System.out.print("Masukkan Jenis Kelamin          : ");
        String setJK = br.readLine();
        System.out.print("Masukkan NIK                    : ");
        long setNIK;
        setNIK = Long.parseLong(br.readLine());
        System.out.print("Masukkan Usia                   : ");
        int setUSIA = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Alamat                 : ");
        String setALAMAT = br.readLine();
        System.out.print("Masukkan Jenis Vaksin           : ");
        String setJV = br.readLine();
        System.out.print("Masukkan Dosis Terakhir (1/2/3) : ");
        int setDOSIS = Integer.parseInt(br.readLine());
        System.out.print("==================================================================================");
        System.out.println(" ");

        // ENCAPSULASI (Penggunaan SETTER untuk mengisi data)
        // memasukan data yang baru ke array list (menggantikannya)
        peserta.get(index-1).setNama(setNAMA);
        peserta.get(index-1).setJenis_kelamin(setJK);
        peserta.get(index-1).setNIK(setNIK);
        peserta.get(index-1).setUsia(setUSIA);
        peserta.get(index-1).setAlamat(setALAMAT);
        peserta.get(index-1).setJenis_vaksin(setJV);
        peserta.get(index-1).setDosis(setDOSIS)
                ;

        ///pemanggilan method terupdate
        peserta.get(index-1).ubah_data();
    }

    public static void hapus_peserta() throws IOException{
        
        tampil_peserta();
        
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-        MENU HAPUS DATA PESERTA VAKSINASI COVID-19      -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.print("Masukkan Data Peserta Vaksin ke - ");
        int index = Integer.parseInt(br.readLine());
        System.out.println("==================================================================================");
        System.out.println(" ");
        // remove == menghapus data dari array list
        peserta.remove(index-1).hapus_data();
    }

    public static void salam_penutup() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("||                                 TERIMA KASIH                                 ||");
        System.out.println("||                                                                              ||");
        System.out.println("||                               TELAH MENGGUNAKAN                              ||");
        System.out.println("||                                                                              ||");
        System.out.println("||                 PROGRAM PENDATAAN PESERTA VAKSINASI COVID-19                 ||");
        System.out.println("==================================================================================");
    }
}