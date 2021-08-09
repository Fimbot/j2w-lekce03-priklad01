package cz.czechitas.java2webapps.lekce3.entity;




public class Address {
    String ulice;
    String obec;
    String psc;

    public Address() {
    }

    public Address(String ulice, String obec, String psc) {
        this.ulice = ulice;
        this.obec = obec;
        this.psc = psc;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }
}
