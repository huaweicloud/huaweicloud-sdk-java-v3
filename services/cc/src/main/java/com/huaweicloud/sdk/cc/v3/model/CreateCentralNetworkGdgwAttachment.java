package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建中心网络GDGW附件的请求体。
 */
public class CreateCentralNetworkGdgwAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_id")

    private String enterpriseRouterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_project_id")

    private String globalDcGatewayProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_region_id")

    private String globalDcGatewayRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_project_id")

    private String enterpriseRouterProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_region_id")

    private String enterpriseRouterRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_plane_id")

    private String centralNetworkPlaneId;

    public CreateCentralNetworkGdgwAttachment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCentralNetworkGdgwAttachment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCentralNetworkGdgwAttachment withEnterpriseRouterId(String enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
        return this;
    }

    /**
     * 企业路由器的ID。
     * @return enterpriseRouterId
     */
    public String getEnterpriseRouterId() {
        return enterpriseRouterId;
    }

    public void setEnterpriseRouterId(String enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
    }

    public CreateCentralNetworkGdgwAttachment withGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
        return this;
    }

    /**
     * Gdgw的ID。
     * @return globalDcGatewayId
     */
    public String getGlobalDcGatewayId() {
        return globalDcGatewayId;
    }

    public void setGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
    }

    public CreateCentralNetworkGdgwAttachment withGlobalDcGatewayProjectId(String globalDcGatewayProjectId) {
        this.globalDcGatewayProjectId = globalDcGatewayProjectId;
        return this;
    }

    /**
     * Gdgw的项目ID。
     * @return globalDcGatewayProjectId
     */
    public String getGlobalDcGatewayProjectId() {
        return globalDcGatewayProjectId;
    }

    public void setGlobalDcGatewayProjectId(String globalDcGatewayProjectId) {
        this.globalDcGatewayProjectId = globalDcGatewayProjectId;
    }

    public CreateCentralNetworkGdgwAttachment withGlobalDcGatewayRegionId(String globalDcGatewayRegionId) {
        this.globalDcGatewayRegionId = globalDcGatewayRegionId;
        return this;
    }

    /**
     * Gdgw的RegionID。
     * @return globalDcGatewayRegionId
     */
    public String getGlobalDcGatewayRegionId() {
        return globalDcGatewayRegionId;
    }

    public void setGlobalDcGatewayRegionId(String globalDcGatewayRegionId) {
        this.globalDcGatewayRegionId = globalDcGatewayRegionId;
    }

    public CreateCentralNetworkGdgwAttachment withEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
        return this;
    }

    /**
     * 企业路由器的项目ID。
     * @return enterpriseRouterProjectId
     */
    public String getEnterpriseRouterProjectId() {
        return enterpriseRouterProjectId;
    }

    public void setEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
    }

    public CreateCentralNetworkGdgwAttachment withEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
        this.enterpriseRouterRegionId = enterpriseRouterRegionId;
        return this;
    }

    /**
     * ER路由器的regionID。
     * @return enterpriseRouterRegionId
     */
    public String getEnterpriseRouterRegionId() {
        return enterpriseRouterRegionId;
    }

    public void setEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
        this.enterpriseRouterRegionId = enterpriseRouterRegionId;
    }

    public CreateCentralNetworkGdgwAttachment withCentralNetworkPlaneId(String centralNetworkPlaneId) {
        this.centralNetworkPlaneId = centralNetworkPlaneId;
        return this;
    }

    /**
     * 中心网络平面ID。
     * @return centralNetworkPlaneId
     */
    public String getCentralNetworkPlaneId() {
        return centralNetworkPlaneId;
    }

    public void setCentralNetworkPlaneId(String centralNetworkPlaneId) {
        this.centralNetworkPlaneId = centralNetworkPlaneId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCentralNetworkGdgwAttachment that = (CreateCentralNetworkGdgwAttachment) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseRouterId, that.enterpriseRouterId)
            && Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId)
            && Objects.equals(this.globalDcGatewayProjectId, that.globalDcGatewayProjectId)
            && Objects.equals(this.globalDcGatewayRegionId, that.globalDcGatewayRegionId)
            && Objects.equals(this.enterpriseRouterProjectId, that.enterpriseRouterProjectId)
            && Objects.equals(this.enterpriseRouterRegionId, that.enterpriseRouterRegionId)
            && Objects.equals(this.centralNetworkPlaneId, that.centralNetworkPlaneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            enterpriseRouterId,
            globalDcGatewayId,
            globalDcGatewayProjectId,
            globalDcGatewayRegionId,
            enterpriseRouterProjectId,
            enterpriseRouterRegionId,
            centralNetworkPlaneId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCentralNetworkGdgwAttachment {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseRouterId: ").append(toIndentedString(enterpriseRouterId)).append("\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
        sb.append("    globalDcGatewayProjectId: ").append(toIndentedString(globalDcGatewayProjectId)).append("\n");
        sb.append("    globalDcGatewayRegionId: ").append(toIndentedString(globalDcGatewayRegionId)).append("\n");
        sb.append("    enterpriseRouterProjectId: ").append(toIndentedString(enterpriseRouterProjectId)).append("\n");
        sb.append("    enterpriseRouterRegionId: ").append(toIndentedString(enterpriseRouterRegionId)).append("\n");
        sb.append("    centralNetworkPlaneId: ").append(toIndentedString(centralNetworkPlaneId)).append("\n");
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
