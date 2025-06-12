package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回结果
 */
public class ListJobResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_list")

    private List<ListJobResultJobList> jobList = null;

    public ListJobResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 任务总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListJobResult withJobList(List<ListJobResultJobList> jobList) {
        this.jobList = jobList;
        return this;
    }

    public ListJobResult addJobListItem(ListJobResultJobList jobListItem) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public ListJobResult withJobList(Consumer<List<ListJobResultJobList>> jobListSetter) {
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
    public List<ListJobResultJobList> getJobList() {
        return jobList;
    }

    public void setJobList(List<ListJobResultJobList> jobList) {
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
        ListJobResult that = (ListJobResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.jobList, that.jobList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, jobList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobResult {\n");
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
