package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AiApiKeyCreate
 */
public class AiApiKeyCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_api_key")

    private String aiApiKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    public AiApiKeyCreate withAiApiKey(String aiApiKey) {
        this.aiApiKey = aiApiKey;
        return this;
    }

    /**
     * AIAPIKey值，不指定具体值时，由后台自动生成随机字符串。 支持大小写英文字母、数字，以及+-_/=特殊字符，长度为8~128个字符。 
     * @return aiApiKey
     */
    public String getAiApiKey() {
        return aiApiKey;
    }

    public void setAiApiKey(String aiApiKey) {
        this.aiApiKey = aiApiKey;
    }

    public AiApiKeyCreate withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * AIAPIKey的别名。支持大小写字母，数字，下划线，中划线，长度为1~100个字符。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiApiKeyCreate that = (AiApiKeyCreate) obj;
        return Objects.equals(this.aiApiKey, that.aiApiKey) && Objects.equals(this.alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiApiKey, alias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiApiKeyCreate {\n");
        sb.append("    aiApiKey: ").append(toIndentedString(aiApiKey)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
