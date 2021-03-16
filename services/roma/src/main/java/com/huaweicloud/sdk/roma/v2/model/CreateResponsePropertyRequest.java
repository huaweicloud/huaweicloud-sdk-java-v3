package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.CreatePropertyRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateResponsePropertyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private String serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_id")
    
    private Integer commandId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreatePropertyRequestBody body;

    public CreateResponsePropertyRequest withInstanceId(String instanceId) {
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

    

    public CreateResponsePropertyRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * Get serviceId
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    

    public CreateResponsePropertyRequest withCommandId(Integer commandId) {
        this.commandId = commandId;
        return this;
    }

    


    /**
     * Get commandId
     * minimum: 0
     * maximum: 200376420520689663
     * @return commandId
     */
    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }

    

    public CreateResponsePropertyRequest withBody(CreatePropertyRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateResponsePropertyRequest withBody(Consumer<CreatePropertyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreatePropertyRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreatePropertyRequestBody getBody() {
        return body;
    }

    public void setBody(CreatePropertyRequestBody body) {
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
        CreateResponsePropertyRequest createResponsePropertyRequest = (CreateResponsePropertyRequest) o;
        return Objects.equals(this.instanceId, createResponsePropertyRequest.instanceId) &&
            Objects.equals(this.serviceId, createResponsePropertyRequest.serviceId) &&
            Objects.equals(this.commandId, createResponsePropertyRequest.commandId) &&
            Objects.equals(this.body, createResponsePropertyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, serviceId, commandId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResponsePropertyRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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

