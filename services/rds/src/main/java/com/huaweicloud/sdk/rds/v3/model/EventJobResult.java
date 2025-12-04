package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EventJobResult
 */
public class EventJobResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    public EventJobResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  事件id  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EventJobResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例id  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public EventJobResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  任务id  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public EventJobResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * **参数解释**：  错误码  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public EventJobResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * **参数解释**：  错误信息  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public EventJobResult withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释**：  是否成功  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventJobResult that = (EventJobResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, jobId, errorCode, errorMsg, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventJobResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
