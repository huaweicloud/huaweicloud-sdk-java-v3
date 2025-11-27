package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GitRepository
 */
public class GitRepository {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private GitRepositoryMetaData metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private GitRepositorySpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private GitRepositoryStatus status;

    public GitRepository withMetadata(GitRepositoryMetaData metadata) {
        this.metadata = metadata;
        return this;
    }

    public GitRepository withMetadata(Consumer<GitRepositoryMetaData> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new GitRepositoryMetaData();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public GitRepositoryMetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(GitRepositoryMetaData metadata) {
        this.metadata = metadata;
    }

    public GitRepository withSpec(GitRepositorySpec spec) {
        this.spec = spec;
        return this;
    }

    public GitRepository withSpec(Consumer<GitRepositorySpec> specSetter) {
        if (this.spec == null) {
            this.spec = new GitRepositorySpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public GitRepositorySpec getSpec() {
        return spec;
    }

    public void setSpec(GitRepositorySpec spec) {
        this.spec = spec;
    }

    public GitRepository withStatus(GitRepositoryStatus status) {
        this.status = status;
        return this;
    }

    public GitRepository withStatus(Consumer<GitRepositoryStatus> statusSetter) {
        if (this.status == null) {
            this.status = new GitRepositoryStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public GitRepositoryStatus getStatus() {
        return status;
    }

    public void setStatus(GitRepositoryStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GitRepository that = (GitRepository) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitRepository {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
