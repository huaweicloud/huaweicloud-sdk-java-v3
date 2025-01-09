package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务器组关联的标签列表。
 */
public class BatchCreateServerGroupTagsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ServerGroupTagsInfo> items = null;

    public BatchCreateServerGroupTagsReq withItems(List<ServerGroupTagsInfo> items) {
        this.items = items;
        return this;
    }

    public BatchCreateServerGroupTagsReq addItemsItem(ServerGroupTagsInfo itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public BatchCreateServerGroupTagsReq withItems(Consumer<List<ServerGroupTagsInfo>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 服务器组关联的标签列表。
     * @return items
     */
    public List<ServerGroupTagsInfo> getItems() {
        return items;
    }

    public void setItems(List<ServerGroupTagsInfo> items) {
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
        BatchCreateServerGroupTagsReq that = (BatchCreateServerGroupTagsReq) obj;
        return Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateServerGroupTagsReq {\n");
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
