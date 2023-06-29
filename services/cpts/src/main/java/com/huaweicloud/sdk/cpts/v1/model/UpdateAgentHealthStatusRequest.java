package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAgentHealthStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private Integer agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAgentHealthStatusRequestBody body;

    public UpdateAgentHealthStatusRequest withAgentId(Integer agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 探针id
     * @return agentId
     */
    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public UpdateAgentHealthStatusRequest withBody(UpdateAgentHealthStatusRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAgentHealthStatusRequest withBody(Consumer<UpdateAgentHealthStatusRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAgentHealthStatusRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAgentHealthStatusRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateAgentHealthStatusRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAgentHealthStatusRequest that = (UpdateAgentHealthStatusRequest) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAgentHealthStatusRequest {\n");
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
