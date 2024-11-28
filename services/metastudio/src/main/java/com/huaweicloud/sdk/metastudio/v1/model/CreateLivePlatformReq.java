package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义直播平台创建请求
 */
public class CreateLivePlatformReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config")

    private CustomPlatformAuthConfig authConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_config")

    private List<StandardPlatformApiConfig> callbackConfig = null;

    public CreateLivePlatformReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 直播平台名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateLivePlatformReq withAuthConfig(CustomPlatformAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    public CreateLivePlatformReq withAuthConfig(Consumer<CustomPlatformAuthConfig> authConfigSetter) {
        if (this.authConfig == null) {
            this.authConfig = new CustomPlatformAuthConfig();
            authConfigSetter.accept(this.authConfig);
        }

        return this;
    }

    /**
     * Get authConfig
     * @return authConfig
     */
    public CustomPlatformAuthConfig getAuthConfig() {
        return authConfig;
    }

    public void setAuthConfig(CustomPlatformAuthConfig authConfig) {
        this.authConfig = authConfig;
    }

    public CreateLivePlatformReq withCallbackConfig(List<StandardPlatformApiConfig> callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }

    public CreateLivePlatformReq addCallbackConfigItem(StandardPlatformApiConfig callbackConfigItem) {
        if (this.callbackConfig == null) {
            this.callbackConfig = new ArrayList<>();
        }
        this.callbackConfig.add(callbackConfigItem);
        return this;
    }

    public CreateLivePlatformReq withCallbackConfig(Consumer<List<StandardPlatformApiConfig>> callbackConfigSetter) {
        if (this.callbackConfig == null) {
            this.callbackConfig = new ArrayList<>();
        }
        callbackConfigSetter.accept(this.callbackConfig);
        return this;
    }

    /**
     * 自定义直播平台回调配置。同一种类型仅保留一个配置，如果配置多个会随机保存一个。
     * @return callbackConfig
     */
    public List<StandardPlatformApiConfig> getCallbackConfig() {
        return callbackConfig;
    }

    public void setCallbackConfig(List<StandardPlatformApiConfig> callbackConfig) {
        this.callbackConfig = callbackConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLivePlatformReq that = (CreateLivePlatformReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.authConfig, that.authConfig)
            && Objects.equals(this.callbackConfig, that.callbackConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authConfig, callbackConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLivePlatformReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
        sb.append("    callbackConfig: ").append(toIndentedString(callbackConfig)).append("\n");
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
