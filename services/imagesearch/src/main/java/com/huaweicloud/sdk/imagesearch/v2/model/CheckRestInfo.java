package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检查数据的相关信息。
 */
public class CheckRestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existed")

    private Boolean existed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_info")

    private ItemSource itemInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<SearchItem> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_info")

    private CheckInfo checkInfo;

    public CheckRestInfo withExisted(Boolean existed) {
        this.existed = existed;
        return this;
    }

    /**
     * 数据是否存在，存在返回true，不存在返回false。仅在指定ID检查时包含该字段。
     * @return existed
     */
    public Boolean getExisted() {
        return existed;
    }

    public void setExisted(Boolean existed) {
        this.existed = existed;
    }

    public CheckRestInfo withItemInfo(ItemSource itemInfo) {
        this.itemInfo = itemInfo;
        return this;
    }

    public CheckRestInfo withItemInfo(Consumer<ItemSource> itemInfoSetter) {
        if (this.itemInfo == null) {
            this.itemInfo = new ItemSource();
            itemInfoSetter.accept(this.itemInfo);
        }

        return this;
    }

    /**
     * Get itemInfo
     * @return itemInfo
     */
    public ItemSource getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemSource itemInfo) {
        this.itemInfo = itemInfo;
    }

    public CheckRestInfo withItems(List<SearchItem> items) {
        this.items = items;
        return this;
    }

    public CheckRestInfo addItemsItem(SearchItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public CheckRestInfo withItems(Consumer<List<SearchItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 检查结果列表，仅在条件检查时包含该字段。
     * @return items
     */
    public List<SearchItem> getItems() {
        return items;
    }

    public void setItems(List<SearchItem> items) {
        this.items = items;
    }

    public CheckRestInfo withCheckInfo(CheckInfo checkInfo) {
        this.checkInfo = checkInfo;
        return this;
    }

    public CheckRestInfo withCheckInfo(Consumer<CheckInfo> checkInfoSetter) {
        if (this.checkInfo == null) {
            this.checkInfo = new CheckInfo();
            checkInfoSetter.accept(this.checkInfo);
        }

        return this;
    }

    /**
     * Get checkInfo
     * @return checkInfo
     */
    public CheckInfo getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(CheckInfo checkInfo) {
        this.checkInfo = checkInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRestInfo that = (CheckRestInfo) obj;
        return Objects.equals(this.existed, that.existed) && Objects.equals(this.itemInfo, that.itemInfo)
            && Objects.equals(this.items, that.items) && Objects.equals(this.checkInfo, that.checkInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(existed, itemInfo, items, checkInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRestInfo {\n");
        sb.append("    existed: ").append(toIndentedString(existed)).append("\n");
        sb.append("    itemInfo: ").append(toIndentedString(itemInfo)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    checkInfo: ").append(toIndentedString(checkInfo)).append("\n");
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
