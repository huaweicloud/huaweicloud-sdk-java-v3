package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubCategoryDetailVO
 */
public class SubCategoryDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private String pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_categories")

    private Object subCategories;

    public SubCategoryDetailVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 目录ID，根目录的ID为0
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubCategoryDetailVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubCategoryDetailVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型 built_in:系统内置 user-defined: 用户自定义
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SubCategoryDetailVO withPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * 父目录ID
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public SubCategoryDetailVO withSubCategories(Object subCategories) {
        this.subCategories = subCategories;
        return this;
    }

    /**
     * 子目录
     * @return subCategories
     */
    public Object getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Object subCategories) {
        this.subCategories = subCategories;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubCategoryDetailVO subCategoryDetailVO = (SubCategoryDetailVO) o;
        return Objects.equals(this.id, subCategoryDetailVO.id) && Objects.equals(this.name, subCategoryDetailVO.name)
            && Objects.equals(this.type, subCategoryDetailVO.type) && Objects.equals(this.pid, subCategoryDetailVO.pid)
            && Objects.equals(this.subCategories, subCategoryDetailVO.subCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, pid, subCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubCategoryDetailVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
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
