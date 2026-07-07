package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetDevServerOperationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_status")

    private String operationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_error")

    private ServerOperationError operationError;

    public GetDevServerOperationResponse withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * **参数解释**：操作ID。 **取值范围**：长度为[8,36]个字符。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public GetDevServerOperationResponse withOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * **参数解释**：操作状态。 **取值范围**：长度为[8,36]个字符。
     * @return operationStatus
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public GetDevServerOperationResponse withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * **参数解释**：操作类型。 **取值范围**：长度为[8,36]个字符。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public GetDevServerOperationResponse withOperationError(ServerOperationError operationError) {
        this.operationError = operationError;
        return this;
    }

    public GetDevServerOperationResponse withOperationError(Consumer<ServerOperationError> operationErrorSetter) {
        if (this.operationError == null) {
            this.operationError = new ServerOperationError();
            operationErrorSetter.accept(this.operationError);
        }

        return this;
    }

    /**
     * Get operationError
     * @return operationError
     */
    public ServerOperationError getOperationError() {
        return operationError;
    }

    public void setOperationError(ServerOperationError operationError) {
        this.operationError = operationError;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetDevServerOperationResponse that = (GetDevServerOperationResponse) obj;
        return Objects.equals(this.operationId, that.operationId)
            && Objects.equals(this.operationStatus, that.operationStatus)
            && Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.operationError, that.operationError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId, operationStatus, operationType, operationError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDevServerOperationResponse {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    operationError: ").append(toIndentedString(operationError)).append("\n");
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
