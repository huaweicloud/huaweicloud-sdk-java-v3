package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ProtectableAgentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private List<ProtectableAgentStatusResource> agentStatus = null;

    public ProtectableAgentReq withAgentStatus(List<ProtectableAgentStatusResource> agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    public ProtectableAgentReq addAgentStatusItem(ProtectableAgentStatusResource agentStatusItem) {
        if (this.agentStatus == null) {
            this.agentStatus = new ArrayList<>();
        }
        this.agentStatus.add(agentStatusItem);
        return this;
    }

    public ProtectableAgentReq withAgentStatus(Consumer<List<ProtectableAgentStatusResource>> agentStatusSetter) {
        if (this.agentStatus == null) {
            this.agentStatus = new ArrayList<>();
        }
        agentStatusSetter.accept(this.agentStatus);
        return this;
    }

    /**
     * 查询参数列表
     * @return agentStatus
     */
    public List<ProtectableAgentStatusResource> getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(List<ProtectableAgentStatusResource> agentStatus) {
        this.agentStatus = agentStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectableAgentReq protectableAgentReq = (ProtectableAgentReq) o;
        return Objects.equals(this.agentStatus, protectableAgentReq.agentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectableAgentReq {\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
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
