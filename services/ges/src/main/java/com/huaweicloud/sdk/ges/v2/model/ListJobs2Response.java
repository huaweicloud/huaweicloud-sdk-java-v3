package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListJobs2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_count")

    private Integer jobCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_list")

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
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public ListJobs2Response withJobList(Consumer<List<ListJobsRespJobList>> jobListSetter) {
        if (this.jobList == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobs2Response that = (ListJobs2Response) obj;
        return Objects.equals(this.jobCount, that.jobCount) && Objects.equals(this.jobList, that.jobList);
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
