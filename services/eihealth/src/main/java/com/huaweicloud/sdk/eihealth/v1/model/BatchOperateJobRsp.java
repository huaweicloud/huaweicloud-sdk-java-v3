package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchOperateJobRsp
 */
public class BatchOperateJobRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BatchOperateJobStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public BatchOperateJobRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchOperateJobRsp withStatus(BatchOperateJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BatchOperateJobStatus getStatus() {
        return status;
    }

    public void setStatus(BatchOperateJobStatus status) {
        this.status = status;
    }

    public BatchOperateJobRsp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 操作结果失败信息，仅在操作失败时会返回
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchOperateJobRsp batchOperateJobRsp = (BatchOperateJobRsp) o;
        return Objects.equals(this.id, batchOperateJobRsp.id) && Objects.equals(this.status, batchOperateJobRsp.status)
            && Objects.equals(this.message, batchOperateJobRsp.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchOperateJobRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
