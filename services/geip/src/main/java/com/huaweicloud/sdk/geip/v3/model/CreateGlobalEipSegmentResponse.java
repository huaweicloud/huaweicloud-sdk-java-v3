package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateGlobalEipSegmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_segment")

    private ShortGlobalEipSegment globalEipSegment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateGlobalEipSegmentResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 本次请求的job id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateGlobalEipSegmentResponse withGlobalEipSegment(ShortGlobalEipSegment globalEipSegment) {
        this.globalEipSegment = globalEipSegment;
        return this;
    }

    public CreateGlobalEipSegmentResponse withGlobalEipSegment(Consumer<ShortGlobalEipSegment> globalEipSegmentSetter) {
        if (this.globalEipSegment == null) {
            this.globalEipSegment = new ShortGlobalEipSegment();
            globalEipSegmentSetter.accept(this.globalEipSegment);
        }

        return this;
    }

    /**
     * Get globalEipSegment
     * @return globalEipSegment
     */
    public ShortGlobalEipSegment getGlobalEipSegment() {
        return globalEipSegment;
    }

    public void setGlobalEipSegment(ShortGlobalEipSegment globalEipSegment) {
        this.globalEipSegment = globalEipSegment;
    }

    public CreateGlobalEipSegmentResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGlobalEipSegmentResponse that = (CreateGlobalEipSegmentResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.globalEipSegment, that.globalEipSegment)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, globalEipSegment, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalEipSegmentResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    globalEipSegment: ").append(toIndentedString(globalEipSegment)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
