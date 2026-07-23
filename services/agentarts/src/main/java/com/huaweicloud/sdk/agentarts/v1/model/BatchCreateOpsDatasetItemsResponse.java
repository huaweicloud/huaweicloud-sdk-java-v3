package com.huaweicloud.sdk.agentarts.v1.model;

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
public class BatchCreateOpsDatasetItemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_ids")

    private List<String> itemIds = null;

    public BatchCreateOpsDatasetItemsResponse withItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }

    public BatchCreateOpsDatasetItemsResponse addItemIdsItem(String itemIdsItem) {
        if (this.itemIds == null) {
            this.itemIds = new ArrayList<>();
        }
        this.itemIds.add(itemIdsItem);
        return this;
    }

    public BatchCreateOpsDatasetItemsResponse withItemIds(Consumer<List<String>> itemIdsSetter) {
        if (this.itemIds == null) {
            this.itemIds = new ArrayList<>();
        }
        itemIdsSetter.accept(this.itemIds);
        return this;
    }

    /**
     * **参数解释：** 系统为新创建的数据条目生成的唯一标识符列表。 **取值范围：** 符合数据库标识符规范的字符串列表。 
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
        BatchCreateOpsDatasetItemsResponse that = (BatchCreateOpsDatasetItemsResponse) obj;
        return Objects.equals(this.itemIds, that.itemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateOpsDatasetItemsResponse {\n");
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
