package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AclBindingBatchFailure;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchDeleteApiAclBindingV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success_count")
    
    private Integer successCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failure")
    
    private List<AclBindingBatchFailure> failure = null;
    
    public BatchDeleteApiAclBindingV2Response withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    


    /**
     * 成功解除绑定的ACL策略数量
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    

    public BatchDeleteApiAclBindingV2Response withFailure(List<AclBindingBatchFailure> failure) {
        this.failure = failure;
        return this;
    }

    
    public BatchDeleteApiAclBindingV2Response addFailureItem(AclBindingBatchFailure failureItem) {
        if(this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public BatchDeleteApiAclBindingV2Response withFailure(Consumer<List<AclBindingBatchFailure>> failureSetter) {
        if(this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 解除绑定失败的ACL策略及错误信息
     * @return failure
     */
    public List<AclBindingBatchFailure> getFailure() {
        return failure;
    }

    public void setFailure(List<AclBindingBatchFailure> failure) {
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
        BatchDeleteApiAclBindingV2Response batchDeleteApiAclBindingV2Response = (BatchDeleteApiAclBindingV2Response) o;
        return Objects.equals(this.successCount, batchDeleteApiAclBindingV2Response.successCount) &&
            Objects.equals(this.failure, batchDeleteApiAclBindingV2Response.failure);
    }
    @Override
    public int hashCode() {
        return Objects.hash(successCount, failure);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteApiAclBindingV2Response {\n");
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

