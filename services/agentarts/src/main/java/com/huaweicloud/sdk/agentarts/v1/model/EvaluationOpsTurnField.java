package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EvaluationOpsTurnField
 */
public class EvaluationOpsTurnField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public EvaluationOpsTurnField withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 数据字段的唯一标识符（键名），代表业务属性。 **约束限制：** 1-100个字符。 **取值范围：** 通常为英文标识，如 instruction, output 等。 **默认取值：** 不涉及。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public EvaluationOpsTurnField withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 字段对应的实际文本内容，存放模型生成或输入的语料。 **约束限制：** 1-10,000个字符。 **取值范围：** 纯文本、Markdown 或转义JSON字符串。 **默认取值：** 不涉及。 
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
        EvaluationOpsTurnField that = (EvaluationOpsTurnField) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsTurnField {\n");
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
