package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Repository<T extends Content> implements Iterable<T>{
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
//        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return new RepositoryIterator<>(ds);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
