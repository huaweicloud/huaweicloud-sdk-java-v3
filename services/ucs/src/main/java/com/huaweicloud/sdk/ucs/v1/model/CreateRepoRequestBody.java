package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRepoRequestBody
 */
public class CreateRepoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gitRepositorySpec")

    private GitRepositorySpec gitRepositorySpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secretInfo")

    private SecretInfo secretInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterInfo")

    private ClusterInfo clusterInfo;

    public CreateRepoRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 仓库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRepoRequestBody withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 所在命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public CreateRepoRequestBody withGitRepositorySpec(GitRepositorySpec gitRepositorySpec) {
        this.gitRepositorySpec = gitRepositorySpec;
        return this;
    }

    public CreateRepoRequestBody withGitRepositorySpec(Consumer<GitRepositorySpec> gitRepositorySpecSetter) {
        if (this.gitRepositorySpec == null) {
            this.gitRepositorySpec = new GitRepositorySpec();
            gitRepositorySpecSetter.accept(this.gitRepositorySpec);
        }

        return this;
    }

    /**
     * Get gitRepositorySpec
     * @return gitRepositorySpec
     */
    public GitRepositorySpec getGitRepositorySpec() {
        return gitRepositorySpec;
    }

    public void setGitRepositorySpec(GitRepositorySpec gitRepositorySpec) {
        this.gitRepositorySpec = gitRepositorySpec;
    }

    public CreateRepoRequestBody withSecretInfo(SecretInfo secretInfo) {
        this.secretInfo = secretInfo;
        return this;
    }

    public CreateRepoRequestBody withSecretInfo(Consumer<SecretInfo> secretInfoSetter) {
        if (this.secretInfo == null) {
            this.secretInfo = new SecretInfo();
            secretInfoSetter.accept(this.secretInfo);
        }

        return this;
    }

    /**
     * Get secretInfo
     * @return secretInfo
     */
    public SecretInfo getSecretInfo() {
        return secretInfo;
    }

    public void setSecretInfo(SecretInfo secretInfo) {
        this.secretInfo = secretInfo;
    }

    public CreateRepoRequestBody withClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public CreateRepoRequestBody withClusterInfo(Consumer<ClusterInfo> clusterInfoSetter) {
        if (this.clusterInfo == null) {
            this.clusterInfo = new ClusterInfo();
            clusterInfoSetter.accept(this.clusterInfo);
        }

        return this;
    }

    /**
     * Get clusterInfo
     * @return clusterInfo
     */
    public ClusterInfo getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRepoRequestBody that = (CreateRepoRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.gitRepositorySpec, that.gitRepositorySpec)
            && Objects.equals(this.secretInfo, that.secretInfo) && Objects.equals(this.clusterInfo, that.clusterInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace, gitRepositorySpec, secretInfo, clusterInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRepoRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    gitRepositorySpec: ").append(toIndentedString(gitRepositorySpec)).append("\n");
        sb.append("    secretInfo: ").append(toIndentedString(secretInfo)).append("\n");
        sb.append("    clusterInfo: ").append(toIndentedString(clusterInfo)).append("\n");
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
