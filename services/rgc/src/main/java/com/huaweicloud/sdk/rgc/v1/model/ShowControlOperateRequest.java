package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowControlOperateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_control_status_id")

    private String operationControlStatusId;

    public ShowControlOperateRequest withOperationControlStatusId(String operationControlStatusId) {
        this.operationControlStatusId = operationControlStatusId;
        return this;
    }

    /**
     * 操作控制策略的请求ID。
     * @return operationControlStatusId
     */
    public String getOperationControlStatusId() {
        return operationControlStatusId;
    }

    public void setOperationControlStatusId(String operationControlStatusId) {
        this.operationControlStatusId = operationControlStatusId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowControlOperateRequest that = (ShowControlOperateRequest) obj;
        return Objects.equals(this.operationControlStatusId, that.operationControlStatusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationControlStatusId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlOperateRequest {\n");
        sb.append("    operationControlStatusId: ").append(toIndentedString(operationControlStatusId)).append("\n");
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
