package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IM 通道配置
 */
public class ImChannelConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_specific")

    private Map<String, String> platformSpecific = null;

    public ImChannelConfig withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * IM 平台类型：wecom / feishu / dingtalk-connector
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ImChannelConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ImChannelConfig withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端 ID
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ImChannelConfig withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * 客户端密钥
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public ImChannelConfig withPlatformSpecific(Map<String, String> platformSpecific) {
        this.platformSpecific = platformSpecific;
        return this;
    }

    public ImChannelConfig putPlatformSpecificItem(String key, String platformSpecificItem) {
        if (this.platformSpecific == null) {
            this.platformSpecific = new HashMap<>();
        }
        this.platformSpecific.put(key, platformSpecificItem);
        return this;
    }

    public ImChannelConfig withPlatformSpecific(Consumer<Map<String, String>> platformSpecificSetter) {
        if (this.platformSpecific == null) {
            this.platformSpecific = new HashMap<>();
        }
        platformSpecificSetter.accept(this.platformSpecific);
        return this;
    }

    /**
     * 平台扩展配置
     * @return platformSpecific
     */
    public Map<String, String> getPlatformSpecific() {
        return platformSpecific;
    }

    public void setPlatformSpecific(Map<String, String> platformSpecific) {
        this.platformSpecific = platformSpecific;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImChannelConfig that = (ImChannelConfig) obj;
        return Objects.equals(this.platform, that.platform) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.clientId, that.clientId) && Objects.equals(this.clientSecret, that.clientSecret)
            && Objects.equals(this.platformSpecific, that.platformSpecific);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform, enabled, clientId, clientSecret, platformSpecific);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImChannelConfig {\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    platformSpecific: ").append(toIndentedString(platformSpecific)).append("\n");
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
