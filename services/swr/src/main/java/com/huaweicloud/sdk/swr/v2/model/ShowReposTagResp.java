package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ShowReposTagResp */
public class ShowReposTagResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private Long repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Tag")

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
    @JsonProperty(value = "deleted")

    private String deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanned")

    private Boolean scanned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private Long tagType;

    public ShowReposTagResp withId(Long id) {
        this.id = id;
        return this;
    }

    /** tag编号
     * 
     * @return id */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowReposTagResp withRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }

    /** 仓库编号
     * 
     * @return repoId */
    public Long getRepoId() {
        return repoId;
    }

    public void setRepoId(Long repoId) {
        this.repoId = repoId;
    }

    public ShowReposTagResp withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** Tag版本名称
     * 
     * @return tag */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ShowReposTagResp withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /** 镜像id
     * 
     * @return imageId */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowReposTagResp withManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }

    /** 镜像manifest
     * 
     * @return manifest */
    public String getManifest() {
        return manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public ShowReposTagResp withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /** 镜像hash值
     * 
     * @return digest */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public ShowReposTagResp withSchema(Long schema) {
        this.schema = schema;
        return this;
    }

    /** docker协议版本，值为1或2
     * 
     * @return schema */
    public Long getSchema() {
        return schema;
    }

    public void setSchema(Long schema) {
        this.schema = schema;
    }

    public ShowReposTagResp withPath(String path) {
        this.path = path;
        return this;
    }

    /** 镜像pull地址，格式为swr.cn-north-1.myhuaweicloud.com/namespace/repository:tag
     * 
     * @return path */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowReposTagResp withInternalPath(String internalPath) {
        this.internalPath = internalPath;
        return this;
    }

    /** cce集群内镜像pull路径，格式为 10.125.0.198:20202/namespace/repository:tag
     * 
     * @return internalPath */
    public String getInternalPath() {
        return internalPath;
    }

    public void setInternalPath(String internalPath) {
        this.internalPath = internalPath;
    }

    public ShowReposTagResp withSize(Long size) {
        this.size = size;
        return this;
    }

    /** 镜像大小，0 ~ 9223372036854775807
     * 
     * @return size */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ShowReposTagResp withIsTrusted(Boolean isTrusted) {
        this.isTrusted = isTrusted;
        return this;
    }

    /** 默认值为false
     * 
     * @return isTrusted */
    public Boolean getIsTrusted() {
        return isTrusted;
    }

    public void setIsTrusted(Boolean isTrusted) {
        this.isTrusted = isTrusted;
    }

    public ShowReposTagResp withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 镜像创建时间，UTC时间格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * 
     * @return created */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowReposTagResp withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /** 镜像更新时间，UTC时间格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * 
     * @return updated */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowReposTagResp withDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    /** 镜像删除时间，UTC时间格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * 
     * @return deleted */
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public ShowReposTagResp withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 帐号ID
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowReposTagResp withScanned(Boolean scanned) {
        this.scanned = scanned;
        return this;
    }

    /** 镜像是否被扫描过
     * 
     * @return scanned */
    public Boolean getScanned() {
        return scanned;
    }

    public void setScanned(Boolean scanned) {
        this.scanned = scanned;
    }

    public ShowReposTagResp withTagType(Long tagType) {
        this.tagType = tagType;
        return this;
    }

    /** 0：manifest类型；1：manifest list类型
     * 
     * @return tagType */
    public Long getTagType() {
        return tagType;
    }

    public void setTagType(Long tagType) {
        this.tagType = tagType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowReposTagResp showReposTagResp = (ShowReposTagResp) o;
        return Objects.equals(this.id, showReposTagResp.id) && Objects.equals(this.repoId, showReposTagResp.repoId)
            && Objects.equals(this.tag, showReposTagResp.tag) && Objects.equals(this.imageId, showReposTagResp.imageId)
            && Objects.equals(this.manifest, showReposTagResp.manifest)
            && Objects.equals(this.digest, showReposTagResp.digest)
            && Objects.equals(this.schema, showReposTagResp.schema) && Objects.equals(this.path, showReposTagResp.path)
            && Objects.equals(this.internalPath, showReposTagResp.internalPath)
            && Objects.equals(this.size, showReposTagResp.size)
            && Objects.equals(this.isTrusted, showReposTagResp.isTrusted)
            && Objects.equals(this.created, showReposTagResp.created)
            && Objects.equals(this.updated, showReposTagResp.updated)
            && Objects.equals(this.deleted, showReposTagResp.deleted)
            && Objects.equals(this.domainId, showReposTagResp.domainId)
            && Objects.equals(this.scanned, showReposTagResp.scanned)
            && Objects.equals(this.tagType, showReposTagResp.tagType);
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
            deleted,
            domainId,
            scanned,
            tagType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReposTagResp {\n");
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
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    scanned: ").append(toIndentedString(scanned)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
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
