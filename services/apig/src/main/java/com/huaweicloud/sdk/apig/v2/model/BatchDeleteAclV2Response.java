package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class BatchDeleteAclV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    private List<AclBatchResultFailureResp> failure = null;

    public BatchDeleteAclV2Response withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /** 删除成功的ACL策略数量
     * 
     * @return successCount */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public BatchDeleteAclV2Response withFailure(List<AclBatchResultFailureResp> failure) {
        this.failure = failure;
        return this;
    }

    public BatchDeleteAclV2Response addFailureItem(AclBatchResultFailureResp failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public BatchDeleteAclV2Response withFailure(Consumer<List<AclBatchResultFailureResp>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /** 删除失败的ACL策略及错误信息
     * 
     * @return failure */
    public List<AclBatchResultFailureResp> getFailure() {
        return failure;
    }

    public void setFailure(List<AclBatchResultFailureResp> failure) {
        this.failure = failure;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteAclV2Response batchDeleteAclV2Response = (BatchDeleteAclV2Response) o;
        return Objects.equals(this.successCount, batchDeleteAclV2Response.successCount)
            && Objects.equals(this.failure, batchDeleteAclV2Response.failure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successCount, failure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAclV2Response {\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
