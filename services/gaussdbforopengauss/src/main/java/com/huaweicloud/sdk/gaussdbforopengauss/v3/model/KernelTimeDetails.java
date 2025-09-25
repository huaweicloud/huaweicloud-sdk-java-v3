package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内核耗时详细信息
 */
public class KernelTimeDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parse_time")

    private Long parseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_time")

    private Long rewriteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_time")

    private Long planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Long executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_time")

    private Long otherTime;

    public KernelTimeDetails withParseTime(Long parseTime) {
        this.parseTime = parseTime;
        return this;
    }

    /**
     * **参数解释**: SQL解析时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return parseTime
     */
    public Long getParseTime() {
        return parseTime;
    }

    public void setParseTime(Long parseTime) {
        this.parseTime = parseTime;
    }

    public KernelTimeDetails withRewriteTime(Long rewriteTime) {
        this.rewriteTime = rewriteTime;
        return this;
    }

    /**
     * **参数解释**: SQL重写时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return rewriteTime
     */
    public Long getRewriteTime() {
        return rewriteTime;
    }

    public void setRewriteTime(Long rewriteTime) {
        this.rewriteTime = rewriteTime;
    }

    public KernelTimeDetails withPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * **参数解释**: SQL生成计划时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return planTime
     */
    public Long getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public KernelTimeDetails withExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * **参数解释**: 执行器内执行时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return executionTime
     */
    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public KernelTimeDetails withOtherTime(Long otherTime) {
        this.otherTime = otherTime;
        return this;
    }

    /**
     * **参数解释**: 其余耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return otherTime
     */
    public Long getOtherTime() {
        return otherTime;
    }

    public void setOtherTime(Long otherTime) {
        this.otherTime = otherTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KernelTimeDetails that = (KernelTimeDetails) obj;
        return Objects.equals(this.parseTime, that.parseTime) && Objects.equals(this.rewriteTime, that.rewriteTime)
            && Objects.equals(this.planTime, that.planTime) && Objects.equals(this.executionTime, that.executionTime)
            && Objects.equals(this.otherTime, that.otherTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parseTime, rewriteTime, planTime, executionTime, otherTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KernelTimeDetails {\n");
        sb.append("    parseTime: ").append(toIndentedString(parseTime)).append("\n");
        sb.append("    rewriteTime: ").append(toIndentedString(rewriteTime)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    otherTime: ").append(toIndentedString(otherTime)).append("\n");
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
