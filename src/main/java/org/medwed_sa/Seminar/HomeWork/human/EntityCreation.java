package org.medwed_sa.Seminar.HomeWork.human;

import java.io.Serializable;
import java.util.List;

public interface EntityCreation<T> extends Serializable {
    int getAge();
    void addChild(T entity);
    void addParent(T entity);
    long getId();
    void setId(long id);
    String getFirstName();
    T getMother();
    T getFather();
    T getSpouse();
    void setSpouse(T entity);
    List<T> getParents();
    List<T> getChildren();
    String getSpouseInfo();

}
