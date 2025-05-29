package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class RecyclingJobsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_time")

    private Integer keepTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_list")

    private List<RecyclingJob> jobList = null;

    public RecyclingJobsResult withKeepTime(Integer keepTime) {
        this.keepTime = keepTime;
        return this;
    }

    /**
     * 任务保留时间
     * @return keepTime
     */
    public Integer getKeepTime() {
        return keepTime;
    }

    public void setKeepTime(Integer keepTime) {
        this.keepTime = keepTime;
    }

    public RecyclingJobsResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public RecyclingJobsResult withJobList(List<RecyclingJob> jobList) {
        this.jobList = jobList;
        return this;
    }

    public RecyclingJobsResult addJobListItem(RecyclingJob jobListItem) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public RecyclingJobsResult withJobList(Consumer<List<RecyclingJob>> jobListSetter) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        jobListSetter.accept(this.jobList);
        return this;
    }

    /**
     * 任务列表
     * @return jobList
     */
    public List<RecyclingJob> getJobList() {
        return jobList;
    }

    public void setJobList(List<RecyclingJob> jobList) {
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
        RecyclingJobsResult that = (RecyclingJobsResult) obj;
        return Objects.equals(this.keepTime, that.keepTime) && Objects.equals(this.total, that.total)
            && Objects.equals(this.jobList, that.jobList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepTime, total, jobList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecyclingJobsResult {\n");
        sb.append("    keepTime: ").append(toIndentedString(keepTime)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
