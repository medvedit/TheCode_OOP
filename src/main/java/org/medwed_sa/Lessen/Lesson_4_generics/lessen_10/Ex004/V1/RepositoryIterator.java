package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V1;

import java.util.Iterator;
import java.util.List;

public class RepositoryIterator implements Iterator<Content> {
    private int index;
    private List<Content> contentList;

    public RepositoryIterator(List<Content> contentList) {
        this.contentList = contentList;
    }

    @Override
    public boolean hasNext() {
        return index < contentList.size();
    }

    @Override
    public Content next() {
        return contentList.get(index++);
    }
}
