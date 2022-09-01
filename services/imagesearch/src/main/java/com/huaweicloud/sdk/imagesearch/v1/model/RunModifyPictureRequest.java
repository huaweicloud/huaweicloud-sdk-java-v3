package com.huaweicloud.sdk.imagesearch.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v1.model.RunModifyPictureReq;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunModifyPictureRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    @JacksonXmlProperty(localName = "instance_name")
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    @JacksonXmlProperty(localName = "body")
    
    private RunModifyPictureReq body;

    public RunModifyPictureRequest withInstanceName(String instanceName) {
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

    

    public RunModifyPictureRequest withBody(RunModifyPictureReq body) {
        this.body = body;
        return this;
    }

    public RunModifyPictureRequest withBody(Consumer<RunModifyPictureReq> bodySetter) {
        if(this.body == null ){
            this.body = new RunModifyPictureReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RunModifyPictureReq getBody() {
        return body;
    }

    public void setBody(RunModifyPictureReq body) {
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
        RunModifyPictureRequest runModifyPictureRequest = (RunModifyPictureRequest) o;
        return Objects.equals(this.instanceName, runModifyPictureRequest.instanceName) &&
            Objects.equals(this.body, runModifyPictureRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunModifyPictureRequest {\n");
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

