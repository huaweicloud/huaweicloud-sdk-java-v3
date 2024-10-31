package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BasePageInfoMindmapRecycle
 */
public class BasePageInfoMindmapRecycle {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<MindmapRecycle> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private Integer pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public BasePageInfoMindmapRecycle withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public BasePageInfoMindmapRecycle withList(List<MindmapRecycle> list) {
        this.list = list;
        return this;
    }

    public BasePageInfoMindmapRecycle addListItem(MindmapRecycle listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public BasePageInfoMindmapRecycle withList(Consumer<List<MindmapRecycle>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 入参集合
     * @return list
     */
    public List<MindmapRecycle> getList() {
        return list;
    }

    public void setList(List<MindmapRecycle> list) {
        this.list = list;
    }

    public BasePageInfoMindmapRecycle withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，最大支持200条
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public BasePageInfoMindmapRecycle withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始偏移量，表示从此偏移量开始查询，offset大于等于0，小于等于100000
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public BasePageInfoMindmapRecycle withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * 总页数
     * @return pages
     */
    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public BasePageInfoMindmapRecycle withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页条数
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasePageInfoMindmapRecycle that = (BasePageInfoMindmapRecycle) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.list, that.list)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.pages, that.pages) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, list, limit, offset, pages, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasePageInfoMindmapRecycle {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
