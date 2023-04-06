package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.JobExecution;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 作业配置。
 */
public class StepConfig  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_execution")
    

    private JobExecution jobExecution;

    public StepConfig withJobExecution(JobExecution jobExecution) {
        this.jobExecution = jobExecution;
        return this;
    }

    public StepConfig withJobExecution(Consumer<JobExecution> jobExecutionSetter) {
        if(this.jobExecution == null ){
            this.jobExecution = new JobExecution();
            jobExecutionSetter.accept(this.jobExecution);
        }
        
        return this;
    }


    /**
     * Get jobExecution
     * @return jobExecution
     */
    public JobExecution getJobExecution() {
        return jobExecution;
    }

    public void setJobExecution(JobExecution jobExecution) {
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
        StepConfig stepConfig = (StepConfig) o;
        return Objects.equals(this.jobExecution, stepConfig.jobExecution);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobExecution);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StepConfig {\n");
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

