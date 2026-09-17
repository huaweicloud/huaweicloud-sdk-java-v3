package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 响应数据主体。 **约束限制：** 不涉及。
 */
public class ListOpsEvaluationTaskResultsResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<OpsEvaluationTaskResultItem> items = null;

    public ListOpsEvaluationTaskResultsResponseBodyData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足查询条件的评估结果总数。 **约束限制：** 不涉及。 **取值范围：** 非负整数。
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsEvaluationTaskResultsResponseBodyData withItems(List<OpsEvaluationTaskResultItem> items) {
        this.items = items;
        return this;
    }

    public ListOpsEvaluationTaskResultsResponseBodyData addItemsItem(OpsEvaluationTaskResultItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListOpsEvaluationTaskResultsResponseBodyData withItems(
        Consumer<List<OpsEvaluationTaskResultItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释：** 评估结果条目列表。 **约束限制：** 不涉及。
     * @return items
     */
    public List<OpsEvaluationTaskResultItem> getItems() {
        return items;
    }

    public void setItems(List<OpsEvaluationTaskResultItem> items) {
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
        ListOpsEvaluationTaskResultsResponseBodyData that = (ListOpsEvaluationTaskResultsResponseBodyData) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluationTaskResultsResponseBodyData {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
