package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 动作配置。
 */
public class ActionConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

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

    public ActionConfig withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 动作名称。STOP：关机，HIBERNATE：休眠，REBOOT：重启，EXECUTE_SCRIPT：执行脚本。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ActionConfig withMinWaitTime(Integer minWaitTime) {
        this.minWaitTime = minWaitTime;
        return this;
    }

    /**
     * 最小等待时长，单位分钟。如果不填，则使用父级的 min_wait_time。
     * @return minWaitTime
     */
    public Integer getMinWaitTime() {
        return minWaitTime;
    }

    public void setMinWaitTime(Integer minWaitTime) {
        this.minWaitTime = minWaitTime;
    }

    public ActionConfig withDefaultWaitTime(Integer defaultWaitTime) {
        this.defaultWaitTime = defaultWaitTime;
        return this;
    }

    /**
     * 默认等待时长，单位分钟。如果不填，则使用父级的 default_wait_time。
     * @return defaultWaitTime
     */
    public Integer getDefaultWaitTime() {
        return defaultWaitTime;
    }

    public void setDefaultWaitTime(Integer defaultWaitTime) {
        this.defaultWaitTime = defaultWaitTime;
    }

    public ActionConfig withMinExecTime(Integer minExecTime) {
        this.minExecTime = minExecTime;
        return this;
    }

    /**
     * 最小执行周期，单位分钟。如果不填，则使用父级的 min_exec_time。
     * @return minExecTime
     */
    public Integer getMinExecTime() {
        return minExecTime;
    }

    public void setMinExecTime(Integer minExecTime) {
        this.minExecTime = minExecTime;
    }

    public ActionConfig withDefaultExecTime(Integer defaultExecTime) {
        this.defaultExecTime = defaultExecTime;
        return this;
    }

    /**
     * 默认执行周期，单位分钟。如果不填，则使用父级的 default_exec_time。
     * @return defaultExecTime
     */
    public Integer getDefaultExecTime() {
        return defaultExecTime;
    }

    public void setDefaultExecTime(Integer defaultExecTime) {
        this.defaultExecTime = defaultExecTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionConfig that = (ActionConfig) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.minWaitTime, that.minWaitTime)
            && Objects.equals(this.defaultWaitTime, that.defaultWaitTime)
            && Objects.equals(this.minExecTime, that.minExecTime)
            && Objects.equals(this.defaultExecTime, that.defaultExecTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, minWaitTime, defaultWaitTime, minExecTime, defaultExecTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionConfig {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    minWaitTime: ").append(toIndentedString(minWaitTime)).append("\n");
        sb.append("    defaultWaitTime: ").append(toIndentedString(defaultWaitTime)).append("\n");
        sb.append("    minExecTime: ").append(toIndentedString(minExecTime)).append("\n");
        sb.append("    defaultExecTime: ").append(toIndentedString(defaultExecTime)).append("\n");
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
