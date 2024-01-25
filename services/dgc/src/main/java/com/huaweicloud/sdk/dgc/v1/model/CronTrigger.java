package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CronTrigger
 */
public class CronTrigger {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expressionTimeZone")

    private String expressionTimeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependPrePeriod")

    private Boolean dependPrePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependJobs")

    private DependJob dependJobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent")

    private Integer concurrent;

    public CronTrigger withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 调度开始时间，采用ISO 8601时间表示方法，格式为yyyy-MM-dd'T'HH:mm:ssZ，例如2018-10-22T23:59:59+08表示的时间为2018年10月22日23时59分59秒，在正8区，即北京时区。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CronTrigger withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 调度结束时间，采用ISO 8601时间表示方法，格式为yyyy-MM-dd'T'HH:mm:ssZ，例如2018-10-22T23:59:59+08表示的时间为2018年10月22日23时59分59秒，在正8区，即北京时区。如果结束时间不配置，作业会按照调度周期一直执行下去。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CronTrigger withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Cron表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public CronTrigger withExpressionTimeZone(String expressionTimeZone) {
        this.expressionTimeZone = expressionTimeZone;
        return this;
    }

    /**
     * 时区
     * @return expressionTimeZone
     */
    public String getExpressionTimeZone() {
        return expressionTimeZone;
    }

    public void setExpressionTimeZone(String expressionTimeZone) {
        this.expressionTimeZone = expressionTimeZone;
    }

    public CronTrigger withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 用于描述运行的间隔时间，格式为时间+时间单位。需要与expression中的表达式对应
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public CronTrigger withDependPrePeriod(Boolean dependPrePeriod) {
        this.dependPrePeriod = dependPrePeriod;
        return this;
    }

    /**
     * 是否依赖本作业上一个运行周期任务的执行结果
     * @return dependPrePeriod
     */
    public Boolean getDependPrePeriod() {
        return dependPrePeriod;
    }

    public void setDependPrePeriod(Boolean dependPrePeriod) {
        this.dependPrePeriod = dependPrePeriod;
    }

    public CronTrigger withDependJobs(DependJob dependJobs) {
        this.dependJobs = dependJobs;
        return this;
    }

    public CronTrigger withDependJobs(Consumer<DependJob> dependJobsSetter) {
        if (this.dependJobs == null) {
            this.dependJobs = new DependJob();
            dependJobsSetter.accept(this.dependJobs);
        }

        return this;
    }

    /**
     * Get dependJobs
     * @return dependJobs
     */
    public DependJob getDependJobs() {
        return dependJobs;
    }

    public void setDependJobs(DependJob dependJobs) {
        this.dependJobs = dependJobs;
    }

    public CronTrigger withConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
        return this;
    }

    /**
     * 并发调用数
     * @return concurrent
     */
    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CronTrigger that = (CronTrigger) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.expressionTimeZone, that.expressionTimeZone)
            && Objects.equals(this.period, that.period) && Objects.equals(this.dependPrePeriod, that.dependPrePeriod)
            && Objects.equals(this.dependJobs, that.dependJobs) && Objects.equals(this.concurrent, that.concurrent);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(startTime, endTime, expression, expressionTimeZone, period, dependPrePeriod, dependJobs, concurrent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CronTrigger {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    expressionTimeZone: ").append(toIndentedString(expressionTimeZone)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    dependPrePeriod: ").append(toIndentedString(dependPrePeriod)).append("\n");
        sb.append("    dependJobs: ").append(toIndentedString(dependJobs)).append("\n");
        sb.append("    concurrent: ").append(toIndentedString(concurrent)).append("\n");
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
