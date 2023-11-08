package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4.Repository.iteraror;

import java.util.Iterator;
import java.util.List;

public class RepositoryIterator<T> implements Iterator<T> {
    private int index;
    private List<T> tList;

    public RepositoryIterator(List<T> tList) {
        this.tList = tList;
    }


    @Override
    public boolean hasNext() {
        return index < tList.size();
    }

    @Override
    public T next() {
        return tList.get(index++);
    }
}
