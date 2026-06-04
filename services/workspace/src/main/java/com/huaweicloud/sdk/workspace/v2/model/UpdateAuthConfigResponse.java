package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateAuthConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config_id")

    private String authConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_login_enabled")

    private Boolean smsLoginEnabled;

    public UpdateAuthConfigResponse withAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }

    /**
     * 认证配置ID。
     * @return authConfigId
     */
    public String getAuthConfigId() {
        return authConfigId;
    }

    public void setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
    }

    public UpdateAuthConfigResponse withSmsLoginEnabled(Boolean smsLoginEnabled) {
        this.smsLoginEnabled = smsLoginEnabled;
        return this;
    }

    /**
     * 是否开启短信登录。
     * @return smsLoginEnabled
     */
    public Boolean getSmsLoginEnabled() {
        return smsLoginEnabled;
    }

    public void setSmsLoginEnabled(Boolean smsLoginEnabled) {
        this.smsLoginEnabled = smsLoginEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAuthConfigResponse that = (UpdateAuthConfigResponse) obj;
        return Objects.equals(this.authConfigId, that.authConfigId)
            && Objects.equals(this.smsLoginEnabled, that.smsLoginEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authConfigId, smsLoginEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuthConfigResponse {\n");
        sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
        sb.append("    smsLoginEnabled: ").append(toIndentedString(smsLoginEnabled)).append("\n");
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
