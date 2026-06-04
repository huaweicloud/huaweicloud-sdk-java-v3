package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 增量更新认证配置请求。
 */
public class UpdateAuthConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_login_enabled")

    private Boolean smsLoginEnabled;

    public UpdateAuthConfigReq withSmsLoginEnabled(Boolean smsLoginEnabled) {
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
        UpdateAuthConfigReq that = (UpdateAuthConfigReq) obj;
        return Objects.equals(this.smsLoginEnabled, that.smsLoginEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smsLoginEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuthConfigReq {\n");
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
