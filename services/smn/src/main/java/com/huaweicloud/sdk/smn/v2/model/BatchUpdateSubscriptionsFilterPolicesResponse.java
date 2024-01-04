package com.huaweicloud.sdk.smn.v2.model;

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
public class BatchUpdateSubscriptionsFilterPolicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_result")

    private List<BatchResult> batchResult = null;

    public BatchUpdateSubscriptionsFilterPolicesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public BatchUpdateSubscriptionsFilterPolicesResponse withBatchResult(List<BatchResult> batchResult) {
        this.batchResult = batchResult;
        return this;
    }

    public BatchUpdateSubscriptionsFilterPolicesResponse addBatchResultItem(BatchResult batchResultItem) {
        if (this.batchResult == null) {
            this.batchResult = new ArrayList<>();
        }
        this.batchResult.add(batchResultItem);
        return this;
    }

    public BatchUpdateSubscriptionsFilterPolicesResponse withBatchResult(
        Consumer<List<BatchResult>> batchResultSetter) {
        if (this.batchResult == null) {
            this.batchResult = new ArrayList<>();
        }
        batchResultSetter.accept(this.batchResult);
        return this;
    }

    /**
     * 批量结果
     * @return batchResult
     */
    public List<BatchResult> getBatchResult() {
        return batchResult;
    }

    public void setBatchResult(List<BatchResult> batchResult) {
        this.batchResult = batchResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateSubscriptionsFilterPolicesResponse that = (BatchUpdateSubscriptionsFilterPolicesResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.batchResult, that.batchResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, batchResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateSubscriptionsFilterPolicesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    batchResult: ").append(toIndentedString(batchResult)).append("\n");
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
