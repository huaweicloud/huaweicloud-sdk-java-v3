package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SlowSqlTrendItem
 */
public class SlowSqlTrendItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_count")

    private Long slowLogCount;

    public SlowSqlTrendItem withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 毫秒时间戳。表示统计数据的时间范围为timestamp到timestamp + interval_millis。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public SlowSqlTrendItem withSlowLogCount(Long slowLogCount) {
        this.slowLogCount = slowLogCount;
        return this;
    }

    /**
     * 慢SQL数量。
     * @return slowLogCount
     */
    public Long getSlowLogCount() {
        return slowLogCount;
    }

    public void setSlowLogCount(Long slowLogCount) {
        this.slowLogCount = slowLogCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowSqlTrendItem that = (SlowSqlTrendItem) obj;
        return Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.slowLogCount, that.slowLogCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, slowLogCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowSqlTrendItem {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    slowLogCount: ").append(toIndentedString(slowLogCount)).append("\n");
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
