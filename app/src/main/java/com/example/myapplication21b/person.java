package com.example.myapplication21b;

public class person {
    private String nr;
    private String navn;

    public person() {

    }

    public person(String nr, String navn) {
        this.nr = nr;
        this.navn = navn;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}

