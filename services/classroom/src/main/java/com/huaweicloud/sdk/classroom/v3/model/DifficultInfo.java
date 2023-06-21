package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 习题难度信息
 */
public class DifficultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "degree")

    private Integer degree;

    public DifficultInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 难度id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DifficultInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 难度名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DifficultInfo withDegree(Integer degree) {
        this.degree = degree;
        return this;
    }

    /**
     * 难度等级
     * @return degree
     */
    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DifficultInfo difficultInfo = (DifficultInfo) o;
        return Objects.equals(this.id, difficultInfo.id) && Objects.equals(this.name, difficultInfo.name)
            && Objects.equals(this.degree, difficultInfo.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, degree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DifficultInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
