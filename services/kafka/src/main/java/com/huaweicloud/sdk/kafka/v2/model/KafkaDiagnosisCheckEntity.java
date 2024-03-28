package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * kafka消息积压诊断预检查实体
 */
public class KafkaDiagnosisCheckEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    public KafkaDiagnosisCheckEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 预检查项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KafkaDiagnosisCheckEntity withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 预检查失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public KafkaDiagnosisCheckEntity withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 预检查是否正常
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
        KafkaDiagnosisCheckEntity that = (KafkaDiagnosisCheckEntity) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, reason, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaDiagnosisCheckEntity {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
