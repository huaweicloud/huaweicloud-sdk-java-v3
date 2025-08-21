package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_id")

    private String blobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private RepositoryCommitDto commit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_limited")

    private Boolean isLimited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_sha256")

    private String contentSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_commit_id")

    private String lastCommitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ShowFileResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 文件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowFileResponse withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 文件路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowFileResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 文件大小
     * minimum: 1
     * maximum: 9007199254740992
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ShowFileResponse withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * 文件编码方式
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public ShowFileResponse withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * 分支名称、tag名称或者commitid
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public ShowFileResponse withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * 文件标识
     * @return blobId
     */
    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public ShowFileResponse withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ShowFileResponse withCommit(RepositoryCommitDto commit) {
        this.commit = commit;
        return this;
    }

    public ShowFileResponse withCommit(Consumer<RepositoryCommitDto> commitSetter) {
        if (this.commit == null) {
            this.commit = new RepositoryCommitDto();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    public RepositoryCommitDto getCommit() {
        return commit;
    }

    public void setCommit(RepositoryCommitDto commit) {
        this.commit = commit;
    }

    public ShowFileResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 文件内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowFileResponse withIsLimited(Boolean isLimited) {
        this.isLimited = isLimited;
        return this;
    }

    /**
     * **参数解释：** 文件是否受限。 **取值范围：** - false, 不受限。 - true, 受限。
     * @return isLimited
     */
    public Boolean getIsLimited() {
        return isLimited;
    }

    public void setIsLimited(Boolean isLimited) {
        this.isLimited = isLimited;
    }

    public ShowFileResponse withContentSha256(String contentSha256) {
        this.contentSha256 = contentSha256;
        return this;
    }

    /**
     * sha256值
     * @return contentSha256
     */
    public String getContentSha256() {
        return contentSha256;
    }

    public void setContentSha256(String contentSha256) {
        this.contentSha256 = contentSha256;
    }

    public ShowFileResponse withLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * 最新提交commitid
     * @return lastCommitId
     */
    public String getLastCommitId() {
        return lastCommitId;
    }

    public void setLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
    }

    public ShowFileResponse withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ShowFileResponse withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名称
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public ShowFileResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowFileResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFileResponse that = (ShowFileResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.path, that.path)
            && Objects.equals(this.size, that.size) && Objects.equals(this.encoding, that.encoding)
            && Objects.equals(this.ref, that.ref) && Objects.equals(this.blobId, that.blobId)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.commit, that.commit)
            && Objects.equals(this.content, that.content) && Objects.equals(this.isLimited, that.isLimited)
            && Objects.equals(this.contentSha256, that.contentSha256)
            && Objects.equals(this.lastCommitId, that.lastCommitId) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            path,
            size,
            encoding,
            ref,
            blobId,
            fileType,
            commit,
            content,
            isLimited,
            contentSha256,
            lastCommitId,
            nickName,
            tenantName,
            userName,
            xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFileResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    isLimited: ").append(toIndentedString(isLimited)).append("\n");
        sb.append("    contentSha256: ").append(toIndentedString(contentSha256)).append("\n");
        sb.append("    lastCommitId: ").append(toIndentedString(lastCommitId)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
