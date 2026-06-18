package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWorkflowStepExecutionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<StepExecutionResp> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_order")

    private String defaultOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_columns")

    private CompareColumns compareColumns;

    public ListWorkflowStepExecutionResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：总数。 **取值范围**：不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWorkflowStepExecutionResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：返回个数。 **取值范围**：不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListWorkflowStepExecutionResponse withItems(List<StepExecutionResp> items) {
        this.items = items;
        return this;
    }

    public ListWorkflowStepExecutionResponse addItemsItem(StepExecutionResp itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListWorkflowStepExecutionResponse withItems(Consumer<List<StepExecutionResp>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释**：StepExecution数组。
     * @return items
     */
    public List<StepExecutionResp> getItems() {
        return items;
    }

    public void setItems(List<StepExecutionResp> items) {
        this.items = items;
    }

    public ListWorkflowStepExecutionResponse withDefaultOrder(String defaultOrder) {
        this.defaultOrder = defaultOrder;
        return this;
    }

    /**
     * **参数解释**：默认排序。 **取值范围**：不涉及。
     * @return defaultOrder
     */
    public String getDefaultOrder() {
        return defaultOrder;
    }

    public void setDefaultOrder(String defaultOrder) {
        this.defaultOrder = defaultOrder;
    }

    public ListWorkflowStepExecutionResponse withCompareColumns(CompareColumns compareColumns) {
        this.compareColumns = compareColumns;
        return this;
    }

    public ListWorkflowStepExecutionResponse withCompareColumns(Consumer<CompareColumns> compareColumnsSetter) {
        if (this.compareColumns == null) {
            this.compareColumns = new CompareColumns();
            compareColumnsSetter.accept(this.compareColumns);
        }

        return this;
    }

    /**
     * Get compareColumns
     * @return compareColumns
     */
    public CompareColumns getCompareColumns() {
        return compareColumns;
    }

    public void setCompareColumns(CompareColumns compareColumns) {
        this.compareColumns = compareColumns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkflowStepExecutionResponse that = (ListWorkflowStepExecutionResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.count, that.count)
            && Objects.equals(this.items, that.items) && Objects.equals(this.defaultOrder, that.defaultOrder)
            && Objects.equals(this.compareColumns, that.compareColumns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, count, items, defaultOrder, compareColumns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkflowStepExecutionResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    defaultOrder: ").append(toIndentedString(defaultOrder)).append("\n");
        sb.append("    compareColumns: ").append(toIndentedString(compareColumns)).append("\n");
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
