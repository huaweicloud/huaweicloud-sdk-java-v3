package com.huaweicloud.sdk.rgc.v1.model;

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
public class ShowBestPracticeStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage_complete")

    private Integer percentageComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_messages")

    private List<String> errorMessages = null;

    public ShowBestPracticeStatusResponse withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 操作Id
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public ShowBestPracticeStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态：进行中，成功，成败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowBestPracticeStatusResponse withPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
        return this;
    }

    /**
     * 检测进度
     * minimum: 0
     * maximum: 100
     * @return percentageComplete
     */
    public Integer getPercentageComplete() {
        return percentageComplete;
    }

    public void setPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    public ShowBestPracticeStatusResponse withErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }

    public ShowBestPracticeStatusResponse addErrorMessagesItem(String errorMessagesItem) {
        if (this.errorMessages == null) {
            this.errorMessages = new ArrayList<>();
        }
        this.errorMessages.add(errorMessagesItem);
        return this;
    }

    public ShowBestPracticeStatusResponse withErrorMessages(Consumer<List<String>> errorMessagesSetter) {
        if (this.errorMessages == null) {
            this.errorMessages = new ArrayList<>();
        }
        errorMessagesSetter.accept(this.errorMessages);
        return this;
    }

    /**
     * 错误消息
     * @return errorMessages
     */
    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBestPracticeStatusResponse that = (ShowBestPracticeStatusResponse) obj;
        return Objects.equals(this.operationId, that.operationId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.percentageComplete, that.percentageComplete)
            && Objects.equals(this.errorMessages, that.errorMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId, status, percentageComplete, errorMessages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBestPracticeStatusResponse {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
        sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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
