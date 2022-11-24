package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListWorkflowStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_count")

    private Integer appCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_count")

    private Integer workflowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_count")

    private Integer jobCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeed_job_count")

    private Integer succeedJobCount;

    public ListWorkflowStatisticResponse withAppCount(Integer appCount) {
        this.appCount = appCount;
        return this;
    }

    /**
     * 应用总数
     * @return appCount
     */
    public Integer getAppCount() {
        return appCount;
    }

    public void setAppCount(Integer appCount) {
        this.appCount = appCount;
    }

    public ListWorkflowStatisticResponse withWorkflowCount(Integer workflowCount) {
        this.workflowCount = workflowCount;
        return this;
    }

    /**
     * 流程总数
     * @return workflowCount
     */
    public Integer getWorkflowCount() {
        return workflowCount;
    }

    public void setWorkflowCount(Integer workflowCount) {
        this.workflowCount = workflowCount;
    }

    public ListWorkflowStatisticResponse withJobCount(Integer jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    /**
     * 作业总数
     * @return jobCount
     */
    public Integer getJobCount() {
        return jobCount;
    }

    public void setJobCount(Integer jobCount) {
        this.jobCount = jobCount;
    }

    public ListWorkflowStatisticResponse withSucceedJobCount(Integer succeedJobCount) {
        this.succeedJobCount = succeedJobCount;
        return this;
    }

    /**
     * 运行成功作业总数
     * @return succeedJobCount
     */
    public Integer getSucceedJobCount() {
        return succeedJobCount;
    }

    public void setSucceedJobCount(Integer succeedJobCount) {
        this.succeedJobCount = succeedJobCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkflowStatisticResponse listWorkflowStatisticResponse = (ListWorkflowStatisticResponse) o;
        return Objects.equals(this.appCount, listWorkflowStatisticResponse.appCount)
            && Objects.equals(this.workflowCount, listWorkflowStatisticResponse.workflowCount)
            && Objects.equals(this.jobCount, listWorkflowStatisticResponse.jobCount)
            && Objects.equals(this.succeedJobCount, listWorkflowStatisticResponse.succeedJobCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appCount, workflowCount, jobCount, succeedJobCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkflowStatisticResponse {\n");
        sb.append("    appCount: ").append(toIndentedString(appCount)).append("\n");
        sb.append("    workflowCount: ").append(toIndentedString(workflowCount)).append("\n");
        sb.append("    jobCount: ").append(toIndentedString(jobCount)).append("\n");
        sb.append("    succeedJobCount: ").append(toIndentedString(succeedJobCount)).append("\n");
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
