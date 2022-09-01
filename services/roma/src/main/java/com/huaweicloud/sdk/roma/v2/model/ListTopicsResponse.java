package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTopicsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    @JacksonXmlProperty(localName = "items")

    private List<Topic> items = null;

    public ListTopicsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 1
     * maximum: 99999
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTopicsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回数量
     * minimum: 1
     * maximum: 1000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListTopicsResponse withItems(List<Topic> items) {
        this.items = items;
        return this;
    }

    public ListTopicsResponse addItemsItem(Topic itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListTopicsResponse withItems(Consumer<List<Topic>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 主题列表
     * @return items
     */
    public List<Topic> getItems() {
        return items;
    }

    public void setItems(List<Topic> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTopicsResponse listTopicsResponse = (ListTopicsResponse) o;
        return Objects.equals(this.total, listTopicsResponse.total)
            && Objects.equals(this.size, listTopicsResponse.size)
            && Objects.equals(this.items, listTopicsResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
