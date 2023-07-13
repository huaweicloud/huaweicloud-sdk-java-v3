package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AomMappingRuleInfo
 */
public class AomMappingRuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployments_prefix")

    private String deploymentsPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployments")

    private List<String> deployments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<AomMappingfilesInfo> files = null;

    public AomMappingRuleInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public AomMappingRuleInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public AomMappingRuleInfo withDeploymentsPrefix(String deploymentsPrefix) {
        this.deploymentsPrefix = deploymentsPrefix;
        return this;
    }

    /**
     * 日志流前缀
     * @return deploymentsPrefix
     */
    public String getDeploymentsPrefix() {
        return deploymentsPrefix;
    }

    public void setDeploymentsPrefix(String deploymentsPrefix) {
        this.deploymentsPrefix = deploymentsPrefix;
    }

    public AomMappingRuleInfo withDeployments(List<String> deployments) {
        this.deployments = deployments;
        return this;
    }

    public AomMappingRuleInfo addDeploymentsItem(String deploymentsItem) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deploymentsItem);
        return this;
    }

    public AomMappingRuleInfo withDeployments(Consumer<List<String>> deploymentsSetter) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        deploymentsSetter.accept(this.deployments);
        return this;
    }

    /**
     * 工作负载
     * @return deployments
     */
    public List<String> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<String> deployments) {
        this.deployments = deployments;
    }

    public AomMappingRuleInfo withNamespace(String namespace) {
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

    public AomMappingRuleInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public AomMappingRuleInfo withFiles(List<AomMappingfilesInfo> files) {
        this.files = files;
        return this;
    }

    public AomMappingRuleInfo addFilesItem(AomMappingfilesInfo filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public AomMappingRuleInfo withFiles(Consumer<List<AomMappingfilesInfo>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 接入规则详情
     * @return files
     */
    public List<AomMappingfilesInfo> getFiles() {
        return files;
    }

    public void setFiles(List<AomMappingfilesInfo> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AomMappingRuleInfo that = (AomMappingRuleInfo) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.deploymentsPrefix, that.deploymentsPrefix)
            && Objects.equals(this.deployments, that.deployments) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, clusterName, deploymentsPrefix, deployments, namespace, containerName, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AomMappingRuleInfo {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    deploymentsPrefix: ").append(toIndentedString(deploymentsPrefix)).append("\n");
        sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
