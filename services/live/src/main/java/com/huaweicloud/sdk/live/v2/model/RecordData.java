package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecordData
 */
public class RecordData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent_count")

    private Integer concurrentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public RecordData withConcurrentCount(Integer concurrentCount) {
        this.concurrentCount = concurrentCount;
        return this;
    }

    /**
     * 最大并发路数。
     * minimum: 0
     * maximum: 2147483647
     * @return concurrentCount
     */
    public Integer getConcurrentCount() {
        return concurrentCount;
    }

    public void setConcurrentCount(Integer concurrentCount) {
        this.concurrentCount = concurrentCount;
    }

    public RecordData withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 采样时间，每小时内最大并发路数时间点。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ 。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordData that = (RecordData) obj;
        return Objects.equals(this.concurrentCount, that.concurrentCount) && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(concurrentCount, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordData {\n");
        sb.append("    concurrentCount: ").append(toIndentedString(concurrentCount)).append("\n");
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
