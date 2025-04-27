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
    @JsonProperty(value = "localHdfs")

    private Boolean localHdfs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show_222_version_feature")

    private String isShow222VersionFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actionsCount")

    private List<String> actionsCount = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_auth")

    private Boolean supportAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_status")

    private String orderStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_local_hdfs")

    private Boolean isLocalHdfs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ck_deploy_mode")

    private String ckDeployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type_en")

    private String flavorTypeEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hot_cold_feature_cluster")

    private String enableHotColdFeatureCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hot_cold_feature")

    private String enableHotColdFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_flavor")

    private String dataFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_flavor")

    private String controlFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_node_num")

    private String dataNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_node_num")

    private String controlNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_node_total_storage_size")

    private String dataNodeTotalStorageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_node_total_storage_size")

    private String controlNodeTotalStorageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cold_storage_used_size")

    private String coldStorageUsedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_node_volume_type")

    private String dataNodeVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_node_volume_type")

    private String controlNodeVolumeType;

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

    public ClusterDetail withLocalHdfs(Boolean localHdfs) {
        this.localHdfs = localHdfs;
        return this;
    }

    /**
     * 是否开启hdfs。 - false：不开启 - true：开启
     * @return localHdfs
     */
    public Boolean getLocalHdfs() {
        return localHdfs;
    }

    public void setLocalHdfs(Boolean localHdfs) {
        this.localHdfs = localHdfs;
    }

    public ClusterDetail withIsShow222VersionFeature(String isShow222VersionFeature) {
        this.isShow222VersionFeature = isShow222VersionFeature;
        return this;
    }

    /**
     * 是否开222版本特性。 - false：不开启 - true：开启
     * @return isShow222VersionFeature
     */
    public String getIsShow222VersionFeature() {
        return isShow222VersionFeature;
    }

    public void setIsShow222VersionFeature(String isShow222VersionFeature) {
        this.isShow222VersionFeature = isShow222VersionFeature;
    }

    public ClusterDetail withActionsCount(List<String> actionsCount) {
        this.actionsCount = actionsCount;
        return this;
    }

    public ClusterDetail addActionsCountItem(String actionsCountItem) {
        if (this.actionsCount == null) {
            this.actionsCount = new ArrayList<>();
        }
        this.actionsCount.add(actionsCountItem);
        return this;
    }

    public ClusterDetail withActionsCount(Consumer<List<String>> actionsCountSetter) {
        if (this.actionsCount == null) {
            this.actionsCount = new ArrayList<>();
        }
        actionsCountSetter.accept(this.actionsCount);
        return this;
    }

    /**
     * 集群操作记录
     * @return actionsCount
     */
    public List<String> getActionsCount() {
        return actionsCount;
    }

    public void setActionsCount(List<String> actionsCount) {
        this.actionsCount = actionsCount;
    }

    public ClusterDetail withSupportAuth(Boolean supportAuth) {
        this.supportAuth = supportAuth;
        return this;
    }

    /**
     * 是否支持开启认证。 - false：不支持 - true：支持
     * @return supportAuth
     */
    public Boolean getSupportAuth() {
        return supportAuth;
    }

    public void setSupportAuth(Boolean supportAuth) {
        this.supportAuth = supportAuth;
    }

    public ClusterDetail withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * eps_id。
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public ClusterDetail withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型。
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ClusterDetail withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期订单号。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ClusterDetail withOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * 包周期订单状态。
     * @return orderStatus
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ClusterDetail withIsLocalHdfs(Boolean isLocalHdfs) {
        this.isLocalHdfs = isLocalHdfs;
        return this;
    }

    /**
     * 是否开启hdfs。 - false：不开启 - true：开启
     * @return isLocalHdfs
     */
    public Boolean getIsLocalHdfs() {
        return isLocalHdfs;
    }

    public void setIsLocalHdfs(Boolean isLocalHdfs) {
        this.isLocalHdfs = isLocalHdfs;
    }

    public ClusterDetail withCkDeployMode(String ckDeployMode) {
        this.ckDeployMode = ckDeployMode;
        return this;
    }

    /**
     * ClickHouse部署模式。
     * @return ckDeployMode
     */
    public String getCkDeployMode() {
        return ckDeployMode;
    }

    public void setCkDeployMode(String ckDeployMode) {
        this.ckDeployMode = ckDeployMode;
    }

    public ClusterDetail withFlavorTypeEn(String flavorTypeEn) {
        this.flavorTypeEn = flavorTypeEn;
        return this;
    }

    /**
     * 节点磁盘类型。
     * @return flavorTypeEn
     */
    public String getFlavorTypeEn() {
        return flavorTypeEn;
    }

    public void setFlavorTypeEn(String flavorTypeEn) {
        this.flavorTypeEn = flavorTypeEn;
    }

    public ClusterDetail withEnableHotColdFeatureCluster(String enableHotColdFeatureCluster) {
        this.enableHotColdFeatureCluster = enableHotColdFeatureCluster;
        return this;
    }

    /**
     * 集群是否支持开启冷热分离。
     * @return enableHotColdFeatureCluster
     */
    public String getEnableHotColdFeatureCluster() {
        return enableHotColdFeatureCluster;
    }

    public void setEnableHotColdFeatureCluster(String enableHotColdFeatureCluster) {
        this.enableHotColdFeatureCluster = enableHotColdFeatureCluster;
    }

    public ClusterDetail withEnableHotColdFeature(String enableHotColdFeature) {
        this.enableHotColdFeature = enableHotColdFeature;
        return this;
    }

    /**
     * 集群是否开启冷热分离。
     * @return enableHotColdFeature
     */
    public String getEnableHotColdFeature() {
        return enableHotColdFeature;
    }

    public void setEnableHotColdFeature(String enableHotColdFeature) {
        this.enableHotColdFeature = enableHotColdFeature;
    }

    public ClusterDetail withDataFlavor(String dataFlavor) {
        this.dataFlavor = dataFlavor;
        return this;
    }

    /**
     * 数据节点规格。
     * @return dataFlavor
     */
    public String getDataFlavor() {
        return dataFlavor;
    }

    public void setDataFlavor(String dataFlavor) {
        this.dataFlavor = dataFlavor;
    }

    public ClusterDetail withControlFlavor(String controlFlavor) {
        this.controlFlavor = controlFlavor;
        return this;
    }

    /**
     * 数据同步节点规格。
     * @return controlFlavor
     */
    public String getControlFlavor() {
        return controlFlavor;
    }

    public void setControlFlavor(String controlFlavor) {
        this.controlFlavor = controlFlavor;
    }

    public ClusterDetail withDataNodeNum(String dataNodeNum) {
        this.dataNodeNum = dataNodeNum;
        return this;
    }

    /**
     * 数据节点个数。
     * @return dataNodeNum
     */
    public String getDataNodeNum() {
        return dataNodeNum;
    }

    public void setDataNodeNum(String dataNodeNum) {
        this.dataNodeNum = dataNodeNum;
    }

    public ClusterDetail withControlNodeNum(String controlNodeNum) {
        this.controlNodeNum = controlNodeNum;
        return this;
    }

    /**
     * 数据同步节点个数。
     * @return controlNodeNum
     */
    public String getControlNodeNum() {
        return controlNodeNum;
    }

    public void setControlNodeNum(String controlNodeNum) {
        this.controlNodeNum = controlNodeNum;
    }

    public ClusterDetail withDataNodeTotalStorageSize(String dataNodeTotalStorageSize) {
        this.dataNodeTotalStorageSize = dataNodeTotalStorageSize;
        return this;
    }

    /**
     * 数据节点磁盘容量。
     * @return dataNodeTotalStorageSize
     */
    public String getDataNodeTotalStorageSize() {
        return dataNodeTotalStorageSize;
    }

    public void setDataNodeTotalStorageSize(String dataNodeTotalStorageSize) {
        this.dataNodeTotalStorageSize = dataNodeTotalStorageSize;
    }

    public ClusterDetail withControlNodeTotalStorageSize(String controlNodeTotalStorageSize) {
        this.controlNodeTotalStorageSize = controlNodeTotalStorageSize;
        return this;
    }

    /**
     * 数据同步节点磁盘容量。
     * @return controlNodeTotalStorageSize
     */
    public String getControlNodeTotalStorageSize() {
        return controlNodeTotalStorageSize;
    }

    public void setControlNodeTotalStorageSize(String controlNodeTotalStorageSize) {
        this.controlNodeTotalStorageSize = controlNodeTotalStorageSize;
    }

    public ClusterDetail withColdStorageUsedSize(String coldStorageUsedSize) {
        this.coldStorageUsedSize = coldStorageUsedSize;
        return this;
    }

    /**
     * 冷存储使用量。
     * @return coldStorageUsedSize
     */
    public String getColdStorageUsedSize() {
        return coldStorageUsedSize;
    }

    public void setColdStorageUsedSize(String coldStorageUsedSize) {
        this.coldStorageUsedSize = coldStorageUsedSize;
    }

    public ClusterDetail withDataNodeVolumeType(String dataNodeVolumeType) {
        this.dataNodeVolumeType = dataNodeVolumeType;
        return this;
    }

    /**
     * 数据节点磁盘类型。
     * @return dataNodeVolumeType
     */
    public String getDataNodeVolumeType() {
        return dataNodeVolumeType;
    }

    public void setDataNodeVolumeType(String dataNodeVolumeType) {
        this.dataNodeVolumeType = dataNodeVolumeType;
    }

    public ClusterDetail withControlNodeVolumeType(String controlNodeVolumeType) {
        this.controlNodeVolumeType = controlNodeVolumeType;
        return this;
    }

    /**
     * 数据同步节点磁盘类型。
     * @return controlNodeVolumeType
     */
    public String getControlNodeVolumeType() {
        return controlNodeVolumeType;
    }

    public void setControlNodeVolumeType(String controlNodeVolumeType) {
        this.controlNodeVolumeType = controlNodeVolumeType;
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
            && Objects.equals(this.localHdfs, that.localHdfs)
            && Objects.equals(this.isShow222VersionFeature, that.isShow222VersionFeature)
            && Objects.equals(this.actionsCount, that.actionsCount)
            && Objects.equals(this.supportAuth, that.supportAuth) && Objects.equals(this.epsId, that.epsId)
            && Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.orderStatus, that.orderStatus) && Objects.equals(this.isLocalHdfs, that.isLocalHdfs)
            && Objects.equals(this.ckDeployMode, that.ckDeployMode)
            && Objects.equals(this.flavorTypeEn, that.flavorTypeEn)
            && Objects.equals(this.enableHotColdFeatureCluster, that.enableHotColdFeatureCluster)
            && Objects.equals(this.enableHotColdFeature, that.enableHotColdFeature)
            && Objects.equals(this.dataFlavor, that.dataFlavor)
            && Objects.equals(this.controlFlavor, that.controlFlavor)
            && Objects.equals(this.dataNodeNum, that.dataNodeNum)
            && Objects.equals(this.controlNodeNum, that.controlNodeNum)
            && Objects.equals(this.dataNodeTotalStorageSize, that.dataNodeTotalStorageSize)
            && Objects.equals(this.controlNodeTotalStorageSize, that.controlNodeTotalStorageSize)
            && Objects.equals(this.coldStorageUsedSize, that.coldStorageUsedSize)
            && Objects.equals(this.dataNodeVolumeType, that.dataNodeVolumeType)
            && Objects.equals(this.controlNodeVolumeType, that.controlNodeVolumeType)
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
            localHdfs,
            isShow222VersionFeature,
            actionsCount,
            supportAuth,
            epsId,
            clusterType,
            orderId,
            orderStatus,
            isLocalHdfs,
            ckDeployMode,
            flavorTypeEn,
            enableHotColdFeatureCluster,
            enableHotColdFeature,
            dataFlavor,
            controlFlavor,
            dataNodeNum,
            controlNodeNum,
            dataNodeTotalStorageSize,
            controlNodeTotalStorageSize,
            coldStorageUsedSize,
            dataNodeVolumeType,
            controlNodeVolumeType,
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
        sb.append("    localHdfs: ").append(toIndentedString(localHdfs)).append("\n");
        sb.append("    isShow222VersionFeature: ").append(toIndentedString(isShow222VersionFeature)).append("\n");
        sb.append("    actionsCount: ").append(toIndentedString(actionsCount)).append("\n");
        sb.append("    supportAuth: ").append(toIndentedString(supportAuth)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
        sb.append("    isLocalHdfs: ").append(toIndentedString(isLocalHdfs)).append("\n");
        sb.append("    ckDeployMode: ").append(toIndentedString(ckDeployMode)).append("\n");
        sb.append("    flavorTypeEn: ").append(toIndentedString(flavorTypeEn)).append("\n");
        sb.append("    enableHotColdFeatureCluster: ")
            .append(toIndentedString(enableHotColdFeatureCluster))
            .append("\n");
        sb.append("    enableHotColdFeature: ").append(toIndentedString(enableHotColdFeature)).append("\n");
        sb.append("    dataFlavor: ").append(toIndentedString(dataFlavor)).append("\n");
        sb.append("    controlFlavor: ").append(toIndentedString(controlFlavor)).append("\n");
        sb.append("    dataNodeNum: ").append(toIndentedString(dataNodeNum)).append("\n");
        sb.append("    controlNodeNum: ").append(toIndentedString(controlNodeNum)).append("\n");
        sb.append("    dataNodeTotalStorageSize: ").append(toIndentedString(dataNodeTotalStorageSize)).append("\n");
        sb.append("    controlNodeTotalStorageSize: ")
            .append(toIndentedString(controlNodeTotalStorageSize))
            .append("\n");
        sb.append("    coldStorageUsedSize: ").append(toIndentedString(coldStorageUsedSize)).append("\n");
        sb.append("    dataNodeVolumeType: ").append(toIndentedString(dataNodeVolumeType)).append("\n");
        sb.append("    controlNodeVolumeType: ").append(toIndentedString(controlNodeVolumeType)).append("\n");
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
