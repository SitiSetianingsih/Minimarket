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
public class Barang {
private String barcode;
private String nama;
private double hargajual;
private double hargabeli;
private double laba;
private String satuan;
private int jmlstok;

void setbarcode (String barcode) throws Exception {
Integer.parseInt(barcode);
if (barcode.length()>6) return;
this.barcode = barcode;
}

String getbarcode() {
return barcode;
}

void setnama (String nama) throws Exception {
if (nama.length()>50) return;
this.nama = nama;
}

String getnama () {
return nama;
}

void sethargajual(double hargajual) throws Exception {
if (hargajual<0) return;
this.hargajual = hargajual;
}

double gethargajual(){
return hargajual;
} 

void sethargabeli(double hargabeli) throws Exception {
if (hargabeli<0) return;
this.hargabeli = hargabeli;
}

double gethargabeli(){
return hargabeli;
} 

void setsatuan (String satuan) {
this.satuan = satuan;
}

String getsatuan () {
return satuan;
}

void setlaba() throws Exception {
laba = hargajual-hargabeli;
}

double getlaba () {
return laba;
}

void setjmlstok (int jmlstok) throws Exception {
if (jmlstok<0) return;
this.jmlstok = jmlstok;
}

int getjmlstok() {
return jmlstok;
}
}
