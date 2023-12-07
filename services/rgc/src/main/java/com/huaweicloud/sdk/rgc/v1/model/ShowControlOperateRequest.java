package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowControlOperateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")

    private String xSecurityToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_operate_request_id")

    private String controlOperateRequestId;

    public ShowControlOperateRequest withXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
        return this;
    }

    /**
     * 如果正在使用临时安全凭据，则此header是必需的，该值是临时安全凭据的安全令牌（会话令牌）。
     * @return xSecurityToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")
    public String getXSecurityToken() {
        return xSecurityToken;
    }

    public void setXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
    }

    public ShowControlOperateRequest withControlOperateRequestId(String controlOperateRequestId) {
        this.controlOperateRequestId = controlOperateRequestId;
        return this;
    }

    /**
     * 操作控制策略的请求ID。
     * @return controlOperateRequestId
     */
    public String getControlOperateRequestId() {
        return controlOperateRequestId;
    }

    public void setControlOperateRequestId(String controlOperateRequestId) {
        this.controlOperateRequestId = controlOperateRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowControlOperateRequest that = (ShowControlOperateRequest) obj;
        return Objects.equals(this.xSecurityToken, that.xSecurityToken)
            && Objects.equals(this.controlOperateRequestId, that.controlOperateRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSecurityToken, controlOperateRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlOperateRequest {\n");
        sb.append("    xSecurityToken: ").append(toIndentedString(xSecurityToken)).append("\n");
        sb.append("    controlOperateRequestId: ").append(toIndentedString(controlOperateRequestId)).append("\n");
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
