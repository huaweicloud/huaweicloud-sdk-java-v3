package com.huaweicloud.sdk.aom.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v3.model.ComponentUpdateParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateComponentRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_id")
    
    
    private String componentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private ComponentUpdateParam body;

    public UpdateComponentRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    


    /**
     * 组件id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    

    public UpdateComponentRequest withBody(ComponentUpdateParam body) {
        this.body = body;
        return this;
    }

    public UpdateComponentRequest withBody(Consumer<ComponentUpdateParam> bodySetter) {
        if(this.body == null ){
            this.body = new ComponentUpdateParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ComponentUpdateParam getBody() {
        return body;
    }

    public void setBody(ComponentUpdateParam body) {
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
        UpdateComponentRequest updateComponentRequest = (UpdateComponentRequest) o;
        return Objects.equals(this.componentId, updateComponentRequest.componentId) &&
            Objects.equals(this.body, updateComponentRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(componentId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateComponentRequest {\n");
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

