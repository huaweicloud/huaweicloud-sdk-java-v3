package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群详情信息对象。
 */
public class ClusterDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_progress")

    private ActionProgress actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_mode")

    private String authMode;

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
    @JsonProperty(value = "enable_openTSDB")

    private String enableOpenTSDB;

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

    public ClusterDetail withActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public ClusterDetail withActionProgress(Consumer<ActionProgress> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new ActionProgress();
            actionProgressSetter.accept(this.actionProgress);
        }

        return this;
    }

    /**
     * Get actionProgress
     * @return actionProgress
     */
    public ActionProgress getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ClusterDetail withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ClusterDetail addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ClusterDetail withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 集群操作记录
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ClusterDetail withAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }

    /**
     * 是否开启IAM权限认证。 - false：不开启 - true：开启
     * @return authMode
     */
    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public ClusterDetail withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 集群所在的可用区（AZ)。
     * @return azCode
     */
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

    /**
     * 集群ID，集群唯一标识。
     * @return clusterId
     */
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

    /**
     * CloudTable集群名称。
     * @return clusterName
     */
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

    /**
     * 集群创建时间。
     * @return created
     */
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

    /**
     * 是否开启DFV。 - false：不开启 - true：开启
     * @return enableDfv
     */
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

    /**
     * 集群是否免费。 - false：不免费 - true：免费
     * @return enableFree
     */
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

    /**
     * 是否开启Lemon。 - false：不开启 - true：开启
     * @return enableLemon
     */
    public String getEnableLemon() {
        return enableLemon;
    }

    public void setEnableLemon(String enableLemon) {
        this.enableLemon = enableLemon;
    }

    public ClusterDetail withEnableOpenTSDB(String enableOpenTSDB) {
        this.enableOpenTSDB = enableOpenTSDB;
        return this;
    }

    /**
     * 是否开启OpenTSDB。 - false：不开启 - true：开启
     * @return enableOpenTSDB
     */
    public String getEnableOpenTSDB() {
        return enableOpenTSDB;
    }

    public void setEnableOpenTSDB(String enableOpenTSDB) {
        this.enableOpenTSDB = enableOpenTSDB;
    }

    public ClusterDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 集群状态： - 200：集群正常 - 300：集群异常 - 303：集群创建失败 - 400：集群已删除
     * @return status
     */
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

    /**
     * 集群标识符。
     * @return tags
     */
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

    /**
     * 集群版本号。
     * @return version
     */
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

    /**
     * CloudTable集群ZooKeeper的链接地址。例如：cloudtable-3058-zk3-Dqcwuh6R.mycloudtable.com:2181,cloudtable-3058-zk2-TCwkZEie.mycloudtable.com:2181,cloudtable-3058-zk1-TBELUFOK.mycloudtable.com:2181
     * @return zookeeperLink
     */
    public String getZookeeperLink() {
        return zookeeperLink;
    }

    public void setZookeeperLink(String zookeeperLink) {
        this.zookeeperLink = zookeeperLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterDetail that = (ClusterDetail) obj;
        return Objects.equals(this.actionProgress, that.actionProgress) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.authMode, that.authMode) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.created, that.created) && Objects.equals(this.enableDfv, that.enableDfv)
            && Objects.equals(this.enableFree, that.enableFree) && Objects.equals(this.enableLemon, that.enableLemon)
            && Objects.equals(this.enableOpenTSDB, that.enableOpenTSDB) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.version, that.version)
            && Objects.equals(this.zookeeperLink, that.zookeeperLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionProgress,
            actions,
            authMode,
            azCode,
            clusterId,
            clusterName,
            created,
            enableDfv,
            enableFree,
            enableLemon,
            enableOpenTSDB,
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
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    enableDfv: ").append(toIndentedString(enableDfv)).append("\n");
        sb.append("    enableFree: ").append(toIndentedString(enableFree)).append("\n");
        sb.append("    enableLemon: ").append(toIndentedString(enableLemon)).append("\n");
        sb.append("    enableOpenTSDB: ").append(toIndentedString(enableOpenTSDB)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    zookeeperLink: ").append(toIndentedString(zookeeperLink)).append("\n");
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
