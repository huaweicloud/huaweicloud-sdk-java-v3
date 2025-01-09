package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面监控用户在线状态信息
 */
public class MonitorUserOnlineInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoded_authorization_message")

    private String encodedAuthorizationMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_setup_time")

    private String connectionSetupTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_end_time")

    private String connectionEndTime;

    public MonitorUserOnlineInfo withErrorCode(String errorCode) {
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

    public MonitorUserOnlineInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public MonitorUserOnlineInfo withEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
        return this;
    }

    /**
     * 加密后的详细拒绝原因，用户可以自行调用STS服务的decode-authorization-message接口进行解密。
     * @return encodedAuthorizationMessage
     */
    public String getEncodedAuthorizationMessage() {
        return encodedAuthorizationMessage;
    }

    public void setEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
    }

    public MonitorUserOnlineInfo withConnectionSetupTime(String connectionSetupTime) {
        this.connectionSetupTime = connectionSetupTime;
        return this;
    }

    /**
     * 建立连接时间
     * @return connectionSetupTime
     */
    public String getConnectionSetupTime() {
        return connectionSetupTime;
    }

    public void setConnectionSetupTime(String connectionSetupTime) {
        this.connectionSetupTime = connectionSetupTime;
    }

    public MonitorUserOnlineInfo withConnectionEndTime(String connectionEndTime) {
        this.connectionEndTime = connectionEndTime;
        return this;
    }

    /**
     * 结束连接时间
     * @return connectionEndTime
     */
    public String getConnectionEndTime() {
        return connectionEndTime;
    }

    public void setConnectionEndTime(String connectionEndTime) {
        this.connectionEndTime = connectionEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MonitorUserOnlineInfo that = (MonitorUserOnlineInfo) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.encodedAuthorizationMessage, that.encodedAuthorizationMessage)
            && Objects.equals(this.connectionSetupTime, that.connectionSetupTime)
            && Objects.equals(this.connectionEndTime, that.connectionEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, encodedAuthorizationMessage, connectionSetupTime, connectionEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonitorUserOnlineInfo {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    encodedAuthorizationMessage: ")
            .append(toIndentedString(encodedAuthorizationMessage))
            .append("\n");
        sb.append("    connectionSetupTime: ").append(toIndentedString(connectionSetupTime)).append("\n");
        sb.append("    connectionEndTime: ").append(toIndentedString(connectionEndTime)).append("\n");
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
