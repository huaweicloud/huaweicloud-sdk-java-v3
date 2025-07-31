package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateSecurityGroupPolicyRequestBody
 */
public class UpdateSecurityGroupPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    public UpdateSecurityGroupPolicyRequestBody withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 安全策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateSecurityGroupPolicyRequestBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public UpdateSecurityGroupPolicyRequestBody withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public UpdateSecurityGroupPolicyRequestBody addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public UpdateSecurityGroupPolicyRequestBody withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组列表
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecurityGroupPolicyRequestBody that = (UpdateSecurityGroupPolicyRequestBody) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.securityGroups, that.securityGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, policyName, securityGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityGroupPolicyRequestBody {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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
