package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建配置集请求
 */
public class CreateConfigSetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configSetType")

    private String configSetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoName")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucketSpec")

    private Object bucketSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "helmChartSpec")

    private Object helmChartSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gitRepositorySpec")

    private GitRepositorySpec gitRepositorySpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "helmRepositorySpec")

    private Object helmRepositorySpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kustomizationSpec")

    private KustomizationSpec kustomizationSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterInfo")

    private ClusterInfo clusterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secretInfo")

    private SecretInfo secretInfo;

    public CreateConfigSetRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配置集合的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateConfigSetRequestBody withNamespace(String namespace) {
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

    public CreateConfigSetRequestBody withConfigSetType(String configSetType) {
        this.configSetType = configSetType;
        return this;
    }

    /**
     * 配置集合的类型
     * @return configSetType
     */
    public String getConfigSetType() {
        return configSetType;
    }

    public void setConfigSetType(String configSetType) {
        this.configSetType = configSetType;
    }

    public CreateConfigSetRequestBody withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 源代码仓库名称
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public CreateConfigSetRequestBody withBucketSpec(Object bucketSpec) {
        this.bucketSpec = bucketSpec;
        return this;
    }

    /**
     * 对象存储桶的基本信息
     * @return bucketSpec
     */
    public Object getBucketSpec() {
        return bucketSpec;
    }

    public void setBucketSpec(Object bucketSpec) {
        this.bucketSpec = bucketSpec;
    }

    public CreateConfigSetRequestBody withHelmChartSpec(Object helmChartSpec) {
        this.helmChartSpec = helmChartSpec;
        return this;
    }

    /**
     * Helm Chart源基本信息
     * @return helmChartSpec
     */
    public Object getHelmChartSpec() {
        return helmChartSpec;
    }

    public void setHelmChartSpec(Object helmChartSpec) {
        this.helmChartSpec = helmChartSpec;
    }

    public CreateConfigSetRequestBody withGitRepositorySpec(GitRepositorySpec gitRepositorySpec) {
        this.gitRepositorySpec = gitRepositorySpec;
        return this;
    }

    public CreateConfigSetRequestBody withGitRepositorySpec(Consumer<GitRepositorySpec> gitRepositorySpecSetter) {
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

    public CreateConfigSetRequestBody withHelmRepositorySpec(Object helmRepositorySpec) {
        this.helmRepositorySpec = helmRepositorySpec;
        return this;
    }

    /**
     * Helm仓库基本信息
     * @return helmRepositorySpec
     */
    public Object getHelmRepositorySpec() {
        return helmRepositorySpec;
    }

    public void setHelmRepositorySpec(Object helmRepositorySpec) {
        this.helmRepositorySpec = helmRepositorySpec;
    }

    public CreateConfigSetRequestBody withKustomizationSpec(KustomizationSpec kustomizationSpec) {
        this.kustomizationSpec = kustomizationSpec;
        return this;
    }

    public CreateConfigSetRequestBody withKustomizationSpec(Consumer<KustomizationSpec> kustomizationSpecSetter) {
        if (this.kustomizationSpec == null) {
            this.kustomizationSpec = new KustomizationSpec();
            kustomizationSpecSetter.accept(this.kustomizationSpec);
        }

        return this;
    }

    /**
     * Get kustomizationSpec
     * @return kustomizationSpec
     */
    public KustomizationSpec getKustomizationSpec() {
        return kustomizationSpec;
    }

    public void setKustomizationSpec(KustomizationSpec kustomizationSpec) {
        this.kustomizationSpec = kustomizationSpec;
    }

    public CreateConfigSetRequestBody withClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public CreateConfigSetRequestBody withClusterInfo(Consumer<ClusterInfo> clusterInfoSetter) {
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

    public CreateConfigSetRequestBody withSecretInfo(SecretInfo secretInfo) {
        this.secretInfo = secretInfo;
        return this;
    }

    public CreateConfigSetRequestBody withSecretInfo(Consumer<SecretInfo> secretInfoSetter) {
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
        CreateConfigSetRequestBody that = (CreateConfigSetRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.configSetType, that.configSetType) && Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.bucketSpec, that.bucketSpec)
            && Objects.equals(this.helmChartSpec, that.helmChartSpec)
            && Objects.equals(this.gitRepositorySpec, that.gitRepositorySpec)
            && Objects.equals(this.helmRepositorySpec, that.helmRepositorySpec)
            && Objects.equals(this.kustomizationSpec, that.kustomizationSpec)
            && Objects.equals(this.clusterInfo, that.clusterInfo) && Objects.equals(this.secretInfo, that.secretInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            namespace,
            configSetType,
            repoName,
            bucketSpec,
            helmChartSpec,
            gitRepositorySpec,
            helmRepositorySpec,
            kustomizationSpec,
            clusterInfo,
            secretInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigSetRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    configSetType: ").append(toIndentedString(configSetType)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    bucketSpec: ").append(toIndentedString(bucketSpec)).append("\n");
        sb.append("    helmChartSpec: ").append(toIndentedString(helmChartSpec)).append("\n");
        sb.append("    gitRepositorySpec: ").append(toIndentedString(gitRepositorySpec)).append("\n");
        sb.append("    helmRepositorySpec: ").append(toIndentedString(helmRepositorySpec)).append("\n");
        sb.append("    kustomizationSpec: ").append(toIndentedString(kustomizationSpec)).append("\n");
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
