package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SparkSqlParameter
 */
public class SparkSqlParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private SparkSqlParameterValueType valueType;

    public SparkSqlParameter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**：占位符的键，用于在SQL语句中标识参数位置。例如：SQL语句中的${key}。 **约束限制**：不涉及。 **取值范围**：长度为1~128个字符。 **默认取值**：不涉及。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SparkSqlParameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**：占位符的值，用于替换SQL语句中的占位符。根据value_type的不同，值的格式也不同。 - STRING：字符串，例如：“xxx”。 - DECIMAL：定点数，例如：“12.1”。 - INTEGER：整数，例如：“13”。 - DATE：日期时间戳，例如：“1779188276372”。 - TIMESTAMP：时间戳，例如：“1779188276372”。 **取值范围**：长度为1~512个字符。 **默认取值**：不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SparkSqlParameter withValueType(SparkSqlParameterValueType valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * Get valueType
     * @return valueType
     */
    public SparkSqlParameterValueType getValueType() {
        return valueType;
    }

    public void setValueType(SparkSqlParameterValueType valueType) {
        this.valueType = valueType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkSqlParameter that = (SparkSqlParameter) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.valueType, that.valueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, valueType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlParameter {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
