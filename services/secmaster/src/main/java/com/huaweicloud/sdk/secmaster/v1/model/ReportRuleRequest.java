package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建报告发送规则请求体
 */
public class ReportRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private String rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_end")

    private String ruleEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private ReportRuleRequestStartTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private ReportRuleRequestEndTime endTime;

    public ReportRuleRequest withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * 报告发送任务cron表达式
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public ReportRuleRequest withRuleEnd(String ruleEnd) {
        this.ruleEnd = ruleEnd;
        return this;
    }

    /**
     * 报告发送任务启动截止时间
     * @return ruleEnd
     */
    public String getRuleEnd() {
        return ruleEnd;
    }

    public void setRuleEnd(String ruleEnd) {
        this.ruleEnd = ruleEnd;
    }

    public ReportRuleRequest withStartTime(ReportRuleRequestStartTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public ReportRuleRequest withStartTime(Consumer<ReportRuleRequestStartTime> startTimeSetter) {
        if (this.startTime == null) {
            this.startTime = new ReportRuleRequestStartTime();
            startTimeSetter.accept(this.startTime);
        }

        return this;
    }

    /**
     * Get startTime
     * @return startTime
     */
    public ReportRuleRequestStartTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ReportRuleRequestStartTime startTime) {
        this.startTime = startTime;
    }

    public ReportRuleRequest withEndTime(ReportRuleRequestEndTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public ReportRuleRequest withEndTime(Consumer<ReportRuleRequestEndTime> endTimeSetter) {
        if (this.endTime == null) {
            this.endTime = new ReportRuleRequestEndTime();
            endTimeSetter.accept(this.endTime);
        }

        return this;
    }

    /**
     * Get endTime
     * @return endTime
     */
    public ReportRuleRequestEndTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ReportRuleRequestEndTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportRuleRequest that = (ReportRuleRequest) obj;
        return Objects.equals(this.rule, that.rule) && Objects.equals(this.ruleEnd, that.ruleEnd)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule, ruleEnd, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportRuleRequest {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    ruleEnd: ").append(toIndentedString(ruleEnd)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
