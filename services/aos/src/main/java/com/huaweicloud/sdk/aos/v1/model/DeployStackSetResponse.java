package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeployStackSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_operation_id")

    private String stackSetOperationId;

    public DeployStackSetResponse withStackSetOperationId(String stackSetOperationId) {
        this.stackSetOperationId = stackSetOperationId;
        return this;
    }

    /**
     * 资源栈集操作（stack_set_operation）的唯一Id。  此ID由资源编排服务在生成资源栈集操作的时候生成，为UUID。
     * @return stackSetOperationId
     */
    public String getStackSetOperationId() {
        return stackSetOperationId;
    }

    public void setStackSetOperationId(String stackSetOperationId) {
        this.stackSetOperationId = stackSetOperationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployStackSetResponse that = (DeployStackSetResponse) obj;
        return Objects.equals(this.stackSetOperationId, that.stackSetOperationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetOperationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStackSetResponse {\n");
        sb.append("    stackSetOperationId: ").append(toIndentedString(stackSetOperationId)).append("\n");
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
