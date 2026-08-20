package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SQL脚本占位符参数，用于配置SQL脚本中的参数化变量。 
 */
public class SparkJobSqlScriptParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private SparkSqlParameterValueType valueType;

    public SparkJobSqlScriptParameter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**：占位符的键，用于标识SQL脚本中的参数名称。 **取值范围**：长度为1~128个字符。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SparkJobSqlScriptParameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**：占位符的值，用于传递给SQL脚本的实际参数值。不同类型的数据格式如下： - STRING：字符串，例如：“xxx”。 - DECIMAL：定点数，例如：“12.1”。 - INTEGER：整数，例如：“13”。 - DATE：日期时间戳，例如：“1779188276372”。 - TIMESTAMP：时间戳，例如：“1779188276372”。 **取值范围**：长度为1~512个字符。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SparkJobSqlScriptParameter withValueType(SparkSqlParameterValueType valueType) {
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
        SparkJobSqlScriptParameter that = (SparkJobSqlScriptParameter) obj;
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
        sb.append("class SparkJobSqlScriptParameter {\n");
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
