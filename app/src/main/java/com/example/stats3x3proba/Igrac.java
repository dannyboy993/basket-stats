package com.example.stats3x3proba;

import android.os.Parcel;
import android.os.Parcelable;

public class Igrac implements Parcelable {

    private String ime;
    private int promasio1;
    private int pogodio1;
    private int promasio2;
    private int pogodio2;
    private int poeni;
    private int asistencije;
    private int skokovi;

    public Igrac(String ime, int promasio1, int pogodio1, int promasio2, int pogodio2, int poeni, int asistencije, int skokovi) {
        this.ime = ime;
        this.promasio1 = promasio1;
        this.pogodio1 = pogodio1;
        this.promasio2 = promasio2;
        this.pogodio2 = pogodio2;
        this.poeni = poeni;
        this.asistencije = asistencije;
        this.skokovi = skokovi;
    }

    protected Igrac(Parcel in) {
        ime = in.readString();
        promasio1 = in.readInt();
        pogodio1 = in.readInt();
        promasio2 = in.readInt();
        pogodio2 = in.readInt();
        poeni = in.readInt();
        asistencije = in.readInt();
        skokovi = in.readInt();
    }

    public static final Creator<Igrac> CREATOR = new Creator<Igrac>() {
        @Override
        public Igrac createFromParcel(Parcel in) {
            return new Igrac(in);
        }

        @Override
        public Igrac[] newArray(int size) {
            return new Igrac[size];
        }
    };

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getPromasio1() {
        return promasio1;
    }

    public void setPromasio1(int promasio1) {
        this.promasio1 = promasio1;
    }

    public int getPogodio1() {
        return pogodio1;
    }

    public void setPogodio1(int pogodio1) {
        this.pogodio1 = pogodio1;
    }

    public int getPromasio2() {
        return promasio2;
    }

    public void setPromasio2(int promasio2) {
        this.promasio2 = promasio2;
    }

    public int getPogodio2() {
        return pogodio2;
    }

    public void setPogodio2(int pogodio2) {
        this.pogodio2 = pogodio2;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    public int getAsistencije() {
        return asistencije;
    }

    public void setAsistencije(int asistencije) {
        this.asistencije = asistencije;
    }

    public int getSkokovi() {
        return skokovi;
    }

    public void setSkokovi(int skokovi) {
        this.skokovi = skokovi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ime);
        parcel.writeInt(promasio1);
        parcel.writeInt(pogodio1);
        parcel.writeInt(promasio2);
        parcel.writeInt(pogodio2);
        parcel.writeInt(poeni);
        parcel.writeInt(asistencije);
        parcel.writeInt(skokovi);
    }
}

