package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实际生效值
 */
public class ConfigItemOverride {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_tag_id")

    private Long envTagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_tag_name")

    private String envTagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ConfigItemOverride withEnvTagId(Long envTagId) {
        this.envTagId = envTagId;
        return this;
    }

    /**
     * 环境标签ID
     * @return envTagId
     */
    public Long getEnvTagId() {
        return envTagId;
    }

    public void setEnvTagId(Long envTagId) {
        this.envTagId = envTagId;
    }

    public ConfigItemOverride withEnvTagName(String envTagName) {
        this.envTagName = envTagName;
        return this;
    }

    /**
     * 环境标签名
     * @return envTagName
     */
    public String getEnvTagName() {
        return envTagName;
    }

    public void setEnvTagName(String envTagName) {
        this.envTagName = envTagName;
    }

    public ConfigItemOverride withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ConfigItemOverride withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigItemOverride that = (ConfigItemOverride) obj;
        return Objects.equals(this.envTagId, that.envTagId) && Objects.equals(this.envTagName, that.envTagName)
            && Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envTagId, envTagName, key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigItemOverride {\n");
        sb.append("    envTagId: ").append(toIndentedString(envTagId)).append("\n");
        sb.append("    envTagName: ").append(toIndentedString(envTagName)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
