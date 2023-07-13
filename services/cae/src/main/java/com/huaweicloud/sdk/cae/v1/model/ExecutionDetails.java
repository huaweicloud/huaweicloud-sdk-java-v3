package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExecutionDetails
 */
public class ExecutionDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_time")

    private String lastExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ComponentExecutionResult> items = null;

    public ExecutionDetails withLastExecutionTime(String lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
        return this;
    }

    /**
     * 启停策略执行时间。
     * @return lastExecutionTime
     */
    public String getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(String lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    public ExecutionDetails withItems(List<ComponentExecutionResult> items) {
        this.items = items;
        return this;
    }

    public ExecutionDetails addItemsItem(ComponentExecutionResult itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ExecutionDetails withItems(Consumer<List<ComponentExecutionResult>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 组件启停规则执行结果列表。
     * @return items
     */
    public List<ComponentExecutionResult> getItems() {
        return items;
    }

    public void setItems(List<ComponentExecutionResult> items) {
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
        ExecutionDetails that = (ExecutionDetails) obj;
        return Objects.equals(this.lastExecutionTime, that.lastExecutionTime) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastExecutionTime, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionDetails {\n");
        sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
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
