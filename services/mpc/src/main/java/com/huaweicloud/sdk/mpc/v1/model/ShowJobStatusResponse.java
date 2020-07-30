package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.Job;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobStatusResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job")
    
    private Job job = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retCode")
    
    private String retCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retSuccess")
    
    private String retSuccess;

    public ShowJobStatusResponse withJob(Job job) {
        this.job = job;
        return this;
    }

    public ShowJobStatusResponse withJob(Consumer<Job> jobSetter) {
        if(this.job == null ){
            this.job = new Job();
            jobSetter.accept(this.job);
        }
        
        return this;
    }


    /**
     * Get job
     * @return job
     */
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public ShowJobStatusResponse withRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }

    


    /**
     * 任务返回码
     * @return retCode
     */
    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public ShowJobStatusResponse withRetSuccess(String retSuccess) {
        this.retSuccess = retSuccess;
        return this;
    }

    


    /**
     * 任务信息
     * @return retSuccess
     */
    public String getRetSuccess() {
        return retSuccess;
    }

    public void setRetSuccess(String retSuccess) {
        this.retSuccess = retSuccess;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobStatusResponse showJobStatusResponse = (ShowJobStatusResponse) o;
        return Objects.equals(this.job, showJobStatusResponse.job) &&
            Objects.equals(this.retCode, showJobStatusResponse.retCode) &&
            Objects.equals(this.retSuccess, showJobStatusResponse.retSuccess);
    }
    @Override
    public int hashCode() {
        return Objects.hash(job, retCode, retSuccess);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobStatusResponse {\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
        sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
        sb.append("    retSuccess: ").append(toIndentedString(retSuccess)).append("\n");
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

