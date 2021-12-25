package ru.g3tx.crud.service;

import java.util.List;

public interface DaoImpl<T> {

    public List<T> getAllUsers();

    public void saveUser(T item);

    public void deleteUser(long id);

    public void updateUser(T item);

    public T getUserById(long id);

}
