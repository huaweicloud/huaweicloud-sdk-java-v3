package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTenantNoticeConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_msg")

    private Boolean sendMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private String properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowTenantNoticeConfigurationResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 通知类型。 * RESOURCE_EXPIRE：资源过期通知 * RESOURCE_LEFT：资源剩余量通知
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowTenantNoticeConfigurationResponse withSendMsg(Boolean sendMsg) {
        this.sendMsg = sendMsg;
        return this;
    }

    /**
     * 是否发送短信。
     * @return sendMsg
     */
    public Boolean getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(Boolean sendMsg) {
        this.sendMsg = sendMsg;
    }

    public ShowTenantNoticeConfigurationResponse withProperties(String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * 通知配置项
     * @return properties
     */
    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public ShowTenantNoticeConfigurationResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTenantNoticeConfigurationResponse that = (ShowTenantNoticeConfigurationResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sendMsg, that.sendMsg)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sendMsg, properties, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantNoticeConfigurationResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sendMsg: ").append(toIndentedString(sendMsg)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
