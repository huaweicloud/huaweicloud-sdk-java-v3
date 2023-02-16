package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceRespItem;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateRestoreInstanceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    
    
    private CreateInstanceRespItem instance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    
    private String jobId;

    public CreateRestoreInstanceResponse withInstance(CreateInstanceRespItem instance) {
        this.instance = instance;
        return this;
    }

    public CreateRestoreInstanceResponse withInstance(Consumer<CreateInstanceRespItem> instanceSetter) {
        if(this.instance == null ){
            this.instance = new CreateInstanceRespItem();
            instanceSetter.accept(this.instance);
        }
        
        return this;
    }


    /**
     * Get instance
     * @return instance
     */
    public CreateInstanceRespItem getInstance() {
        return instance;
    }

    public void setInstance(CreateInstanceRespItem instance) {
        this.instance = instance;
    }

    

    public CreateRestoreInstanceResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 恢复新实例的任务id。  仅恢复按需实例时会返回该参数。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRestoreInstanceResponse createRestoreInstanceResponse = (CreateRestoreInstanceResponse) o;
        return Objects.equals(this.instance, createRestoreInstanceResponse.instance) &&
            Objects.equals(this.jobId, createRestoreInstanceResponse.jobId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instance, jobId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRestoreInstanceResponse {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

