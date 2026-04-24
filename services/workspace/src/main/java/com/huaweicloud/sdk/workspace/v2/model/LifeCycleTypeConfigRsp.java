package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生命周期类型配置响应。
 */
public class LifeCycleTypeConfigRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_wait_time")

    private Integer minWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_wait_time")

    private Integer defaultWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_exec_time")

    private Integer minExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_exec_time")

    private Integer defaultExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_exec_time")

    private Boolean supportExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ActionConfig> actions = null;

    public LifeCycleTypeConfigRsp withMinWaitTime(Integer minWaitTime) {
        this.minWaitTime = minWaitTime;
        return this;
    }

    /**
     * 最小等待时长，单位分钟。
     * @return minWaitTime
     */
    public Integer getMinWaitTime() {
        return minWaitTime;
    }

    public void setMinWaitTime(Integer minWaitTime) {
        this.minWaitTime = minWaitTime;
    }

    public LifeCycleTypeConfigRsp withDefaultWaitTime(Integer defaultWaitTime) {
        this.defaultWaitTime = defaultWaitTime;
        return this;
    }

    /**
     * 默认等待时长，单位分钟。
     * @return defaultWaitTime
     */
    public Integer getDefaultWaitTime() {
        return defaultWaitTime;
    }

    public void setDefaultWaitTime(Integer defaultWaitTime) {
        this.defaultWaitTime = defaultWaitTime;
    }

    public LifeCycleTypeConfigRsp withMinExecTime(Integer minExecTime) {
        this.minExecTime = minExecTime;
        return this;
    }

    /**
     * 最小执行周期，单位分钟。
     * @return minExecTime
     */
    public Integer getMinExecTime() {
        return minExecTime;
    }

    public void setMinExecTime(Integer minExecTime) {
        this.minExecTime = minExecTime;
    }

    public LifeCycleTypeConfigRsp withDefaultExecTime(Integer defaultExecTime) {
        this.defaultExecTime = defaultExecTime;
        return this;
    }

    /**
     * 默认执行周期，单位分钟。
     * @return defaultExecTime
     */
    public Integer getDefaultExecTime() {
        return defaultExecTime;
    }

    public void setDefaultExecTime(Integer defaultExecTime) {
        this.defaultExecTime = defaultExecTime;
    }

    public LifeCycleTypeConfigRsp withSupportExecTime(Boolean supportExecTime) {
        this.supportExecTime = supportExecTime;
        return this;
    }

    /**
     * 是否支持执行周期。
     * @return supportExecTime
     */
    public Boolean getSupportExecTime() {
        return supportExecTime;
    }

    public void setSupportExecTime(Boolean supportExecTime) {
        this.supportExecTime = supportExecTime;
    }

    public LifeCycleTypeConfigRsp withActions(List<ActionConfig> actions) {
        this.actions = actions;
        return this;
    }

    public LifeCycleTypeConfigRsp addActionsItem(ActionConfig actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public LifeCycleTypeConfigRsp withActions(Consumer<List<ActionConfig>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 可执行的动作列表。
     * @return actions
     */
    public List<ActionConfig> getActions() {
        return actions;
    }

    public void setActions(List<ActionConfig> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LifeCycleTypeConfigRsp that = (LifeCycleTypeConfigRsp) obj;
        return Objects.equals(this.minWaitTime, that.minWaitTime)
            && Objects.equals(this.defaultWaitTime, that.defaultWaitTime)
            && Objects.equals(this.minExecTime, that.minExecTime)
            && Objects.equals(this.defaultExecTime, that.defaultExecTime)
            && Objects.equals(this.supportExecTime, that.supportExecTime) && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minWaitTime, defaultWaitTime, minExecTime, defaultExecTime, supportExecTime, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LifeCycleTypeConfigRsp {\n");
        sb.append("    minWaitTime: ").append(toIndentedString(minWaitTime)).append("\n");
        sb.append("    defaultWaitTime: ").append(toIndentedString(defaultWaitTime)).append("\n");
        sb.append("    minExecTime: ").append(toIndentedString(minExecTime)).append("\n");
        sb.append("    defaultExecTime: ").append(toIndentedString(defaultExecTime)).append("\n");
        sb.append("    supportExecTime: ").append(toIndentedString(supportExecTime)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
