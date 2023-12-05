package org.example;

import javax.persistence.FetchType;

public @interface OneToMany {
    String mappedBy();

    FetchType fetch();
}
