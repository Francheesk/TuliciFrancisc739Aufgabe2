package Repository;

import Model.Verein;

import java.util.ArrayList;
import java.util.List;

public class VereinRepo implements IVereinRepo {
    private List<Verein> vereins = new ArrayList<>();
    private static int nextId = 0;

    public void add(Verein verein) {
        verein.setId(nextId++); // Assign and increment the ID
        vereins.add(verein);
    }

    public void update(Verein oldVerein, Verein newVerein) {
        int index = vereins.indexOf(oldVerein);
        if (index != -1) {
            vereins.set(index, newVerein);
        }
    }

    public void delete(Verein verein) {
        vereins.remove(verein);
    }

    public List<Verein> getAll() {
        return vereins;
    }

    public Verein findById(int id) {
        return vereins.stream()
                .filter(verein -> verein.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
