package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AgentStatusInfo
 */
public class AgentStatusInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_time")

    private Long statusTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_reason")

    private String abnormalReason;

    public AgentStatusInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: Agent状态 **取值范围**: 包含如下3种。 - online：在线。 - offline：离线。 - agent_protect_interrupted：防护中断。
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public AgentStatusInfo withStatusTime(Long statusTime) {
        this.statusTime = statusTime;
        return this;
    }

    /**
     * **参数解释**： agent状态时间，采用时间戳，默认毫秒 **取值范围**： 0-4824695185000
     * minimum: 0
     * maximum: 4824695185000
     * @return statusTime
     */
    public Long getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Long statusTime) {
        this.statusTime = statusTime;
    }

    public AgentStatusInfo withAbnormalReason(String abnormalReason) {
        this.abnormalReason = abnormalReason;
        return this;
    }

    /**
     * **参数解释**： 异常原因 **取值范围**： 字符长度0-512位
     * @return abnormalReason
     */
    public String getAbnormalReason() {
        return abnormalReason;
    }

    public void setAbnormalReason(String abnormalReason) {
        this.abnormalReason = abnormalReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentStatusInfo that = (AgentStatusInfo) obj;
        return Objects.equals(this.agentStatus, that.agentStatus) && Objects.equals(this.statusTime, that.statusTime)
            && Objects.equals(this.abnormalReason, that.abnormalReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentStatus, statusTime, abnormalReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentStatusInfo {\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    statusTime: ").append(toIndentedString(statusTime)).append("\n");
        sb.append("    abnormalReason: ").append(toIndentedString(abnormalReason)).append("\n");
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
