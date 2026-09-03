package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行时间趋势项
 */
public class ExTimeTrendItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_at")

    private Long executeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private Double executeTime;

    public ExTimeTrendItem withExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
        return this;
    }

    /**
     * SQL执行的时间点
     * @return executeAt
     */
    public Long getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
    }

    public ExTimeTrendItem withExecuteTime(Double executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * SQL执行耗时
     * @return executeTime
     */
    public Double getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Double executeTime) {
        this.executeTime = executeTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExTimeTrendItem that = (ExTimeTrendItem) obj;
        return Objects.equals(this.executeAt, that.executeAt) && Objects.equals(this.executeTime, that.executeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeAt, executeTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExTimeTrendItem {\n");
        sb.append("    executeAt: ").append(toIndentedString(executeAt)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
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
