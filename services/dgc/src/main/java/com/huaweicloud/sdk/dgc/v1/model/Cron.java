package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Cron
 */
public class Cron {

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
    @JsonProperty(value = "dependPrePeriod")

    private Boolean dependPrePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intervalType")

    private String intervalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependJobs")

    private DependJob dependJobs;

    public Cron withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 调度开始时间，采用ISO 8601时间表示方法，格式为yyyy-MM-dd'T'HH:mm:ssZ，例如2018-10-22T23:59:59+08表示的时间为2018年10月22日23时59分59秒，在正8区，即北京时区
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Cron withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 调度结束时间，采用ISO 8601时间表示方法，格式为yyyy-MM-dd'T'HH:mm:ssZ，例如2018-10-22T23:59:59+08表示的时间为2018年10月22日23时59分59秒，在正8区，即北京时区。如果结束时间不配置，作业会按照调度周期一直执行下去
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Cron withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Cron表达式，格式为\"<秒> <分> <时> <天> <月> <星期>\"
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Cron withExpressionTimeZone(String expressionTimeZone) {
        this.expressionTimeZone = expressionTimeZone;
        return this;
    }

    /**
     * Cron表达式对应的时区信息，例如GMT+8
     * @return expressionTimeZone
     */
    public String getExpressionTimeZone() {
        return expressionTimeZone;
    }

    public void setExpressionTimeZone(String expressionTimeZone) {
        this.expressionTimeZone = expressionTimeZone;
    }

    public Cron withDependPrePeriod(Boolean dependPrePeriod) {
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

    public Cron withIntervalType(String intervalType) {
        this.intervalType = intervalType;
        return this;
    }

    /**
     * 调度间隔类型： - minutes：分钟 - hours：小时 - days：天 - weeks： 周 - months：月 - seasons： 季 - years：年
     * @return intervalType
     */
    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    public Cron withDependJobs(DependJob dependJobs) {
        this.dependJobs = dependJobs;
        return this;
    }

    public Cron withDependJobs(Consumer<DependJob> dependJobsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cron that = (Cron) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.expressionTimeZone, that.expressionTimeZone)
            && Objects.equals(this.dependPrePeriod, that.dependPrePeriod)
            && Objects.equals(this.intervalType, that.intervalType) && Objects.equals(this.dependJobs, that.dependJobs);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(startTime, endTime, expression, expressionTimeZone, dependPrePeriod, intervalType, dependJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cron {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    expressionTimeZone: ").append(toIndentedString(expressionTimeZone)).append("\n");
        sb.append("    dependPrePeriod: ").append(toIndentedString(dependPrePeriod)).append("\n");
        sb.append("    intervalType: ").append(toIndentedString(intervalType)).append("\n");
        sb.append("    dependJobs: ").append(toIndentedString(dependJobs)).append("\n");
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
