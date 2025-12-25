package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatasetItem
 */
public class DatasetItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert")

    private Boolean alert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_alert")

    private Boolean allowAlert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_lts")

    private Boolean allowLts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private Boolean region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public DatasetItem withAlert(Boolean alert) {
        this.alert = alert;
        return this;
    }

    /**
     * 是否触发告警
     * @return alert
     */
    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    public DatasetItem withAllowAlert(Boolean allowAlert) {
        this.allowAlert = allowAlert;
        return this;
    }

    /**
     * 是否允许告警
     * @return allowAlert
     */
    public Boolean getAllowAlert() {
        return allowAlert;
    }

    public void setAllowAlert(Boolean allowAlert) {
        this.allowAlert = allowAlert;
    }

    public DatasetItem withAllowLts(Boolean allowLts) {
        this.allowLts = allowLts;
        return this;
    }

    /**
     * 是否允许长期存储
     * @return allowLts
     */
    public Boolean getAllowLts() {
        return allowLts;
    }

    public void setAllowLts(Boolean allowLts) {
        this.allowLts = allowLts;
    }

    public DatasetItem withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，单位为毫秒的时间戳
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public DatasetItem withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID，唯一标识
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DatasetItem withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 启用状态，例如 \"active\" 表示启用
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public DatasetItem withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，唯一标识
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DatasetItem withRegion(Boolean region) {
        this.region = region;
        return this;
    }

    /**
     * 是否是区域级数据
     * @return region
     */
    public Boolean getRegion() {
        return region;
    }

    public void setRegion(Boolean region) {
        this.region = region;
    }

    public DatasetItem withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID，表示当前区域
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public DatasetItem withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 操作是否成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public DatasetItem withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总记录数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public DatasetItem withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，单位为毫秒的时间戳
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public DatasetItem withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID，唯一标识
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatasetItem that = (DatasetItem) obj;
        return Objects.equals(this.alert, that.alert) && Objects.equals(this.allowAlert, that.allowAlert)
            && Objects.equals(this.allowLts, that.allowLts) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.success, that.success)
            && Objects.equals(this.total, that.total) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alert,
            allowAlert,
            allowLts,
            createTime,
            domainId,
            enable,
            projectId,
            region,
            regionId,
            success,
            total,
            updateTime,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasetItem {\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    allowAlert: ").append(toIndentedString(allowAlert)).append("\n");
        sb.append("    allowLts: ").append(toIndentedString(allowLts)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
