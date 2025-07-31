package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataPointInfo
 */
public class DataPointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    public DataPointInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**： 计算出该条告警记录的资源监控数据上报的UTC时间。 **取值范围**： 字符串长度在 1 到 64 之间。 
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public DataPointInfo withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 计算出该条告警记录的资源监控数据在该时间点的监控数值，如：7.019。 **取值范围**： 整数，最小值为0，最大值为1.7976931348623157e+308。 
     * minimum: 0
     * maximum: 1.7976931348623157E+308
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
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
        DataPointInfo that = (DataPointInfo) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataPointInfo {\n");
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
