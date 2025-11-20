package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置租户预警个性化配置请求
 */
public class SetTenantNoticeConfigurationReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_msg")

    private Boolean sendMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private String properties;

    public SetTenantNoticeConfigurationReq withType(String type) {
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

    public SetTenantNoticeConfigurationReq withSendMsg(Boolean sendMsg) {
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

    public SetTenantNoticeConfigurationReq withProperties(String properties) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetTenantNoticeConfigurationReq that = (SetTenantNoticeConfigurationReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sendMsg, that.sendMsg)
            && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sendMsg, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetTenantNoticeConfigurationReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sendMsg: ").append(toIndentedString(sendMsg)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
