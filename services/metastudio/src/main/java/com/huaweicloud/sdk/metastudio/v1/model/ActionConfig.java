package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 动作编排配置。
 */
public class ActionConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_interval")

    private Float actionInterval;

    public ActionConfig withActionInterval(Float actionInterval) {
        this.actionInterval = actionInterval;
        return this;
    }

    /**
     * 算法自动插入无语义动作的时间间隔。这个参数填0或者不填默认是间隔4秒，设置成255时不自动插入无语义动作。
     * minimum: 0
     * maximum: 255
     * @return actionInterval
     */
    public Float getActionInterval() {
        return actionInterval;
    }

    public void setActionInterval(Float actionInterval) {
        this.actionInterval = actionInterval;
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
        return Objects.equals(this.actionInterval, that.actionInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionConfig {\n");
        sb.append("    actionInterval: ").append(toIndentedString(actionInterval)).append("\n");
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
