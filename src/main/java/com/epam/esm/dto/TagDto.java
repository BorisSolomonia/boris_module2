package com.epam.esm.dto;

public class TagDto {
    private String name;
    private long id;

    public TagDto(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public TagDto(String name) {
        this.name = name;
    }

    public TagDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TagDto{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
