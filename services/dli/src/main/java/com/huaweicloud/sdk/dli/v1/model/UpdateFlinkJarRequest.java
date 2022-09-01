package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFlinkJarRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateFlinkdefinedJobsResp body;

    public UpdateFlinkJarRequest withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID。
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public UpdateFlinkJarRequest withBody(UpdateFlinkdefinedJobsResp body) {
        this.body = body;
        return this;
    }

    public UpdateFlinkJarRequest withBody(Consumer<UpdateFlinkdefinedJobsResp> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFlinkdefinedJobsResp();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFlinkdefinedJobsResp getBody() {
        return body;
    }

    public void setBody(UpdateFlinkdefinedJobsResp body) {
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
        UpdateFlinkJarRequest updateFlinkJarRequest = (UpdateFlinkJarRequest) o;
        return Objects.equals(this.jobId, updateFlinkJarRequest.jobId)
            && Objects.equals(this.body, updateFlinkJarRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlinkJarRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
