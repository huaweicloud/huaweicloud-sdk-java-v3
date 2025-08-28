package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateTokenPolicyReqBody
 */
public class UpdateTokenPolicyReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_enabled")

    private Boolean tokenEnabled;

    public UpdateTokenPolicyReqBody withTokenEnabled(Boolean tokenEnabled) {
        this.tokenEnabled = tokenEnabled;
        return this;
    }

    /**
     * 是否允许获取Token，默认为true，设置为false后将不允许获取账号下所有身份类型（IAM用户、委托、联邦用户）的Token（联邦认证获取的unscoped token不受Token策略影响）。
     * @return tokenEnabled
     */
    public Boolean getTokenEnabled() {
        return tokenEnabled;
    }

    public void setTokenEnabled(Boolean tokenEnabled) {
        this.tokenEnabled = tokenEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTokenPolicyReqBody that = (UpdateTokenPolicyReqBody) obj;
        return Objects.equals(this.tokenEnabled, that.tokenEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTokenPolicyReqBody {\n");
        sb.append("    tokenEnabled: ").append(toIndentedString(tokenEnabled)).append("\n");
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
