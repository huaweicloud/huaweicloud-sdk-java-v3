package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略内容
 */
public class PolicyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_image_startup")

    private Boolean enableImageStartup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private String policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private Integer severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_item")

    private List<String> riskyItem = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private Integer action;

    public PolicyContent withEnableImageStartup(Boolean enableImageStartup) {
        this.enableImageStartup = enableImageStartup;
        return this;
    }

    /**
     * 是否允许未扫描镜像启动
     * @return enableImageStartup
     */
    public Boolean getEnableImageStartup() {
        return enableImageStartup;
    }

    public void setEnableImageStartup(Boolean enableImageStartup) {
        this.enableImageStartup = enableImageStartup;
    }

    public PolicyContent withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 告警策略: - vuls: 漏洞 - baselines: 基线  - malwares: 恶意脚本 
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public PolicyContent withSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 风险等级
     * minimum: 1
     * maximum: 32
     * @return severity
     */
    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public PolicyContent withRiskyItem(List<String> riskyItem) {
        this.riskyItem = riskyItem;
        return this;
    }

    public PolicyContent addRiskyItemItem(String riskyItemItem) {
        if (this.riskyItem == null) {
            this.riskyItem = new ArrayList<>();
        }
        this.riskyItem.add(riskyItemItem);
        return this;
    }

    public PolicyContent withRiskyItem(Consumer<List<String>> riskyItemSetter) {
        if (this.riskyItem == null) {
            this.riskyItem = new ArrayList<>();
        }
        riskyItemSetter.accept(this.riskyItem);
        return this;
    }

    /**
     * 危险项
     * @return riskyItem
     */
    public List<String> getRiskyItem() {
        return riskyItem;
    }

    public void setRiskyItem(List<String> riskyItem) {
        this.riskyItem = riskyItem;
    }

    public PolicyContent withAction(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * 防护动作   - 0: 告警   - 1: 阻断   - 2: 放行 
     * minimum: 0
     * maximum: 10
     * @return action
     */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyContent that = (PolicyContent) obj;
        return Objects.equals(this.enableImageStartup, that.enableImageStartup)
            && Objects.equals(this.policyType, that.policyType) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.riskyItem, that.riskyItem) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableImageStartup, policyType, severity, riskyItem, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyContent {\n");
        sb.append("    enableImageStartup: ").append(toIndentedString(enableImageStartup)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    riskyItem: ").append(toIndentedString(riskyItem)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
