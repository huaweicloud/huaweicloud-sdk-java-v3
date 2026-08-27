package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量关联模型分组与资源请求。每项指定一个模型分组与一个资源（桌面/桌面标签）的关联。
 */
public class ApplyModelConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ModelConfigItem> items = null;

    public ApplyModelConfigReq withItems(List<ModelConfigItem> items) {
        this.items = items;
        return this;
    }

    public ApplyModelConfigReq addItemsItem(ModelConfigItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ApplyModelConfigReq withItems(Consumer<List<ModelConfigItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 关联项列表，每项包含模型分组ID、资源ID及资源类型。
     * @return items
     */
    public List<ModelConfigItem> getItems() {
        return items;
    }

    public void setItems(List<ModelConfigItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyModelConfigReq that = (ApplyModelConfigReq) obj;
        return Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyModelConfigReq {\n");
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
