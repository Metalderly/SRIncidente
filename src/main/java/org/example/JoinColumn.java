package org.example;

public @interface JoinColumn {
    String name();

    String referencedColumName();
}
