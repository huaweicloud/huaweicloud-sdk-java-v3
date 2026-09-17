package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 键值对配置，用于Header和Query参数。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsThirdPartyAgentKeyValuePair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public OpsThirdPartyAgentKeyValuePair withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 参数名。 **约束限制：** 最大长度100字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public OpsThirdPartyAgentKeyValuePair withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 参数值，支持使用{{变量名}}占位符。 **约束限制：** 最大长度2000字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OpsThirdPartyAgentKeyValuePair withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 参数描述，用于说明该参数的用途。 **约束限制：** 最大长度200字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsThirdPartyAgentKeyValuePair that = (OpsThirdPartyAgentKeyValuePair) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsThirdPartyAgentKeyValuePair {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
