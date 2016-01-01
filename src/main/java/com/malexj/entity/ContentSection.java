package com.malexj.entity;

public class ContentSection extends AbstractEntity {

    private int id_content;
    private int id_section;


    public ContentSection() {
    }

    public ContentSection(int id, int id_content, int id_section) {
        super(id);
        this.id_content = id_content;
        this.id_section = id_section;
    }

    public int getId_content() {
        return id_content;
    }

    public void setId_content(int id_content) {
        this.id_content = id_content;
    }

    public int getId_section() {
        return id_section;
    }

    public void setId_section(int id_section) {
        this.id_section = id_section;
    }

    @Override
    public String toString() {
        return "id=" + getId() +
                ", id_content=" + id_content +
                ", id_section=" + id_section +
                '}';
    }
}
