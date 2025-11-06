package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProjectSimpleDto
 */
public class ProjectSimpleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_with_namespace")

    private String nameWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_with_namespace")

    private String pathWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_mode")

    private String developMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_kia")

    private Boolean isKia;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_url_to_repo")

    private String sshUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_url_to_repo")

    private String httpUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readme_url")

    private String readmeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_mgnt_mode")

    private Integer memberMgntMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private NamespaceBasicDto namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_type")

    private String repoType;

    public ProjectSimpleDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 项目id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProjectSimpleDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 项目描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectSimpleDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectSimpleDto withNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    /**
     * 项目名称
     * @return nameWithNamespace
     */
    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public ProjectSimpleDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 项目路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ProjectSimpleDto withPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }

    /**
     * 项目路径
     * @return pathWithNamespace
     */
    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public ProjectSimpleDto withDevelopMode(String developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * 开发模式
     * @return developMode
     */
    public String getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(String developMode) {
        this.developMode = developMode;
    }

    public ProjectSimpleDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ProjectSimpleDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProjectSimpleDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * 是否归档
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public ProjectSimpleDto withIsKia(Boolean isKia) {
        this.isKia = isKia;
        return this;
    }

    /**
     * 是否为kia仓
     * @return isKia
     */
    public Boolean getIsKia() {
        return isKia;
    }

    public void setIsKia(Boolean isKia) {
        this.isKia = isKia;
    }

    public ProjectSimpleDto withSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
        return this;
    }

    /**
     * 项目url
     * @return sshUrlToRepo
     */
    public String getSshUrlToRepo() {
        return sshUrlToRepo;
    }

    public void setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
    }

    public ProjectSimpleDto withHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
        return this;
    }

    /**
     * 项目url
     * @return httpUrlToRepo
     */
    public String getHttpUrlToRepo() {
        return httpUrlToRepo;
    }

    public void setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
    }

    public ProjectSimpleDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 项目url
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public ProjectSimpleDto withReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
        return this;
    }

    /**
     * 项目readme url
     * @return readmeUrl
     */
    public String getReadmeUrl() {
        return readmeUrl;
    }

    public void setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
    }

    public ProjectSimpleDto withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * product id
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProjectSimpleDto withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * product name
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProjectSimpleDto withMemberMgntMode(Integer memberMgntMode) {
        this.memberMgntMode = memberMgntMode;
        return this;
    }

    /**
     * member mgnt mode
     * @return memberMgntMode
     */
    public Integer getMemberMgntMode() {
        return memberMgntMode;
    }

    public void setMemberMgntMode(Integer memberMgntMode) {
        this.memberMgntMode = memberMgntMode;
    }

    public ProjectSimpleDto withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * visibility
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public ProjectSimpleDto withNamespace(NamespaceBasicDto namespace) {
        this.namespace = namespace;
        return this;
    }

    public ProjectSimpleDto withNamespace(Consumer<NamespaceBasicDto> namespaceSetter) {
        if (this.namespace == null) {
            this.namespace = new NamespaceBasicDto();
            namespaceSetter.accept(this.namespace);
        }

        return this;
    }

    /**
     * Get namespace
     * @return namespace
     */
    public NamespaceBasicDto getNamespace() {
        return namespace;
    }

    public void setNamespace(NamespaceBasicDto namespace) {
        this.namespace = namespace;
    }

    public ProjectSimpleDto withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * 项目类型
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectSimpleDto that = (ProjectSimpleDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameWithNamespace, that.nameWithNamespace)
            && Objects.equals(this.path, that.path) && Objects.equals(this.pathWithNamespace, that.pathWithNamespace)
            && Objects.equals(this.developMode, that.developMode) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.archived, that.archived)
            && Objects.equals(this.isKia, that.isKia) && Objects.equals(this.sshUrlToRepo, that.sshUrlToRepo)
            && Objects.equals(this.httpUrlToRepo, that.httpUrlToRepo) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.readmeUrl, that.readmeUrl) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.memberMgntMode, that.memberMgntMode)
            && Objects.equals(this.visibility, that.visibility) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.repoType, that.repoType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            name,
            nameWithNamespace,
            path,
            pathWithNamespace,
            developMode,
            createdAt,
            updatedAt,
            archived,
            isKia,
            sshUrlToRepo,
            httpUrlToRepo,
            webUrl,
            readmeUrl,
            productId,
            productName,
            memberMgntMode,
            visibility,
            namespace,
            repoType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectSimpleDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameWithNamespace: ").append(toIndentedString(nameWithNamespace)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathWithNamespace: ").append(toIndentedString(pathWithNamespace)).append("\n");
        sb.append("    developMode: ").append(toIndentedString(developMode)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    isKia: ").append(toIndentedString(isKia)).append("\n");
        sb.append("    sshUrlToRepo: ").append(toIndentedString(sshUrlToRepo)).append("\n");
        sb.append("    httpUrlToRepo: ").append(toIndentedString(httpUrlToRepo)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    readmeUrl: ").append(toIndentedString(readmeUrl)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    memberMgntMode: ").append(toIndentedString(memberMgntMode)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
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
