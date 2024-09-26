package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CentralNetworkErInstance
 */
public class CentralNetworkErInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_id")

    private String enterpriseRouterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asn")

    private Long asn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    public CentralNetworkErInstance withId(String id) {
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

    public CentralNetworkErInstance withEnterpriseRouterId(String enterpriseRouterId) {
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

    public CentralNetworkErInstance withProjectId(String projectId) {
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

    public CentralNetworkErInstance withRegionId(String regionId) {
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

    public CentralNetworkErInstance withAsn(Long asn) {
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

    public CentralNetworkErInstance withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 站点编码定义
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkErInstance that = (CentralNetworkErInstance) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.enterpriseRouterId, that.enterpriseRouterId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.asn, that.asn) && Objects.equals(this.siteCode, that.siteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enterpriseRouterId, projectId, regionId, asn, siteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkErInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enterpriseRouterId: ").append(toIndentedString(enterpriseRouterId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
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
