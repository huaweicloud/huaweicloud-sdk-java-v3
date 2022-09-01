package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateStreamGraphRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private GenStreamGraphReq body;

    public CreateStreamGraphRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get jobId
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateStreamGraphRequest withBody(GenStreamGraphReq body) {
        this.body = body;
        return this;
    }

    public CreateStreamGraphRequest withBody(Consumer<GenStreamGraphReq> bodySetter) {
        if (this.body == null) {
            this.body = new GenStreamGraphReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public GenStreamGraphReq getBody() {
        return body;
    }

    public void setBody(GenStreamGraphReq body) {
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
        CreateStreamGraphRequest createStreamGraphRequest = (CreateStreamGraphRequest) o;
        return Objects.equals(this.jobId, createStreamGraphRequest.jobId)
            && Objects.equals(this.body, createStreamGraphRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStreamGraphRequest {\n");
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
