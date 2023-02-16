package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AgentSwitchRequest
 */
public class AgentSwitchRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_id")
    
    
    private String agentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private Integer status;

    public AgentSwitchRequest withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    


    /**
     * 审计agent的ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    

    public AgentSwitchRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * Agent开关状态 1：开启 0：关闭
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentSwitchRequest agentSwitchRequest = (AgentSwitchRequest) o;
        return Objects.equals(this.agentId, agentSwitchRequest.agentId) &&
            Objects.equals(this.status, agentSwitchRequest.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agentId, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentSwitchRequest {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

