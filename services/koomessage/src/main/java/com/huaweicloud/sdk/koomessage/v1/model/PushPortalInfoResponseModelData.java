package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 消息体。
 */
public class PushPortalInfoResponseModelData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public PushPortalInfoResponseModelData withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 主页申请记录ID。
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public PushPortalInfoResponseModelData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 返回信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushPortalInfoResponseModelData pushPortalInfoResponseModelData = (PushPortalInfoResponseModelData) o;
        return Objects.equals(this.logId, pushPortalInfoResponseModelData.logId)
            && Objects.equals(this.message, pushPortalInfoResponseModelData.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logId, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushPortalInfoResponseModelData {\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
