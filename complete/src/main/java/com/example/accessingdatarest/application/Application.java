package com.example.accessingdatarest.application;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String version;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Object config;


    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String lastName) {
        this.version = lastName;
    }

    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }
}
