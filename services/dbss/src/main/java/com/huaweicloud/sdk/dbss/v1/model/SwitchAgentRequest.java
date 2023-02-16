package com.huaweicloud.sdk.dbss.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.AgentSwitchRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SwitchAgentRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private AgentSwitchRequest body;

    public SwitchAgentRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public SwitchAgentRequest withBody(AgentSwitchRequest body) {
        this.body = body;
        return this;
    }

    public SwitchAgentRequest withBody(Consumer<AgentSwitchRequest> bodySetter) {
        if(this.body == null ){
            this.body = new AgentSwitchRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AgentSwitchRequest getBody() {
        return body;
    }

    public void setBody(AgentSwitchRequest body) {
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
        SwitchAgentRequest switchAgentRequest = (SwitchAgentRequest) o;
        return Objects.equals(this.instanceId, switchAgentRequest.instanceId) &&
            Objects.equals(this.body, switchAgentRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchAgentRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

