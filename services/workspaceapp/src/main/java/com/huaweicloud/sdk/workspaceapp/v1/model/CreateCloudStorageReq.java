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
    @JsonProperty(value = "project_config_ids")

    private List<String> projectConfigIds = null;

    public CreateCloudStorageReq withProjectConfigIds(List<String> projectConfigIds) {
        this.projectConfigIds = projectConfigIds;
        return this;
    }

    public CreateCloudStorageReq addProjectConfigIdsItem(String projectConfigIdsItem) {
        if (this.projectConfigIds == null) {
            this.projectConfigIds = new ArrayList<>();
        }
        this.projectConfigIds.add(projectConfigIdsItem);
        return this;
    }

    public CreateCloudStorageReq withProjectConfigIds(Consumer<List<String>> projectConfigIdsSetter) {
        if (this.projectConfigIds == null) {
            this.projectConfigIds = new ArrayList<>();
        }
        projectConfigIdsSetter.accept(this.projectConfigIds);
        return this;
    }

    /**
     * project_config_id,数量区间 [1, 50]。
     * @return projectConfigIds
     */
    public List<String> getProjectConfigIds() {
        return projectConfigIds;
    }

    public void setProjectConfigIds(List<String> projectConfigIds) {
        this.projectConfigIds = projectConfigIds;
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
        return Objects.equals(this.projectConfigIds, that.projectConfigIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectConfigIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudStorageReq {\n");
        sb.append("    projectConfigIds: ").append(toIndentedString(projectConfigIds)).append("\n");
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
