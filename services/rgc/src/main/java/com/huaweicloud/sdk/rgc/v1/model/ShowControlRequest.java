package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowControlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_id")

    private String controlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")

    private String xSecurityToken;

    public ShowControlRequest withControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    /**
     * 控制策略ID。
     * @return controlId
     */
    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    public ShowControlRequest withXSecurityToken(String xSecurityToken) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowControlRequest that = (ShowControlRequest) obj;
        return Objects.equals(this.controlId, that.controlId)
            && Objects.equals(this.xSecurityToken, that.xSecurityToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlId, xSecurityToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlRequest {\n");
        sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
        sb.append("    xSecurityToken: ").append(toIndentedString(xSecurityToken)).append("\n");
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
