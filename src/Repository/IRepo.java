package Repository;

import java.util.List;

public interface IRepo<T> {
    void add(T entity);
    void update(T oldEntity, T newEntity);
    void delete(T entity);
    List<T> getAll();
}
