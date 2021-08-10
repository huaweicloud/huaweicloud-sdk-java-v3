package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** PageInstancesVO */
public class PageInstancesVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "empty")

    private Boolean empty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<InstancesVO> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items_before")

    private Long itemsBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_items_count")

    private Long totalItemsCount;

    public PageInstancesVO withEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }

    /** 是否为空
     * 
     * @return empty */
    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public PageInstancesVO withItems(List<InstancesVO> items) {
        this.items = items;
        return this;
    }

    public PageInstancesVO addItemsItem(InstancesVO itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public PageInstancesVO withItems(Consumer<List<InstancesVO>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /** 列表详情
     * 
     * @return items */
    public List<InstancesVO> getItems() {
        return items;
    }

    public void setItems(List<InstancesVO> items) {
        this.items = items;
    }

    public PageInstancesVO withItemsBefore(Long itemsBefore) {
        this.itemsBefore = itemsBefore;
        return this;
    }

    /** 偏移量，表示从此偏移量开始查询 minimum: 0 maximum: 999
     * 
     * @return itemsBefore */
    public Long getItemsBefore() {
        return itemsBefore;
    }

    public void setItemsBefore(Long itemsBefore) {
        this.itemsBefore = itemsBefore;
    }

    public PageInstancesVO withSize(Long size) {
        this.size = size;
        return this;
    }

    /** 每页显示的条目数量 minimum: 10 maximum: 30
     * 
     * @return size */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public PageInstancesVO withTotalItemsCount(Long totalItemsCount) {
        this.totalItemsCount = totalItemsCount;
        return this;
    }

    /** 总数 minimum: 1 maximum: -9223372036854775616
     * 
     * @return totalItemsCount */
    public Long getTotalItemsCount() {
        return totalItemsCount;
    }

    public void setTotalItemsCount(Long totalItemsCount) {
        this.totalItemsCount = totalItemsCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PageInstancesVO pageInstancesVO = (PageInstancesVO) o;
        return Objects.equals(this.empty, pageInstancesVO.empty) && Objects.equals(this.items, pageInstancesVO.items)
            && Objects.equals(this.itemsBefore, pageInstancesVO.itemsBefore)
            && Objects.equals(this.size, pageInstancesVO.size)
            && Objects.equals(this.totalItemsCount, pageInstancesVO.totalItemsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empty, items, itemsBefore, size, totalItemsCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInstancesVO {\n");
        sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    itemsBefore: ").append(toIndentedString(itemsBefore)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    totalItemsCount: ").append(toIndentedString(totalItemsCount)).append("\n");
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
