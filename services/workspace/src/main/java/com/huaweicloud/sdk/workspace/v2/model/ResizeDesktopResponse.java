package com.huaweicloud.sdk.workspace.v2.model;

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
public class ResizeDesktopResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<ResizeDesktopJobResult> jobs = null;

    public ResizeDesktopResponse withJobs(List<ResizeDesktopJobResult> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ResizeDesktopResponse addJobsItem(ResizeDesktopJobResult jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ResizeDesktopResponse withJobs(Consumer<List<ResizeDesktopJobResult>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 按需桌面变更规格返回的任务信息。
     * @return jobs
     */
    public List<ResizeDesktopJobResult> getJobs() {
        return jobs;
    }

    public void setJobs(List<ResizeDesktopJobResult> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeDesktopResponse resizeDesktopResponse = (ResizeDesktopResponse) o;
        return Objects.equals(this.jobs, resizeDesktopResponse.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeDesktopResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
