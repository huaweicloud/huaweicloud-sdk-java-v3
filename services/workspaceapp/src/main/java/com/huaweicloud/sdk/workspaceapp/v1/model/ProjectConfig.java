package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 项目配置信息。
 */
public class ProjectConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_config_id")

    private String projectConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_config_name")

    private String projectConfigName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_quota")

    private Long storageQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_relevance")

    private Boolean isRelevance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_group_id")

    private String clusterGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public ProjectConfig withProjectConfigId(String projectConfigId) {
        this.projectConfigId = projectConfigId;
        return this;
    }

    /**
     * 项目配置名称。
     * @return projectConfigId
     */
    public String getProjectConfigId() {
        return projectConfigId;
    }

    public void setProjectConfigId(String projectConfigId) {
        this.projectConfigId = projectConfigId;
    }

    public ProjectConfig withProjectConfigName(String projectConfigName) {
        this.projectConfigName = projectConfigName;
        return this;
    }

    /**
     * 项目名称。
     * @return projectConfigName
     */
    public String getProjectConfigName() {
        return projectConfigName;
    }

    public void setProjectConfigName(String projectConfigName) {
        this.projectConfigName = projectConfigName;
    }

    public ProjectConfig withStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }

    /**
     * 存储配额。
     * @return storageQuota
     */
    public Long getStorageQuota() {
        return storageQuota;
    }

    public void setStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
    }

    public ProjectConfig withIsRelevance(Boolean isRelevance) {
        this.isRelevance = isRelevance;
        return this;
    }

    /**
     * 是否已经关联
     * @return isRelevance
     */
    public Boolean getIsRelevance() {
        return isRelevance;
    }

    public void setIsRelevance(Boolean isRelevance) {
        this.isRelevance = isRelevance;
    }

    public ProjectConfig withClusterGroupId(String clusterGroupId) {
        this.clusterGroupId = clusterGroupId;
        return this;
    }

    /**
     * sfs集群ID。
     * @return clusterGroupId
     */
    public String getClusterGroupId() {
        return clusterGroupId;
    }

    public void setClusterGroupId(String clusterGroupId) {
        this.clusterGroupId = clusterGroupId;
    }

    public ProjectConfig withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectConfig that = (ProjectConfig) obj;
        return Objects.equals(this.projectConfigId, that.projectConfigId)
            && Objects.equals(this.projectConfigName, that.projectConfigName)
            && Objects.equals(this.storageQuota, that.storageQuota)
            && Objects.equals(this.isRelevance, that.isRelevance)
            && Objects.equals(this.clusterGroupId, that.clusterGroupId)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectConfigId, projectConfigName, storageQuota, isRelevance, clusterGroupId, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectConfig {\n");
        sb.append("    projectConfigId: ").append(toIndentedString(projectConfigId)).append("\n");
        sb.append("    projectConfigName: ").append(toIndentedString(projectConfigName)).append("\n");
        sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
        sb.append("    isRelevance: ").append(toIndentedString(isRelevance)).append("\n");
        sb.append("    clusterGroupId: ").append(toIndentedString(clusterGroupId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
