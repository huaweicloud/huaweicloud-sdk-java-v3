package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CloudTable集群OpenTSDB 数据value的Schema配置，用于将通道内的JSON数据进行格式转换生成OpenTSDB 数据的value。
 */
public class OpenTSDBValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public OpenTSDBValue withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 通道内用户JSON数据对应JSON属性的类型名称。  取值范围：  - Bigint - Double - Boolean - Timestamp - String - Decimal
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OpenTSDBValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 常量或通道内用户数据的JSON属性名称。  取值范围：1～32，只能包含英文字母、数字和下划线。
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
        OpenTSDBValue that = (OpenTSDBValue) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenTSDBValue {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
