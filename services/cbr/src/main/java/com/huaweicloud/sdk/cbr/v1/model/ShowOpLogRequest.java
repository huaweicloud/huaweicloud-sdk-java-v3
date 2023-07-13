package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOpLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_log_id")

    private String operationLogId;

    public ShowOpLogRequest withOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId;
        return this;
    }

    /**
     * 任务ID
     * @return operationLogId
     */
    public String getOperationLogId() {
        return operationLogId;
    }

    public void setOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpLogRequest that = (ShowOpLogRequest) obj;
        return Objects.equals(this.operationLogId, that.operationLogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationLogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpLogRequest {\n");
        sb.append("    operationLogId: ").append(toIndentedString(operationLogId)).append("\n");
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
