package com.rentmanager.client.builders;

public enum Entity {
    TENANTS("Tenants");

    Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;
}
