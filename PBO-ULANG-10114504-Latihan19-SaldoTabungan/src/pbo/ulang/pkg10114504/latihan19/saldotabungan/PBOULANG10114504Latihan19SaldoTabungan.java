/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan19.saldotabungan;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi jumlah saldo dan bunga
 */
public class PBOULANG10114504Latihan19SaldoTabungan {
private static String nama;
private int jumlah;
private int saldo;

public PBOULANG10114504Latihan19SaldoTabungan(String namaNasabah, int jumlah){
    nama = namaNasabah;
    nama ="Sandy Akbar";
    saldo = 2500000;

}

public void nabung(int sal){
    saldo = saldo *15/100;
}

public int ambilSaldo(){
    return saldo;
}

public void setSaldo(int sal){
    saldo = sal;
}



public static void main(String[] args) {
    
 
    
    PBOULANG10114504Latihan19SaldoTabungan bls = new PBOULANG10114504Latihan19SaldoTabungan("Sandy Akbar",12345);

    System.out.println("Nama Nasabah             : " + nama);
    System.out.println("Saldo di bulan ke-1      : " + "Rp." + bls.ambilSaldo());
    System.out.println("Saldo di bulan ke-2      : " + "Rp." + bls.ambilSaldo());
    
    
    }

}