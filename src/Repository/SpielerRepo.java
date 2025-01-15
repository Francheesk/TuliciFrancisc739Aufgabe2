package Repository;

import Model.Spieler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpielerRepo implements ISpielerRepo{
    private List<Spieler> Spielers = new ArrayList<>();

    public void update(Spieler oldSpieler, Spieler newSpieler) {
        int index = Spielers.indexOf(oldSpieler);
        if (index != -1) {
            Spielers.set(index, newSpieler);
        }
    }

    public void delete(Spieler Spieler) {
        Spielers.remove(Spieler);
    }

    @Override
    public void add(Spieler entity) {
        Spielers.add(entity);
    }

    public List<Spieler> getAll() {
        return Spielers;
    }

}
