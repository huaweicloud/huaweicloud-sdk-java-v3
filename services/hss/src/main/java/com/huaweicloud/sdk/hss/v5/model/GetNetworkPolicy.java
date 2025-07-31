package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetNetworkPolicy
 */
public class GetNetworkPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_content")

    private NetworkPolicyBody policyContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_status")

    private Boolean deployStatus;

    public GetNetworkPolicy withPolicyId(String policyId) {
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

    public GetNetworkPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetNetworkPolicy withNamespace(String namespace) {
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

    public GetNetworkPolicy withPolicyContent(NetworkPolicyBody policyContent) {
        this.policyContent = policyContent;
        return this;
    }

    public GetNetworkPolicy withPolicyContent(Consumer<NetworkPolicyBody> policyContentSetter) {
        if (this.policyContent == null) {
            this.policyContent = new NetworkPolicyBody();
            policyContentSetter.accept(this.policyContent);
        }

        return this;
    }

    /**
     * Get policyContent
     * @return policyContent
     */
    public NetworkPolicyBody getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(NetworkPolicyBody policyContent) {
        this.policyContent = policyContent;
    }

    public GetNetworkPolicy withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public GetNetworkPolicy withDeployStatus(Boolean deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }

    /**
     * 下发策略到cce成功与否
     * @return deployStatus
     */
    public Boolean getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(Boolean deployStatus) {
        this.deployStatus = deployStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetNetworkPolicy that = (GetNetworkPolicy) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.policyContent, that.policyContent)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.deployStatus, that.deployStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, name, namespace, policyContent, createTime, deployStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNetworkPolicy {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    policyContent: ").append(toIndentedString(policyContent)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deployStatus: ").append(toIndentedString(deployStatus)).append("\n");
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
