package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLivePlatformResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_id")

    private String platformId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private AccessTypeEnum accessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_info")

    private PlatformAuthorizationInfo authorizationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config")

    private CustomPlatformAuthConfig authConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_config")

    private List<StandardPlatformApiConfig> callbackConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowLivePlatformResponse withPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }

    /**
     * 平台ID
     * @return platformId
     */
    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public ShowLivePlatformResponse withAccessType(AccessTypeEnum accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * Get accessType
     * @return accessType
     */
    public AccessTypeEnum getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessTypeEnum accessType) {
        this.accessType = accessType;
    }

    public ShowLivePlatformResponse withName(String name) {
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

    public ShowLivePlatformResponse withAuthorizationInfo(PlatformAuthorizationInfo authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
        return this;
    }

    public ShowLivePlatformResponse withAuthorizationInfo(Consumer<PlatformAuthorizationInfo> authorizationInfoSetter) {
        if (this.authorizationInfo == null) {
            this.authorizationInfo = new PlatformAuthorizationInfo();
            authorizationInfoSetter.accept(this.authorizationInfo);
        }

        return this;
    }

    /**
     * Get authorizationInfo
     * @return authorizationInfo
     */
    public PlatformAuthorizationInfo getAuthorizationInfo() {
        return authorizationInfo;
    }

    public void setAuthorizationInfo(PlatformAuthorizationInfo authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
    }

    public ShowLivePlatformResponse withAuthConfig(CustomPlatformAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    public ShowLivePlatformResponse withAuthConfig(Consumer<CustomPlatformAuthConfig> authConfigSetter) {
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

    public ShowLivePlatformResponse withCallbackConfig(List<StandardPlatformApiConfig> callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }

    public ShowLivePlatformResponse addCallbackConfigItem(StandardPlatformApiConfig callbackConfigItem) {
        if (this.callbackConfig == null) {
            this.callbackConfig = new ArrayList<>();
        }
        this.callbackConfig.add(callbackConfigItem);
        return this;
    }

    public ShowLivePlatformResponse withCallbackConfig(Consumer<List<StandardPlatformApiConfig>> callbackConfigSetter) {
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

    public ShowLivePlatformResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLivePlatformResponse that = (ShowLivePlatformResponse) obj;
        return Objects.equals(this.platformId, that.platformId) && Objects.equals(this.accessType, that.accessType)
            && Objects.equals(this.name, that.name) && Objects.equals(this.authorizationInfo, that.authorizationInfo)
            && Objects.equals(this.authConfig, that.authConfig)
            && Objects.equals(this.callbackConfig, that.callbackConfig)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformId, accessType, name, authorizationInfo, authConfig, callbackConfig, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLivePlatformResponse {\n");
        sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    authorizationInfo: ").append(toIndentedString(authorizationInfo)).append("\n");
        sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
        sb.append("    callbackConfig: ").append(toIndentedString(callbackConfig)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
