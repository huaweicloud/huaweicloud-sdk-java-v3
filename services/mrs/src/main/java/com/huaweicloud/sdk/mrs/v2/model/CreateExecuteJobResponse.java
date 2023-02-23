package com.huaweicloud.sdk.mrs.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.JobSubmitResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateExecuteJobResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_submit_result")
    

    private JobSubmitResult jobSubmitResult;

    public CreateExecuteJobResponse withJobSubmitResult(JobSubmitResult jobSubmitResult) {
        this.jobSubmitResult = jobSubmitResult;
        return this;
    }

    public CreateExecuteJobResponse withJobSubmitResult(Consumer<JobSubmitResult> jobSubmitResultSetter) {
        if(this.jobSubmitResult == null ){
            this.jobSubmitResult = new JobSubmitResult();
            jobSubmitResultSetter.accept(this.jobSubmitResult);
        }
        
        return this;
    }


    /**
     * Get jobSubmitResult
     * @return jobSubmitResult
     */
    public JobSubmitResult getJobSubmitResult() {
        return jobSubmitResult;
    }

    public void setJobSubmitResult(JobSubmitResult jobSubmitResult) {
        this.jobSubmitResult = jobSubmitResult;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateExecuteJobResponse createExecuteJobResponse = (CreateExecuteJobResponse) o;
        return Objects.equals(this.jobSubmitResult, createExecuteJobResponse.jobSubmitResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobSubmitResult);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExecuteJobResponse {\n");
        sb.append("    jobSubmitResult: ").append(toIndentedString(jobSubmitResult)).append("\n");
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

