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
public class ShowJobProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_job_id")

    private Integer subJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Double progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs")

    private List<SubJobDatas> subJobs = null;

    public ShowJobProgressResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowJobProgressResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowJobProgressResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobProgressResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowJobProgressResponse withSubJobId(Integer subJobId) {
        this.subJobId = subJobId;
        return this;
    }

    /**
     * 正在运行的子作业ID，如果作业还没开始运行或者运行结束，则子作业ID可能为空。
     * @return subJobId
     */
    public Integer getSubJobId() {
        return subJobId;
    }

    public void setSubJobId(Integer subJobId) {
        this.subJobId = subJobId;
    }

    public ShowJobProgressResponse withProgress(Double progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 正在运行的子作业的进度或者整个作业进度，该值只能粗略的估算子作业进度，不表示作业的详细进度。有两方面的含义： （1）如果整个作业刚开始运行或者在提交中，则进度展示为0；如果作业运行结束，则进度展示为1。此时progress表示整个作业的运行进度，因为没有子作业在运行，sub_job_id不展示。 （2）如果有子作业在运行中，则展示该子作业的运行进度，progress的计算方法为：子作业已经完成的task数除以子作业总的task数。此时progress表示子作业的运行进度，sub_job_id展示。
     * @return progress
     */
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public ShowJobProgressResponse withSubJobs(List<SubJobDatas> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    public ShowJobProgressResponse addSubJobsItem(SubJobDatas subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public ShowJobProgressResponse withSubJobs(Consumer<List<SubJobDatas>> subJobsSetter) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 正在运行作业的子作业的详细信息，一个作业可能包含多个子作业。
     * @return subJobs
     */
    public List<SubJobDatas> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<SubJobDatas> subJobs) {
        this.subJobs = subJobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobProgressResponse showJobProgressResponse = (ShowJobProgressResponse) o;
        return Objects.equals(this.isSuccess, showJobProgressResponse.isSuccess)
            && Objects.equals(this.message, showJobProgressResponse.message)
            && Objects.equals(this.jobId, showJobProgressResponse.jobId)
            && Objects.equals(this.status, showJobProgressResponse.status)
            && Objects.equals(this.subJobId, showJobProgressResponse.subJobId)
            && Objects.equals(this.progress, showJobProgressResponse.progress)
            && Objects.equals(this.subJobs, showJobProgressResponse.subJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, jobId, status, subJobId, progress, subJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobProgressResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subJobId: ").append(toIndentedString(subJobId)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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
