package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 文件/文件夹信息
 */
public class LogTreeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private RepositoryCommitDto commit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_id")

    private String blobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submodule_url")

    private String submoduleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_limited")

    private Boolean isLimited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submodule_link")

    private String submoduleLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5")

    private String md5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public LogTreeDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 文件名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LogTreeDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LogTreeDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 文件类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LogTreeDto withCommit(RepositoryCommitDto commit) {
        this.commit = commit;
        return this;
    }

    public LogTreeDto withCommit(Consumer<RepositoryCommitDto> commitSetter) {
        if (this.commit == null) {
            this.commit = new RepositoryCommitDto();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * **参数解释：** 最近提交信息
     * @return commit
     */
    public RepositoryCommitDto getCommit() {
        return commit;
    }

    public void setCommit(RepositoryCommitDto commit) {
        this.commit = commit;
    }

    public LogTreeDto withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * **参数解释：** 文件id
     * @return blobId
     */
    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public LogTreeDto withSubmoduleUrl(String submoduleUrl) {
        this.submoduleUrl = submoduleUrl;
        return this;
    }

    /**
     * **参数解释：** 子模块url地址
     * @return submoduleUrl
     */
    public String getSubmoduleUrl() {
        return submoduleUrl;
    }

    public void setSubmoduleUrl(String submoduleUrl) {
        this.submoduleUrl = submoduleUrl;
    }

    public LogTreeDto withIsLimited(Boolean isLimited) {
        this.isLimited = isLimited;
        return this;
    }

    /**
     * **参数解释：** 文件是否受限
     * @return isLimited
     */
    public Boolean getIsLimited() {
        return isLimited;
    }

    public void setIsLimited(Boolean isLimited) {
        this.isLimited = isLimited;
    }

    public LogTreeDto withSubmoduleLink(String submoduleLink) {
        this.submoduleLink = submoduleLink;
        return this;
    }

    /**
     * **参数解释：** 子模块链接
     * @return submoduleLink
     */
    public String getSubmoduleLink() {
        return submoduleLink;
    }

    public void setSubmoduleLink(String submoduleLink) {
        this.submoduleLink = submoduleLink;
    }

    public LogTreeDto withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * **参数解释：** 文件md5
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public LogTreeDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 最近提交作者昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public LogTreeDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名称
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public LogTreeDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogTreeDto that = (LogTreeDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.path, that.path)
            && Objects.equals(this.type, that.type) && Objects.equals(this.commit, that.commit)
            && Objects.equals(this.blobId, that.blobId) && Objects.equals(this.submoduleUrl, that.submoduleUrl)
            && Objects.equals(this.isLimited, that.isLimited) && Objects.equals(this.submoduleLink, that.submoduleLink)
            && Objects.equals(this.md5, that.md5) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            path,
            type,
            commit,
            blobId,
            submoduleUrl,
            isLimited,
            submoduleLink,
            md5,
            nickName,
            tenantName,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogTreeDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
        sb.append("    submoduleUrl: ").append(toIndentedString(submoduleUrl)).append("\n");
        sb.append("    isLimited: ").append(toIndentedString(isLimited)).append("\n");
        sb.append("    submoduleLink: ").append(toIndentedString(submoduleLink)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
