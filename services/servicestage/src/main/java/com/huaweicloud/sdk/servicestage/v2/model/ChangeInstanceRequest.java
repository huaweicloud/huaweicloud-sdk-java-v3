package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.InstanceModify;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ChangeInstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_id")
    
    private String applicationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_id")
    
    private String componentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private InstanceModify body = null;

    public ChangeInstanceRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    


    /**
     * Get applicationId
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ChangeInstanceRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    


    /**
     * Get componentId
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ChangeInstanceRequest withInstanceId(String instanceId) {
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

    public ChangeInstanceRequest withBody(InstanceModify body) {
        this.body = body;
        return this;
    }

    public ChangeInstanceRequest withBody(Consumer<InstanceModify> bodySetter) {
        if(this.body == null ){
            this.body = new InstanceModify();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public InstanceModify getBody() {
        return body;
    }

    public void setBody(InstanceModify body) {
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
        ChangeInstanceRequest changeInstanceRequest = (ChangeInstanceRequest) o;
        return Objects.equals(this.applicationId, changeInstanceRequest.applicationId) &&
            Objects.equals(this.componentId, changeInstanceRequest.componentId) &&
            Objects.equals(this.instanceId, changeInstanceRequest.instanceId) &&
            Objects.equals(this.body, changeInstanceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationId, componentId, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeInstanceRequest {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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

