package by.mishastoma.customarray.repository.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.repository.Repository;
import by.mishastoma.customarray.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RepositoryImpl implements Repository {

    private static RepositoryImpl instance;

    private List<CustomArray> storage;

    private RepositoryImpl() {
        storage = new ArrayList<>();
    }

    public static RepositoryImpl getInstance() {
        if (instance == null) {
            instance = new RepositoryImpl();
        }
        return instance;
    }

    @Override
    public void add(CustomArray array) {
        storage.add(array);
    }

    @Override
    public void remove(int index) {
        storage.remove(index);
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public void addAll(ArrayList<CustomArray> arrays) {
        this.storage = arrays;
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public CustomArray get(int index) {
        return storage.get(index);
    }

    @Override
    public List<CustomArray> getAll(){
        return new ArrayList<>(storage);
    }

    @Override
    public void set(int index, CustomArray array) {
        this.storage.set(index, array);
    }

    @Override
    public List<CustomArray> sort(Comparator<CustomArray> comparator){
        return storage.stream().sorted(comparator).collect(Collectors.toList());
    }

    @Override
    public List<CustomArray> query(Specification specification){
        return storage.stream().filter(specification::specify).collect(Collectors.toList());
    }
}
