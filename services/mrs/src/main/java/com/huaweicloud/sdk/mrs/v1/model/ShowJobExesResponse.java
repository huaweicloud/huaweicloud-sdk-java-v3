package com.huaweicloud.sdk.mrs.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.JobExeResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobExesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_execution")
    
    
    private JobExeResult jobExecution;

    public ShowJobExesResponse withJobExecution(JobExeResult jobExecution) {
        this.jobExecution = jobExecution;
        return this;
    }

    public ShowJobExesResponse withJobExecution(Consumer<JobExeResult> jobExecutionSetter) {
        if(this.jobExecution == null ){
            this.jobExecution = new JobExeResult();
            jobExecutionSetter.accept(this.jobExecution);
        }
        
        return this;
    }


    /**
     * Get jobExecution
     * @return jobExecution
     */
    public JobExeResult getJobExecution() {
        return jobExecution;
    }

    public void setJobExecution(JobExeResult jobExecution) {
        this.jobExecution = jobExecution;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobExesResponse showJobExesResponse = (ShowJobExesResponse) o;
        return Objects.equals(this.jobExecution, showJobExesResponse.jobExecution);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobExecution);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobExesResponse {\n");
        sb.append("    jobExecution: ").append(toIndentedString(jobExecution)).append("\n");
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

