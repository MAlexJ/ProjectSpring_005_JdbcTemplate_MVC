package com.malexj.repository;

import com.malexj.entity.AdminTable;
import com.malexj.entity.Content;
import com.malexj.entity.Section;

import java.util.List;

public interface PostgresRepository {

    public List<Content> getListContent();

    public void setListContent(List<Content> contents);

    public List<Section> getListSection();

    public List<Content> getListContentFromContentSection();

    List<AdminTable> getListAdmin();

    List<String> getTablesNames();
}
