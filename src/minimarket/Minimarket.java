package minimarket;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Minimarket {
    public static void main (String[] args) {
        Barang barang2 = new Barang();
        try {
        barang2.setbarcode("123456");
        } catch (Exception e) {
            System.out.println("Input barcode yang anda masukkan salah!");
        } 
        try {
        barang2.setnama("Tim-Tam Classic chocolate 120g");
        } catch (Exception e) {
            System.out.println("Input nama yang anda masukkan salah!");
        } 
        try {
        barang2.sethargabeli(5000);
        } catch (Exception e) {
            System.out.println("Input harga yang anda masukkan salah!");
        } 
        try {
        barang2.setlaba();
        } catch (Exception e) {
            System.out.println("Input harga yang anda masukkan salah!");
        } 
        try {
        barang2.sethargajual(6000);
        } catch (Exception e) {
            System.out.println("Input harga yang anda masukkan salah!");
        } 
        try {
        barang2.setsatuan("bungkus");
        } catch (Exception e) {
            System.out.println("Input satuan yang anda masukkan salah!");
        } 
        try {
        barang2.setjmlstok(600);
        } catch (Exception e) {
            System.out.println("Input jumlah stok yang anda masukkan salah!");
        } 
        
        Alamat alamat1 = new Alamat ();
        try {
        alamat1.setnamajalan("Otista Raya");
        } catch (Exception e) {
            System.out.println("Input namajalan yang anda masukkan salah!");
        } 
       try {
        alamat1.setnorumah("64C");
        } catch (Exception e) {
            System.out.println("Input nomor rumah yang anda masukkan salah!");
        } 
        try {
        alamat1.setkota("Jakarta Timur");
        } catch (Exception e) {
            System.out.println("Input kota yang anda masukkan salah!");
        } 
        try {
        alamat1.setprov("DKI Jakarta");
        } catch (Exception e) {
            System.out.println("Input provinsi yang anda masukkan salah!");
        } 
        
        Alamat alamat2 = new Alamat();
        try {
        alamat2.setnamajalan("Bonsay");
        } catch (Exception e) {
            System.out.println("Input namajalan yang anda masukkan salah!");
        } 
        try {
        alamat2.setnorumah("12A");
        } catch (Exception e) {
            System.out.println("Input norumah yang anda masukkan salah!");
        } 
        try {
        alamat2.setkota("Jakarta Timur");
        } catch (Exception e) {
            System.out.println("Input nama jalan yang anda masukkan salah!");
        } 
        try {
        alamat1.setprov("DKI Jakarta");
        } catch (Exception e) {
            System.out.println("Input namajalan yang anda masukkan salah!");
        } 
           
        Pegawai pegawai1 = new Pegawai();
        try {
        pegawai1.setnama("Luli");
        } catch (Exception e) {
            System.out.println("Input nama yang anda masukkan salah!");
        } 
        try {
        pegawai1.setid("1223");
        } catch (Exception e) {
            System.out.println("Input id yang anda masukkan salah!");
        } 
        try {
        pegawai1.setjabatan("kasir");
        } catch (Exception e) {
            System.out.println("Input jabatan yang anda masukkan salah!");
        } 
        try {
        pegawai1.setjk("perempuan");
        } catch (Exception e) {
            System.out.println("Input jenis kelamin yang anda masukkan salah!");
        } 
        try {
        pegawai1.setalamat(alamat1);
        } catch (Exception e) {
            System.out.println("Input alamat yang anda masukkan salah!");
        } 
        
        Pelanggan pelanggan1 = new Pelanggan ();
        try {
        pelanggan1.setnama("Mugi");
        } catch (Exception e) {
            System.out.println("Input nama yang anda masukkan salah!");
        } 
        try {
        pelanggan1.setalamat(alamat2);
        } catch (Exception e) {
            System.out.println("Input alamat yang anda masukkan salah!");
        }  
 
        Pembelian pembelian1 = new Pembelian();
        try {
        pembelian1.setkasir(pegawai1);
        } catch (Exception e) {
            System.out.println("Input kasir yang anda masukkan salah!");
        }  
       try {
        pembelian1.setbarang1(barang2);
        } catch (Exception e) {
            System.out.println("Input barang yang anda masukkan salah!");
        }
       try {
        pembelian1.setjmlbarang(3);
        } catch (Exception e) {
            System.out.println("Input jumlah barang yang anda masukkan salah!");
        } 
       pembelian1.setpelanggan(pelanggan1);
       pembelian1.setjmlbayar();
       try {
        pembelian1.setbayaran(20000);
        } catch (Exception e) {
            System.out.println("Input bayaran yang anda masukkan salah!");
        }
       pembelian1.setkembalian();
       
       System.out.println("Struk kasir");
       System.out.println("-------------");
       System.out.println(pembelian1.getbarang1().getnama()+ " x " + pembelian1.getjmlbarang());
       System.out.println("Total     = "+pembelian1.getjmlbayar());
       System.out.println("-------------");
       System.out.println("Bayaran   = "+pembelian1.getbayaran());
       System.out.println("Kembalian = "+pembelian1.getkembalian());
       System.out.println();
       System.out.println("Terima kasih :)");
    }
 }

