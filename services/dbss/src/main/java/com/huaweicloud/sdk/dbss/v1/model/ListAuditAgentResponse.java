package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListAuditAgentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agents")

    private List<AuditAgentRespoonseAgents> agents = null;

    public ListAuditAgentResponse withAgents(List<AuditAgentRespoonseAgents> agents) {
        this.agents = agents;
        return this;
    }

    public ListAuditAgentResponse addAgentsItem(AuditAgentRespoonseAgents agentsItem) {
        if (this.agents == null) {
            this.agents = new ArrayList<>();
        }
        this.agents.add(agentsItem);
        return this;
    }

    public ListAuditAgentResponse withAgents(Consumer<List<AuditAgentRespoonseAgents>> agentsSetter) {
        if (this.agents == null) {
            this.agents = new ArrayList<>();
        }
        agentsSetter.accept(this.agents);
        return this;
    }

    /**
     * agent列表
     * @return agents
     */
    public List<AuditAgentRespoonseAgents> getAgents() {
        return agents;
    }

    public void setAgents(List<AuditAgentRespoonseAgents> agents) {
        this.agents = agents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditAgentResponse that = (ListAuditAgentResponse) obj;
        return Objects.equals(this.agents, that.agents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditAgentResponse {\n");
        sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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
