package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServerRoceNetwork
 */
public class ServerRoceNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private String subnets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider:network_type")

    private String providerNetworkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider:physical_network")

    private String providerPhysicalNetwork;

    public ServerRoceNetwork withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：RoCE网络id。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerRoceNetwork withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：RoCE网络名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerRoceNetwork withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：项目ID。 **取值范围**：不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ServerRoceNetwork withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：状态。 **参数解释**：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServerRoceNetwork withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释**：租户id。 **取值范围**：不涉及。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ServerRoceNetwork withSubnets(String subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * **参数解释**：子网。 **取值范围**：不涉及。
     * @return subnets
     */
    public String getSubnets() {
        return subnets;
    }

    public void setSubnets(String subnets) {
        this.subnets = subnets;
    }

    public ServerRoceNetwork withProviderNetworkType(String providerNetworkType) {
        this.providerNetworkType = providerNetworkType;
        return this;
    }

    /**
     * **参数解释**：RoCE网络类型。 **取值范围**：不涉及。
     * @return providerNetworkType
     */
    public String getProviderNetworkType() {
        return providerNetworkType;
    }

    public void setProviderNetworkType(String providerNetworkType) {
        this.providerNetworkType = providerNetworkType;
    }

    public ServerRoceNetwork withProviderPhysicalNetwork(String providerPhysicalNetwork) {
        this.providerPhysicalNetwork = providerPhysicalNetwork;
        return this;
    }

    /**
     * **参数解释**：实际物理网络。 **取值范围**：不涉及。
     * @return providerPhysicalNetwork
     */
    public String getProviderPhysicalNetwork() {
        return providerPhysicalNetwork;
    }

    public void setProviderPhysicalNetwork(String providerPhysicalNetwork) {
        this.providerPhysicalNetwork = providerPhysicalNetwork;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerRoceNetwork that = (ServerRoceNetwork) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.subnets, that.subnets)
            && Objects.equals(this.providerNetworkType, that.providerNetworkType)
            && Objects.equals(this.providerPhysicalNetwork, that.providerPhysicalNetwork);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, projectId, status, tenantId, subnets, providerNetworkType, providerPhysicalNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerRoceNetwork {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
        sb.append("    providerNetworkType: ").append(toIndentedString(providerNetworkType)).append("\n");
        sb.append("    providerPhysicalNetwork: ").append(toIndentedString(providerPhysicalNetwork)).append("\n");
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
