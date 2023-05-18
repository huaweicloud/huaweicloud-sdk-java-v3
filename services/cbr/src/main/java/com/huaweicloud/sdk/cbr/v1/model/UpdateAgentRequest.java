package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAgentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AgentUpdateReq body;

    public UpdateAgentRequest withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * Get agentId
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public UpdateAgentRequest withBody(AgentUpdateReq body) {
        this.body = body;
        return this;
    }

    public UpdateAgentRequest withBody(Consumer<AgentUpdateReq> bodySetter) {
        if (this.body == null) {
            this.body = new AgentUpdateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AgentUpdateReq getBody() {
        return body;
    }

    public void setBody(AgentUpdateReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAgentRequest updateAgentRequest = (UpdateAgentRequest) o;
        return Objects.equals(this.agentId, updateAgentRequest.agentId)
            && Objects.equals(this.body, updateAgentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAgentRequest {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
