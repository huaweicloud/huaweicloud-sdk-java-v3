package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StarRocksInstanceInfoInstances
 */
public class StarRocksInstanceInfoInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_enable_public_access")

    private Boolean canEnablePublicAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_backup_node_id")

    private String currentBackupNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_mode")

    private String clusterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private Integer isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_time")

    private Long frozenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_period")

    private String bakPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_keep_day")

    private Integer bakKeepDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_expected_start_time")

    private Long bakExpectedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_version_id")

    private String dataStoreVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_version")

    private String dataStoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_type")

    private String dataStoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_at")

    private Long deleteAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private String dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_group")

    private String paramGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<QueryAction> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_fail_error_code")

    private String createFailErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<StarRocksInstanceInfoGroups> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ops_window")

    private StarRocksInstanceInfoOpsWindow opsWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_info")

    private StarRocksInstanceInfoTagsInfo tagsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_used_space")

    private String backupUsedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_mode")

    private String azMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_info")

    private StarRocksInstanceInfoPortInfo portInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fe_node_volume_code")

    private String feNodeVolumeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_node_volume_code")

    private String beNodeVolumeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fe_node_volume_size")

    private String feNodeVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_node_volume_size")

    private String beNodeVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_data_replication")

    private Boolean supportDataReplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_version_available")

    private Boolean newVersionAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_option")

    private Boolean sslOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_resource_id")

    private String dedicatedResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private String payModel;

    public StarRocksInstanceInfoInstances withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID，严格匹配UUID规则。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StarRocksInstanceInfoInstances withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建的实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarRocksInstanceInfoInstances withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户在某一Region下的project ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public StarRocksInstanceInfoInstances withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 公网访问IP。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public StarRocksInstanceInfoInstances withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    /**
     * StarRocks FE节点类型数据IP（多个IP使用逗号分隔）
     * @return dataVip
     */
    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public StarRocksInstanceInfoInstances withCanEnablePublicAccess(Boolean canEnablePublicAccess) {
        this.canEnablePublicAccess = canEnablePublicAccess;
        return this;
    }

    /**
     * 是否可公网访问。
     * @return canEnablePublicAccess
     */
    public Boolean getCanEnablePublicAccess() {
        return canEnablePublicAccess;
    }

    public void setCanEnablePublicAccess(Boolean canEnablePublicAccess) {
        this.canEnablePublicAccess = canEnablePublicAccess;
    }

    public StarRocksInstanceInfoInstances withCurrentBackupNodeId(String currentBackupNodeId) {
        this.currentBackupNodeId = currentBackupNodeId;
        return this;
    }

    /**
     * 备份节点ID。
     * @return currentBackupNodeId
     */
    public String getCurrentBackupNodeId() {
        return currentBackupNodeId;
    }

    public void setCurrentBackupNodeId(String currentBackupNodeId) {
        this.currentBackupNodeId = currentBackupNodeId;
    }

    public StarRocksInstanceInfoInstances withClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * 部署模式。
     * @return clusterMode
     */
    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

    public StarRocksInstanceInfoInstances withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StarRocksInstanceInfoInstances withIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 是否冻结。
     * @return isFrozen
     */
    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }

    public StarRocksInstanceInfoInstances withFrozenTime(Long frozenTime) {
        this.frozenTime = frozenTime;
        return this;
    }

    /**
     * 冻结时间。
     * @return frozenTime
     */
    public Long getFrozenTime() {
        return frozenTime;
    }

    public void setFrozenTime(Long frozenTime) {
        this.frozenTime = frozenTime;
    }

    public StarRocksInstanceInfoInstances withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 默认用户名。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public StarRocksInstanceInfoInstances withBakPeriod(String bakPeriod) {
        this.bakPeriod = bakPeriod;
        return this;
    }

    /**
     * 备份周期。
     * @return bakPeriod
     */
    public String getBakPeriod() {
        return bakPeriod;
    }

    public void setBakPeriod(String bakPeriod) {
        this.bakPeriod = bakPeriod;
    }

    public StarRocksInstanceInfoInstances withBakKeepDay(Integer bakKeepDay) {
        this.bakKeepDay = bakKeepDay;
        return this;
    }

    /**
     * 备份保存天数。
     * @return bakKeepDay
     */
    public Integer getBakKeepDay() {
        return bakKeepDay;
    }

    public void setBakKeepDay(Integer bakKeepDay) {
        this.bakKeepDay = bakKeepDay;
    }

    public StarRocksInstanceInfoInstances withBakExpectedStartTime(Long bakExpectedStartTime) {
        this.bakExpectedStartTime = bakExpectedStartTime;
        return this;
    }

    /**
     * 备份预计开始时间。
     * @return bakExpectedStartTime
     */
    public Long getBakExpectedStartTime() {
        return bakExpectedStartTime;
    }

    public void setBakExpectedStartTime(Long bakExpectedStartTime) {
        this.bakExpectedStartTime = bakExpectedStartTime;
    }

    public StarRocksInstanceInfoInstances withDataStoreVersionId(String dataStoreVersionId) {
        this.dataStoreVersionId = dataStoreVersionId;
        return this;
    }

    /**
     * 数据库版本ID。
     * @return dataStoreVersionId
     */
    public String getDataStoreVersionId() {
        return dataStoreVersionId;
    }

    public void setDataStoreVersionId(String dataStoreVersionId) {
        this.dataStoreVersionId = dataStoreVersionId;
    }

    public StarRocksInstanceInfoInstances withDataStoreVersion(String dataStoreVersion) {
        this.dataStoreVersion = dataStoreVersion;
        return this;
    }

    /**
     * 数据库版本。
     * @return dataStoreVersion
     */
    public String getDataStoreVersion() {
        return dataStoreVersion;
    }

    public void setDataStoreVersion(String dataStoreVersion) {
        this.dataStoreVersion = dataStoreVersion;
    }

    public StarRocksInstanceInfoInstances withDataStoreType(String dataStoreType) {
        this.dataStoreType = dataStoreType;
        return this;
    }

    /**
     * 数据库引擎。
     * @return dataStoreType
     */
    public String getDataStoreType() {
        return dataStoreType;
    }

    public void setDataStoreType(String dataStoreType) {
        this.dataStoreType = dataStoreType;
    }

    public StarRocksInstanceInfoInstances withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 实例创建时间。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public StarRocksInstanceInfoInstances withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 实例更新时间。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public StarRocksInstanceInfoInstances withDeleteAt(Long deleteAt) {
        this.deleteAt = deleteAt;
        return this;
    }

    /**
     * 实例删除时间。
     * @return deleteAt
     */
    public Long getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Long deleteAt) {
        this.deleteAt = deleteAt;
    }

    public StarRocksInstanceInfoInstances withDbPort(String dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口号。
     * @return dbPort
     */
    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public StarRocksInstanceInfoInstances withParamGroup(String paramGroup) {
        this.paramGroup = paramGroup;
        return this;
    }

    /**
     * 参数组。
     * @return paramGroup
     */
    public String getParamGroup() {
        return paramGroup;
    }

    public void setParamGroup(String paramGroup) {
        this.paramGroup = paramGroup;
    }

    public StarRocksInstanceInfoInstances withActions(List<QueryAction> actions) {
        this.actions = actions;
        return this;
    }

    public StarRocksInstanceInfoInstances addActionsItem(QueryAction actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public StarRocksInstanceInfoInstances withActions(Consumer<List<QueryAction>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 实例动作。
     * @return actions
     */
    public List<QueryAction> getActions() {
        return actions;
    }

    public void setActions(List<QueryAction> actions) {
        this.actions = actions;
    }

    public StarRocksInstanceInfoInstances withCreateFailErrorCode(String createFailErrorCode) {
        this.createFailErrorCode = createFailErrorCode;
        return this;
    }

    /**
     * 实例创建失败错误码。
     * @return createFailErrorCode
     */
    public String getCreateFailErrorCode() {
        return createFailErrorCode;
    }

    public void setCreateFailErrorCode(String createFailErrorCode) {
        this.createFailErrorCode = createFailErrorCode;
    }

    public StarRocksInstanceInfoInstances withGroups(List<StarRocksInstanceInfoGroups> groups) {
        this.groups = groups;
        return this;
    }

    public StarRocksInstanceInfoInstances addGroupsItem(StarRocksInstanceInfoGroups groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public StarRocksInstanceInfoInstances withGroups(Consumer<List<StarRocksInstanceInfoGroups>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 实例分组。
     * @return groups
     */
    public List<StarRocksInstanceInfoGroups> getGroups() {
        return groups;
    }

    public void setGroups(List<StarRocksInstanceInfoGroups> groups) {
        this.groups = groups;
    }

    public StarRocksInstanceInfoInstances withOpsWindow(StarRocksInstanceInfoOpsWindow opsWindow) {
        this.opsWindow = opsWindow;
        return this;
    }

    public StarRocksInstanceInfoInstances withOpsWindow(Consumer<StarRocksInstanceInfoOpsWindow> opsWindowSetter) {
        if (this.opsWindow == null) {
            this.opsWindow = new StarRocksInstanceInfoOpsWindow();
            opsWindowSetter.accept(this.opsWindow);
        }

        return this;
    }

    /**
     * Get opsWindow
     * @return opsWindow
     */
    public StarRocksInstanceInfoOpsWindow getOpsWindow() {
        return opsWindow;
    }

    public void setOpsWindow(StarRocksInstanceInfoOpsWindow opsWindow) {
        this.opsWindow = opsWindow;
    }

    public StarRocksInstanceInfoInstances withTagsInfo(StarRocksInstanceInfoTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
        return this;
    }

    public StarRocksInstanceInfoInstances withTagsInfo(Consumer<StarRocksInstanceInfoTagsInfo> tagsInfoSetter) {
        if (this.tagsInfo == null) {
            this.tagsInfo = new StarRocksInstanceInfoTagsInfo();
            tagsInfoSetter.accept(this.tagsInfo);
        }

        return this;
    }

    /**
     * Get tagsInfo
     * @return tagsInfo
     */
    public StarRocksInstanceInfoTagsInfo getTagsInfo() {
        return tagsInfo;
    }

    public void setTagsInfo(StarRocksInstanceInfoTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
    }

    public StarRocksInstanceInfoInstances withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public StarRocksInstanceInfoInstances withBackupUsedSpace(String backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
        return this;
    }

    /**
     * 备份使用空间。
     * @return backupUsedSpace
     */
    public String getBackupUsedSpace() {
        return backupUsedSpace;
    }

    public void setBackupUsedSpace(String backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
    }

    public StarRocksInstanceInfoInstances withAzMode(String azMode) {
        this.azMode = azMode;
        return this;
    }

    /**
     * 可用区模式。  取值范围：  - single：单可用区 - multi：多可用区
     * @return azMode
     */
    public String getAzMode() {
        return azMode;
    }

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    public StarRocksInstanceInfoInstances withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public StarRocksInstanceInfoInstances withPortInfo(StarRocksInstanceInfoPortInfo portInfo) {
        this.portInfo = portInfo;
        return this;
    }

    public StarRocksInstanceInfoInstances withPortInfo(Consumer<StarRocksInstanceInfoPortInfo> portInfoSetter) {
        if (this.portInfo == null) {
            this.portInfo = new StarRocksInstanceInfoPortInfo();
            portInfoSetter.accept(this.portInfo);
        }

        return this;
    }

    /**
     * Get portInfo
     * @return portInfo
     */
    public StarRocksInstanceInfoPortInfo getPortInfo() {
        return portInfo;
    }

    public void setPortInfo(StarRocksInstanceInfoPortInfo portInfo) {
        this.portInfo = portInfo;
    }

    public StarRocksInstanceInfoInstances withFeNodeVolumeCode(String feNodeVolumeCode) {
        this.feNodeVolumeCode = feNodeVolumeCode;
        return this;
    }

    /**
     * FE节点磁盘类型。
     * @return feNodeVolumeCode
     */
    public String getFeNodeVolumeCode() {
        return feNodeVolumeCode;
    }

    public void setFeNodeVolumeCode(String feNodeVolumeCode) {
        this.feNodeVolumeCode = feNodeVolumeCode;
    }

    public StarRocksInstanceInfoInstances withBeNodeVolumeCode(String beNodeVolumeCode) {
        this.beNodeVolumeCode = beNodeVolumeCode;
        return this;
    }

    /**
     * BE节点磁盘类型。
     * @return beNodeVolumeCode
     */
    public String getBeNodeVolumeCode() {
        return beNodeVolumeCode;
    }

    public void setBeNodeVolumeCode(String beNodeVolumeCode) {
        this.beNodeVolumeCode = beNodeVolumeCode;
    }

    public StarRocksInstanceInfoInstances withFeNodeVolumeSize(String feNodeVolumeSize) {
        this.feNodeVolumeSize = feNodeVolumeSize;
        return this;
    }

    /**
     * FE节点磁盘大小。
     * @return feNodeVolumeSize
     */
    public String getFeNodeVolumeSize() {
        return feNodeVolumeSize;
    }

    public void setFeNodeVolumeSize(String feNodeVolumeSize) {
        this.feNodeVolumeSize = feNodeVolumeSize;
    }

    public StarRocksInstanceInfoInstances withBeNodeVolumeSize(String beNodeVolumeSize) {
        this.beNodeVolumeSize = beNodeVolumeSize;
        return this;
    }

    /**
     * BE节点磁盘大小。
     * @return beNodeVolumeSize
     */
    public String getBeNodeVolumeSize() {
        return beNodeVolumeSize;
    }

    public void setBeNodeVolumeSize(String beNodeVolumeSize) {
        this.beNodeVolumeSize = beNodeVolumeSize;
    }

    public StarRocksInstanceInfoInstances withSupportDataReplication(Boolean supportDataReplication) {
        this.supportDataReplication = supportDataReplication;
        return this;
    }

    /**
     * 是否支持副本。
     * @return supportDataReplication
     */
    public Boolean getSupportDataReplication() {
        return supportDataReplication;
    }

    public void setSupportDataReplication(Boolean supportDataReplication) {
        this.supportDataReplication = supportDataReplication;
    }

    public StarRocksInstanceInfoInstances withNewVersionAvailable(Boolean newVersionAvailable) {
        this.newVersionAvailable = newVersionAvailable;
        return this;
    }

    /**
     * 是否有数据库新版本。
     * @return newVersionAvailable
     */
    public Boolean getNewVersionAvailable() {
        return newVersionAvailable;
    }

    public void setNewVersionAvailable(Boolean newVersionAvailable) {
        this.newVersionAvailable = newVersionAvailable;
    }

    public StarRocksInstanceInfoInstances withSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    /**
     * SSL开关。
     * @return sslOption
     */
    public Boolean getSslOption() {
        return sslOption;
    }

    public void setSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
    }

    public StarRocksInstanceInfoInstances withDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
        return this;
    }

    /**
     * 专属资源池ID，只有数据库实例属于专属资源池才会返回该参数。
     * @return dedicatedResourceId
     */
    public String getDedicatedResourceId() {
        return dedicatedResourceId;
    }

    public void setDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
    }

    public StarRocksInstanceInfoInstances withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 支付模式。
     * @return payModel
     */
    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StarRocksInstanceInfoInstances that = (StarRocksInstanceInfoInstances) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.dataVip, that.dataVip)
            && Objects.equals(this.canEnablePublicAccess, that.canEnablePublicAccess)
            && Objects.equals(this.currentBackupNodeId, that.currentBackupNodeId)
            && Objects.equals(this.clusterMode, that.clusterMode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.isFrozen, that.isFrozen) && Objects.equals(this.frozenTime, that.frozenTime)
            && Objects.equals(this.dbUser, that.dbUser) && Objects.equals(this.bakPeriod, that.bakPeriod)
            && Objects.equals(this.bakKeepDay, that.bakKeepDay)
            && Objects.equals(this.bakExpectedStartTime, that.bakExpectedStartTime)
            && Objects.equals(this.dataStoreVersionId, that.dataStoreVersionId)
            && Objects.equals(this.dataStoreVersion, that.dataStoreVersion)
            && Objects.equals(this.dataStoreType, that.dataStoreType) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.deleteAt, that.deleteAt)
            && Objects.equals(this.dbPort, that.dbPort) && Objects.equals(this.paramGroup, that.paramGroup)
            && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.createFailErrorCode, that.createFailErrorCode)
            && Objects.equals(this.groups, that.groups) && Objects.equals(this.opsWindow, that.opsWindow)
            && Objects.equals(this.tagsInfo, that.tagsInfo) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.backupUsedSpace, that.backupUsedSpace) && Objects.equals(this.azMode, that.azMode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.portInfo, that.portInfo)
            && Objects.equals(this.feNodeVolumeCode, that.feNodeVolumeCode)
            && Objects.equals(this.beNodeVolumeCode, that.beNodeVolumeCode)
            && Objects.equals(this.feNodeVolumeSize, that.feNodeVolumeSize)
            && Objects.equals(this.beNodeVolumeSize, that.beNodeVolumeSize)
            && Objects.equals(this.supportDataReplication, that.supportDataReplication)
            && Objects.equals(this.newVersionAvailable, that.newVersionAvailable)
            && Objects.equals(this.sslOption, that.sslOption)
            && Objects.equals(this.dedicatedResourceId, that.dedicatedResourceId)
            && Objects.equals(this.payModel, that.payModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            projectId,
            publicIp,
            dataVip,
            canEnablePublicAccess,
            currentBackupNodeId,
            clusterMode,
            status,
            isFrozen,
            frozenTime,
            dbUser,
            bakPeriod,
            bakKeepDay,
            bakExpectedStartTime,
            dataStoreVersionId,
            dataStoreVersion,
            dataStoreType,
            createAt,
            updateAt,
            deleteAt,
            dbPort,
            paramGroup,
            actions,
            createFailErrorCode,
            groups,
            opsWindow,
            tagsInfo,
            timeZone,
            backupUsedSpace,
            azMode,
            enterpriseProjectId,
            portInfo,
            feNodeVolumeCode,
            beNodeVolumeCode,
            feNodeVolumeSize,
            beNodeVolumeSize,
            supportDataReplication,
            newVersionAvailable,
            sslOption,
            dedicatedResourceId,
            payModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarRocksInstanceInfoInstances {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    canEnablePublicAccess: ").append(toIndentedString(canEnablePublicAccess)).append("\n");
        sb.append("    currentBackupNodeId: ").append(toIndentedString(currentBackupNodeId)).append("\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    frozenTime: ").append(toIndentedString(frozenTime)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    bakPeriod: ").append(toIndentedString(bakPeriod)).append("\n");
        sb.append("    bakKeepDay: ").append(toIndentedString(bakKeepDay)).append("\n");
        sb.append("    bakExpectedStartTime: ").append(toIndentedString(bakExpectedStartTime)).append("\n");
        sb.append("    dataStoreVersionId: ").append(toIndentedString(dataStoreVersionId)).append("\n");
        sb.append("    dataStoreVersion: ").append(toIndentedString(dataStoreVersion)).append("\n");
        sb.append("    dataStoreType: ").append(toIndentedString(dataStoreType)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    paramGroup: ").append(toIndentedString(paramGroup)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    createFailErrorCode: ").append(toIndentedString(createFailErrorCode)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    opsWindow: ").append(toIndentedString(opsWindow)).append("\n");
        sb.append("    tagsInfo: ").append(toIndentedString(tagsInfo)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    backupUsedSpace: ").append(toIndentedString(backupUsedSpace)).append("\n");
        sb.append("    azMode: ").append(toIndentedString(azMode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    portInfo: ").append(toIndentedString(portInfo)).append("\n");
        sb.append("    feNodeVolumeCode: ").append(toIndentedString(feNodeVolumeCode)).append("\n");
        sb.append("    beNodeVolumeCode: ").append(toIndentedString(beNodeVolumeCode)).append("\n");
        sb.append("    feNodeVolumeSize: ").append(toIndentedString(feNodeVolumeSize)).append("\n");
        sb.append("    beNodeVolumeSize: ").append(toIndentedString(beNodeVolumeSize)).append("\n");
        sb.append("    supportDataReplication: ").append(toIndentedString(supportDataReplication)).append("\n");
        sb.append("    newVersionAvailable: ").append(toIndentedString(newVersionAvailable)).append("\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
        sb.append("    dedicatedResourceId: ").append(toIndentedString(dedicatedResourceId)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
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
