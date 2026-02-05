package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建项目配置关联。
 */
public class CreateCloudStorageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_config_cluster_group_id_list")

    private List<ProjectConfigClusterGroupIdEntity> projectConfigClusterGroupIdList = null;

    public CreateCloudStorageReq withProjectConfigClusterGroupIdList(
        List<ProjectConfigClusterGroupIdEntity> projectConfigClusterGroupIdList) {
        this.projectConfigClusterGroupIdList = projectConfigClusterGroupIdList;
        return this;
    }

    public CreateCloudStorageReq addProjectConfigClusterGroupIdListItem(
        ProjectConfigClusterGroupIdEntity projectConfigClusterGroupIdListItem) {
        if (this.projectConfigClusterGroupIdList == null) {
            this.projectConfigClusterGroupIdList = new ArrayList<>();
        }
        this.projectConfigClusterGroupIdList.add(projectConfigClusterGroupIdListItem);
        return this;
    }

    public CreateCloudStorageReq withProjectConfigClusterGroupIdList(
        Consumer<List<ProjectConfigClusterGroupIdEntity>> projectConfigClusterGroupIdListSetter) {
        if (this.projectConfigClusterGroupIdList == null) {
            this.projectConfigClusterGroupIdList = new ArrayList<>();
        }
        projectConfigClusterGroupIdListSetter.accept(this.projectConfigClusterGroupIdList);
        return this;
    }

    /**
     * 创建项目配置关联ID列表。
     * @return projectConfigClusterGroupIdList
     */
    public List<ProjectConfigClusterGroupIdEntity> getProjectConfigClusterGroupIdList() {
        return projectConfigClusterGroupIdList;
    }

    public void setProjectConfigClusterGroupIdList(
        List<ProjectConfigClusterGroupIdEntity> projectConfigClusterGroupIdList) {
        this.projectConfigClusterGroupIdList = projectConfigClusterGroupIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudStorageReq that = (CreateCloudStorageReq) obj;
        return Objects.equals(this.projectConfigClusterGroupIdList, that.projectConfigClusterGroupIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectConfigClusterGroupIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudStorageReq {\n");
        sb.append("    projectConfigClusterGroupIdList: ")
            .append(toIndentedString(projectConfigClusterGroupIdList))
            .append("\n");
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
