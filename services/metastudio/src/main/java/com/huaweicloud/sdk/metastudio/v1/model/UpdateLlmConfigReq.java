package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改大语言模型配置请求。
 */
public class UpdateLlmConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_url")

    private String llmUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key")

    private String apiKey;

    public UpdateLlmConfigReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 大语言模型配置名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateLlmConfigReq withLlmUrl(String llmUrl) {
        this.llmUrl = llmUrl;
        return this;
    }

    /**
     * 大语言模型地址。
     * @return llmUrl
     */
    public String getLlmUrl() {
        return llmUrl;
    }

    public void setLlmUrl(String llmUrl) {
        this.llmUrl = llmUrl;
    }

    public UpdateLlmConfigReq withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * 密钥。
     * @return apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLlmConfigReq that = (UpdateLlmConfigReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.llmUrl, that.llmUrl)
            && Objects.equals(this.apiKey, that.apiKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, llmUrl, apiKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLlmConfigReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    llmUrl: ").append(toIndentedString(llmUrl)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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
