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
public class BatchBindInferApiKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_items")

    private List<ApiKeyResponseV2> successItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_count")

    private Integer failureCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_items")

    private List<ApiKeyFailureResponse> failureItems = null;

    public BatchBindInferApiKeysResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 请求绑定apikey总个数。 **取值范围：** 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public BatchBindInferApiKeysResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * **参数解释：** 绑定apikey成功个数。 **取值范围：** 不涉及。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public BatchBindInferApiKeysResponse withSuccessItems(List<ApiKeyResponseV2> successItems) {
        this.successItems = successItems;
        return this;
    }

    public BatchBindInferApiKeysResponse addSuccessItemsItem(ApiKeyResponseV2 successItemsItem) {
        if (this.successItems == null) {
            this.successItems = new ArrayList<>();
        }
        this.successItems.add(successItemsItem);
        return this;
    }

    public BatchBindInferApiKeysResponse withSuccessItems(Consumer<List<ApiKeyResponseV2>> successItemsSetter) {
        if (this.successItems == null) {
            this.successItems = new ArrayList<>();
        }
        successItemsSetter.accept(this.successItems);
        return this;
    }

    /**
     * **参数解释：** 绑定成功的apikey列表。
     * @return successItems
     */
    public List<ApiKeyResponseV2> getSuccessItems() {
        return successItems;
    }

    public void setSuccessItems(List<ApiKeyResponseV2> successItems) {
        this.successItems = successItems;
    }

    public BatchBindInferApiKeysResponse withFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /**
     * **参数解释：** 绑定apikey失败个数。 **取值范围：** 不涉及。
     * @return failureCount
     */
    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    public BatchBindInferApiKeysResponse withFailureItems(List<ApiKeyFailureResponse> failureItems) {
        this.failureItems = failureItems;
        return this;
    }

    public BatchBindInferApiKeysResponse addFailureItemsItem(ApiKeyFailureResponse failureItemsItem) {
        if (this.failureItems == null) {
            this.failureItems = new ArrayList<>();
        }
        this.failureItems.add(failureItemsItem);
        return this;
    }

    public BatchBindInferApiKeysResponse withFailureItems(Consumer<List<ApiKeyFailureResponse>> failureItemsSetter) {
        if (this.failureItems == null) {
            this.failureItems = new ArrayList<>();
        }
        failureItemsSetter.accept(this.failureItems);
        return this;
    }

    /**
     * **参数解释：** 绑定失败的apikey列表。
     * @return failureItems
     */
    public List<ApiKeyFailureResponse> getFailureItems() {
        return failureItems;
    }

    public void setFailureItems(List<ApiKeyFailureResponse> failureItems) {
        this.failureItems = failureItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchBindInferApiKeysResponse that = (BatchBindInferApiKeysResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.successItems, that.successItems)
            && Objects.equals(this.failureCount, that.failureCount)
            && Objects.equals(this.failureItems, that.failureItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, successCount, successItems, failureCount, failureItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBindInferApiKeysResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    successItems: ").append(toIndentedString(successItems)).append("\n");
        sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
        sb.append("    failureItems: ").append(toIndentedString(failureItems)).append("\n");
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
