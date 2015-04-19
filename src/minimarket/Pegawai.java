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
public class Pegawai {
private String id;
private String nama;
private Alamat alamat;
private String jabatan;
private String jk;
private double gajiperbulan;

void setid (String id) throws Exception {
Integer.parseInt(id);
this.id = id;
}

void setnama (String nama) throws Exception {
if (nama.length() >30) return;
this.nama = nama;
}

void setalamat (Alamat alamat) { 
this.alamat = alamat;
}

void setjabatan (String jabatan) throws Exception {
if (!jabatan.equals("manajer") && !jabatan.equals("staf") && !jabatan.equals("kasir")) return;
this.jabatan = jabatan;
}

void setjk (String jk) throws Exception {
if (!jk.equals("laki-laki") && !jk.equals("perempuan")) return;
this.jk = jk;
}

void setgajiperbulan() {
if (    getjabatan().equals("manajer")) gajiperbulan = 10000000;
else if (getjabatan().equals("staf")) gajiperbulan = 2500000;
else if (getjabatan().equals("kasir")) gajiperbulan = 2000000;
}

    /**
     * @return the id
     */
    public String getid() {
        return id;
    }

    /**
     * @return the nama
     */
    public String getnama() {
        return nama;
    }

    /**
     * @return the alamat
     */
    public Alamat getalamat() {
        return alamat;
    }

    /**
     * @return the jabatan
     */
    public String getjabatan() {
        return jabatan;
    }

    /**
     * @return the jk
     */
    public String getjk() {
        return jk;
    }


}
