package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StatisticsDetail
 */
public class StatisticsDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private CountDetail count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public StatisticsDetail withCount(CountDetail count) {
        this.count = count;
        return this;
    }

    public StatisticsDetail withCount(Consumer<CountDetail> countSetter) {
        if (this.count == null) {
            this.count = new CountDetail();
            countSetter.accept(this.count);
        }

        return this;
    }

    /**
     * Get count
     * @return count
     */
    public CountDetail getCount() {
        return count;
    }

    public void setCount(CountDetail count) {
        this.count = count;
    }

    public StatisticsDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticsDetail that = (StatisticsDetail) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticsDetail {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
