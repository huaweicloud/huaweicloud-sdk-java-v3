package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowStrategyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_set_id")

    private String ruleSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_project_id")

    private String cloudProjectId;

    public ShowStrategyRequest withRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
        return this;
    }

    /**
     * 策略ID
     * @return ruleSetId
     */
    public String getRuleSetId() {
        return ruleSetId;
    }

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    public ShowStrategyRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowStrategyRequest withCloudProjectId(String cloudProjectId) {
        this.cloudProjectId = cloudProjectId;
        return this;
    }

    /**
     * 项目ID
     * @return cloudProjectId
     */
    public String getCloudProjectId() {
        return cloudProjectId;
    }

    public void setCloudProjectId(String cloudProjectId) {
        this.cloudProjectId = cloudProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStrategyRequest that = (ShowStrategyRequest) obj;
        return Objects.equals(this.ruleSetId, that.ruleSetId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.cloudProjectId, that.cloudProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleSetId, domainId, cloudProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStrategyRequest {\n");
        sb.append("    ruleSetId: ").append(toIndentedString(ruleSetId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    cloudProjectId: ").append(toIndentedString(cloudProjectId)).append("\n");
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
