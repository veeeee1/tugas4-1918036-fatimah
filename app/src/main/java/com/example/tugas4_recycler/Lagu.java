package com.example.tugas4_recycler;

public class Lagu {
    private String judul, jenis, durasi;
    private int gambar;

    public Lagu(String judul, String jenis, String durasi, int gambar) {
        this.judul = judul;
        this.jenis = jenis;
        this.durasi = durasi;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
