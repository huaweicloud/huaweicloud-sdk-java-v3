package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ForkedFromRepositorySimplestDto
 */
public class ForkedFromRepositorySimplestDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_with_namespace")

    private String nameWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_with_namespace")

    private String pathWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    public ForkedFromRepositorySimplestDto withNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 带命名空间的仓库名称。 **约束限制：** 不涉及。
     * @return nameWithNamespace
     */
    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public ForkedFromRepositorySimplestDto withPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 带命名空间的仓库路径。 **约束限制：** 不涉及。
     * @return pathWithNamespace
     */
    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public ForkedFromRepositorySimplestDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 仓库名称。 **约束限制：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ForkedFromRepositorySimplestDto withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释：** 命名空间。 **约束限制：** 不涉及。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ForkedFromRepositorySimplestDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库ID **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ForkedFromRepositorySimplestDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 产品ID。 **约束限制：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ForkedFromRepositorySimplestDto withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 产品名称。 **约束限制：** 不涉及。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ForkedFromRepositorySimplestDto that = (ForkedFromRepositorySimplestDto) obj;
        return Objects.equals(this.nameWithNamespace, that.nameWithNamespace)
            && Objects.equals(this.pathWithNamespace, that.pathWithNamespace) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.id, that.id)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameWithNamespace, pathWithNamespace, name, namespace, id, projectId, projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForkedFromRepositorySimplestDto {\n");
        sb.append("    nameWithNamespace: ").append(toIndentedString(nameWithNamespace)).append("\n");
        sb.append("    pathWithNamespace: ").append(toIndentedString(pathWithNamespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
