package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Cron
 */
public class Cron {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    @JacksonXmlProperty(localName = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    @JacksonXmlProperty(localName = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    @JacksonXmlProperty(localName = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependPrePeriod")

    @JacksonXmlProperty(localName = "dependPrePeriod")

    private Boolean dependPrePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependJobs")

    @JacksonXmlProperty(localName = "dependJobs")

    private List<DependJob> dependJobs = null;

    public Cron withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
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
     * Get endTime
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
     * Cron表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
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

    public Cron withDependJobs(List<DependJob> dependJobs) {
        this.dependJobs = dependJobs;
        return this;
    }

    public Cron addDependJobsItem(DependJob dependJobsItem) {
        if (this.dependJobs == null) {
            this.dependJobs = new ArrayList<>();
        }
        this.dependJobs.add(dependJobsItem);
        return this;
    }

    public Cron withDependJobs(Consumer<List<DependJob>> dependJobsSetter) {
        if (this.dependJobs == null) {
            this.dependJobs = new ArrayList<>();
        }
        dependJobsSetter.accept(this.dependJobs);
        return this;
    }

    /**
     * 依赖其它作业列表
     * @return dependJobs
     */
    public List<DependJob> getDependJobs() {
        return dependJobs;
    }

    public void setDependJobs(List<DependJob> dependJobs) {
        this.dependJobs = dependJobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cron cron = (Cron) o;
        return Objects.equals(this.startTime, cron.startTime) && Objects.equals(this.endTime, cron.endTime)
            && Objects.equals(this.expression, cron.expression)
            && Objects.equals(this.dependPrePeriod, cron.dependPrePeriod)
            && Objects.equals(this.dependJobs, cron.dependJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, expression, dependPrePeriod, dependJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cron {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    dependPrePeriod: ").append(toIndentedString(dependPrePeriod)).append("\n");
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
