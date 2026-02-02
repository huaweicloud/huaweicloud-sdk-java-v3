package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建自动扩缩容策略中，规则对象。
 */
public class AutoScalingRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_replicas")

    private Integer targetReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    public AutoScalingRuleReq withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 自动扩缩容规则的名称。支持1-20位字符，只能由小写字母、数字、“-”或“.”组成，且必须由字母或数字开头和结尾。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public AutoScalingRuleReq withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * 在定时类型自动扩缩容策略中，任务运行时间与周期。格式为包含5个域的CRON表达式，5个域分别代表分、小时、日期、月份、星期。需要特别注意的是，对于星期，0表示星期天，1~6表示星期一到星期六。
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public AutoScalingRuleReq withTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
        return this;
    }

    /**
     * 自动扩缩容的目标实例数。
     * minimum: 1
     * maximum: 500
     * @return targetReplicas
     */
    public Integer getTargetReplicas() {
        return targetReplicas;
    }

    public void setTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
    }

    public AutoScalingRuleReq withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * 规则是否禁用。可选值如下： - true：该规则设置禁用状态。 - false：该规则设置启用状态。
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoScalingRuleReq that = (AutoScalingRuleReq) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.schedule, that.schedule)
            && Objects.equals(this.targetReplicas, that.targetReplicas) && Objects.equals(this.disable, that.disable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, schedule, targetReplicas, disable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingRuleReq {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    targetReplicas: ").append(toIndentedString(targetReplicas)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
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
