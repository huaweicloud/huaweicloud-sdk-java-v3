package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePermissionSet请求体
 */
public class UpdatePermissionSetReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relay_state")

    private String relayState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_duration")

    private String sessionDuration;

    public UpdatePermissionSetReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 权限集描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePermissionSetReqBody withRelayState(String relayState) {
        this.relayState = relayState;
        return this;
    }

    /**
     * 用于在联合身份验证过程中重定向应用程序中的用户
     * @return relayState
     */
    public String getRelayState() {
        return relayState;
    }

    public void setRelayState(String relayState) {
        this.relayState = relayState;
    }

    public UpdatePermissionSetReqBody withSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }

    /**
     * 应用程序用户会话在ISO-8601标准中有效的时间长度
     * @return sessionDuration
     */
    public String getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePermissionSetReqBody that = (UpdatePermissionSetReqBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.relayState, that.relayState)
            && Objects.equals(this.sessionDuration, that.sessionDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, relayState, sessionDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePermissionSetReqBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    relayState: ").append(toIndentedString(relayState)).append("\n");
        sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
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
