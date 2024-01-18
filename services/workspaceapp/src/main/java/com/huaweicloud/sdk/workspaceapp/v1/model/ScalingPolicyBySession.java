package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 基于会话的弹性策略。
 */
public class ScalingPolicyBySession {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_usage_threshold")

    private Integer sessionUsageThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shrink_after_session_idle_minutes")

    private Integer shrinkAfterSessionIdleMinutes;

    public ScalingPolicyBySession withSessionUsageThreshold(Integer sessionUsageThreshold) {
        this.sessionUsageThreshold = sessionUsageThreshold;
        return this;
    }

    /**
     * 分组的总会话使用率(达到改阈值后扩容)。
     * minimum: 1
     * maximum: 100
     * @return sessionUsageThreshold
     */
    public Integer getSessionUsageThreshold() {
        return sessionUsageThreshold;
    }

    public void setSessionUsageThreshold(Integer sessionUsageThreshold) {
        this.sessionUsageThreshold = sessionUsageThreshold;
    }

    public ScalingPolicyBySession withShrinkAfterSessionIdleMinutes(Integer shrinkAfterSessionIdleMinutes) {
        this.shrinkAfterSessionIdleMinutes = shrinkAfterSessionIdleMinutes;
        return this;
    }

    /**
     * 给定时间内无会话连接的的实例进行释放。
     * minimum: 5
     * maximum: 120
     * @return shrinkAfterSessionIdleMinutes
     */
    public Integer getShrinkAfterSessionIdleMinutes() {
        return shrinkAfterSessionIdleMinutes;
    }

    public void setShrinkAfterSessionIdleMinutes(Integer shrinkAfterSessionIdleMinutes) {
        this.shrinkAfterSessionIdleMinutes = shrinkAfterSessionIdleMinutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScalingPolicyBySession that = (ScalingPolicyBySession) obj;
        return Objects.equals(this.sessionUsageThreshold, that.sessionUsageThreshold)
            && Objects.equals(this.shrinkAfterSessionIdleMinutes, that.shrinkAfterSessionIdleMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionUsageThreshold, shrinkAfterSessionIdleMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingPolicyBySession {\n");
        sb.append("    sessionUsageThreshold: ").append(toIndentedString(sessionUsageThreshold)).append("\n");
        sb.append("    shrinkAfterSessionIdleMinutes: ")
            .append(toIndentedString(shrinkAfterSessionIdleMinutes))
            .append("\n");
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
