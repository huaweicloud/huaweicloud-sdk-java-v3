package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BasePageInfoTestCase
 */
public class BasePageInfoTestCase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<TestCase> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private Integer pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public BasePageInfoTestCase withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public BasePageInfoTestCase withList(List<TestCase> list) {
        this.list = list;
        return this;
    }

    public BasePageInfoTestCase addListItem(TestCase listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public BasePageInfoTestCase withList(Consumer<List<TestCase>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * Get list
     * @return list
     */
    public List<TestCase> getList() {
        return list;
    }

    public void setList(List<TestCase> list) {
        this.list = list;
    }

    public BasePageInfoTestCase withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public BasePageInfoTestCase withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get pages
     * @return pages
     */
    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public BasePageInfoTestCase withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BasePageInfoTestCase withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasePageInfoTestCase that = (BasePageInfoTestCase) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.list, that.list)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.pages, that.pages)
            && Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, list, offset, pages, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasePageInfoTestCase {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
