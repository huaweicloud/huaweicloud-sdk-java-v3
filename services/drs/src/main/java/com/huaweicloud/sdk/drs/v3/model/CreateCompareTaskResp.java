package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.CreateCompareTaskResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CreateCompareTaskResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_level_compare_create_result")
    
    private CreateCompareTaskResult objectLevelCompareCreateResult = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_level_compare_create_result")
    
    private CreateCompareTaskResult dataLevelCompareCreateResult = null;

    public CreateCompareTaskResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateCompareTaskResp withObjectLevelCompareCreateResult(CreateCompareTaskResult objectLevelCompareCreateResult) {
        this.objectLevelCompareCreateResult = objectLevelCompareCreateResult;
        return this;
    }

    public CreateCompareTaskResp withObjectLevelCompareCreateResult(Consumer<CreateCompareTaskResult> objectLevelCompareCreateResultSetter) {
        if(this.objectLevelCompareCreateResult == null ){
            this.objectLevelCompareCreateResult = new CreateCompareTaskResult();
            objectLevelCompareCreateResultSetter.accept(this.objectLevelCompareCreateResult);
        }
        
        return this;
    }


    /**
     * Get objectLevelCompareCreateResult
     * @return objectLevelCompareCreateResult
     */
    public CreateCompareTaskResult getObjectLevelCompareCreateResult() {
        return objectLevelCompareCreateResult;
    }

    public void setObjectLevelCompareCreateResult(CreateCompareTaskResult objectLevelCompareCreateResult) {
        this.objectLevelCompareCreateResult = objectLevelCompareCreateResult;
    }

    public CreateCompareTaskResp withDataLevelCompareCreateResult(CreateCompareTaskResult dataLevelCompareCreateResult) {
        this.dataLevelCompareCreateResult = dataLevelCompareCreateResult;
        return this;
    }

    public CreateCompareTaskResp withDataLevelCompareCreateResult(Consumer<CreateCompareTaskResult> dataLevelCompareCreateResultSetter) {
        if(this.dataLevelCompareCreateResult == null ){
            this.dataLevelCompareCreateResult = new CreateCompareTaskResult();
            dataLevelCompareCreateResultSetter.accept(this.dataLevelCompareCreateResult);
        }
        
        return this;
    }


    /**
     * Get dataLevelCompareCreateResult
     * @return dataLevelCompareCreateResult
     */
    public CreateCompareTaskResult getDataLevelCompareCreateResult() {
        return dataLevelCompareCreateResult;
    }

    public void setDataLevelCompareCreateResult(CreateCompareTaskResult dataLevelCompareCreateResult) {
        this.dataLevelCompareCreateResult = dataLevelCompareCreateResult;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCompareTaskResp createCompareTaskResp = (CreateCompareTaskResp) o;
        return Objects.equals(this.jobId, createCompareTaskResp.jobId) &&
            Objects.equals(this.objectLevelCompareCreateResult, createCompareTaskResp.objectLevelCompareCreateResult) &&
            Objects.equals(this.dataLevelCompareCreateResult, createCompareTaskResp.dataLevelCompareCreateResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, objectLevelCompareCreateResult, dataLevelCompareCreateResult);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompareTaskResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    objectLevelCompareCreateResult: ").append(toIndentedString(objectLevelCompareCreateResult)).append("\n");
        sb.append("    dataLevelCompareCreateResult: ").append(toIndentedString(dataLevelCompareCreateResult)).append("\n");
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

