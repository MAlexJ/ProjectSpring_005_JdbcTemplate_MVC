package com.malexj.entity;

public class Content extends AbstractEntity {
    private String path;

    public Content() {
    }

    public Content(String name) {
        super(name);
    }

    public Content(int id, String name) {
        super(id, name);
    }

    public Content(int id, String name, String path) {
        super(id, name);
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
