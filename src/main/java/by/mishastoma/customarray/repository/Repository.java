package by.mishastoma.customarray.repository;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.repository.impl.RepositoryImpl;
import by.mishastoma.customarray.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public interface Repository {

    public void add(CustomArray array);

    public void remove(int index);

    public void clear();

    public void addAll(ArrayList<CustomArray> arrays);

    public int size();

    public CustomArray get(int index);

    public List<CustomArray> getAll();

    public void set(int index, CustomArray array);

    public List<CustomArray> sort(Comparator<CustomArray> comparator);

    public List<CustomArray> query(Specification specification);
}
