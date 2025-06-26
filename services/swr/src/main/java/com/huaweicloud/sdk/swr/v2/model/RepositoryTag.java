package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepositoryTag
 */
public class RepositoryTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_id")

    private Integer artifactId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_type")

    private String mediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_media_type")

    private String manifestMediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pull_time")

    private String pullTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_time")

    private String pushTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public RepositoryTag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 版本名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryTag withArtifactId(Integer artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * 关联的制品ID
     * @return artifactId
     */
    public Integer getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Integer artifactId) {
        this.artifactId = artifactId;
    }

    public RepositoryTag withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * 关联的制品摘要
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public RepositoryTag withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 版本ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RepositoryTag withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 制品仓库仓库ID
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepositoryTag withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 制品类型，比如IMAGE
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RepositoryTag withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 命名空间ID
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public RepositoryTag withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * 制品MIME类型
     * @return mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public RepositoryTag withManifestMediaType(String manifestMediaType) {
        this.manifestMediaType = manifestMediaType;
        return this;
    }

    /**
     * 制品元数据MIME类型
     * @return manifestMediaType
     */
    public String getManifestMediaType() {
        return manifestMediaType;
    }

    public void setManifestMediaType(String manifestMediaType) {
        this.manifestMediaType = manifestMediaType;
    }

    public RepositoryTag withPullTime(String pullTime) {
        this.pullTime = pullTime;
        return this;
    }

    /**
     * 最近一次拉取时间
     * @return pullTime
     */
    public String getPullTime() {
        return pullTime;
    }

    public void setPullTime(String pullTime) {
        this.pullTime = pullTime;
    }

    public RepositoryTag withPushTime(String pushTime) {
        this.pushTime = pushTime;
        return this;
    }

    /**
     * 最近一次上传时间
     * @return pushTime
     */
    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) {
        this.pushTime = pushTime;
    }

    public RepositoryTag withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 制品大小，单位：Byte
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryTag that = (RepositoryTag) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.artifactId, that.artifactId)
            && Objects.equals(this.digest, that.digest) && Objects.equals(this.id, that.id)
            && Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.namespaceId, that.namespaceId) && Objects.equals(this.mediaType, that.mediaType)
            && Objects.equals(this.manifestMediaType, that.manifestMediaType)
            && Objects.equals(this.pullTime, that.pullTime) && Objects.equals(this.pushTime, that.pushTime)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            artifactId,
            digest,
            id,
            repositoryId,
            type,
            namespaceId,
            mediaType,
            manifestMediaType,
            pullTime,
            pushTime,
            size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryTag {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    manifestMediaType: ").append(toIndentedString(manifestMediaType)).append("\n");
        sb.append("    pullTime: ").append(toIndentedString(pullTime)).append("\n");
        sb.append("    pushTime: ").append(toIndentedString(pushTime)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
