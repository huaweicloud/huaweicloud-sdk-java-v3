package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * TimeValueData
 */
public class TimeValueData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private Long value;

    public TimeValueData withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 采样时间。日期格式按照ISO8601表示法，并使用UTC时间。格式为YYYY-MM-DDThh:mm:ssZ
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public TimeValueData withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 查询的指标值
     * minimum: 0
     * maximum: 1844674407
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimeValueData timeValueData = (TimeValueData) o;
        return Objects.equals(this.time, timeValueData.time) && Objects.equals(this.value, timeValueData.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeValueData {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
