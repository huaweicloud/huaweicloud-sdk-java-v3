package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流量回放SQL的执行记录
 */
public class ReplayExecuteRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private Long executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_sql")

    private Long finishedSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_sql")

    private Long abnormalSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql")

    private Long slowSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_sql")

    private Long totalSql;

    public ReplayExecuteRecords withExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * 执行记录的时间，格式为秒级时间戳。
     * @return executeTime
     */
    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }

    public ReplayExecuteRecords withFinishedSql(Long finishedSql) {
        this.finishedSql = finishedSql;
        return this;
    }

    /**
     * 执行完的SQL数量。
     * @return finishedSql
     */
    public Long getFinishedSql() {
        return finishedSql;
    }

    public void setFinishedSql(Long finishedSql) {
        this.finishedSql = finishedSql;
    }

    public ReplayExecuteRecords withAbnormalSql(Long abnormalSql) {
        this.abnormalSql = abnormalSql;
        return this;
    }

    /**
     * 执行的异常SQL数量。
     * @return abnormalSql
     */
    public Long getAbnormalSql() {
        return abnormalSql;
    }

    public void setAbnormalSql(Long abnormalSql) {
        this.abnormalSql = abnormalSql;
    }

    public ReplayExecuteRecords withSlowSql(Long slowSql) {
        this.slowSql = slowSql;
        return this;
    }

    /**
     * 执行的慢SQL数量。
     * @return slowSql
     */
    public Long getSlowSql() {
        return slowSql;
    }

    public void setSlowSql(Long slowSql) {
        this.slowSql = slowSql;
    }

    public ReplayExecuteRecords withTotalSql(Long totalSql) {
        this.totalSql = totalSql;
        return this;
    }

    /**
     * 执行记录的SQL总数。
     * @return totalSql
     */
    public Long getTotalSql() {
        return totalSql;
    }

    public void setTotalSql(Long totalSql) {
        this.totalSql = totalSql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplayExecuteRecords that = (ReplayExecuteRecords) obj;
        return Objects.equals(this.executeTime, that.executeTime) && Objects.equals(this.finishedSql, that.finishedSql)
            && Objects.equals(this.abnormalSql, that.abnormalSql) && Objects.equals(this.slowSql, that.slowSql)
            && Objects.equals(this.totalSql, that.totalSql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeTime, finishedSql, abnormalSql, slowSql, totalSql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayExecuteRecords {\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    finishedSql: ").append(toIndentedString(finishedSql)).append("\n");
        sb.append("    abnormalSql: ").append(toIndentedString(abnormalSql)).append("\n");
        sb.append("    slowSql: ").append(toIndentedString(slowSql)).append("\n");
        sb.append("    totalSql: ").append(toIndentedString(totalSql)).append("\n");
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
