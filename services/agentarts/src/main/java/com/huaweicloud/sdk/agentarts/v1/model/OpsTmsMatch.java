package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 资源字段匹配条件，用于按资源属性搜索。 key支持resource_name和resource_id。多个match之间为OR关系。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
 */
public class OpsTmsMatch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public OpsTmsMatch withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 匹配字段名。支持以下值： - resource_name：按资源名称前缀模糊匹配（LIKE value%）。value为空字符串时精确匹配空串（多数资源名称非空，返回空列表）。 - resource_id：按资源ID精确匹配。value为空字符串时返回空列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public OpsTmsMatch withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 匹配值。resource_name使用前缀模糊匹配，resource_id使用精确匹配。 **约束限制：** 不涉及。 **取值范围：** 长度0~255个字符。 **默认取值：** 不涉及。
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
        OpsTmsMatch that = (OpsTmsMatch) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTmsMatch {\n");
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
