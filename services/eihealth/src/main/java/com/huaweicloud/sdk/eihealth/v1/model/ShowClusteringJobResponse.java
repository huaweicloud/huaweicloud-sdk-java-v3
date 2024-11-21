package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowClusteringJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private DrugFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reasons")

    private List<FailedReasonRecord> failedReasons = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_result")

    private JobResult jobResult;

    public ShowClusteringJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowClusteringJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new DrugJobDto();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public DrugJobDto getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ShowClusteringJobResponse withFile(DrugFile file) {
        this.file = file;
        return this;
    }

    public ShowClusteringJobResponse withFile(Consumer<DrugFile> fileSetter) {
        if (this.file == null) {
            this.file = new DrugFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public DrugFile getFile() {
        return file;
    }

    public void setFile(DrugFile file) {
        this.file = file;
    }

    public ShowClusteringJobResponse withFailedReasons(List<FailedReasonRecord> failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    public ShowClusteringJobResponse addFailedReasonsItem(FailedReasonRecord failedReasonsItem) {
        if (this.failedReasons == null) {
            this.failedReasons = new ArrayList<>();
        }
        this.failedReasons.add(failedReasonsItem);
        return this;
    }

    public ShowClusteringJobResponse withFailedReasons(Consumer<List<FailedReasonRecord>> failedReasonsSetter) {
        if (this.failedReasons == null) {
            this.failedReasons = new ArrayList<>();
        }
        failedReasonsSetter.accept(this.failedReasons);
        return this;
    }

    /**
     * 部分失败原因和数量。
     * @return failedReasons
     */
    public List<FailedReasonRecord> getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(List<FailedReasonRecord> failedReasons) {
        this.failedReasons = failedReasons;
    }

    public ShowClusteringJobResponse withJobResult(JobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    public ShowClusteringJobResponse withJobResult(Consumer<JobResult> jobResultSetter) {
        if (this.jobResult == null) {
            this.jobResult = new JobResult();
            jobResultSetter.accept(this.jobResult);
        }

        return this;
    }

    /**
     * Get jobResult
     * @return jobResult
     */
    public JobResult getJobResult() {
        return jobResult;
    }

    public void setJobResult(JobResult jobResult) {
        this.jobResult = jobResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusteringJobResponse that = (ShowClusteringJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.file, that.file)
            && Objects.equals(this.failedReasons, that.failedReasons) && Objects.equals(this.jobResult, that.jobResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, file, failedReasons, jobResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusteringJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
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
