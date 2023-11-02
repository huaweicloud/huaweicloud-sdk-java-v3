package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScalingHistory
 */
public class ScalingHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private String rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_before_scale")

    private Integer countBeforeScale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_after_scale")

    private Integer countAfterScale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public ScalingHistory withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * 策略规则
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public ScalingHistory withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 执行动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ScalingHistory withCountBeforeScale(Integer countBeforeScale) {
        this.countBeforeScale = countBeforeScale;
        return this;
    }

    /**
     * 伸缩前节点数
     * @return countBeforeScale
     */
    public Integer getCountBeforeScale() {
        return countBeforeScale;
    }

    public void setCountBeforeScale(Integer countBeforeScale) {
        this.countBeforeScale = countBeforeScale;
    }

    public ScalingHistory withCountAfterScale(Integer countAfterScale) {
        this.countAfterScale = countAfterScale;
        return this;
    }

    /**
     * 伸缩后节点数
     * @return countAfterScale
     */
    public Integer getCountAfterScale() {
        return countAfterScale;
    }

    public void setCountAfterScale(Integer countAfterScale) {
        this.countAfterScale = countAfterScale;
    }

    public ScalingHistory withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 执行状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ScalingHistory withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 执行时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScalingHistory that = (ScalingHistory) obj;
        return Objects.equals(this.rule, that.rule) && Objects.equals(this.action, that.action)
            && Objects.equals(this.countBeforeScale, that.countBeforeScale)
            && Objects.equals(this.countAfterScale, that.countAfterScale) && Objects.equals(this.state, that.state)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule, action, countBeforeScale, countAfterScale, state, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingHistory {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    countBeforeScale: ").append(toIndentedString(countBeforeScale)).append("\n");
        sb.append("    countAfterScale: ").append(toIndentedString(countAfterScale)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
