package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 单个字段的键值对，key为字段名，value为字段值。 **约束限制：** key和value均为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsFineGrainedEvalFieldKV {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public OpsFineGrainedEvalFieldKV withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 字段名，与评估器Prompt模板中的变量名对应。 **约束限制：** 字符长度1到100，同一item内不允许重复。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public OpsFineGrainedEvalFieldKV withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 字段值。 **约束限制：** 字符长度0到10000。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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
        OpsFineGrainedEvalFieldKV that = (OpsFineGrainedEvalFieldKV) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFineGrainedEvalFieldKV {\n");
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
