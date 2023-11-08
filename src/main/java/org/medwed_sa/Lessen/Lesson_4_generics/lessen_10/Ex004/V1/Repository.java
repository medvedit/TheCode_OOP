package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Repository implements Iterable<Content>{
    private List<Content> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
//        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(Content content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public Content get(Integer index) {
        return ds.get(index);
    }


    // В качестве тренировки реализуйте возможность работы с foreach

    @Override
    public Iterator<Content> iterator() {
        return new RepositoryIterator(ds);
    }

    public String getContentInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список\n");
        for (Content d : ds) {
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }

}
