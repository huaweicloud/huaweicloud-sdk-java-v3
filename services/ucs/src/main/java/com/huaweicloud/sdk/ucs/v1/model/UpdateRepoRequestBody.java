package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateRepoRequestBody
 */
public class UpdateRepoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoType")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gitRepositorySpec")

    private GitRepositorySpec gitRepositorySpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secretInfo")

    private SecretInfo secretInfo;

    public UpdateRepoRequestBody withName(String name) {
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

    public UpdateRepoRequestBody withNamespace(String namespace) {
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

    public UpdateRepoRequestBody withRepoType(String repoType) {
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

    public UpdateRepoRequestBody withGitRepositorySpec(GitRepositorySpec gitRepositorySpec) {
        this.gitRepositorySpec = gitRepositorySpec;
        return this;
    }

    public UpdateRepoRequestBody withGitRepositorySpec(Consumer<GitRepositorySpec> gitRepositorySpecSetter) {
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

    public UpdateRepoRequestBody withSecretInfo(SecretInfo secretInfo) {
        this.secretInfo = secretInfo;
        return this;
    }

    public UpdateRepoRequestBody withSecretInfo(Consumer<SecretInfo> secretInfoSetter) {
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
        UpdateRepoRequestBody that = (UpdateRepoRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.repoType, that.repoType)
            && Objects.equals(this.gitRepositorySpec, that.gitRepositorySpec)
            && Objects.equals(this.secretInfo, that.secretInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace, repoType, gitRepositorySpec, secretInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepoRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    gitRepositorySpec: ").append(toIndentedString(gitRepositorySpec)).append("\n");
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
