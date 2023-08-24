package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AuthConfigA
 */
public class AuthConfigA {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config")

    private Object authConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_dynamic")

    private Object authDynamic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info")

    private Map<String, String> authInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_prop")

    private Object authProp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdm_params_config")

    private Object cdmParamsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_config")

    private Object hostConfig;

    public AuthConfigA withAuthConfig(Object authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    /**
     * Get authConfig
     * @return authConfig
     */
    public Object getAuthConfig() {
        return authConfig;
    }

    public void setAuthConfig(Object authConfig) {
        this.authConfig = authConfig;
    }

    public AuthConfigA withAuthDynamic(Object authDynamic) {
        this.authDynamic = authDynamic;
        return this;
    }

    /**
     * Get authDynamic
     * @return authDynamic
     */
    public Object getAuthDynamic() {
        return authDynamic;
    }

    public void setAuthDynamic(Object authDynamic) {
        this.authDynamic = authDynamic;
    }

    public AuthConfigA withAuthInfo(Map<String, String> authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public AuthConfigA putAuthInfoItem(String key, String authInfoItem) {
        if (this.authInfo == null) {
            this.authInfo = new HashMap<>();
        }
        this.authInfo.put(key, authInfoItem);
        return this;
    }

    public AuthConfigA withAuthInfo(Consumer<Map<String, String>> authInfoSetter) {
        if (this.authInfo == null) {
            this.authInfo = new HashMap<>();
        }
        authInfoSetter.accept(this.authInfo);
        return this;
    }

    /**
     * Get authInfo
     * @return authInfo
     */
    public Map<String, String> getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(Map<String, String> authInfo) {
        this.authInfo = authInfo;
    }

    public AuthConfigA withAuthProp(Object authProp) {
        this.authProp = authProp;
        return this;
    }

    /**
     * Get authProp
     * @return authProp
     */
    public Object getAuthProp() {
        return authProp;
    }

    public void setAuthProp(Object authProp) {
        this.authProp = authProp;
    }

    public AuthConfigA withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get authType
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public AuthConfigA withCdmParamsConfig(Object cdmParamsConfig) {
        this.cdmParamsConfig = cdmParamsConfig;
        return this;
    }

    /**
     * Get cdmParamsConfig
     * @return cdmParamsConfig
     */
    public Object getCdmParamsConfig() {
        return cdmParamsConfig;
    }

    public void setCdmParamsConfig(Object cdmParamsConfig) {
        this.cdmParamsConfig = cdmParamsConfig;
    }

    public AuthConfigA withHostConfig(Object hostConfig) {
        this.hostConfig = hostConfig;
        return this;
    }

    /**
     * Get hostConfig
     * @return hostConfig
     */
    public Object getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(Object hostConfig) {
        this.hostConfig = hostConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthConfigA that = (AuthConfigA) obj;
        return Objects.equals(this.authConfig, that.authConfig) && Objects.equals(this.authDynamic, that.authDynamic)
            && Objects.equals(this.authInfo, that.authInfo) && Objects.equals(this.authProp, that.authProp)
            && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.cdmParamsConfig, that.cdmParamsConfig)
            && Objects.equals(this.hostConfig, that.hostConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authConfig, authDynamic, authInfo, authProp, authType, cdmParamsConfig, hostConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthConfigA {\n");
        sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
        sb.append("    authDynamic: ").append(toIndentedString(authDynamic)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    authProp: ").append(toIndentedString(authProp)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    cdmParamsConfig: ").append(toIndentedString(cdmParamsConfig)).append("\n");
        sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
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
