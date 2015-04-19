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
public class Pelanggan {

    private String nama;
    private Alamat alamat;
    private boolean statuspelanggan;
    
    public void setnama(String nama) throws Exception {
        if (nama.length()>30) return;
        this.nama = nama;
    }
    
    public String getnama() {
        return nama;
    }
    
    public void setalamat (Alamat alamat) {
        this.alamat = alamat;
    }
    
    public Alamat getalamat () {
        return alamat;
    }
    
    public void setstatuspelanggan() {
        statuspelanggan = true;
    }
    
    boolean getstatuspelanggan() {
        return statuspelanggan;
    }
}
