package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepoInfoV2
 */
public class RepoInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_url")

    private String httpsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_uuid")

    private String iamUserUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_owner")

    private Integer isOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lfs_size")

    private String lfsSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_is_deleted")

    private String projectIsDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_size")

    private String repositorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_uuid")

    private String repositoryUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_url")

    private String sshUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star")

    private Boolean star;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userRole")

    private Integer userRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility_level")

    private Integer visibilityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    public RepoInfoV2 withCreatedAt(String createdAt) {
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

    public RepoInfoV2 withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者的用户名，在用户是租户的情况下，用户名和租户名相等
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public RepoInfoV2 withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 创建者的租户名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public RepoInfoV2 withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 仓库组名(克隆地址中域名后面仓库名前的一段 示例：git@repo.alpha.devcloud.inhuawei.com:Demo00228/testword.git  组名：Demo00228 )
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public RepoInfoV2 withHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
        return this;
    }

    /**
     * 使用 https 克隆仓库时所使用的 url
     * @return httpsUrl
     */
    public String getHttpsUrl() {
        return httpsUrl;
    }

    public void setHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
    }

    public RepoInfoV2 withIamUserUuid(String iamUserUuid) {
        this.iamUserUuid = iamUserUuid;
        return this;
    }

    /**
     * 用户的 iam user uuid
     * @return iamUserUuid
     */
    public String getIamUserUuid() {
        return iamUserUuid;
    }

    public void setIamUserUuid(String iamUserUuid) {
        this.iamUserUuid = iamUserUuid;
    }

    public RepoInfoV2 withIsOwner(Integer isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    /**
     * 当前用户是否是仓库的创建者，1：是，0：不是
     * @return isOwner
     */
    public Integer getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Integer isOwner) {
        this.isOwner = isOwner;
    }

    public RepoInfoV2 withLfsSize(String lfsSize) {
        this.lfsSize = lfsSize;
        return this;
    }

    /**
     * 仓库 LFS 容量，单位为M，大于 1024M 则单位为 G
     * @return lfsSize
     */
    public String getLfsSize() {
        return lfsSize;
    }

    public void setLfsSize(String lfsSize) {
        this.lfsSize = lfsSize;
    }

    public RepoInfoV2 withProjectIsDeleted(String projectIsDeleted) {
        this.projectIsDeleted = projectIsDeleted;
        return this;
    }

    /**
     * 项目是否被删除
     * @return projectIsDeleted
     */
    public String getProjectIsDeleted() {
        return projectIsDeleted;
    }

    public void setProjectIsDeleted(String projectIsDeleted) {
        this.projectIsDeleted = projectIsDeleted;
    }

    public RepoInfoV2 withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目ID，获取方式请参见[获取项目ID](codehub_api_0014.xml)。
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public RepoInfoV2 withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库主键id
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepoInfoV2 withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * 仓库名
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public RepoInfoV2 withRepositorySize(String repositorySize) {
        this.repositorySize = repositorySize;
        return this;
    }

    /**
     * 仓库总容量 = 仓库 LFS 容量 + git 库容量，单位为M，大于 1024M 则单位为 G
     * @return repositorySize
     */
    public String getRepositorySize() {
        return repositorySize;
    }

    public void setRepositorySize(String repositorySize) {
        this.repositorySize = repositorySize;
    }

    public RepoInfoV2 withRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
        return this;
    }

    /**
     * 仓库uuid(由CreateRepository接口返回)
     * @return repositoryUuid
     */
    public String getRepositoryUuid() {
        return repositoryUuid;
    }

    public void setRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
    }

    public RepoInfoV2 withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    /**
     * 使用 ssh 方式克隆仓库时所使用的 url
     * @return sshUrl
     */
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public RepoInfoV2 withStar(Boolean star) {
        this.star = star;
        return this;
    }

    /**
     * 当前用户是否收藏该仓库
     * @return star
     */
    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }

    public RepoInfoV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 仓库状态， 0：仓库正常创建成功 1：仓库创建中 2：创建失败 3：仓库冻结 4：仓库已经关闭 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public RepoInfoV2 withUpdatedAt(String updatedAt) {
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

    public RepoInfoV2 withUserRole(Integer userRole) {
        this.userRole = userRole;
        return this;
    }

    /**
     * 用户在仓库中的权限:20：只读成员 30：普通成员 40：管理员 
     * @return userRole
     */
    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public RepoInfoV2 withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    /**
     * 是否可见：0私有仓库，20公有仓库
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public RepoInfoV2 withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * web url 路径，访问它将跳转至仓库详情页
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoInfoV2 that = (RepoInfoV2) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.httpsUrl, that.httpsUrl) && Objects.equals(this.iamUserUuid, that.iamUserUuid)
            && Objects.equals(this.isOwner, that.isOwner) && Objects.equals(this.lfsSize, that.lfsSize)
            && Objects.equals(this.projectIsDeleted, that.projectIsDeleted)
            && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.repositoryName, that.repositoryName)
            && Objects.equals(this.repositorySize, that.repositorySize)
            && Objects.equals(this.repositoryUuid, that.repositoryUuid) && Objects.equals(this.sshUrl, that.sshUrl)
            && Objects.equals(this.star, that.star) && Objects.equals(this.status, that.status)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.userRole, that.userRole)
            && Objects.equals(this.visibilityLevel, that.visibilityLevel) && Objects.equals(this.webUrl, that.webUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt,
            creatorName,
            domainName,
            groupName,
            httpsUrl,
            iamUserUuid,
            isOwner,
            lfsSize,
            projectIsDeleted,
            projectUuid,
            repositoryId,
            repositoryName,
            repositorySize,
            repositoryUuid,
            sshUrl,
            star,
            status,
            updatedAt,
            userRole,
            visibilityLevel,
            webUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoInfoV2 {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    httpsUrl: ").append(toIndentedString(httpsUrl)).append("\n");
        sb.append("    iamUserUuid: ").append(toIndentedString(iamUserUuid)).append("\n");
        sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
        sb.append("    lfsSize: ").append(toIndentedString(lfsSize)).append("\n");
        sb.append("    projectIsDeleted: ").append(toIndentedString(projectIsDeleted)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    repositorySize: ").append(toIndentedString(repositorySize)).append("\n");
        sb.append("    repositoryUuid: ").append(toIndentedString(repositoryUuid)).append("\n");
        sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
        sb.append("    star: ").append(toIndentedString(star)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
        sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
