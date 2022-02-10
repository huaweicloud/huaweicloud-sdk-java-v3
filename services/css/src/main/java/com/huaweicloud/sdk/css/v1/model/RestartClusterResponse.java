package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class RestartClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobId")

    private List<String> jobId = null;

    public RestartClusterResponse withJobId(List<String> jobId) {
        this.jobId = jobId;
        return this;
    }

    public RestartClusterResponse addJobIdItem(String jobIdItem) {
        if (this.jobId == null) {
            this.jobId = new ArrayList<>();
        }
        this.jobId.add(jobIdItem);
        return this;
    }

    public RestartClusterResponse withJobId(Consumer<List<String>> jobIdSetter) {
        if (this.jobId == null) {
            this.jobId = new ArrayList<>();
        }
        jobIdSetter.accept(this.jobId);
        return this;
    }

    /** 重启任务的ID。
     * 
     * @return jobId */
    public List<String> getJobId() {
        return jobId;
    }

    public void setJobId(List<String> jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestartClusterResponse restartClusterResponse = (RestartClusterResponse) o;
        return Objects.equals(this.jobId, restartClusterResponse.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartClusterResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
