package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeadletterResendRespResendResults
 */
public class DeadletterResendRespResendResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id")

    private String msgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public DeadletterResendRespResendResults withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * 消息ID。
     * @return msgId
     */
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public DeadletterResendRespResendResults withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public DeadletterResendRespResendResults withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeadletterResendRespResendResults deadletterResendRespResendResults = (DeadletterResendRespResendResults) o;
        return Objects.equals(this.msgId, deadletterResendRespResendResults.msgId)
            && Objects.equals(this.errorCode, deadletterResendRespResendResults.errorCode)
            && Objects.equals(this.errorMessage, deadletterResendRespResendResults.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msgId, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeadletterResendRespResendResults {\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
