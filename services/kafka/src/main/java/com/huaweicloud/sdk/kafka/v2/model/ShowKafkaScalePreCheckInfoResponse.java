package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowKafkaScalePreCheckInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk")

    private String risk;

    public ShowKafkaScalePreCheckInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 检查项名称。  **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowKafkaScalePreCheckInfoResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释**： 检查项状态。 **取值范围**： - true：正常。 - false：异常。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ShowKafkaScalePreCheckInfoResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**： 失败原因。    **取值范围**： 不涉及。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ShowKafkaScalePreCheckInfoResponse withRisk(String risk) {
        this.risk = risk;
        return this;
    }

    /**
     * **参数解释**： 风险等级。   **取值范围**： - low：低风险。 - medium：中风险。 - high：高风险。
     * @return risk
     */
    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKafkaScalePreCheckInfoResponse that = (ShowKafkaScalePreCheckInfoResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.success, that.success)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.risk, that.risk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, success, reason, risk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaScalePreCheckInfoResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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
