package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigSetResponse
 */
public class ConfigSetResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

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
    @JsonProperty(value = "bucket")

    private Object bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "helmChart")

    private Object helmChart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gitRepository")

    private GitRepository gitRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "helmRepository")

    private Object helmRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoStatus")

    private String repoStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "helmRelease")

    private Object helmRelease;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kustomization")

    private Kustomization kustomization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configSetStatus")

    private String configSetStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterInfo")

    private ClusterInfo clusterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secretInfo")

    private SecretInfo secretInfo;

    public ConfigSetResponse withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 配置集合的唯一标识
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ConfigSetResponse withName(String name) {
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

    public ConfigSetResponse withNamespace(String namespace) {
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

    public ConfigSetResponse withConfigSetType(String configSetType) {
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

    public ConfigSetResponse withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 仓库名称
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public ConfigSetResponse withBucket(Object bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * bucket基本信息
     * @return bucket
     */
    public Object getBucket() {
        return bucket;
    }

    public void setBucket(Object bucket) {
        this.bucket = bucket;
    }

    public ConfigSetResponse withHelmChart(Object helmChart) {
        this.helmChart = helmChart;
        return this;
    }

    /**
     * Helm Chart源基本信息
     * @return helmChart
     */
    public Object getHelmChart() {
        return helmChart;
    }

    public void setHelmChart(Object helmChart) {
        this.helmChart = helmChart;
    }

    public ConfigSetResponse withGitRepository(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
        return this;
    }

    public ConfigSetResponse withGitRepository(Consumer<GitRepository> gitRepositorySetter) {
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

    public ConfigSetResponse withHelmRepository(Object helmRepository) {
        this.helmRepository = helmRepository;
        return this;
    }

    /**
     * Helm仓库的定义与状态等信息
     * @return helmRepository
     */
    public Object getHelmRepository() {
        return helmRepository;
    }

    public void setHelmRepository(Object helmRepository) {
        this.helmRepository = helmRepository;
    }

    public ConfigSetResponse withRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }

    /**
     * 仓库状态信息
     * @return repoStatus
     */
    public String getRepoStatus() {
        return repoStatus;
    }

    public void setRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
    }

    public ConfigSetResponse withHelmRelease(Object helmRelease) {
        this.helmRelease = helmRelease;
        return this;
    }

    /**
     * Helm Chart的发布配置和状态信息
     * @return helmRelease
     */
    public Object getHelmRelease() {
        return helmRelease;
    }

    public void setHelmRelease(Object helmRelease) {
        this.helmRelease = helmRelease;
    }

    public ConfigSetResponse withKustomization(Kustomization kustomization) {
        this.kustomization = kustomization;
        return this;
    }

    public ConfigSetResponse withKustomization(Consumer<Kustomization> kustomizationSetter) {
        if (this.kustomization == null) {
            this.kustomization = new Kustomization();
            kustomizationSetter.accept(this.kustomization);
        }

        return this;
    }

    /**
     * Get kustomization
     * @return kustomization
     */
    public Kustomization getKustomization() {
        return kustomization;
    }

    public void setKustomization(Kustomization kustomization) {
        this.kustomization = kustomization;
    }

    public ConfigSetResponse withConfigSetStatus(String configSetStatus) {
        this.configSetStatus = configSetStatus;
        return this;
    }

    /**
     * 配置集合状态信息
     * @return configSetStatus
     */
    public String getConfigSetStatus() {
        return configSetStatus;
    }

    public void setConfigSetStatus(String configSetStatus) {
        this.configSetStatus = configSetStatus;
    }

    public ConfigSetResponse withClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public ConfigSetResponse withClusterInfo(Consumer<ClusterInfo> clusterInfoSetter) {
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

    public ConfigSetResponse withSecretInfo(SecretInfo secretInfo) {
        this.secretInfo = secretInfo;
        return this;
    }

    public ConfigSetResponse withSecretInfo(Consumer<SecretInfo> secretInfoSetter) {
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
        ConfigSetResponse that = (ConfigSetResponse) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.configSetType, that.configSetType)
            && Objects.equals(this.repoName, that.repoName) && Objects.equals(this.bucket, that.bucket)
            && Objects.equals(this.helmChart, that.helmChart) && Objects.equals(this.gitRepository, that.gitRepository)
            && Objects.equals(this.helmRepository, that.helmRepository)
            && Objects.equals(this.repoStatus, that.repoStatus) && Objects.equals(this.helmRelease, that.helmRelease)
            && Objects.equals(this.kustomization, that.kustomization)
            && Objects.equals(this.configSetStatus, that.configSetStatus)
            && Objects.equals(this.clusterInfo, that.clusterInfo) && Objects.equals(this.secretInfo, that.secretInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid,
            name,
            namespace,
            configSetType,
            repoName,
            bucket,
            helmChart,
            gitRepository,
            helmRepository,
            repoStatus,
            helmRelease,
            kustomization,
            configSetStatus,
            clusterInfo,
            secretInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigSetResponse {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    configSetType: ").append(toIndentedString(configSetType)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    helmChart: ").append(toIndentedString(helmChart)).append("\n");
        sb.append("    gitRepository: ").append(toIndentedString(gitRepository)).append("\n");
        sb.append("    helmRepository: ").append(toIndentedString(helmRepository)).append("\n");
        sb.append("    repoStatus: ").append(toIndentedString(repoStatus)).append("\n");
        sb.append("    helmRelease: ").append(toIndentedString(helmRelease)).append("\n");
        sb.append("    kustomization: ").append(toIndentedString(kustomization)).append("\n");
        sb.append("    configSetStatus: ").append(toIndentedString(configSetStatus)).append("\n");
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
