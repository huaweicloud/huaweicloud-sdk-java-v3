package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussInstanceResponse;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateInstanceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    
    
    private OpenGaussInstanceResponse instance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    
    private String orderId;

    public CreateInstanceResponse withInstance(OpenGaussInstanceResponse instance) {
        this.instance = instance;
        return this;
    }

    public CreateInstanceResponse withInstance(Consumer<OpenGaussInstanceResponse> instanceSetter) {
        if(this.instance == null ){
            this.instance = new OpenGaussInstanceResponse();
            instanceSetter.accept(this.instance);
        }
        
        return this;
    }


    /**
     * Get instance
     * @return instance
     */
    public OpenGaussInstanceResponse getInstance() {
        return instance;
    }

    public void setInstance(OpenGaussInstanceResponse instance) {
        this.instance = instance;
    }

    

    public CreateInstanceResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 实例创建的任务id。  仅创建按需实例时会返回该参数。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public CreateInstanceResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 创建实例的订单ID。  仅创建包周期实例时会返回该参数。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceResponse createInstanceResponse = (CreateInstanceResponse) o;
        return Objects.equals(this.instance, createInstanceResponse.instance) &&
            Objects.equals(this.jobId, createInstanceResponse.jobId) &&
            Objects.equals(this.orderId, createInstanceResponse.orderId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instance, jobId, orderId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceResponse {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

