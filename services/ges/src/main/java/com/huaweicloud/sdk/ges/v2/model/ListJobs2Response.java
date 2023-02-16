package com.huaweicloud.sdk.ges.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ListJobsRespJobList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListJobs2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_count")
    
    
    private Integer jobCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_list")
    
    
    private List<ListJobsRespJobList> jobList = null;
    
    public ListJobs2Response withJobCount(Integer jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    


    /**
     * 任务总数。
     * @return jobCount
     */
    public Integer getJobCount() {
        return jobCount;
    }

    public void setJobCount(Integer jobCount) {
        this.jobCount = jobCount;
    }

    

    public ListJobs2Response withJobList(List<ListJobsRespJobList> jobList) {
        this.jobList = jobList;
        return this;
    }

    
    public ListJobs2Response addJobListItem(ListJobsRespJobList jobListItem) {
        if(this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public ListJobs2Response withJobList(Consumer<List<ListJobsRespJobList>> jobListSetter) {
        if(this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        jobListSetter.accept(this.jobList);
        return this;
    }

    /**
     * 任务列表。
     * @return jobList
     */
    public List<ListJobsRespJobList> getJobList() {
        return jobList;
    }

    public void setJobList(List<ListJobsRespJobList> jobList) {
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
        ListJobs2Response listJobs2Response = (ListJobs2Response) o;
        return Objects.equals(this.jobCount, listJobs2Response.jobCount) &&
            Objects.equals(this.jobList, listJobs2Response.jobList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobCount, jobList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobs2Response {\n");
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

