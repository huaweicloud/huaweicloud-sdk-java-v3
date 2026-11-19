package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class SwitchColdTableStorageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_items")

    private List<FailedItem> failedItems = null;

    public SwitchColdTableStorageResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释**：  操作结果。  **取值范围**：  - SUCCESS：成功。 - FAILED：失败。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public SwitchColdTableStorageResponse withFailedItems(List<FailedItem> failedItems) {
        this.failedItems = failedItems;
        return this;
    }

    public SwitchColdTableStorageResponse addFailedItemsItem(FailedItem failedItemsItem) {
        if (this.failedItems == null) {
            this.failedItems = new ArrayList<>();
        }
        this.failedItems.add(failedItemsItem);
        return this;
    }

    public SwitchColdTableStorageResponse withFailedItems(Consumer<List<FailedItem>> failedItemsSetter) {
        if (this.failedItems == null) {
            this.failedItems = new ArrayList<>();
        }
        failedItemsSetter.accept(this.failedItems);
        return this;
    }

    /**
     * **参数解释**：  校验失败的表信息。  当result取值为FAILED时，返回此参数。
     * @return failedItems
     */
    public List<FailedItem> getFailedItems() {
        return failedItems;
    }

    public void setFailedItems(List<FailedItem> failedItems) {
        this.failedItems = failedItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchColdTableStorageResponse that = (SwitchColdTableStorageResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.failedItems, that.failedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, failedItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchColdTableStorageResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    failedItems: ").append(toIndentedString(failedItems)).append("\n");
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
