package org.Java_Concepts.Generics;

import java.io.Serializable;

public class MyGenericTypeClass<T extends Number & Serializable> {
    T myType;

    MyGenericTypeClass(T myType) {
        this.myType = myType;
    }

    public T getMyType() {
        return myType;
    }
}
