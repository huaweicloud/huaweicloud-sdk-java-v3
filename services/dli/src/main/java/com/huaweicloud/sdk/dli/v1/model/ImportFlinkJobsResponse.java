package com.huaweicloud.sdk.dli.v1.model;

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
public class ImportFlinkJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private String isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mapping")

    private List<JobMap> jobMapping = null;

    public ImportFlinkJobsResponse withIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ImportFlinkJobsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ImportFlinkJobsResponse withJobMapping(List<JobMap> jobMapping) {
        this.jobMapping = jobMapping;
        return this;
    }

    public ImportFlinkJobsResponse addJobMappingItem(JobMap jobMappingItem) {
        if (this.jobMapping == null) {
            this.jobMapping = new ArrayList<>();
        }
        this.jobMapping.add(jobMappingItem);
        return this;
    }

    public ImportFlinkJobsResponse withJobMapping(Consumer<List<JobMap>> jobMappingSetter) {
        if (this.jobMapping == null) {
            this.jobMapping = new ArrayList<>();
        }
        jobMappingSetter.accept(this.jobMapping);
        return this;
    }

    /**
     * 作业导入结果。
     * @return jobMapping
     */
    public List<JobMap> getJobMapping() {
        return jobMapping;
    }

    public void setJobMapping(List<JobMap> jobMapping) {
        this.jobMapping = jobMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportFlinkJobsResponse that = (ImportFlinkJobsResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.jobMapping, that.jobMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, jobMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportFlinkJobsResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobMapping: ").append(toIndentedString(jobMapping)).append("\n");
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
