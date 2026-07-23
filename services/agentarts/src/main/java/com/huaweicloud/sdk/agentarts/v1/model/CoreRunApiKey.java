package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  API密钥详细配置。 **约束限制**: 不涉及。 **取值范围**： 不涉及。 **默认取值**: 不涉及。
 */
public class CoreRunApiKey {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key")

    private String apiKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key_name")

    private String apiKeyName;

    public CoreRunApiKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * **参数解释**：  API密钥值。轮换期间，可以使用其中任何一个密钥。如果密钥为空，则会生成一个随机字符串。 **约束限制**: 不涉及。 **取值范围**： 长度为 1 - 512 个字符，只包含字母数字、中划线和下划线。 **默认取值**: 不涉及。
     * @return apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public CoreRunApiKey withApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }

    /**
     * **参数解释**：  API密钥名称，该名称仅用于标识该密钥，不用于实际认证。 **约束限制**: 不涉及。 **取值范围**： 长度为 0 - 64 个字符，只包含字母数字、中划线和下划线。 **默认取值**: 不涉及。
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return apiKeyName;
    }

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunApiKey that = (CoreRunApiKey) obj;
        return Objects.equals(this.apiKey, that.apiKey) && Objects.equals(this.apiKeyName, that.apiKeyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKey, apiKeyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunApiKey {\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
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
