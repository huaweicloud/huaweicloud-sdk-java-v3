package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 缺失索引趋势点
 */
public class MissingIndexTrendPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_missing_index_count")

    private Long totalMissingIndexCount;

    public MissingIndexTrendPoint withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public MissingIndexTrendPoint withTotalMissingIndexCount(Long totalMissingIndexCount) {
        this.totalMissingIndexCount = totalMissingIndexCount;
        return this;
    }

    /**
     * 索引缺失总数
     * @return totalMissingIndexCount
     */
    public Long getTotalMissingIndexCount() {
        return totalMissingIndexCount;
    }

    public void setTotalMissingIndexCount(Long totalMissingIndexCount) {
        this.totalMissingIndexCount = totalMissingIndexCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MissingIndexTrendPoint that = (MissingIndexTrendPoint) obj;
        return Objects.equals(this.collectTime, that.collectTime)
            && Objects.equals(this.totalMissingIndexCount, that.totalMissingIndexCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectTime, totalMissingIndexCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MissingIndexTrendPoint {\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    totalMissingIndexCount: ").append(toIndentedString(totalMissingIndexCount)).append("\n");
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
