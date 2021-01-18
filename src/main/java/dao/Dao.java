package dao;

public interface Dao<T> {
    public T get(long id);
    public void add(T obj);

}
