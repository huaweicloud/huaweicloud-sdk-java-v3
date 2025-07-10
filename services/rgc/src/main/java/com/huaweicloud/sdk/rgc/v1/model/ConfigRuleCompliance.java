package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigRuleCompliance
 */
public class ConfigRuleCompliance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_id")

    private String controlId;

    public ConfigRuleCompliance withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 合规规则。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ConfigRuleCompliance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 合规状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConfigRuleCompliance withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域信息。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ConfigRuleCompliance withControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    /**
     * 控制策略ID。
     * @return controlId
     */
    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigRuleCompliance that = (ConfigRuleCompliance) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.region, that.region) && Objects.equals(this.controlId, that.controlId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, status, region, controlId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigRuleCompliance {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
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
