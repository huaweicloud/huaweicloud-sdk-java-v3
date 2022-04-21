package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProjectV3
 */
public class ProjectV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_permission")

    private Boolean managementPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_stock")

    private Boolean isStock;

    public ProjectV3 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProjectV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectV3 withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域编码
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ProjectV3 withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 区域名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ProjectV3 withManagementPermission(Boolean managementPermission) {
        this.managementPermission = managementPermission;
        return this;
    }

    /**
     * 管理权限
     * @return managementPermission
     */
    public Boolean getManagementPermission() {
        return managementPermission;
    }

    public void setManagementPermission(Boolean managementPermission) {
        this.managementPermission = managementPermission;
    }

    public ProjectV3 withIsStock(Boolean isStock) {
        this.isStock = isStock;
        return this;
    }

    /**
     * 是否是存量项目
     * @return isStock
     */
    public Boolean getIsStock() {
        return isStock;
    }

    public void setIsStock(Boolean isStock) {
        this.isStock = isStock;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectV3 projectV3 = (ProjectV3) o;
        return Objects.equals(this.projectId, projectV3.projectId) && Objects.equals(this.name, projectV3.name)
            && Objects.equals(this.regionId, projectV3.regionId)
            && Objects.equals(this.regionName, projectV3.regionName)
            && Objects.equals(this.managementPermission, projectV3.managementPermission)
            && Objects.equals(this.isStock, projectV3.isStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, name, regionId, regionName, managementPermission, isStock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectV3 {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    managementPermission: ").append(toIndentedString(managementPermission)).append("\n");
        sb.append("    isStock: ").append(toIndentedString(isStock)).append("\n");
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
