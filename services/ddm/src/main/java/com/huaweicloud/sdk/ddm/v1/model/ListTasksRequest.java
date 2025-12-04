package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private BigDecimal startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private BigDecimal endTime;

    public ListTasksRequest withStartTime(BigDecimal startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public BigDecimal getStartTime() {
        return startTime;
    }

    public void setStartTime(BigDecimal startTime) {
        this.startTime = startTime;
    }

    public ListTasksRequest withEndTime(BigDecimal endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 开始时间。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public BigDecimal getEndTime() {
        return endTime;
    }

    public void setEndTime(BigDecimal endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksRequest that = (ListTasksRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
