package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Namespace
 */
public class Namespace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NamespaceMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_count")

    private Integer repoCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_allowlist")

    private CVEAllowlist cveAllowlist;

    public Namespace withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 命名空间名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Namespace withMetadata(NamespaceMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Namespace withMetadata(Consumer<NamespaceMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NamespaceMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NamespaceMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(NamespaceMetadata metadata) {
        this.metadata = metadata;
    }

    public Namespace withNamespaceId(Integer namespaceId) {
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

    public Namespace withCreatedAt(String createdAt) {
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

    public Namespace withUpdatedAt(String updatedAt) {
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

    public Namespace withRepoCount(Integer repoCount) {
        this.repoCount = repoCount;
        return this;
    }

    /**
     * 镜像数量
     * @return repoCount
     */
    public Integer getRepoCount() {
        return repoCount;
    }

    public void setRepoCount(Integer repoCount) {
        this.repoCount = repoCount;
    }

    public Namespace withCveAllowlist(CVEAllowlist cveAllowlist) {
        this.cveAllowlist = cveAllowlist;
        return this;
    }

    public Namespace withCveAllowlist(Consumer<CVEAllowlist> cveAllowlistSetter) {
        if (this.cveAllowlist == null) {
            this.cveAllowlist = new CVEAllowlist();
            cveAllowlistSetter.accept(this.cveAllowlist);
        }

        return this;
    }

    /**
     * Get cveAllowlist
     * @return cveAllowlist
     */
    public CVEAllowlist getCveAllowlist() {
        return cveAllowlist;
    }

    public void setCveAllowlist(CVEAllowlist cveAllowlist) {
        this.cveAllowlist = cveAllowlist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Namespace that = (Namespace) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.namespaceId, that.namespaceId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.repoCount, that.repoCount)
            && Objects.equals(this.cveAllowlist, that.cveAllowlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, metadata, namespaceId, createdAt, updatedAt, repoCount, cveAllowlist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Namespace {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    repoCount: ").append(toIndentedString(repoCount)).append("\n");
        sb.append("    cveAllowlist: ").append(toIndentedString(cveAllowlist)).append("\n");
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
