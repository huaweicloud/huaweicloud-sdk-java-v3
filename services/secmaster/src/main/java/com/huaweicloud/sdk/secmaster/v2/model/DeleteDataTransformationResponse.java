package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteDataTransformationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_id")

    private String dataTransformationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private JobProcessStatus processStatus;

    public DeleteDataTransformationResponse withDataTransformationId(String dataTransformationId) {
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

    public DeleteDataTransformationResponse withDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return deleteTime
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public DeleteDataTransformationResponse withProcessStatus(JobProcessStatus processStatus) {
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
        DeleteDataTransformationResponse that = (DeleteDataTransformationResponse) obj;
        return Objects.equals(this.dataTransformationId, that.dataTransformationId)
            && Objects.equals(this.deleteTime, that.deleteTime)
            && Objects.equals(this.processStatus, that.processStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataTransformationId, deleteTime, processStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDataTransformationResponse {\n");
        sb.append("    dataTransformationId: ").append(toIndentedString(dataTransformationId)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
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
