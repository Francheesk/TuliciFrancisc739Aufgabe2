package Model;

import java.util.ArrayList;
import java.util.List;

public class Verein {
    public Verein(String name, String stadt) {
        Name = name;
        Stadt = stadt;
        SpielerListe = new ArrayList<Spieler>();
    }

    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public List<Spieler> getSpielerListe() {
        return SpielerListe;
    }

    public void setSpielerListe(List<Spieler> spielerListe) {
        SpielerListe = spielerListe;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStadt() {
        return Stadt;
    }

    public void setStadt(String stadt) {
        Stadt = stadt;
    }

    private String Name;
    private String Stadt;
    private List<Spieler> SpielerListe;
}
