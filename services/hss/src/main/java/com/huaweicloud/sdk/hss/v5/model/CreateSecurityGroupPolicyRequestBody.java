package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSecurityGroupPolicyRequestBody
 */
public class CreateSecurityGroupPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_id")

    private String workloadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_name")

    private String workloadName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_type")

    private String workloadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    public CreateSecurityGroupPolicyRequestBody withPolicyName(String policyName) {
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

    public CreateSecurityGroupPolicyRequestBody withWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }

    /**
     * 工作负载ID
     * @return workloadId
     */
    public String getWorkloadId() {
        return workloadId;
    }

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    public CreateSecurityGroupPolicyRequestBody withWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }

    /**
     * 工作负载名称
     * @return workloadName
     */
    public String getWorkloadName() {
        return workloadName;
    }

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    public CreateSecurityGroupPolicyRequestBody withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * 工作负载类型
     * @return workloadType
     */
    public String getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    public CreateSecurityGroupPolicyRequestBody withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateSecurityGroupPolicyRequestBody addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateSecurityGroupPolicyRequestBody withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
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
        CreateSecurityGroupPolicyRequestBody that = (CreateSecurityGroupPolicyRequestBody) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.workloadId, that.workloadId)
            && Objects.equals(this.workloadName, that.workloadName)
            && Objects.equals(this.workloadType, that.workloadType)
            && Objects.equals(this.securityGroups, that.securityGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, workloadId, workloadName, workloadType, securityGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupPolicyRequestBody {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
        sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
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
