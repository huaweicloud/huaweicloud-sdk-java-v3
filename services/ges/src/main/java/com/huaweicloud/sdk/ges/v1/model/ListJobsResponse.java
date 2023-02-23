package com.huaweicloud.sdk.ges.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.Job;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListJobsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobCount")
    

    private Integer jobCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobList")
    
    private List<Job> jobList = null;
    
    public ListJobsResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    public ListJobsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public ListJobsResponse withJobCount(Integer jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    


    /**
     * 任务总数
     * @return jobCount
     */
    public Integer getJobCount() {
        return jobCount;
    }

    public void setJobCount(Integer jobCount) {
        this.jobCount = jobCount;
    }

    

    public ListJobsResponse withJobList(List<Job> jobList) {
        this.jobList = jobList;
        return this;
    }

    
    public ListJobsResponse addJobListItem(Job jobListItem) {
        if(this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public ListJobsResponse withJobList(Consumer<List<Job>> jobListSetter) {
        if(this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        jobListSetter.accept(this.jobList);
        return this;
    }

    /**
     * 任务列表
     * @return jobList
     */
    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJobsResponse listJobsResponse = (ListJobsResponse) o;
        return Objects.equals(this.errorMessage, listJobsResponse.errorMessage) &&
            Objects.equals(this.errorCode, listJobsResponse.errorCode) &&
            Objects.equals(this.jobCount, listJobsResponse.jobCount) &&
            Objects.equals(this.jobList, listJobsResponse.jobList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode, jobCount, jobList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsResponse {\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    jobCount: ").append(toIndentedString(jobCount)).append("\n");
        sb.append("    jobList: ").append(toIndentedString(jobList)).append("\n");
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

