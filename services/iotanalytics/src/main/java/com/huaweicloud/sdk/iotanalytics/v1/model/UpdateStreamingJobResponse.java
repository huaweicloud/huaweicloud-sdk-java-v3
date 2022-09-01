package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateStreamingJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_state")

    @JacksonXmlProperty(localName = "job_state")

    private String jobState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_info")

    @JacksonXmlProperty(localName = "check_info")

    private Map<String, Object> checkInfo = null;

    public UpdateStreamingJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateStreamingJobResponse withJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }

    /**
     * 作业状态
     * @return jobState
     */
    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public UpdateStreamingJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 操作结果
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateStreamingJobResponse withCheckInfo(Map<String, Object> checkInfo) {
        this.checkInfo = checkInfo;
        return this;
    }

    public UpdateStreamingJobResponse putCheckInfoItem(String key, Object checkInfoItem) {
        if (this.checkInfo == null) {
            this.checkInfo = new HashMap<>();
        }
        this.checkInfo.put(key, checkInfoItem);
        return this;
    }

    public UpdateStreamingJobResponse withCheckInfo(Consumer<Map<String, Object>> checkInfoSetter) {
        if (this.checkInfo == null) {
            this.checkInfo = new HashMap<>();
        }
        checkInfoSetter.accept(this.checkInfo);
        return this;
    }

    /**
     * 作业错误详情
     * @return checkInfo
     */
    public Map<String, Object> getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(Map<String, Object> checkInfo) {
        this.checkInfo = checkInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateStreamingJobResponse updateStreamingJobResponse = (UpdateStreamingJobResponse) o;
        return Objects.equals(this.jobId, updateStreamingJobResponse.jobId)
            && Objects.equals(this.jobState, updateStreamingJobResponse.jobState)
            && Objects.equals(this.status, updateStreamingJobResponse.status)
            && Objects.equals(this.checkInfo, updateStreamingJobResponse.checkInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobState, status, checkInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStreamingJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    checkInfo: ").append(toIndentedString(checkInfo)).append("\n");
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
