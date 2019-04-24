package org.esurovskiy;


import java.util.Date;

public enum SingletonEnumExample {
    INSTANCE;

    public Date getDate() {
        return new Date();
    }
}
