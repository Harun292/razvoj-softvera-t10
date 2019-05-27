package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Drzava implements Serializable {
    String naziv;
    int broj_stanovnika;
    double prvrsina;
    String jzpovrsinu;
    Grad glavni_grad;

    public Drzava() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBroj_stanovnika() {
        return broj_stanovnika;
    }

    public void setBroj_stanovnika(int broj_stanovnika) {
        this.broj_stanovnika = broj_stanovnika;
    }

    public double getPrvrsina() {
        return prvrsina;
    }

    public void setPrvrsina(double prvrsina) {
        this.prvrsina = prvrsina;
    }

    public String getJzpovrsinu() {
        return jzpovrsinu;
    }

    public void setJzpovrsinu(String jzpovrsinu) {
        this.jzpovrsinu = jzpovrsinu;
    }

    public Grad getGlavni_grad() {
        return glavni_grad;
    }

    public void setGlavni_grad(Grad glavni_grad) {
        this.glavni_grad = glavni_grad;
    }
}
