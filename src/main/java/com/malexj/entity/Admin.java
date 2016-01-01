package com.malexj.entity;


public class Admin extends AbstractEntity {
    private String path;
    private String icon;

    public Admin() {
    }

    public Admin(int id, String name, String path, String icon) {
        super(id, name);
        this.path = path;
        this.icon = icon;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
