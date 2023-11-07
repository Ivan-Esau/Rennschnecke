package Rennschnecke;

public class Rennschnecke
{
    private String name;
    private Schneckenart art;
    private double weg;

    public Rennschnecke(String name, Schneckenart art, double weg)
    {
        this.name = name;
        this.art = art;
        this.weg = weg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Schneckenart getArt() {
        return art;
    }

    public void setArt(Schneckenart art) {
        this.art = art;
    }

    public double getWeg() {
        return weg;
    }

    public void setWeg(double weg) {
        this.weg = weg;
    }

}
