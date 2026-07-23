package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 批量删除数据条目的请求载体。 **约束限制：** 单次请求ID数量需在 1 到 1000 之间。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class BatchDeleteOpsDatasetItemsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_ids")

    private List<String> itemIds = null;

    public BatchDeleteOpsDatasetItemsRequestBody withItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }

    public BatchDeleteOpsDatasetItemsRequestBody addItemIdsItem(String itemIdsItem) {
        if (this.itemIds == null) {
            this.itemIds = new ArrayList<>();
        }
        this.itemIds.add(itemIdsItem);
        return this;
    }

    public BatchDeleteOpsDatasetItemsRequestBody withItemIds(Consumer<List<String>> itemIdsSetter) {
        if (this.itemIds == null) {
            this.itemIds = new ArrayList<>();
        }
        itemIdsSetter.accept(this.itemIds);
        return this;
    }

    /**
     * **参数解释：** 待删除的数据条目唯一标识符列表。 **约束限制：** 必填参数；数组长度 1 到 1000。 **取值范围：** 符合 MongoDB ObjectID 规范的十六进制字符串列表。 **默认取值：** 不涉及。 
     * @return itemIds
     */
    public List<String> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteOpsDatasetItemsRequestBody that = (BatchDeleteOpsDatasetItemsRequestBody) obj;
        return Objects.equals(this.itemIds, that.itemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteOpsDatasetItemsRequestBody {\n");
        sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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
