package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.AddActionReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateRuleActionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x-LB-Service")
    
    private String xLBService = "L7Adapt4Out";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AddActionReq body = null;

    public CreateRuleActionRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateRuleActionRequest withXLBService(String xLBService) {
        this.xLBService = xLBService;
        return this;
    }

    


    /**
     * Get xLBService
     * @return xLBService
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x-LB-Service")
    public String getXLBService() {
        return xLBService;
    }

    public void setXLBService(String xLBService) {
        this.xLBService = xLBService;
    }

    public CreateRuleActionRequest withBody(AddActionReq body) {
        this.body = body;
        return this;
    }

    public CreateRuleActionRequest withBody(Consumer<AddActionReq> bodySetter) {
        if(this.body == null ){
            this.body = new AddActionReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AddActionReq getBody() {
        return body;
    }

    public void setBody(AddActionReq body) {
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
        CreateRuleActionRequest createRuleActionRequest = (CreateRuleActionRequest) o;
        return Objects.equals(this.instanceId, createRuleActionRequest.instanceId) &&
            Objects.equals(this.xLBService, createRuleActionRequest.xLBService) &&
            Objects.equals(this.body, createRuleActionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, xLBService, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRuleActionRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    xLBService: ").append(toIndentedString(xLBService)).append("\n");
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

