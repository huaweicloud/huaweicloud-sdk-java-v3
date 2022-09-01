package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryCategoryRsp
 */
public class QueryCategoryRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    @JacksonXmlProperty(localName = "children")

    private List<QueryCategoryRsp> children = null;

    public QueryCategoryRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 分类ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryCategoryRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分类名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryCategoryRsp withChildren(List<QueryCategoryRsp> children) {
        this.children = children;
        return this;
    }

    public QueryCategoryRsp addChildrenItem(QueryCategoryRsp childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public QueryCategoryRsp withChildren(Consumer<List<QueryCategoryRsp>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子分类列表。
     * @return children
     */
    public List<QueryCategoryRsp> getChildren() {
        return children;
    }

    public void setChildren(List<QueryCategoryRsp> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCategoryRsp queryCategoryRsp = (QueryCategoryRsp) o;
        return Objects.equals(this.id, queryCategoryRsp.id) && Objects.equals(this.name, queryCategoryRsp.name)
            && Objects.equals(this.children, queryCategoryRsp.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCategoryRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
