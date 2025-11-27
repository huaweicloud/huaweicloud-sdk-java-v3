package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepoResponse
 */
public class RepoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoType")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gitRepository")

    private GitRepository gitRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoStatus")

    private String repoStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterInfo")

    private ClusterInfo clusterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secretInfo")

    private SecretInfo secretInfo;

    public RepoResponse withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 仓库的唯一标识符
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public RepoResponse withName(String name) {
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

    public RepoResponse withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * 仓库类型，包括Bucket、HelmChart、GitRepository、HelmRepository，目前仅支持GitRepository
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public RepoResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public RepoResponse withGitRepository(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
        return this;
    }

    public RepoResponse withGitRepository(Consumer<GitRepository> gitRepositorySetter) {
        if (this.gitRepository == null) {
            this.gitRepository = new GitRepository();
            gitRepositorySetter.accept(this.gitRepository);
        }

        return this;
    }

    /**
     * Get gitRepository
     * @return gitRepository
     */
    public GitRepository getGitRepository() {
        return gitRepository;
    }

    public void setGitRepository(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
    }

    public RepoResponse withRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }

    /**
     * 仓库状态，包括Health、Failed、Unknown、Progressing
     * @return repoStatus
     */
    public String getRepoStatus() {
        return repoStatus;
    }

    public void setRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
    }

    public RepoResponse withClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public RepoResponse withClusterInfo(Consumer<ClusterInfo> clusterInfoSetter) {
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

    public RepoResponse withSecretInfo(SecretInfo secretInfo) {
        this.secretInfo = secretInfo;
        return this;
    }

    public RepoResponse withSecretInfo(Consumer<SecretInfo> secretInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoResponse that = (RepoResponse) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.repoType, that.repoType) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.gitRepository, that.gitRepository)
            && Objects.equals(this.repoStatus, that.repoStatus) && Objects.equals(this.clusterInfo, that.clusterInfo)
            && Objects.equals(this.secretInfo, that.secretInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name, repoType, namespace, gitRepository, repoStatus, clusterInfo, secretInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoResponse {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    gitRepository: ").append(toIndentedString(gitRepository)).append("\n");
        sb.append("    repoStatus: ").append(toIndentedString(repoStatus)).append("\n");
        sb.append("    clusterInfo: ").append(toIndentedString(clusterInfo)).append("\n");
        sb.append("    secretInfo: ").append(toIndentedString(secretInfo)).append("\n");
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
