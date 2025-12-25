package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资产所属环境
 */
public class ResourceEnvironment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_type")

    private String vendorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_name")

    private String epName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_name")

    private String vendorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idc_name")

    private String idcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idc_id")

    private String idcId;

    public ResourceEnvironment withVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }

    /**
     * 环境供应商
     * @return vendorType
     */
    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public ResourceEnvironment withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * HWC special，资产归属
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ResourceEnvironment withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * HWC special，全局服务\"global\"，资产归属
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ResourceEnvironment withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * HWC special， 全局服务默认null， 资产归属
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ResourceEnvironment withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * HWC special，资产归属的企业项目id。
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ResourceEnvironment withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    /**
     * HWC special，资产归属的企业项目名称。
     * @return epName
     */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public ResourceEnvironment withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * OCA special，包含资产探针或资产提供商
     * @return vendorName
     */
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public ResourceEnvironment withIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }

    /**
     * OCA special，线下机房名称
     * @return idcName
     */
    public String getIdcName() {
        return idcName;
    }

    public void setIdcName(String idcName) {
        this.idcName = idcName;
    }

    public ResourceEnvironment withIdcId(String idcId) {
        this.idcId = idcId;
        return this;
    }

    /**
     * OCA special，线下机房id
     * @return idcId
     */
    public String getIdcId() {
        return idcId;
    }

    public void setIdcId(String idcId) {
        this.idcId = idcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceEnvironment that = (ResourceEnvironment) obj;
        return Objects.equals(this.vendorType, that.vendorType) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.epId, that.epId) && Objects.equals(this.epName, that.epName)
            && Objects.equals(this.vendorName, that.vendorName) && Objects.equals(this.idcName, that.idcName)
            && Objects.equals(this.idcId, that.idcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorType, domainId, regionId, projectId, epId, epName, vendorName, idcName, idcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceEnvironment {\n");
        sb.append("    vendorType: ").append(toIndentedString(vendorType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    epName: ").append(toIndentedString(epName)).append("\n");
        sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
        sb.append("    idcName: ").append(toIndentedString(idcName)).append("\n");
        sb.append("    idcId: ").append(toIndentedString(idcId)).append("\n");
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
