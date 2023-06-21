package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取租户的习题库过滤字段
 */
public class PackageFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_names")

    private List<String> tagNames = null;

    public PackageFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 需查询的习题库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PackageFilter withTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    public PackageFilter addTagNamesItem(String tagNamesItem) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        this.tagNames.add(tagNamesItem);
        return this;
    }

    public PackageFilter withTagNames(Consumer<List<String>> tagNamesSetter) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        tagNamesSetter.accept(this.tagNames);
        return this;
    }

    /**
     * 标签名称列表
     * @return tagNames
     */
    public List<String> getTagNames() {
        return tagNames;
    }

    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageFilter packageFilter = (PackageFilter) o;
        return Objects.equals(this.name, packageFilter.name) && Objects.equals(this.tagNames, packageFilter.tagNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tagNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageFilter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
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
