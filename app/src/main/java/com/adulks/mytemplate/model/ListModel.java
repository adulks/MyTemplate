package com.adulks.mytemplate.model;

public class ListModel {

    private String judul = "";
    private String waktu = "";
    private String gambar = "";
    private String content = "";

    public void setjudul(String str) {
        this.judul = str;
    }

    public void setwaktu(String str) {
        this.waktu = str;
    }

    public void setgambar(String str) {
        this.gambar = str;
    }

    public void setcontent(String str) {
        this.content = str;
    }

    public String getjudul() {
        return this.judul;
    }

    public String getwaktu() {
        return this.waktu;
    }

    public String getgambar() {
        return this.gambar;
    }

    public String getcontent() {
        return this.content;
    }


}