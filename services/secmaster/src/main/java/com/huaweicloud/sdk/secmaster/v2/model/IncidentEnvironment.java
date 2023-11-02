package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件产生的环境坐标信息
 */
public class IncidentEnvironment {

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
    @JsonProperty(value = "cross_workspace_id")

    private String crossWorkspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public IncidentEnvironment withVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }

    /**
     * 环境供应商：HWCP/HWC/AWS/Azure/GCP
     * @return vendorType
     */
    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public IncidentEnvironment withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public IncidentEnvironment withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id，全局服务global
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public IncidentEnvironment withCrossWorkspaceId(String crossWorkspaceId) {
        this.crossWorkspaceId = crossWorkspaceId;
        return this;
    }

    /**
     * 数据投递前的源工作空间id，在源空间下值为null，投递后为被委托用户的id
     * @return crossWorkspaceId
     */
    public String getCrossWorkspaceId() {
        return crossWorkspaceId;
    }

    public void setCrossWorkspaceId(String crossWorkspaceId) {
        this.crossWorkspaceId = crossWorkspaceId;
    }

    public IncidentEnvironment withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id， 全局服务默认null
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
        IncidentEnvironment that = (IncidentEnvironment) obj;
        return Objects.equals(this.vendorType, that.vendorType) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.crossWorkspaceId, that.crossWorkspaceId)
            && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorType, domainId, regionId, crossWorkspaceId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentEnvironment {\n");
        sb.append("    vendorType: ").append(toIndentedString(vendorType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    crossWorkspaceId: ").append(toIndentedString(crossWorkspaceId)).append("\n");
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
