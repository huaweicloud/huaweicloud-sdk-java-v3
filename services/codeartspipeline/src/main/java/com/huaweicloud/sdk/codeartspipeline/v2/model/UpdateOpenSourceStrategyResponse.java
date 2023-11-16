package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateOpenSourceStrategyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_template_instance_id")

    private String ruleTemplateInstanceId;

    public UpdateOpenSourceStrategyResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public UpdateOpenSourceStrategyResponse withRuleTemplateInstanceId(String ruleTemplateInstanceId) {
        this.ruleTemplateInstanceId = ruleTemplateInstanceId;
        return this;
    }

    /**
     * 规则模版实例ID
     * @return ruleTemplateInstanceId
     */
    public String getRuleTemplateInstanceId() {
        return ruleTemplateInstanceId;
    }

    public void setRuleTemplateInstanceId(String ruleTemplateInstanceId) {
        this.ruleTemplateInstanceId = ruleTemplateInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOpenSourceStrategyResponse that = (UpdateOpenSourceStrategyResponse) obj;
        return Objects.equals(this.status, that.status)
            && Objects.equals(this.ruleTemplateInstanceId, that.ruleTemplateInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, ruleTemplateInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpenSourceStrategyResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ruleTemplateInstanceId: ").append(toIndentedString(ruleTemplateInstanceId)).append("\n");
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
