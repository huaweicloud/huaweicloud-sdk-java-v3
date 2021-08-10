package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowProjectDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private String namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private String project;

    public ShowProjectDetailResponse withNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /** 命名空间ID。
     * 
     * @return namespaceId */
    public String getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    public ShowProjectDetailResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /** 命名空间。
     * 
     * @return namespace */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowProjectDetailResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 仓库项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowProjectDetailResponse withProject(String project) {
        this.project = project;
        return this;
    }

    /** 仓库项目。
     * 
     * @return project */
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectDetailResponse showProjectDetailResponse = (ShowProjectDetailResponse) o;
        return Objects.equals(this.namespaceId, showProjectDetailResponse.namespaceId)
            && Objects.equals(this.namespace, showProjectDetailResponse.namespace)
            && Objects.equals(this.projectId, showProjectDetailResponse.projectId)
            && Objects.equals(this.project, showProjectDetailResponse.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaceId, namespace, projectId, project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectDetailResponse {\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
