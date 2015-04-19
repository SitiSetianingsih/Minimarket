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
public class Alamat {
    
private String namajalan;
private String norumah;
private String kota;
private String prov;

void setnamajalan (String namajalan) throws Exception {
if (namajalan.length()>30) return;
this.namajalan = namajalan;
}

String getnamajalan () {
return namajalan;
}

void setnorumah (String norumah) throws Exception {
if (norumah.length()>10) return;
this.norumah = norumah;
}

String getnorumah() {
return norumah;
}

void setkota (String kota) throws Exception {
if (kota.length()>30) return;
this.kota = kota;
}

String getkota () {
return kota;
}

void setprov (String prov) throws Exception {
if (prov.length () >30 ) return;
this.prov = prov;
}

String getprov() {
return prov;
}

}
