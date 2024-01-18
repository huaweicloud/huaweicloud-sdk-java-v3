package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 科大讯飞AIUI应用配置
 */
public class IflytekAiuiConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_secret")

    private String apiSecret;

    public IflytekAiuiConfig withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * AIUI应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public IflytekAiuiConfig withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * AIUI应用密钥。
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public IflytekAiuiConfig withApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }

    /**
     * AIUI API密钥。
     * @return apiSecret
     */
    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IflytekAiuiConfig that = (IflytekAiuiConfig) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.appKey, that.appKey)
            && Objects.equals(this.apiSecret, that.apiSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, appKey, apiSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IflytekAiuiConfig {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
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
