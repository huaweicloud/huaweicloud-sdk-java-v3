package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 待关联或取消关联的数据集成资源信息。
 */
public class MigrationBindResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaces")

    private List<MigrationBindWorkspace> workspaces = null;

    public MigrationBindResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public MigrationBindResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public MigrationBindResource withWorkspaces(List<MigrationBindWorkspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    public MigrationBindResource addWorkspacesItem(MigrationBindWorkspace workspacesItem) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        this.workspaces.add(workspacesItem);
        return this;
    }

    public MigrationBindResource withWorkspaces(Consumer<List<MigrationBindWorkspace>> workspacesSetter) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        workspacesSetter.accept(this.workspaces);
        return this;
    }

    /**
     * 资源关联的工作空间列表。
     * @return workspaces
     */
    public List<MigrationBindWorkspace> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(List<MigrationBindWorkspace> workspaces) {
        this.workspaces = workspaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationBindResource that = (MigrationBindResource) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.workspaces, that.workspaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceName, workspaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationBindResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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
