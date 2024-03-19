package com.example.datastructures;

public enum Priority {

    LOW("Low priority"),
    MEDIUM("Medium priority"),
    HIGH("High priority");

    private final String description;

    Priority(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
