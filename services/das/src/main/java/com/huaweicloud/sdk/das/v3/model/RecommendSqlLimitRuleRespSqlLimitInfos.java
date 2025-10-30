package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecommendSqlLimitRuleRespSqlLimitInfos
 */
public class RecommendSqlLimitRuleRespSqlLimitInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_sql")

    private RecommendSqlLimitRuleRespRawSql rawSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_time")

    private Double averageTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Double count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTime")

    private Long maxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exe_time")

    private Long exeTime;

    public RecommendSqlLimitRuleRespSqlLimitInfos withRawSql(RecommendSqlLimitRuleRespRawSql rawSql) {
        this.rawSql = rawSql;
        return this;
    }

    public RecommendSqlLimitRuleRespSqlLimitInfos withRawSql(Consumer<RecommendSqlLimitRuleRespRawSql> rawSqlSetter) {
        if (this.rawSql == null) {
            this.rawSql = new RecommendSqlLimitRuleRespRawSql();
            rawSqlSetter.accept(this.rawSql);
        }

        return this;
    }

    /**
     * Get rawSql
     * @return rawSql
     */
    public RecommendSqlLimitRuleRespRawSql getRawSql() {
        return rawSql;
    }

    public void setRawSql(RecommendSqlLimitRuleRespRawSql rawSql) {
        this.rawSql = rawSql;
    }

    public RecommendSqlLimitRuleRespSqlLimitInfos withAverageTime(Double averageTime) {
        this.averageTime = averageTime;
        return this;
    }

    /**
     * 平均时间
     * @return averageTime
     */
    public Double getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(Double averageTime) {
        this.averageTime = averageTime;
    }

    public RecommendSqlLimitRuleRespSqlLimitInfos withCount(Double count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public RecommendSqlLimitRuleRespSqlLimitInfos withMaxTime(Long maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    /**
     * mysql 提供， taurus不提供
     * @return maxTime
     */
    public Long getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Long maxTime) {
        this.maxTime = maxTime;
    }

    public RecommendSqlLimitRuleRespSqlLimitInfos withExeTime(Long exeTime) {
        this.exeTime = exeTime;
        return this;
    }

    /**
     * 执行时间
     * @return exeTime
     */
    public Long getExeTime() {
        return exeTime;
    }

    public void setExeTime(Long exeTime) {
        this.exeTime = exeTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecommendSqlLimitRuleRespSqlLimitInfos that = (RecommendSqlLimitRuleRespSqlLimitInfos) obj;
        return Objects.equals(this.rawSql, that.rawSql) && Objects.equals(this.averageTime, that.averageTime)
            && Objects.equals(this.count, that.count) && Objects.equals(this.maxTime, that.maxTime)
            && Objects.equals(this.exeTime, that.exeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rawSql, averageTime, count, maxTime, exeTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecommendSqlLimitRuleRespSqlLimitInfos {\n");
        sb.append("    rawSql: ").append(toIndentedString(rawSql)).append("\n");
        sb.append("    averageTime: ").append(toIndentedString(averageTime)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
        sb.append("    exeTime: ").append(toIndentedString(exeTime)).append("\n");
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
