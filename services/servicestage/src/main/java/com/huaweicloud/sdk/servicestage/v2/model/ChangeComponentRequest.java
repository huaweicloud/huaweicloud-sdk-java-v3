package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ComponentModify;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ChangeComponentRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_id")
    
    private String applicationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_id")
    
    private String componentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ComponentModify body;

    public ChangeComponentRequest withApplicationId(String applicationId) {
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

    

    public ChangeComponentRequest withComponentId(String componentId) {
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

    

    public ChangeComponentRequest withBody(ComponentModify body) {
        this.body = body;
        return this;
    }

    public ChangeComponentRequest withBody(Consumer<ComponentModify> bodySetter) {
        if(this.body == null ){
            this.body = new ComponentModify();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ComponentModify getBody() {
        return body;
    }

    public void setBody(ComponentModify body) {
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
        ChangeComponentRequest changeComponentRequest = (ChangeComponentRequest) o;
        return Objects.equals(this.applicationId, changeComponentRequest.applicationId) &&
            Objects.equals(this.componentId, changeComponentRequest.componentId) &&
            Objects.equals(this.body, changeComponentRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationId, componentId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeComponentRequest {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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

