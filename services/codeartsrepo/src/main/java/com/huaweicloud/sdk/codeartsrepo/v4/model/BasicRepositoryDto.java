package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BasicRepositoryDto
 */
public class BasicRepositoryDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_mode")

    private String developMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security")

    private String security;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_with_namespace")

    private String nameWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public BasicRepositoryDto withId(Integer id) {
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

    public BasicRepositoryDto withName(String name) {
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

    public BasicRepositoryDto withNamespace(String namespace) {
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

    public BasicRepositoryDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 仓库路径。 **约束限制：** 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BasicRepositoryDto withDevelopMode(String developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * **参数解释：** 开发模式。 枚举值：normal：合并请求模式；CR：变更请求模式。 **约束限制：** 不涉及。
     * @return developMode
     */
    public String getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(String developMode) {
        this.developMode = developMode;
    }

    public BasicRepositoryDto withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释：** 仓库可见性。 枚举值：private：私有；internal：内部公开；public：公开。 **约束限制：** 不涉及。
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public BasicRepositoryDto withSecurity(String security) {
        this.security = security;
        return this;
    }

    /**
     * **参数解释：** 安全级别。 枚举值：product_internal：项目内公开；tenant_internal：租户内公开。 **约束限制：** 不涉及。
     * @return security
     */
    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public BasicRepositoryDto withNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 包含命名空间的仓库名称。 **约束限制：** 不涉及。
     * @return nameWithNamespace
     */
    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public BasicRepositoryDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * **参数解释：** 是否归档。true：已归档；false：未归档。 **约束限制：** 不涉及。
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public BasicRepositoryDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 仓库状态。 **约束限制：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicRepositoryDto that = (BasicRepositoryDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.path, that.path)
            && Objects.equals(this.developMode, that.developMode) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.security, that.security)
            && Objects.equals(this.nameWithNamespace, that.nameWithNamespace)
            && Objects.equals(this.archived, that.archived) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, namespace, path, developMode, visibility, security, nameWithNamespace, archived, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicRepositoryDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    developMode: ").append(toIndentedString(developMode)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
        sb.append("    nameWithNamespace: ").append(toIndentedString(nameWithNamespace)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
