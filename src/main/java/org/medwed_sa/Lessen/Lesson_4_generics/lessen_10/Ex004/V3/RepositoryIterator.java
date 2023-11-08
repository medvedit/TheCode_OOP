package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V3;

import java.util.Iterator;
import java.util.List;

public class RepositoryIterator<E> implements Iterator<E> {
    private int index;
    private List<E> eList;

    public <T extends Content> RepositoryIterator(List<E> eList) {
        this.eList = eList;
    }

    @Override
    public boolean hasNext() {
        return index < eList.size();
    }

    @Override
    public E next() {
        return eList.get(index++);
    }
}
