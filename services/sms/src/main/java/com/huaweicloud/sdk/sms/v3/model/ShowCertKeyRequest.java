package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCertKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ca_cert")

    private Boolean enableCaCert;

    public ShowCertKeyRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 迁移任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowCertKeyRequest withEnableCaCert(Boolean enableCaCert) {
        this.enableCaCert = enableCaCert;
        return this;
    }

    /**
     * 是否生成ca证书
     * @return enableCaCert
     */
    public Boolean getEnableCaCert() {
        return enableCaCert;
    }

    public void setEnableCaCert(Boolean enableCaCert) {
        this.enableCaCert = enableCaCert;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCertKeyRequest that = (ShowCertKeyRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.enableCaCert, that.enableCaCert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, enableCaCert);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertKeyRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    enableCaCert: ").append(toIndentedString(enableCaCert)).append("\n");
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
