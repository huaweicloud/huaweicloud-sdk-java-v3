package com.huaweicloud.sdk.devstar.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_status")
    
    private Object jobStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_result")
    
    private String jobResult;

    public ShowJobDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 任务的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowJobDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 任务的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowJobDetailResponse withJobStatus(Object jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    


    /**
     * 任务的状态
     * @return jobStatus
     */
    public Object getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Object jobStatus) {
        this.jobStatus = jobStatus;
    }

    

    public ShowJobDetailResponse withJobResult(String jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    


    /**
     * 任务结果信息
     * @return jobResult
     */
    public String getJobResult() {
        return jobResult;
    }

    public void setJobResult(String jobResult) {
        this.jobResult = jobResult;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobDetailResponse showJobDetailResponse = (ShowJobDetailResponse) o;
        return Objects.equals(this.id, showJobDetailResponse.id) &&
            Objects.equals(this.name, showJobDetailResponse.name) &&
            Objects.equals(this.jobStatus, showJobDetailResponse.jobStatus) &&
            Objects.equals(this.jobResult, showJobDetailResponse.jobResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, jobStatus, jobResult);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
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

