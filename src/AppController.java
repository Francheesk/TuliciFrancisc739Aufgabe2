import Model.Verein;
import Model.Spieler;
import Repository.VereinRepo;
import Repository.SpielerRepo;
import Repository.IVereinRepo;
import Repository.ISpielerRepo;

import java.util.List;

public class AppController {
    private ISpielerRepo SpielerRepo;

    public AppController() {
        this.SpielerRepo = new SpielerRepo();
    }

    // Spieler CRUD
    public void addSpieler(Spieler Spieler) { SpielerRepo.add(Spieler); }
    public boolean deleteSpieler(String name) {
        Spieler spieler = SpielerRepo.getAll().stream()
                .filter(f -> f.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
        if (spieler == null) {
            return false;
        }
        SpielerRepo.delete(spieler);
        return true;
    }
    public List<Spieler> getAllSpielers() { return SpielerRepo.getAll(); }

    public Spieler getSpielerByName(String name) {
        return SpielerRepo.getAll().stream()
                .filter(f -> f.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    public boolean updateSpieler(String oldName, int age, String position, int marketValue) {
        Spieler oldSpieler = getSpielerByName(oldName);
        if (oldSpieler == null) {
            return false;
        }
        else {
            oldSpieler.setAlter(age);
            oldSpieler.setMarktwert(marketValue);
            oldSpieler.setPosition(position);
            return true;
        }

    }
    
}
