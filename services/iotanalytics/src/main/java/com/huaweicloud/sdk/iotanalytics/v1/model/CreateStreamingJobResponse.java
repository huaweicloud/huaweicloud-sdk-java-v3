package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateStreamingJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_info")

    private Map<String, Object> checkInfo = null;

    public CreateStreamingJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 作业ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateStreamingJobResponse withCheckInfo(Map<String, Object> checkInfo) {
        this.checkInfo = checkInfo;
        return this;
    }

    public CreateStreamingJobResponse putCheckInfoItem(String key, Object checkInfoItem) {
        if (this.checkInfo == null) {
            this.checkInfo = new HashMap<>();
        }
        this.checkInfo.put(key, checkInfoItem);
        return this;
    }

    public CreateStreamingJobResponse withCheckInfo(Consumer<Map<String, Object>> checkInfoSetter) {
        if (this.checkInfo == null) {
            this.checkInfo = new HashMap<>();
        }
        checkInfoSetter.accept(this.checkInfo);
        return this;
    }

    /** 作业错误详情
     * 
     * @return checkInfo */
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
        CreateStreamingJobResponse createStreamingJobResponse = (CreateStreamingJobResponse) o;
        return Objects.equals(this.jobId, createStreamingJobResponse.jobId)
            && Objects.equals(this.checkInfo, createStreamingJobResponse.checkInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, checkInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStreamingJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    checkInfo: ").append(toIndentedString(checkInfo)).append("\n");
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
