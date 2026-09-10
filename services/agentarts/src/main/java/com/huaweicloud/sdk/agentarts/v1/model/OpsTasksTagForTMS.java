package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpsTasksTagForTMS
 */
public class OpsTasksTagForTMS {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public OpsTasksTagForTMS withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 标签键，标识资源的分类维度。  **约束限制：** 不能为空或者空字符串，不能为空格，校验和使用之前先trim前后半角空格。最大长度128个unicode字符。  **取值范围：** 最大长度128个unicode字符。  **默认取值：** 无
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public OpsTasksTagForTMS withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 标签值，具体的分类值。  **约束限制：** 不校验字符集范围。  **取值范围：** 不校验字符集范围。每个值最大长度255个unicode字符。  **默认取值：** 无
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
        OpsTasksTagForTMS that = (OpsTasksTagForTMS) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTasksTagForTMS {\n");
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
