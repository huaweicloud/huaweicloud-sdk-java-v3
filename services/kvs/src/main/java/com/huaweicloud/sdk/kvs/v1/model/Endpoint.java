package com.huaweicloud.sdk.kvs.v1.model;

public class Endpoint {
    private String name;

    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Endpoint withName(String name) {
        this.name = name;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Endpoint withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
}
