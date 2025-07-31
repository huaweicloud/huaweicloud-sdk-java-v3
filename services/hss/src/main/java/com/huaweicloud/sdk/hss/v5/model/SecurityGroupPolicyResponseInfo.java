package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 安全组策略
 */
public class SecurityGroupPolicyResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_selector")

    private String podSelector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

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
    @JsonProperty(value = "namespace_id")

    private String namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_content")

    private String policyContent;

    public SecurityGroupPolicyResponseInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略Id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public SecurityGroupPolicyResponseInfo withPolicyName(String policyName) {
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

    public SecurityGroupPolicyResponseInfo withPodSelector(String podSelector) {
        this.podSelector = podSelector;
        return this;
    }

    /**
     * 选择器
     * @return podSelector
     */
    public String getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(String podSelector) {
        this.podSelector = podSelector;
    }

    public SecurityGroupPolicyResponseInfo withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public SecurityGroupPolicyResponseInfo addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public SecurityGroupPolicyResponseInfo withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
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

    public SecurityGroupPolicyResponseInfo withWorkloadId(String workloadId) {
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

    public SecurityGroupPolicyResponseInfo withWorkloadName(String workloadName) {
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

    public SecurityGroupPolicyResponseInfo withWorkloadType(String workloadType) {
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

    public SecurityGroupPolicyResponseInfo withNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 命名空间id
     * @return namespaceId
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    public SecurityGroupPolicyResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public SecurityGroupPolicyResponseInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SecurityGroupPolicyResponseInfo withPolicyContent(String policyContent) {
        this.policyContent = policyContent;
        return this;
    }

    /**
     * 策略yaml格式内容
     * @return policyContent
     */
    public String getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityGroupPolicyResponseInfo that = (SecurityGroupPolicyResponseInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.podSelector, that.podSelector)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.workloadId, that.workloadId) && Objects.equals(this.workloadName, that.workloadName)
            && Objects.equals(this.workloadType, that.workloadType)
            && Objects.equals(this.namespaceId, that.namespaceId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.policyContent, that.policyContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            podSelector,
            securityGroups,
            workloadId,
            workloadName,
            workloadType,
            namespaceId,
            namespace,
            createTime,
            policyContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroupPolicyResponseInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
        sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    policyContent: ").append(toIndentedString(policyContent)).append("\n");
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
