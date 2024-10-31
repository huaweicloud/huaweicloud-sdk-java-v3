package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * period每日生效时间区间
 */
public class TimeRangeItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "st")

    private Integer st;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Integer end;

    public TimeRangeItem withSt(Integer st) {
        this.st = st;
        return this;
    }

    /**
     * period每日生效时间区间开始
     * minimum: 0
     * maximum: 864000
     * @return st
     */
    public Integer getSt() {
        return st;
    }

    public void setSt(Integer st) {
        this.st = st;
    }

    public TimeRangeItem withEnd(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * period每日生效时间区间结束
     * minimum: 0
     * maximum: 864000
     * @return end
     */
    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeRangeItem that = (TimeRangeItem) obj;
        return Objects.equals(this.st, that.st) && Objects.equals(this.end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(st, end);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeRangeItem {\n");
        sb.append("    st: ").append(toIndentedString(st)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
