package Repository;

import Model.Verein;

public interface IVereinRepo extends IRepo<Verein> {
    Verein findById(int id);
}
