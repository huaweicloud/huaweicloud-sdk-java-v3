package com.huaweicloud.sdk.cloudide.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.InstanceEdgeParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateInstanceBy3rdRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_label")
    
    private String instanceLabel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private InstanceEdgeParam body = null;

    public CreateInstanceBy3rdRequest withInstanceLabel(String instanceLabel) {
        this.instanceLabel = instanceLabel;
        return this;
    }

    


    /**
     * Get instanceLabel
     * @return instanceLabel
     */
    public String getInstanceLabel() {
        return instanceLabel;
    }

    public void setInstanceLabel(String instanceLabel) {
        this.instanceLabel = instanceLabel;
    }

    public CreateInstanceBy3rdRequest withBody(InstanceEdgeParam body) {
        this.body = body;
        return this;
    }

    public CreateInstanceBy3rdRequest withBody(Consumer<InstanceEdgeParam> bodySetter) {
        if(this.body == null ){
            this.body = new InstanceEdgeParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public InstanceEdgeParam getBody() {
        return body;
    }

    public void setBody(InstanceEdgeParam body) {
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
        CreateInstanceBy3rdRequest createInstanceBy3rdRequest = (CreateInstanceBy3rdRequest) o;
        return Objects.equals(this.instanceLabel, createInstanceBy3rdRequest.instanceLabel) &&
            Objects.equals(this.body, createInstanceBy3rdRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceLabel, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceBy3rdRequest {\n");
        sb.append("    instanceLabel: ").append(toIndentedString(instanceLabel)).append("\n");
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

