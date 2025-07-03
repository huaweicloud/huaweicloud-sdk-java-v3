package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRepoTagResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private Long repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest")

    private String manifest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private Long schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_path")

    private String internalPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_trusted")

    private Boolean isTrusted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private Long tagType;

    public ShowRepoTagResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * tag编号
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowRepoTagResponse withRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 仓库编号
     * @return repoId
     */
    public Long getRepoId() {
        return repoId;
    }

    public void setRepoId(Long repoId) {
        this.repoId = repoId;
    }

    public ShowRepoTagResponse withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * tag版本名称
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ShowRepoTagResponse withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowRepoTagResponse withManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }

    /**
     * 镜像manifest
     * @return manifest
     */
    public String getManifest() {
        return manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public ShowRepoTagResponse withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * 镜像hash值
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public ShowRepoTagResponse withSchema(Long schema) {
        this.schema = schema;
        return this;
    }

    /**
     * docker协议版本，值为1或2
     * @return schema
     */
    public Long getSchema() {
        return schema;
    }

    public void setSchema(Long schema) {
        this.schema = schema;
    }

    public ShowRepoTagResponse withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 镜像pull地址，格式为swr.cn-north-1.myhuaweicloud.com/namespace/repository:tag
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowRepoTagResponse withInternalPath(String internalPath) {
        this.internalPath = internalPath;
        return this;
    }

    /**
     * cce集群内镜像pull路径，格式为 10.125.0.198:20202/namespace/repository:tag
     * @return internalPath
     */
    public String getInternalPath() {
        return internalPath;
    }

    public void setInternalPath(String internalPath) {
        this.internalPath = internalPath;
    }

    public ShowRepoTagResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 镜像大小，0 ~ 9223372036854775807
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ShowRepoTagResponse withIsTrusted(Boolean isTrusted) {
        this.isTrusted = isTrusted;
        return this;
    }

    /**
     * 默认值为false
     * @return isTrusted
     */
    public Boolean getIsTrusted() {
        return isTrusted;
    }

    public void setIsTrusted(Boolean isTrusted) {
        this.isTrusted = isTrusted;
    }

    public ShowRepoTagResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 镜像创建时间，UTC时间格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowRepoTagResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 镜像更新时间，UTC时间格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowRepoTagResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 帐号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowRepoTagResponse withTagType(Long tagType) {
        this.tagType = tagType;
        return this;
    }

    /**
     * 0：manifest类型；1：manifest list类型
     * @return tagType
     */
    public Long getTagType() {
        return tagType;
    }

    public void setTagType(Long tagType) {
        this.tagType = tagType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepoTagResponse that = (ShowRepoTagResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.repoId, that.repoId)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.manifest, that.manifest) && Objects.equals(this.digest, that.digest)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.path, that.path)
            && Objects.equals(this.internalPath, that.internalPath) && Objects.equals(this.size, that.size)
            && Objects.equals(this.isTrusted, that.isTrusted) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.tagType, that.tagType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            repoId,
            tag,
            imageId,
            manifest,
            digest,
            schema,
            path,
            internalPath,
            size,
            isTrusted,
            created,
            updated,
            domainId,
            tagType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepoTagResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    internalPath: ").append(toIndentedString(internalPath)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    isTrusted: ").append(toIndentedString(isTrusted)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
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
