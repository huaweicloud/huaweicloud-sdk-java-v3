package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * TrafficData
 */
public class TrafficData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private Long value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    public TrafficData withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 采样值，单位为byte。
     * minimum: 0
     * maximum: -1
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public TrafficData withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 采样时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrafficData trafficData = (TrafficData) o;
        return Objects.equals(this.value, trafficData.value) && Objects.equals(this.time, trafficData.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficData {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
