package com.huaweicloud.sdk.ces.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAgentStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private List<AgentStatusInfo> agentStatus = null;

    public ListAgentStatusResponse withAgentStatus(List<AgentStatusInfo> agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    public ListAgentStatusResponse addAgentStatusItem(AgentStatusInfo agentStatusItem) {
        if (this.agentStatus == null) {
            this.agentStatus = new ArrayList<>();
        }
        this.agentStatus.add(agentStatusItem);
        return this;
    }

    public ListAgentStatusResponse withAgentStatus(Consumer<List<AgentStatusInfo>> agentStatusSetter) {
        if (this.agentStatus == null) {
            this.agentStatus = new ArrayList<>();
        }
        agentStatusSetter.accept(this.agentStatus);
        return this;
    }

    /**
     * **参数解释**: agent插件状态列表 **取值范围**: 数组长度为[1,2000] 
     * @return agentStatus
     */
    public List<AgentStatusInfo> getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(List<AgentStatusInfo> agentStatus) {
        this.agentStatus = agentStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgentStatusResponse that = (ListAgentStatusResponse) obj;
        return Objects.equals(this.agentStatus, that.agentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentStatusResponse {\n");
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
