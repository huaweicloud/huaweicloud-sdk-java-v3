package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DisableDataTransformationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_id")

    private String dataTransformationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private JobStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private JobProcessStatus processStatus;

    public DisableDataTransformationResponse withDataTransformationId(String dataTransformationId) {
        this.dataTransformationId = dataTransformationId;
        return this;
    }

    /**
     * UUID
     * @return dataTransformationId
     */
    public String getDataTransformationId() {
        return dataTransformationId;
    }

    public void setDataTransformationId(String dataTransformationId) {
        this.dataTransformationId = dataTransformationId;
    }

    public DisableDataTransformationResponse withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public DisableDataTransformationResponse withProcessStatus(JobProcessStatus processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * Get processStatus
     * @return processStatus
     */
    public JobProcessStatus getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(JobProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisableDataTransformationResponse that = (DisableDataTransformationResponse) obj;
        return Objects.equals(this.dataTransformationId, that.dataTransformationId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.processStatus, that.processStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataTransformationId, status, processStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableDataTransformationResponse {\n");
        sb.append("    dataTransformationId: ").append(toIndentedString(dataTransformationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
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
