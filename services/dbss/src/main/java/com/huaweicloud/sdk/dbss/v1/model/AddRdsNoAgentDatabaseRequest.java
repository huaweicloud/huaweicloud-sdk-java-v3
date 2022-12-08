package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.RdsNoAgentDbRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AddRdsNoAgentDatabaseRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private RdsNoAgentDbRequest body;

    public AddRdsNoAgentDatabaseRequest withInstanceId(String instanceId) {
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

    

    public AddRdsNoAgentDatabaseRequest withBody(RdsNoAgentDbRequest body) {
        this.body = body;
        return this;
    }

    public AddRdsNoAgentDatabaseRequest withBody(Consumer<RdsNoAgentDbRequest> bodySetter) {
        if(this.body == null ){
            this.body = new RdsNoAgentDbRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RdsNoAgentDbRequest getBody() {
        return body;
    }

    public void setBody(RdsNoAgentDbRequest body) {
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
        AddRdsNoAgentDatabaseRequest addRdsNoAgentDatabaseRequest = (AddRdsNoAgentDatabaseRequest) o;
        return Objects.equals(this.instanceId, addRdsNoAgentDatabaseRequest.instanceId) &&
            Objects.equals(this.body, addRdsNoAgentDatabaseRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRdsNoAgentDatabaseRequest {\n");
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

