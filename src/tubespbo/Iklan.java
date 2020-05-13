/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author gilan
 */
public class Iklan {

    private String harga, nama, alamat, deskripsi, contact, luas;

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getContact() {
        return contact;
    }

    public String getLuas() {
        return luas;
    }

    public int getId() {
        return id;
    }
    int id;

    public Iklan(String harga, String nama, String alamat, String contact, String luas, int id) {
        this.harga = harga;
        this.nama = nama;
        this.alamat = alamat;
        this.contact = contact;
        this.luas = luas;
        this.id = id;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setLuas(String luas) {
        this.luas = luas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "id " + getId() + "\n Nama: " + getNama() + "\n alamat: " + getAlamat() + "\n harga: " + getHarga() + "\n deskripsi: " + getDeskripsi() + "\n contact: " + getLuas();

    }
}
