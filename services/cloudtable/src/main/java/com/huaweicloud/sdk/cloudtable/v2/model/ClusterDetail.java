package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ClusterDetail */
public class ClusterDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_progress")

    private String actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_mode")

    private Boolean authMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dfv")

    private String enableDfv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_free")

    private String enableFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_lemon")

    private String enableLemon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_opentsdb")

    private String enableOpentsdb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zookeeper_link")

    private String zookeeperLink;

    public ClusterDetail withActionProgress(String actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    /** 集群当前状态列表： - 创建中 - 扩容中 - 重启中 - 开启opentsdb - 扩容失败 - 重启失败 - 开启opentsdb失败
     * 
     * @return actionProgress */
    public String getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(String actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ClusterDetail withAuthMode(Boolean authMode) {
        this.authMode = authMode;
        return this;
    }

    /** 是否开启IAM权限认证。 - false：不开启 - true：开启
     * 
     * @return authMode */
    public Boolean getAuthMode() {
        return authMode;
    }

    public void setAuthMode(Boolean authMode) {
        this.authMode = authMode;
    }

    public ClusterDetail withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /** 集群所在的可用区（AZ)。
     * 
     * @return azCode */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public ClusterDetail withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 集群ID，集群唯一标识。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ClusterDetail withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /** CloudTable集群名称。
     * 
     * @return clusterName */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ClusterDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 集群创建时间。
     * 
     * @return created */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ClusterDetail withEnableDfv(String enableDfv) {
        this.enableDfv = enableDfv;
        return this;
    }

    /** 是否开启DFV。 - false：不开启 - true：开启
     * 
     * @return enableDfv */
    public String getEnableDfv() {
        return enableDfv;
    }

    public void setEnableDfv(String enableDfv) {
        this.enableDfv = enableDfv;
    }

    public ClusterDetail withEnableFree(String enableFree) {
        this.enableFree = enableFree;
        return this;
    }

    /** 集群是否免费。 - false：不免费 - true：免费
     * 
     * @return enableFree */
    public String getEnableFree() {
        return enableFree;
    }

    public void setEnableFree(String enableFree) {
        this.enableFree = enableFree;
    }

    public ClusterDetail withEnableLemon(String enableLemon) {
        this.enableLemon = enableLemon;
        return this;
    }

    /** 是否开启Lemon。 - false：不开启 - true：开启
     * 
     * @return enableLemon */
    public String getEnableLemon() {
        return enableLemon;
    }

    public void setEnableLemon(String enableLemon) {
        this.enableLemon = enableLemon;
    }

    public ClusterDetail withEnableOpentsdb(String enableOpentsdb) {
        this.enableOpentsdb = enableOpentsdb;
        return this;
    }

    /** 是否开启OpenTSDB。 - false：不开启 - true：开启
     * 
     * @return enableOpentsdb */
    public String getEnableOpentsdb() {
        return enableOpentsdb;
    }

    public void setEnableOpentsdb(String enableOpentsdb) {
        this.enableOpentsdb = enableOpentsdb;
    }

    public ClusterDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 集群状态： - 200：集群正常 - 300：集群异常 - 303：集群创建失败 - 400：集群已删除
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterDetail withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /** 集群标识符。
     * 
     * @return tags */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ClusterDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 集群版本号。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterDetail withZookeeperLink(String zookeeperLink) {
        this.zookeeperLink = zookeeperLink;
        return this;
    }

    /** CloudTable集群ZooKeeper的链接地址。例如：cloudtable-3058-zk3-Dqcwuh6R.mycloudtable.com:2181,cloudtable-3058-zk2-TCwkZEie.mycloudtable.com:2181,cloudtable-3058-zk1-TBELUFOK.mycloudtable.com:2181
     * 
     * @return zookeeperLink */
    public String getZookeeperLink() {
        return zookeeperLink;
    }

    public void setZookeeperLink(String zookeeperLink) {
        this.zookeeperLink = zookeeperLink;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterDetail clusterDetail = (ClusterDetail) o;
        return Objects.equals(this.actionProgress, clusterDetail.actionProgress)
            && Objects.equals(this.authMode, clusterDetail.authMode)
            && Objects.equals(this.azCode, clusterDetail.azCode)
            && Objects.equals(this.clusterId, clusterDetail.clusterId)
            && Objects.equals(this.clusterName, clusterDetail.clusterName)
            && Objects.equals(this.created, clusterDetail.created)
            && Objects.equals(this.enableDfv, clusterDetail.enableDfv)
            && Objects.equals(this.enableFree, clusterDetail.enableFree)
            && Objects.equals(this.enableLemon, clusterDetail.enableLemon)
            && Objects.equals(this.enableOpentsdb, clusterDetail.enableOpentsdb)
            && Objects.equals(this.status, clusterDetail.status) && Objects.equals(this.tags, clusterDetail.tags)
            && Objects.equals(this.version, clusterDetail.version)
            && Objects.equals(this.zookeeperLink, clusterDetail.zookeeperLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionProgress,
            authMode,
            azCode,
            clusterId,
            clusterName,
            created,
            enableDfv,
            enableFree,
            enableLemon,
            enableOpentsdb,
            status,
            tags,
            version,
            zookeeperLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDetail {\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    enableDfv: ").append(toIndentedString(enableDfv)).append("\n");
        sb.append("    enableFree: ").append(toIndentedString(enableFree)).append("\n");
        sb.append("    enableLemon: ").append(toIndentedString(enableLemon)).append("\n");
        sb.append("    enableOpentsdb: ").append(toIndentedString(enableOpentsdb)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    zookeeperLink: ").append(toIndentedString(zookeeperLink)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
