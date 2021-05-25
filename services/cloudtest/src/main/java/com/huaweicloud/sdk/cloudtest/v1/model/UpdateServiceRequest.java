package com.huaweicloud.sdk.cloudtest.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudtest.v1.model.ServiceRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateServiceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private Integer serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ServiceRequestBody body;

    public UpdateServiceRequest withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 注册服务唯一标识，该值由注册接口返回
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    

    public UpdateServiceRequest withBody(ServiceRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateServiceRequest withBody(Consumer<ServiceRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ServiceRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ServiceRequestBody getBody() {
        return body;
    }

    public void setBody(ServiceRequestBody body) {
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
        UpdateServiceRequest updateServiceRequest = (UpdateServiceRequest) o;
        return Objects.equals(this.serviceId, updateServiceRequest.serviceId) &&
            Objects.equals(this.body, updateServiceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServiceRequest {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

