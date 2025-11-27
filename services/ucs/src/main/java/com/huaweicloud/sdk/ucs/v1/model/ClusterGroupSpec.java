package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterGroupSpec
 */
public class ClusterGroupSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleNamespaces")

    private List<String> ruleNamespaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "federationId")

    private String federationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnsSuffix")

    private List<String> dnsSuffix = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "federationExpirationTimestamp")

    private String federationExpirationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyId")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "federationVersion")

    private String federationVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectGatewayEndpoints")

    private List<ConnectEndpoint> connectGatewayEndpoints = null;

    public ClusterGroupSpec withRuleNamespaces(List<String> ruleNamespaces) {
        this.ruleNamespaces = ruleNamespaces;
        return this;
    }

    public ClusterGroupSpec addRuleNamespacesItem(String ruleNamespacesItem) {
        if (this.ruleNamespaces == null) {
            this.ruleNamespaces = new ArrayList<>();
        }
        this.ruleNamespaces.add(ruleNamespacesItem);
        return this;
    }

    public ClusterGroupSpec withRuleNamespaces(Consumer<List<String>> ruleNamespacesSetter) {
        if (this.ruleNamespaces == null) {
            this.ruleNamespaces = new ArrayList<>();
        }
        ruleNamespacesSetter.accept(this.ruleNamespaces);
        return this;
    }

    /**
     * 权限策略关联的命名空间列表
     * @return ruleNamespaces
     */
    public List<String> getRuleNamespaces() {
        return ruleNamespaces;
    }

    public void setRuleNamespaces(List<String> ruleNamespaces) {
        this.ruleNamespaces = ruleNamespaces;
    }

    public ClusterGroupSpec withFederationId(String federationId) {
        this.federationId = federationId;
        return this;
    }

    /**
     * 舰队启用联邦ID
     * @return federationId
     */
    public String getFederationId() {
        return federationId;
    }

    public void setFederationId(String federationId) {
        this.federationId = federationId;
    }

    public ClusterGroupSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClusterGroupSpec withDnsSuffix(List<String> dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    public ClusterGroupSpec addDnsSuffixItem(String dnsSuffixItem) {
        if (this.dnsSuffix == null) {
            this.dnsSuffix = new ArrayList<>();
        }
        this.dnsSuffix.add(dnsSuffixItem);
        return this;
    }

    public ClusterGroupSpec withDnsSuffix(Consumer<List<String>> dnsSuffixSetter) {
        if (this.dnsSuffix == null) {
            this.dnsSuffix = new ArrayList<>();
        }
        dnsSuffixSetter.accept(this.dnsSuffix);
        return this;
    }

    /**
     * 舰队对应联邦的DNS后缀，开启联邦后可见
     * @return dnsSuffix
     */
    public List<String> getDnsSuffix() {
        return dnsSuffix;
    }

    public void setDnsSuffix(List<String> dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
    }

    public ClusterGroupSpec withFederationExpirationTimestamp(String federationExpirationTimestamp) {
        this.federationExpirationTimestamp = federationExpirationTimestamp;
        return this;
    }

    /**
     * 联邦到期时间戳
     * @return federationExpirationTimestamp
     */
    public String getFederationExpirationTimestamp() {
        return federationExpirationTimestamp;
    }

    public void setFederationExpirationTimestamp(String federationExpirationTimestamp) {
        this.federationExpirationTimestamp = federationExpirationTimestamp;
    }

    public ClusterGroupSpec withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略管理id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ClusterGroupSpec withFederationVersion(String federationVersion) {
        this.federationVersion = federationVersion;
        return this;
    }

    /**
     * 舰队启用联邦的版本
     * @return federationVersion
     */
    public String getFederationVersion() {
        return federationVersion;
    }

    public void setFederationVersion(String federationVersion) {
        this.federationVersion = federationVersion;
    }

    public ClusterGroupSpec withConnectGatewayEndpoints(List<ConnectEndpoint> connectGatewayEndpoints) {
        this.connectGatewayEndpoints = connectGatewayEndpoints;
        return this;
    }

    public ClusterGroupSpec addConnectGatewayEndpointsItem(ConnectEndpoint connectGatewayEndpointsItem) {
        if (this.connectGatewayEndpoints == null) {
            this.connectGatewayEndpoints = new ArrayList<>();
        }
        this.connectGatewayEndpoints.add(connectGatewayEndpointsItem);
        return this;
    }

    public ClusterGroupSpec withConnectGatewayEndpoints(Consumer<List<ConnectEndpoint>> connectGatewayEndpointsSetter) {
        if (this.connectGatewayEndpoints == null) {
            this.connectGatewayEndpoints = new ArrayList<>();
        }
        connectGatewayEndpointsSetter.accept(this.connectGatewayEndpoints);
        return this;
    }

    /**
     * 集群联邦连接网关节点列表，仅当舰队开启集群联邦时有值
     * @return connectGatewayEndpoints
     */
    public List<ConnectEndpoint> getConnectGatewayEndpoints() {
        return connectGatewayEndpoints;
    }

    public void setConnectGatewayEndpoints(List<ConnectEndpoint> connectGatewayEndpoints) {
        this.connectGatewayEndpoints = connectGatewayEndpoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterGroupSpec that = (ClusterGroupSpec) obj;
        return Objects.equals(this.ruleNamespaces, that.ruleNamespaces)
            && Objects.equals(this.federationId, that.federationId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.dnsSuffix, that.dnsSuffix)
            && Objects.equals(this.federationExpirationTimestamp, that.federationExpirationTimestamp)
            && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.federationVersion, that.federationVersion)
            && Objects.equals(this.connectGatewayEndpoints, that.connectGatewayEndpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleNamespaces,
            federationId,
            description,
            dnsSuffix,
            federationExpirationTimestamp,
            policyId,
            federationVersion,
            connectGatewayEndpoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterGroupSpec {\n");
        sb.append("    ruleNamespaces: ").append(toIndentedString(ruleNamespaces)).append("\n");
        sb.append("    federationId: ").append(toIndentedString(federationId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsSuffix: ").append(toIndentedString(dnsSuffix)).append("\n");
        sb.append("    federationExpirationTimestamp: ")
            .append(toIndentedString(federationExpirationTimestamp))
            .append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    federationVersion: ").append(toIndentedString(federationVersion)).append("\n");
        sb.append("    connectGatewayEndpoints: ").append(toIndentedString(connectGatewayEndpoints)).append("\n");
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
