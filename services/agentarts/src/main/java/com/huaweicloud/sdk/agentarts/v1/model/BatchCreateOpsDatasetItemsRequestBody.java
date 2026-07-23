package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 向评测集中批量添加多个数据记录的请求体。 **约束限制：** items 列表不能为空。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class BatchCreateOpsDatasetItemsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<OpsAddItemRequest> items = null;

    public BatchCreateOpsDatasetItemsRequestBody withItems(List<OpsAddItemRequest> items) {
        this.items = items;
        return this;
    }

    public BatchCreateOpsDatasetItemsRequestBody addItemsItem(OpsAddItemRequest itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public BatchCreateOpsDatasetItemsRequestBody withItems(Consumer<List<OpsAddItemRequest>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释：** 待添加到评测集中的数据条目列表。 **约束限制：** 必填参数；数组长度限制为1到1000个条目。 **取值范围：** 符合OpsAddItemRequest结构的对象数组。 **默认取值：** 不涉及。 
     * @return items
     */
    public List<OpsAddItemRequest> getItems() {
        return items;
    }

    public void setItems(List<OpsAddItemRequest> items) {
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
        BatchCreateOpsDatasetItemsRequestBody that = (BatchCreateOpsDatasetItemsRequestBody) obj;
        return Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateOpsDatasetItemsRequestBody {\n");
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
