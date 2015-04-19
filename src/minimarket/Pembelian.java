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
public class Pembelian {
private Pegawai kasir;
private Barang barang1;
private int jmlbarang;
private double jmlbayar;
private Pelanggan pelanggan;
private double bayaran;
private double kembalian;
private boolean status;

    /**
     * @return the kasir
     */
    Pegawai getkasir() {
        return kasir;
    }

    /**
     * @param kasir the kasir to set
     */
    void setkasir(Pegawai kasir) throws Exception {
        if (kasir.getjabatan().equals("kasir"))
        this.kasir = kasir;
        else return;
    }

    /**
     * @return the barang1
     */
    Barang getbarang1() {
        return barang1;
    }

    /**
     * @param barang1 the barang1 to set
     */
    void setbarang1(Barang barang1) {
        this.barang1 = barang1;
    }

    /**
     * @return the jmlbarang
     */
    int getjmlbarang() {
        return jmlbarang;
    }

    /**
     * @param jmlbarang the jmlbarang to set
     */
    void setjmlbarang(int jmlbarang) throws Exception {
        if (jmlbarang<0) return;
        this.jmlbarang = jmlbarang;
    }

    /**
     * @return the jmlbayar
     */
    double getjmlbayar() {
        return jmlbayar;
    }

    /**
     */
    void setjmlbayar() {
        if (status =true) jmlbayar= jmlbarang*barang1.gethargajual()-jmlbarang*barang1.gethargajual()*0.1;
        else jmlbayar = jmlbarang+barang1.gethargajual();
    }
    
    //dipanggil ketika yang membeli adalah bukan pelanngan
    void setpelanggan (){
        pelanggan = null;
        status = false;
    }
    
    //hanya dipanggil ketika yang membeli adalah pelanngan
    void setpelanggan (Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        status = pelanggan.getstatuspelanggan();
    }
    
    Pelanggan getpelanggan(){
        return pelanggan;
    }

    /**
     * @return the pelanggan
     */
    
    void setbayaran (double bayaran) throws Exception {
        if (bayaran<0) return;
        this.bayaran = bayaran;
    }
    
    double getbayaran () {
        return bayaran;
    }
    void setkembalian () {
        kembalian = bayaran-jmlbayar;
    }
    
    double getkembalian () {
        return kembalian;
    }
    
 }
