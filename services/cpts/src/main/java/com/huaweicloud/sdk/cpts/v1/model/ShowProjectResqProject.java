package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** project */
public class ShowProjectResqProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Integer source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowProjectResqProject withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** create_time
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowProjectResqProject withDescription(String description) {
        this.description = description;
        return this;
    }

    /** description
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowProjectResqProject withGroup(String group) {
        this.group = group;
        return this;
    }

    /** group
     * 
     * @return group */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ShowProjectResqProject withId(Integer id) {
        this.id = id;
        return this;
    }

    /** id minimum: 0 maximum: 2147483647
     * 
     * @return id */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowProjectResqProject withName(String name) {
        this.name = name;
        return this;
    }

    /** name
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowProjectResqProject withSource(Integer source) {
        this.source = source;
        return this;
    }

    /** source minimum: 0 maximum: 2147483647
     * 
     * @return source */
    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public ShowProjectResqProject withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** update_time
     * 
     * @return updateTime */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectResqProject showProjectResqProject = (ShowProjectResqProject) o;
        return Objects.equals(this.createTime, showProjectResqProject.createTime)
            && Objects.equals(this.description, showProjectResqProject.description)
            && Objects.equals(this.group, showProjectResqProject.group)
            && Objects.equals(this.id, showProjectResqProject.id)
            && Objects.equals(this.name, showProjectResqProject.name)
            && Objects.equals(this.source, showProjectResqProject.source)
            && Objects.equals(this.updateTime, showProjectResqProject.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, description, group, id, name, source, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectResqProject {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
