package by.mishastoma.customarray.repository.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {

    private static Repository instance;

    private List<CustomArray> storage;

    private Repository() {
        storage = new ArrayList<>();
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public void add(CustomArray array) {
        storage.add(array);
    }

    public void remove(int index) {
        storage.remove(index);
    }

    public void clear() {
        storage.clear();
    }

    public void addAll(ArrayList<CustomArray> arrays) {
        this.storage = arrays;
    }

    public int size() {
        return storage.size();
    }

    public CustomArray get(int index) {
        return storage.get(index);
    }

    public List<CustomArray> getAll(){
        return new ArrayList<>(storage);
    }

    public void set(int index, CustomArray array) {
        this.storage.set(index, array);
    }

    public List<CustomArray> sort(Comparator<CustomArray> comparator){
        return storage.stream().sorted(comparator).collect(Collectors.toList());
    }

    public List<CustomArray> query(Specification specification){
        return storage.stream().filter(specification::specify).collect(Collectors.toList());
    }
}
