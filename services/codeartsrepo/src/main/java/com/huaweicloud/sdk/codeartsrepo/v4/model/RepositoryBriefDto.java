package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepositoryBriefDto
 */
public class RepositoryBriefDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_with_namespace")

    private String pathWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    public RepositoryBriefDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。 **取值范围：** 不涉及。
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

    public RepositoryBriefDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 仓库名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryBriefDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 仓库路径。 **取值范围：** 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RepositoryBriefDto withPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 仓库完整路径。 **取值范围：** 不涉及。
     * @return pathWithNamespace
     */
    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public RepositoryBriefDto withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 仓库所属项目名称。 **取值范围：** 不涉及。
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
        RepositoryBriefDto that = (RepositoryBriefDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.path, that.path) && Objects.equals(this.pathWithNamespace, that.pathWithNamespace)
            && Objects.equals(this.projectName, that.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, path, pathWithNamespace, projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryBriefDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathWithNamespace: ").append(toIndentedString(pathWithNamespace)).append("\n");
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
