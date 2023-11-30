package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CloudTable集群OpenTSDB 数据timestamp的Schema配置，用于将通道内的JSON数据进行格式转换生成OpenTSDB数据的timestamp。
 */
public class OpenTSDBTimestamp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    public OpenTSDBTimestamp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * - Timestamp类型表示通道内用户数据对应JSON属性的取值为Timestamp类型，不需要进行数据格式转换就可以生成OpenTSDB的timestamp。 - String类型表示通道内用户数据对应JSON属性的取值为Date格式，需要进行数据格式转换才能生成OpenTSDB的timestamp。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OpenTSDBTimestamp withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 通道内用户数据的JSON属性名称。  取值范围：1～32，只能包含英文字母、数字和下划线。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OpenTSDBTimestamp withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * “type”为“String”类型时必选。表示通道内用户数据对应JSON属性的取值为Date格式，需要根据format字段进行数据格式转换生成OpenTSDB的timestamp。  取值范围：  - yyyy/MM/dd HH:mm:ss - MM/dd/yyyy HH:mm:ss - dd/MM/yyyy HH:mm:ss - yyyy-MM-dd HH:mm:ss - MM-dd-yyyy HH:mm:ss - dd-MM-yyyy HH:mm:ss
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenTSDBTimestamp that = (OpenTSDBTimestamp) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value)
            && Objects.equals(this.format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, format);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenTSDBTimestamp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
