package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源操作记录，包含操作类型、操作结果。 
 */
public class Operation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_result")

    private String operationResult;

    public Operation withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * **参数解释**：操作类型。 **取值范围**：   - CREATE：创建。   - SCALEIN：缩容。   - SCALEOUT：扩容。   - DELETE：删除。 
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Operation withOperationResult(String operationResult) {
        this.operationResult = operationResult;
        return this;
    }

    /**
     * **参数解释**：操作结果。 **取值范围**：   - EXECUTING：执行中。   - SUCCESS：操作成功。   - FAILED：操作失败。 
     * @return operationResult
     */
    public String getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(String operationResult) {
        this.operationResult = operationResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Operation that = (Operation) obj;
        return Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.operationResult, that.operationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationType, operationResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Operation {\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    operationResult: ").append(toIndentedString(operationResult)).append("\n");
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
