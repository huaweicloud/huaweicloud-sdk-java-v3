package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DirectedEdge
 */
public class DirectedEdge {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_type")

    private GatewayTypeEnum gatewayType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public DirectedEdge withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DirectedEdge withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * RegionID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public DirectedEdge withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 网关的ID。
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public DirectedEdge withGatewayType(GatewayTypeEnum gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Get gatewayType
     * @return gatewayType
     */
    public GatewayTypeEnum getGatewayType() {
        return gatewayType;
    }

    public void setGatewayType(GatewayTypeEnum gatewayType) {
        this.gatewayType = gatewayType;
    }

    public DirectedEdge withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 站点编码。
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public DirectedEdge withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 实例所属项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectedEdge that = (DirectedEdge) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.gatewayType, that.gatewayType)
            && Objects.equals(this.siteCode, that.siteCode) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regionId, gatewayId, gatewayType, siteCode, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectedEdge {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    gatewayType: ").append(toIndentedString(gatewayType)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
