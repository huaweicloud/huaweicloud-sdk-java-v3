package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 标记指定的服务器维护状态请求。
 */
public class BatchChangeMaintainServerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<String> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_status")

    private Boolean maintainStatus;

    public BatchChangeMaintainServerReq withItems(List<String> items) {
        this.items = items;
        return this;
    }

    public BatchChangeMaintainServerReq addItemsItem(String itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public BatchChangeMaintainServerReq withItems(Consumer<List<String>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 批量请求的服务器ID列表，一次请求数量区间 [1, 20]。
     * @return items
     */
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public BatchChangeMaintainServerReq withMaintainStatus(Boolean maintainStatus) {
        this.maintainStatus = maintainStatus;
        return this;
    }

    /**
     * 服务器维护状态标识： * `true` - 添加标记 * `false` - 移除标记
     * @return maintainStatus
     */
    public Boolean getMaintainStatus() {
        return maintainStatus;
    }

    public void setMaintainStatus(Boolean maintainStatus) {
        this.maintainStatus = maintainStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchChangeMaintainServerReq that = (BatchChangeMaintainServerReq) obj;
        return Objects.equals(this.items, that.items) && Objects.equals(this.maintainStatus, that.maintainStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, maintainStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchChangeMaintainServerReq {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    maintainStatus: ").append(toIndentedString(maintainStatus)).append("\n");
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
