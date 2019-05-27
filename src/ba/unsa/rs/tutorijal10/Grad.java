package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Grad implements Serializable {
    int broj_stanovnika;
    String naziv;
    double[] temperatura= new double[1000];

    public Grad() {
    }

    public int getBroj_stanovnika() {
        return broj_stanovnika;
    }

    public void setBroj_stanovnika(int broj_stanovnika) {
        this.broj_stanovnika = broj_stanovnika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double[] getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double[] temperatura) {
        this.temperatura = temperatura;
    }
}
