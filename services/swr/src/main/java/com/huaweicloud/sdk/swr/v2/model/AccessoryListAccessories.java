package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessoryListAccessories
 */
public class AccessoryListAccessories {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sig_tag")

    private String sigTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sig_digest")

    private String sigDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_digest")

    private String targetDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public AccessoryListAccessories withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 附件编号
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccessoryListAccessories withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 附件所属的租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AccessoryListAccessories withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 附件所属的组织
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public AccessoryListAccessories withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 附件所属的仓库
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public AccessoryListAccessories withSigTag(String sigTag) {
        this.sigTag = sigTag;
        return this;
    }

    /**
     * 附件镜像的版本
     * @return sigTag
     */
    public String getSigTag() {
        return sigTag;
    }

    public void setSigTag(String sigTag) {
        this.sigTag = sigTag;
    }

    public AccessoryListAccessories withSigDigest(String sigDigest) {
        this.sigDigest = sigDigest;
        return this;
    }

    /**
     * 附件镜像的hash值
     * @return sigDigest
     */
    public String getSigDigest() {
        return sigDigest;
    }

    public void setSigDigest(String sigDigest) {
        this.sigDigest = sigDigest;
    }

    public AccessoryListAccessories withTargetDigest(String targetDigest) {
        this.targetDigest = targetDigest;
        return this;
    }

    /**
     * 附件关联镜像的hash值
     * @return targetDigest
     */
    public String getTargetDigest() {
        return targetDigest;
    }

    public void setTargetDigest(String targetDigest) {
        this.targetDigest = targetDigest;
    }

    public AccessoryListAccessories withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 附件镜像的大小
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public AccessoryListAccessories withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 附件的类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AccessoryListAccessories withCreatedAt(String createdAt) {
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

    public AccessoryListAccessories withUpdatedAt(String updatedAt) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessoryListAccessories that = (AccessoryListAccessories) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.namespaceName, that.namespaceName) && Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.sigTag, that.sigTag) && Objects.equals(this.sigDigest, that.sigDigest)
            && Objects.equals(this.targetDigest, that.targetDigest) && Objects.equals(this.size, that.size)
            && Objects.equals(this.type, that.type) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            namespaceName,
            repoName,
            sigTag,
            sigDigest,
            targetDigest,
            size,
            type,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessoryListAccessories {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    sigTag: ").append(toIndentedString(sigTag)).append("\n");
        sb.append("    sigDigest: ").append(toIndentedString(sigDigest)).append("\n");
        sb.append("    targetDigest: ").append(toIndentedString(targetDigest)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
