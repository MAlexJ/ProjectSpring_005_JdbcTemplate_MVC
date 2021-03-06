package com.malexj.repository.impl;

import com.malexj.entity.AdminTable;
import com.malexj.entity.Content;
import com.malexj.entity.Section;
import com.malexj.repository.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

@Repository
public class PostgresRepositoryImpl implements PostgresRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Content> getListContent() {
        return this.jdbcTemplate.query("SELECT * FROM content",
                (rs, rowNum) -> {
                    Content content = new Content();
                    content.setId(rs.getInt("id"));
                    content.setName(rs.getString("name"));
                    content.setPath(rs.getString("path"));
                    return content;
                });
    }

    @Override
    public void setListContent(List<Content> contents) {
        this.jdbcTemplate.batchUpdate("INSERT  INTO content (name) VALUE (?)", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, contents.get(i).getName());
            }

            @Override
            public int getBatchSize() {
                return contents.size();
            }
        });
    }

    @Override
    public List<Section> getListSection() {
        return this.jdbcTemplate.query("SELECT * FROM section", (rs, rowNum) -> {
            Section section = new Section();
            section.setId(rs.getInt("id"));
            section.setName(rs.getString("name"));
            return section;
        });
    }

    @Override
    public List<Content> getListContentFromContentSection() {
        return this.jdbcTemplate.query("SELECT DISTINCT content.name FROM content_section JOIN content ON content.id = content_section.id_content JOIN section ON section.id = content_section.id_section", (rs, rowNum) -> {
            Content content = new Content();
            content.setName(rs.getString("name"));
            return content;
        });
    }

    @Override
    public List<AdminTable> getListAdmin() {
        return this.jdbcTemplate.query("SELECT * FROM admin ORDER BY id", (rs, rowNum) -> {
            AdminTable admin = new AdminTable();
            admin.setId(rs.getInt("id"));
            admin.setName(rs.getString("name"));
            admin.setPath(rs.getString("path"));
            admin.setIcon(rs.getString("icon"));
            return admin;
        });
    }

    @Override
    public List<String> getTablesNames() {
        return this.jdbcTemplate.query("SELECT table_name FROM information_schema.tables WHERE table_schema='public' AND table_type='BASE TABLE'", (rs, rowNum) -> {
            return rs.getString("table_name");
        });
    }

    @Override
    public void setContent(Content content) {
        this.jdbcTemplate.update("INSERT INTO content (name, path) VALUES (?,?)", content.getName(), content.getPath());
    }

    @Override
    public void deleteContent(Content content) {
        this.jdbcTemplate.update("DELETE FROM content WHERE id=?", content.getId());
    }

    @Override
    public void updateContent(Content content) {
        this.jdbcTemplate.update("UPDATE content SET name=?, path=? WHERE id=?", content.getName(), content.getPath(), content.getId());
    }

    @Override
    public void clearContent() {
        this.jdbcTemplate.execute("TRUNCATE TABLE content RESTART IDENTITY CASCADE");
    }
}
