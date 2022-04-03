package service;

public interface IEntity_DAO<T> {

    void addEntity(T entity);

    T getEntity(long id);

    void updateEntity(T entity);

    void removeEntity(long id);
}
