package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDetailsOfAiApiKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_api_key_id")

    private String aiApiKeyId;

    public ShowDetailsOfAiApiKeyRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowDetailsOfAiApiKeyRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 凭据编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowDetailsOfAiApiKeyRequest withAiApiKeyId(String aiApiKeyId) {
        this.aiApiKeyId = aiApiKeyId;
        return this;
    }

    /**
     * AIAPIKey编号。
     * @return aiApiKeyId
     */
    public String getAiApiKeyId() {
        return aiApiKeyId;
    }

    public void setAiApiKeyId(String aiApiKeyId) {
        this.aiApiKeyId = aiApiKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDetailsOfAiApiKeyRequest that = (ShowDetailsOfAiApiKeyRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.aiApiKeyId, that.aiApiKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appId, aiApiKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfAiApiKeyRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    aiApiKeyId: ").append(toIndentedString(aiApiKeyId)).append("\n");
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
