package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteRelationsByOneCaseInfo
 */
public class DeleteRelationsByOneCaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_ids")

    private List<String> workItemIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_type")

    private String relateType;

    public DeleteRelationsByOneCaseInfo withWorkItemIds(List<String> workItemIds) {
        this.workItemIds = workItemIds;
        return this;
    }

    public DeleteRelationsByOneCaseInfo addWorkItemIdsItem(String workItemIdsItem) {
        if (this.workItemIds == null) {
            this.workItemIds = new ArrayList<>();
        }
        this.workItemIds.add(workItemIdsItem);
        return this;
    }

    public DeleteRelationsByOneCaseInfo withWorkItemIds(Consumer<List<String>> workItemIdsSetter) {
        if (this.workItemIds == null) {
            this.workItemIds = new ArrayList<>();
        }
        workItemIdsSetter.accept(this.workItemIds);
        return this;
    }

    /**
     * Get workItemIds
     * @return workItemIds
     */
    public List<String> getWorkItemIds() {
        return workItemIds;
    }

    public void setWorkItemIds(List<String> workItemIds) {
        this.workItemIds = workItemIds;
    }

    public DeleteRelationsByOneCaseInfo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public DeleteRelationsByOneCaseInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public DeleteRelationsByOneCaseInfo withRelateType(String relateType) {
        this.relateType = relateType;
        return this;
    }

    /**
     * 关联关系类型
     * @return relateType
     */
    public String getRelateType() {
        return relateType;
    }

    public void setRelateType(String relateType) {
        this.relateType = relateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteRelationsByOneCaseInfo that = (DeleteRelationsByOneCaseInfo) obj;
        return Objects.equals(this.workItemIds, that.workItemIds) && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.relateType, that.relateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workItemIds, projectUuid, versionUri, relateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRelationsByOneCaseInfo {\n");
        sb.append("    workItemIds: ").append(toIndentedString(workItemIds)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    relateType: ").append(toIndentedString(relateType)).append("\n");
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
