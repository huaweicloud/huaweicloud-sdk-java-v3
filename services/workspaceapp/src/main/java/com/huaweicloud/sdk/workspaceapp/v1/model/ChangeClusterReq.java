package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 切换文件夹归属集群请求体
 */
public class ChangeClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_cluster_group_id")

    private String targetClusterGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_config_id")

    private String targetProjectConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage_assignment_ids")

    private List<String> cloudStorageAssignmentIds = null;

    public ChangeClusterReq withTargetClusterGroupId(String targetClusterGroupId) {
        this.targetClusterGroupId = targetClusterGroupId;
        return this;
    }

    /**
     * 目标集群ID
     * @return targetClusterGroupId
     */
    public String getTargetClusterGroupId() {
        return targetClusterGroupId;
    }

    public void setTargetClusterGroupId(String targetClusterGroupId) {
        this.targetClusterGroupId = targetClusterGroupId;
    }

    public ChangeClusterReq withTargetProjectConfigId(String targetProjectConfigId) {
        this.targetProjectConfigId = targetProjectConfigId;
        return this;
    }

    /**
     * 目标项目配置ID
     * @return targetProjectConfigId
     */
    public String getTargetProjectConfigId() {
        return targetProjectConfigId;
    }

    public void setTargetProjectConfigId(String targetProjectConfigId) {
        this.targetProjectConfigId = targetProjectConfigId;
    }

    public ChangeClusterReq withCloudStorageAssignmentIds(List<String> cloudStorageAssignmentIds) {
        this.cloudStorageAssignmentIds = cloudStorageAssignmentIds;
        return this;
    }

    public ChangeClusterReq addCloudStorageAssignmentIdsItem(String cloudStorageAssignmentIdsItem) {
        if (this.cloudStorageAssignmentIds == null) {
            this.cloudStorageAssignmentIds = new ArrayList<>();
        }
        this.cloudStorageAssignmentIds.add(cloudStorageAssignmentIdsItem);
        return this;
    }

    public ChangeClusterReq withCloudStorageAssignmentIds(Consumer<List<String>> cloudStorageAssignmentIdsSetter) {
        if (this.cloudStorageAssignmentIds == null) {
            this.cloudStorageAssignmentIds = new ArrayList<>();
        }
        cloudStorageAssignmentIdsSetter.accept(this.cloudStorageAssignmentIds);
        return this;
    }

    /**
     * 文件系统id,数量区间 [1, 50]。
     * @return cloudStorageAssignmentIds
     */
    public List<String> getCloudStorageAssignmentIds() {
        return cloudStorageAssignmentIds;
    }

    public void setCloudStorageAssignmentIds(List<String> cloudStorageAssignmentIds) {
        this.cloudStorageAssignmentIds = cloudStorageAssignmentIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeClusterReq that = (ChangeClusterReq) obj;
        return Objects.equals(this.targetClusterGroupId, that.targetClusterGroupId)
            && Objects.equals(this.targetProjectConfigId, that.targetProjectConfigId)
            && Objects.equals(this.cloudStorageAssignmentIds, that.cloudStorageAssignmentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetClusterGroupId, targetProjectConfigId, cloudStorageAssignmentIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeClusterReq {\n");
        sb.append("    targetClusterGroupId: ").append(toIndentedString(targetClusterGroupId)).append("\n");
        sb.append("    targetProjectConfigId: ").append(toIndentedString(targetProjectConfigId)).append("\n");
        sb.append("    cloudStorageAssignmentIds: ").append(toIndentedString(cloudStorageAssignmentIds)).append("\n");
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
