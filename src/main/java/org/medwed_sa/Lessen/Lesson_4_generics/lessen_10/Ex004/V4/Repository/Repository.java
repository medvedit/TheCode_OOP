package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4.Repository;


import org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4.Content.Content;
import org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4.Repository.iteraror.RepositoryIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Repository<T extends Content> implements Iterable<T> {
    private List<T> ds;

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

    public void merge(Repository<T> repo){
        for (int i = 0; i < repo.count(); i++) {
            this.add(repo.get(i));
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<T> iterator() {
        return new RepositoryIterator<>(ds);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
