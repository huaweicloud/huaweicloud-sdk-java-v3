package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchWindow
 */
public class BatchWindow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Integer time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    public BatchWindow withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 批量推送条数[1,10000]
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BatchWindow withTime(Integer time) {
        this.time = time;
        return this;
    }

    /**
     * 重试次数
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public BatchWindow withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 批量推送间隔[0,15](时间：秒)
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchWindow batchWindow = (BatchWindow) o;
        return Objects.equals(this.count, batchWindow.count) && Objects.equals(this.time, batchWindow.time)
            && Objects.equals(this.interval, batchWindow.interval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, time, interval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchWindow {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
