package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSiteInformation
 */
public class CreateSiteInformation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_type")

    private GatewayTypeEnum gatewayType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    public CreateSiteInformation withRegionId(String regionId) {
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

    public CreateSiteInformation withProjectId(String projectId) {
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

    public CreateSiteInformation withGatewayType(GatewayTypeEnum gatewayType) {
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

    public CreateSiteInformation withGatewayId(String gatewayId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSiteInformation that = (CreateSiteInformation) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.gatewayType, that.gatewayType) && Objects.equals(this.gatewayId, that.gatewayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, projectId, gatewayType, gatewayId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSiteInformation {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    gatewayType: ").append(toIndentedString(gatewayType)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
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
