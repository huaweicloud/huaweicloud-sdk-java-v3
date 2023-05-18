package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AgentUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent")

    private AgentUpdate agent;

    public AgentUpdateReq withAgent(AgentUpdate agent) {
        this.agent = agent;
        return this;
    }

    public AgentUpdateReq withAgent(Consumer<AgentUpdate> agentSetter) {
        if (this.agent == null) {
            this.agent = new AgentUpdate();
            agentSetter.accept(this.agent);
        }

        return this;
    }

    /**
     * Get agent
     * @return agent
     */
    public AgentUpdate getAgent() {
        return agent;
    }

    public void setAgent(AgentUpdate agent) {
        this.agent = agent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentUpdateReq agentUpdateReq = (AgentUpdateReq) o;
        return Objects.equals(this.agent, agentUpdateReq.agent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentUpdateReq {\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
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
