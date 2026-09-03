package com.huaweicloud.sdk.das.v3.model;

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
public class ExecuteTuningResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private List<String> messageId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_exceeded")

    private Boolean quotaExceeded;

    public ExecuteTuningResponse withMessageId(List<String> messageId) {
        this.messageId = messageId;
        return this;
    }

    public ExecuteTuningResponse addMessageIdItem(String messageIdItem) {
        if (this.messageId == null) {
            this.messageId = new ArrayList<>();
        }
        this.messageId.add(messageIdItem);
        return this;
    }

    public ExecuteTuningResponse withMessageId(Consumer<List<String>> messageIdSetter) {
        if (this.messageId == null) {
            this.messageId = new ArrayList<>();
        }
        messageIdSetter.accept(this.messageId);
        return this;
    }

    /**
     * SQL诊断消息ID列表
     * @return messageId
     */
    public List<String> getMessageId() {
        return messageId;
    }

    public void setMessageId(List<String> messageId) {
        this.messageId = messageId;
    }

    public ExecuteTuningResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 诊断任务创建状态
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ExecuteTuningResponse withQuotaExceeded(Boolean quotaExceeded) {
        this.quotaExceeded = quotaExceeded;
        return this;
    }

    /**
     * 是否超过诊断任务创建限额
     * @return quotaExceeded
     */
    public Boolean getQuotaExceeded() {
        return quotaExceeded;
    }

    public void setQuotaExceeded(Boolean quotaExceeded) {
        this.quotaExceeded = quotaExceeded;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteTuningResponse that = (ExecuteTuningResponse) obj;
        return Objects.equals(this.messageId, that.messageId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.quotaExceeded, that.quotaExceeded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, status, quotaExceeded);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteTuningResponse {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    quotaExceeded: ").append(toIndentedString(quotaExceeded)).append("\n");
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
