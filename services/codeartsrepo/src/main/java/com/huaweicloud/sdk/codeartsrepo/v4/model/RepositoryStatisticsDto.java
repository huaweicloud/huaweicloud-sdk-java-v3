package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepositoryStatisticsDto
 */
public class RepositoryStatisticsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_count")

    private Integer commitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_size")

    private Double storageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_size")

    private Double repositorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lfs_objects_size")

    private Double lfsObjectsSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_repo_size_limit")

    private Long tenantRepoSizeLimit;

    public RepositoryStatisticsDto withCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * **参数解释：** 提交数量。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return commitCount
     */
    public Integer getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public RepositoryStatisticsDto withStorageSize(Double storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    /**
     * **参数解释：** 存储大小。 **约束限制：** 不涉及。
     * minimum: 1.0
     * maximum: 1024000.0
     * @return storageSize
     */
    public Double getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Double storageSize) {
        this.storageSize = storageSize;
    }

    public RepositoryStatisticsDto withRepositorySize(Double repositorySize) {
        this.repositorySize = repositorySize;
        return this;
    }

    /**
     * **参数解释：** 仓库大小。 **约束限制：** 不涉及。
     * minimum: 1.0
     * maximum: 1024000.0
     * @return repositorySize
     */
    public Double getRepositorySize() {
        return repositorySize;
    }

    public void setRepositorySize(Double repositorySize) {
        this.repositorySize = repositorySize;
    }

    public RepositoryStatisticsDto withLfsObjectsSize(Double lfsObjectsSize) {
        this.lfsObjectsSize = lfsObjectsSize;
        return this;
    }

    /**
     * **参数解释：** LFS对象大小。 **约束限制：** 不涉及。
     * minimum: 1.0
     * maximum: 1024000.0
     * @return lfsObjectsSize
     */
    public Double getLfsObjectsSize() {
        return lfsObjectsSize;
    }

    public void setLfsObjectsSize(Double lfsObjectsSize) {
        this.lfsObjectsSize = lfsObjectsSize;
    }

    public RepositoryStatisticsDto withTenantRepoSizeLimit(Long tenantRepoSizeLimit) {
        this.tenantRepoSizeLimit = tenantRepoSizeLimit;
        return this;
    }

    /**
     * **参数解释：** 租户仓库大小限制。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return tenantRepoSizeLimit
     */
    public Long getTenantRepoSizeLimit() {
        return tenantRepoSizeLimit;
    }

    public void setTenantRepoSizeLimit(Long tenantRepoSizeLimit) {
        this.tenantRepoSizeLimit = tenantRepoSizeLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryStatisticsDto that = (RepositoryStatisticsDto) obj;
        return Objects.equals(this.commitCount, that.commitCount) && Objects.equals(this.storageSize, that.storageSize)
            && Objects.equals(this.repositorySize, that.repositorySize)
            && Objects.equals(this.lfsObjectsSize, that.lfsObjectsSize)
            && Objects.equals(this.tenantRepoSizeLimit, that.tenantRepoSizeLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitCount, storageSize, repositorySize, lfsObjectsSize, tenantRepoSizeLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryStatisticsDto {\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
        sb.append("    repositorySize: ").append(toIndentedString(repositorySize)).append("\n");
        sb.append("    lfsObjectsSize: ").append(toIndentedString(lfsObjectsSize)).append("\n");
        sb.append("    tenantRepoSizeLimit: ").append(toIndentedString(tenantRepoSizeLimit)).append("\n");
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
