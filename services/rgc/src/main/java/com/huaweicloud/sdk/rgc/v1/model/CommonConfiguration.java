package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Landing Zone配置信息。
 */
public class CommonConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "home_region")

    private String homeRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_trail_type")

    private Boolean cloudTrailType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_center_status")

    private String identityCenterStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_structure_type")

    private String organizationStructureType;

    public CommonConfiguration withHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
        return this;
    }

    /**
     * 主区域名。
     * @return homeRegion
     */
    public String getHomeRegion() {
        return homeRegion;
    }

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    public CommonConfiguration withCloudTrailType(Boolean cloudTrailType) {
        this.cloudTrailType = cloudTrailType;
        return this;
    }

    /**
     * CTS配置状态。
     * @return cloudTrailType
     */
    public Boolean getCloudTrailType() {
        return cloudTrailType;
    }

    public void setCloudTrailType(Boolean cloudTrailType) {
        this.cloudTrailType = cloudTrailType;
    }

    public CommonConfiguration withIdentityCenterStatus(String identityCenterStatus) {
        this.identityCenterStatus = identityCenterStatus;
        return this;
    }

    /**
     * 是否设置Landing Zone的identity center。
     * @return identityCenterStatus
     */
    public String getIdentityCenterStatus() {
        return identityCenterStatus;
    }

    public void setIdentityCenterStatus(String identityCenterStatus) {
        this.identityCenterStatus = identityCenterStatus;
    }

    public CommonConfiguration withOrganizationStructureType(String organizationStructureType) {
        this.organizationStructureType = organizationStructureType;
        return this;
    }

    /**
     * 设置organization的类型。STANDARD和NON_STANDARD。
     * @return organizationStructureType
     */
    public String getOrganizationStructureType() {
        return organizationStructureType;
    }

    public void setOrganizationStructureType(String organizationStructureType) {
        this.organizationStructureType = organizationStructureType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonConfiguration that = (CommonConfiguration) obj;
        return Objects.equals(this.homeRegion, that.homeRegion)
            && Objects.equals(this.cloudTrailType, that.cloudTrailType)
            && Objects.equals(this.identityCenterStatus, that.identityCenterStatus)
            && Objects.equals(this.organizationStructureType, that.organizationStructureType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeRegion, cloudTrailType, identityCenterStatus, organizationStructureType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonConfiguration {\n");
        sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
        sb.append("    cloudTrailType: ").append(toIndentedString(cloudTrailType)).append("\n");
        sb.append("    identityCenterStatus: ").append(toIndentedString(identityCenterStatus)).append("\n");
        sb.append("    organizationStructureType: ").append(toIndentedString(organizationStructureType)).append("\n");
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
