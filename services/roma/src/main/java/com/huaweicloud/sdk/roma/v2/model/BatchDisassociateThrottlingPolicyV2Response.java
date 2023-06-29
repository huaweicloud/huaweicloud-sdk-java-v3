package com.huaweicloud.sdk.roma.v2.model;

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
public class BatchDisassociateThrottlingPolicyV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    private List<ThrottleBindingBatchFailure> failure = null;

    public BatchDisassociateThrottlingPolicyV2Response withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功解除绑定的API和流控策略绑定关系的数量
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public BatchDisassociateThrottlingPolicyV2Response withFailure(List<ThrottleBindingBatchFailure> failure) {
        this.failure = failure;
        return this;
    }

    public BatchDisassociateThrottlingPolicyV2Response addFailureItem(ThrottleBindingBatchFailure failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public BatchDisassociateThrottlingPolicyV2Response withFailure(
        Consumer<List<ThrottleBindingBatchFailure>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 解除绑定失败的API和流控绑定关系及错误信息
     * @return failure
     */
    public List<ThrottleBindingBatchFailure> getFailure() {
        return failure;
    }

    public void setFailure(List<ThrottleBindingBatchFailure> failure) {
        this.failure = failure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDisassociateThrottlingPolicyV2Response that = (BatchDisassociateThrottlingPolicyV2Response) obj;
        return Objects.equals(this.successCount, that.successCount) && Objects.equals(this.failure, that.failure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successCount, failure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDisassociateThrottlingPolicyV2Response {\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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
