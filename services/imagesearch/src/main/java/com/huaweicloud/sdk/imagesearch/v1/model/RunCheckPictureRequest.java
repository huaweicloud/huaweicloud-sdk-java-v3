package com.huaweicloud.sdk.imagesearch.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v1.model.DeletePictureReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunCheckPictureRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private DeletePictureReq body;

    public RunCheckPictureRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    

    public RunCheckPictureRequest withBody(DeletePictureReq body) {
        this.body = body;
        return this;
    }

    public RunCheckPictureRequest withBody(Consumer<DeletePictureReq> bodySetter) {
        if(this.body == null ){
            this.body = new DeletePictureReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DeletePictureReq getBody() {
        return body;
    }

    public void setBody(DeletePictureReq body) {
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
        RunCheckPictureRequest runCheckPictureRequest = (RunCheckPictureRequest) o;
        return Objects.equals(this.instanceName, runCheckPictureRequest.instanceName) &&
            Objects.equals(this.body, runCheckPictureRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCheckPictureRequest {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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

