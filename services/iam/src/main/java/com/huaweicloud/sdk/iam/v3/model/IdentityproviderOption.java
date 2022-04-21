package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class IdentityproviderOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sso_type")

    private String ssoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public IdentityproviderOption withSsoType(String ssoType) {
        this.ssoType = ssoType;
        return this;
    }

    /**
     * 身份提供商类型。当前支持virtual_user_sso和iam_user_sso两种，缺省配置默认为virtual_user_sso类型。
     * @return ssoType
     */
    public String getSsoType() {
        return ssoType;
    }

    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    public IdentityproviderOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 身份提供商描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IdentityproviderOption withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 身份提供商是否启用，true为启用，false为停用，默认为false。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityproviderOption identityproviderOption = (IdentityproviderOption) o;
        return Objects.equals(this.ssoType, identityproviderOption.ssoType)
            && Objects.equals(this.description, identityproviderOption.description)
            && Objects.equals(this.enabled, identityproviderOption.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssoType, description, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityproviderOption {\n");
        sb.append("    ssoType: ").append(toIndentedString(ssoType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
