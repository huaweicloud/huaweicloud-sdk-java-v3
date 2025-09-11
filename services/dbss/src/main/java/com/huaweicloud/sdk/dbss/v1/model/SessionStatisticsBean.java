package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SessionStatisticsBean
 */
public class SessionStatisticsBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_session_num")

    private Long activeSessionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_session_num")

    private Long failSessionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_session_num")

    private Long newSessionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    public SessionStatisticsBean withActiveSessionNum(Long activeSessionNum) {
        this.activeSessionNum = activeSessionNum;
        return this;
    }

    /**
     * 活跃SESSION数量
     * @return activeSessionNum
     */
    public Long getActiveSessionNum() {
        return activeSessionNum;
    }

    public void setActiveSessionNum(Long activeSessionNum) {
        this.activeSessionNum = activeSessionNum;
    }

    public SessionStatisticsBean withFailSessionNum(Long failSessionNum) {
        this.failSessionNum = failSessionNum;
        return this;
    }

    /**
     * 失败SESSION数量
     * @return failSessionNum
     */
    public Long getFailSessionNum() {
        return failSessionNum;
    }

    public void setFailSessionNum(Long failSessionNum) {
        this.failSessionNum = failSessionNum;
    }

    public SessionStatisticsBean withNewSessionNum(Long newSessionNum) {
        this.newSessionNum = newSessionNum;
        return this;
    }

    /**
     * 新增SESSION数量
     * @return newSessionNum
     */
    public Long getNewSessionNum() {
        return newSessionNum;
    }

    public void setNewSessionNum(Long newSessionNum) {
        this.newSessionNum = newSessionNum;
    }

    public SessionStatisticsBean withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 周期
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionStatisticsBean that = (SessionStatisticsBean) obj;
        return Objects.equals(this.activeSessionNum, that.activeSessionNum)
            && Objects.equals(this.failSessionNum, that.failSessionNum)
            && Objects.equals(this.newSessionNum, that.newSessionNum) && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeSessionNum, failSessionNum, newSessionNum, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionStatisticsBean {\n");
        sb.append("    activeSessionNum: ").append(toIndentedString(activeSessionNum)).append("\n");
        sb.append("    failSessionNum: ").append(toIndentedString(failSessionNum)).append("\n");
        sb.append("    newSessionNum: ").append(toIndentedString(newSessionNum)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
