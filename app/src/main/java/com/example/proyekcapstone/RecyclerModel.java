package com.example.proyekcapstone;

public class RecyclerModel {
    private String judulberita;
    private String tanggalberita;
    private String kategoriberita;

    public RecyclerModel(String judulberita, String tanggalberita, String kategoriberita){
        this.judulberita = judulberita;
        this.tanggalberita = tanggalberita;
        this.kategoriberita = kategoriberita;
    }

    public String getJudulberita(){
        return judulberita;
    }

    public void setNamaFilm(String namaFilm){
        this.judulberita = namaFilm;
    }

    public String getTanggalberita(){
        return tanggalberita;
    }

    public void setTanggalberita(String tanggalberita) { this.tanggalberita = tanggalberita;
    }

    public String getKategoriberita(){
        return kategoriberita;
    }

    public void setKategoriberita(String durasiMenit){
        this.kategoriberita = kategoriberita;
    }
}
