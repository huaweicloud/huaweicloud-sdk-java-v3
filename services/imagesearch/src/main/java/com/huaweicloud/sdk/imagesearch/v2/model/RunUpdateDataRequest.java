package com.huaweicloud.sdk.imagesearch.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.UpdateParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunUpdateDataRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_name")
    
    
    private String serviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private UpdateParam body;

    public RunUpdateDataRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    


    /**
     * 服务实例的名称，用户创建服务实例时指定。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    

    public RunUpdateDataRequest withBody(UpdateParam body) {
        this.body = body;
        return this;
    }

    public RunUpdateDataRequest withBody(Consumer<UpdateParam> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateParam getBody() {
        return body;
    }

    public void setBody(UpdateParam body) {
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
        RunUpdateDataRequest runUpdateDataRequest = (RunUpdateDataRequest) o;
        return Objects.equals(this.serviceName, runUpdateDataRequest.serviceName) &&
            Objects.equals(this.body, runUpdateDataRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunUpdateDataRequest {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

