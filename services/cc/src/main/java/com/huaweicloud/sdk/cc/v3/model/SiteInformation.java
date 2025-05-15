package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分支信息。
 */
public class SiteInformation {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asn")

    private Long asn;

    public SiteInformation withRegionId(String regionId) {
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

    public SiteInformation withProjectId(String projectId) {
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

    public SiteInformation withGatewayType(GatewayTypeEnum gatewayType) {
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

    public SiteInformation withGatewayId(String gatewayId) {
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

    public SiteInformation withSiteCode(String siteCode) {
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

    public SiteInformation withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    /**
     * 网络实例BGP协议的AS号。
     * minimum: 0
     * maximum: 4294967295
     * @return asn
     */
    public Long getAsn() {
        return asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteInformation that = (SiteInformation) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.gatewayType, that.gatewayType) && Objects.equals(this.gatewayId, that.gatewayId)
            && Objects.equals(this.siteCode, that.siteCode) && Objects.equals(this.asn, that.asn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, projectId, gatewayType, gatewayId, siteCode, asn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteInformation {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    gatewayType: ").append(toIndentedString(gatewayType)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
        sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
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
