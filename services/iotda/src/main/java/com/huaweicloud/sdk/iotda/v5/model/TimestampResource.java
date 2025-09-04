package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 是否校验设备时间戳，若不为空则表示校验，如果设备连接参数（clientId、username）中包含时间戳建议开启校验。开启校验平台会对比设备携带时间戳与平台系统时间，若设备时间戳加一小时小于平台系统时间则校验失败。若想关闭校验则把value属性的值设置为空json:{}
 */
public class TimestampResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    public TimestampResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * UNIX：表示为Unix时间戳秒级别长整数，FORMAT：表示为特定时间格式，需要在format字段中指定具体格式。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TimestampResource withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * 时间日期格式。
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public TimestampResource withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 设备连接时具体时间戳值，可使用FunctionDefinition下的函数编程时间戳的取值，若想关闭时间戳校验则该字段值设置为空json:{}。
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
        TimestampResource that = (TimestampResource) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.pattern, that.pattern)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, pattern, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimestampResource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
