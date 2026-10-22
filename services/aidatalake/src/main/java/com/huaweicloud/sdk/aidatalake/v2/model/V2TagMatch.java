package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：搜索字段，key为要匹配的字段，如resource_name等。value为匹配的值。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
 */
public class V2TagMatch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public V2TagMatch withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**：固定字典值。 **约束限制**：不涉及。 **取值范围**：resource_name，表示资源名称。 **默认取值**：不涉及。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public V2TagMatch withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**：基于“key”对应字段的前缀匹配值。 **约束限制**：最大255个字符。 **取值范围**：不涉及。 **默认取值**：不涉及。 
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
        V2TagMatch that = (V2TagMatch) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2TagMatch {\n");
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
