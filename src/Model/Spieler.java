package Model;

public class Spieler {
    private String Name;
    private int Alter;

    public String getName() {
        return Name;
    }

    public Spieler(String name, int alter, String position, int marktwert) {
        Name = name;
        Alter = alter;
        Position = position;
        Marktwert = marktwert;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int alter) {
        Alter = alter;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "Name='" + Name + '\'' +
                ", Alter=" + Alter +
                ", Position='" + Position + '\'' +
                ", Marktwert=" + Marktwert +
                '}';
    }

    public int getMarktwert() {
        return Marktwert;
    }

    public void setMarktwert(int marktwert) {
        Marktwert = marktwert;
    }

    private String Position;
    private int Marktwert;
}
