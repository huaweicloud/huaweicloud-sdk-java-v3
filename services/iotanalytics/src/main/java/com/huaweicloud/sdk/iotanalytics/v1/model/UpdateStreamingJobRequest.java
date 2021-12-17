package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateStreamingJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check")

    private Boolean check;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Map<String, Object> body = null;

    public UpdateStreamingJobRequest withCheck(Boolean check) {
        this.check = check;
        return this;
    }

    /** 是否需要校验配置是否正确
     * 
     * @return check */
    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public UpdateStreamingJobRequest withJobId(String jobId) {
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

    public UpdateStreamingJobRequest withBody(Map<String, Object> body) {
        this.body = body;
        return this;
    }

    public UpdateStreamingJobRequest putBodyItem(String key, Object bodyItem) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        this.body.put(key, bodyItem);
        return this;
    }

    public UpdateStreamingJobRequest withBody(Consumer<Map<String, Object>> bodySetter) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /** 实时分析作业详细配置，每个作业可选择不同的算子进行组合，各算子的使用方法详见：实时分析算子配置指南。
     * 
     * @return body */
    public Map<String, Object> getBody() {
        return body;
    }

    public void setBody(Map<String, Object> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateStreamingJobRequest updateStreamingJobRequest = (UpdateStreamingJobRequest) o;
        return Objects.equals(this.check, updateStreamingJobRequest.check)
            && Objects.equals(this.jobId, updateStreamingJobRequest.jobId)
            && Objects.equals(this.body, updateStreamingJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(check, jobId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStreamingJobRequest {\n");
        sb.append("    check: ").append(toIndentedString(check)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
