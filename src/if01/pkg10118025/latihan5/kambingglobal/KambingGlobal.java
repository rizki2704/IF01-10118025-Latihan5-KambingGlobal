/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan5.kambingglobal;

/**
 *
 * @author
 * Nama     : Rizki Restu Illahi
 * Kelas    : IF01
 * NIM      : 10118025
 */
public class KambingGlobal{

    /**
     * @param args the command line arguments
     */
    
    //Variable jumlahKambing menjadi variable instance
    
    int jumlahKambing = 88;
    
    //method menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing : " +jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah di Tambah : " +jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal KambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x jalan
        KambingSusu.getJumlahKambing();
        
        //menambah satu kambing 
        KambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing
        KambingSusu.getJumlahKambing();
    }
    
}
