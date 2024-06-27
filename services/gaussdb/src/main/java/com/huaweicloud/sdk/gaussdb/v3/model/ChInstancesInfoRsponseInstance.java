package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息。
 */
public class ChInstancesInfoRsponseInstance {

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

    private String frozenTime;

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

    private String bakExpectedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version_id")

    private String datastoreVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

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

    private ChInstancesInfoRsponseInstanceParamGroup paramGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ChQueryActionInfo> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_fail_error_code")

    private String createFailErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<ChInstancesInfoRsponseInstanceGroups> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ops_window")

    private ChInstancesInfoRsponseInstanceOpsWindow opsWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_info")

    private CreateChInstanceInfoTagsInfo tagsInfo;

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
    @JsonProperty(value = "master_az_code")

    private String masterAzCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_info")

    private ChInstancesInfoRsponseInstancePortInfo portInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_code")

    private String volumeCode;

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

    public ChInstancesInfoRsponseInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChInstancesInfoRsponseInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChInstancesInfoRsponseInstance withProjectId(String projectId) {
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

    public ChInstancesInfoRsponseInstance withPublicIp(String publicIp) {
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

    public ChInstancesInfoRsponseInstance withCanEnablePublicAccess(Boolean canEnablePublicAccess) {
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

    public ChInstancesInfoRsponseInstance withCurrentBackupNodeId(String currentBackupNodeId) {
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

    public ChInstancesInfoRsponseInstance withClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * 部署模式。 取值范围： - Single：单机 - Ha：主备
     * @return clusterMode
     */
    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

    public ChInstancesInfoRsponseInstance withStatus(String status) {
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

    public ChInstancesInfoRsponseInstance withIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 是否冻结。 取值范围： - 0：不冻结 - 1：冻结
     * @return isFrozen
     */
    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }

    public ChInstancesInfoRsponseInstance withFrozenTime(String frozenTime) {
        this.frozenTime = frozenTime;
        return this;
    }

    /**
     * 冻结时间。
     * @return frozenTime
     */
    public String getFrozenTime() {
        return frozenTime;
    }

    public void setFrozenTime(String frozenTime) {
        this.frozenTime = frozenTime;
    }

    public ChInstancesInfoRsponseInstance withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 默认用户。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public ChInstancesInfoRsponseInstance withBakPeriod(String bakPeriod) {
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

    public ChInstancesInfoRsponseInstance withBakKeepDay(Integer bakKeepDay) {
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

    public ChInstancesInfoRsponseInstance withBakExpectedStartTime(String bakExpectedStartTime) {
        this.bakExpectedStartTime = bakExpectedStartTime;
        return this;
    }

    /**
     * 备份预计开始时间。
     * @return bakExpectedStartTime
     */
    public String getBakExpectedStartTime() {
        return bakExpectedStartTime;
    }

    public void setBakExpectedStartTime(String bakExpectedStartTime) {
        this.bakExpectedStartTime = bakExpectedStartTime;
    }

    public ChInstancesInfoRsponseInstance withDatastoreVersionId(String datastoreVersionId) {
        this.datastoreVersionId = datastoreVersionId;
        return this;
    }

    /**
     * 数据库版本ID。
     * @return datastoreVersionId
     */
    public String getDatastoreVersionId() {
        return datastoreVersionId;
    }

    public void setDatastoreVersionId(String datastoreVersionId) {
        this.datastoreVersionId = datastoreVersionId;
    }

    public ChInstancesInfoRsponseInstance withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * 数据库版本。
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public ChInstancesInfoRsponseInstance withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库引擎。
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ChInstancesInfoRsponseInstance withCreateAt(Long createAt) {
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

    public ChInstancesInfoRsponseInstance withUpdateAt(Long updateAt) {
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

    public ChInstancesInfoRsponseInstance withDeleteAt(Long deleteAt) {
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

    public ChInstancesInfoRsponseInstance withDbPort(String dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口号。取值范围0~65535。
     * @return dbPort
     */
    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public ChInstancesInfoRsponseInstance withParamGroup(ChInstancesInfoRsponseInstanceParamGroup paramGroup) {
        this.paramGroup = paramGroup;
        return this;
    }

    public ChInstancesInfoRsponseInstance withParamGroup(
        Consumer<ChInstancesInfoRsponseInstanceParamGroup> paramGroupSetter) {
        if (this.paramGroup == null) {
            this.paramGroup = new ChInstancesInfoRsponseInstanceParamGroup();
            paramGroupSetter.accept(this.paramGroup);
        }

        return this;
    }

    /**
     * Get paramGroup
     * @return paramGroup
     */
    public ChInstancesInfoRsponseInstanceParamGroup getParamGroup() {
        return paramGroup;
    }

    public void setParamGroup(ChInstancesInfoRsponseInstanceParamGroup paramGroup) {
        this.paramGroup = paramGroup;
    }

    public ChInstancesInfoRsponseInstance withActions(List<ChQueryActionInfo> actions) {
        this.actions = actions;
        return this;
    }

    public ChInstancesInfoRsponseInstance addActionsItem(ChQueryActionInfo actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ChInstancesInfoRsponseInstance withActions(Consumer<List<ChQueryActionInfo>> actionsSetter) {
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
    public List<ChQueryActionInfo> getActions() {
        return actions;
    }

    public void setActions(List<ChQueryActionInfo> actions) {
        this.actions = actions;
    }

    public ChInstancesInfoRsponseInstance withCreateFailErrorCode(String createFailErrorCode) {
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

    public ChInstancesInfoRsponseInstance withGroups(List<ChInstancesInfoRsponseInstanceGroups> groups) {
        this.groups = groups;
        return this;
    }

    public ChInstancesInfoRsponseInstance addGroupsItem(ChInstancesInfoRsponseInstanceGroups groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ChInstancesInfoRsponseInstance withGroups(
        Consumer<List<ChInstancesInfoRsponseInstanceGroups>> groupsSetter) {
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
    public List<ChInstancesInfoRsponseInstanceGroups> getGroups() {
        return groups;
    }

    public void setGroups(List<ChInstancesInfoRsponseInstanceGroups> groups) {
        this.groups = groups;
    }

    public ChInstancesInfoRsponseInstance withOpsWindow(ChInstancesInfoRsponseInstanceOpsWindow opsWindow) {
        this.opsWindow = opsWindow;
        return this;
    }

    public ChInstancesInfoRsponseInstance withOpsWindow(
        Consumer<ChInstancesInfoRsponseInstanceOpsWindow> opsWindowSetter) {
        if (this.opsWindow == null) {
            this.opsWindow = new ChInstancesInfoRsponseInstanceOpsWindow();
            opsWindowSetter.accept(this.opsWindow);
        }

        return this;
    }

    /**
     * Get opsWindow
     * @return opsWindow
     */
    public ChInstancesInfoRsponseInstanceOpsWindow getOpsWindow() {
        return opsWindow;
    }

    public void setOpsWindow(ChInstancesInfoRsponseInstanceOpsWindow opsWindow) {
        this.opsWindow = opsWindow;
    }

    public ChInstancesInfoRsponseInstance withTagsInfo(CreateChInstanceInfoTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
        return this;
    }

    public ChInstancesInfoRsponseInstance withTagsInfo(Consumer<CreateChInstanceInfoTagsInfo> tagsInfoSetter) {
        if (this.tagsInfo == null) {
            this.tagsInfo = new CreateChInstanceInfoTagsInfo();
            tagsInfoSetter.accept(this.tagsInfo);
        }

        return this;
    }

    /**
     * Get tagsInfo
     * @return tagsInfo
     */
    public CreateChInstanceInfoTagsInfo getTagsInfo() {
        return tagsInfo;
    }

    public void setTagsInfo(CreateChInstanceInfoTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
    }

    public ChInstancesInfoRsponseInstance withTimeZone(String timeZone) {
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

    public ChInstancesInfoRsponseInstance withBackupUsedSpace(String backupUsedSpace) {
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

    public ChInstancesInfoRsponseInstance withAzMode(String azMode) {
        this.azMode = azMode;
        return this;
    }

    /**
     * 可用区模式。 取值范围： - single：单可用区 - double：多可用区-
     * @return azMode
     */
    public String getAzMode() {
        return azMode;
    }

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    public ChInstancesInfoRsponseInstance withMasterAzCode(String masterAzCode) {
        this.masterAzCode = masterAzCode;
        return this;
    }

    /**
     * 主可用区。
     * @return masterAzCode
     */
    public String getMasterAzCode() {
        return masterAzCode;
    }

    public void setMasterAzCode(String masterAzCode) {
        this.masterAzCode = masterAzCode;
    }

    public ChInstancesInfoRsponseInstance withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ChInstancesInfoRsponseInstance withPortInfo(ChInstancesInfoRsponseInstancePortInfo portInfo) {
        this.portInfo = portInfo;
        return this;
    }

    public ChInstancesInfoRsponseInstance withPortInfo(
        Consumer<ChInstancesInfoRsponseInstancePortInfo> portInfoSetter) {
        if (this.portInfo == null) {
            this.portInfo = new ChInstancesInfoRsponseInstancePortInfo();
            portInfoSetter.accept(this.portInfo);
        }

        return this;
    }

    /**
     * Get portInfo
     * @return portInfo
     */
    public ChInstancesInfoRsponseInstancePortInfo getPortInfo() {
        return portInfo;
    }

    public void setPortInfo(ChInstancesInfoRsponseInstancePortInfo portInfo) {
        this.portInfo = portInfo;
    }

    public ChInstancesInfoRsponseInstance withVolumeCode(String volumeCode) {
        this.volumeCode = volumeCode;
        return this;
    }

    /**
     * 磁盘规格码。
     * @return volumeCode
     */
    public String getVolumeCode() {
        return volumeCode;
    }

    public void setVolumeCode(String volumeCode) {
        this.volumeCode = volumeCode;
    }

    public ChInstancesInfoRsponseInstance withSupportDataReplication(Boolean supportDataReplication) {
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

    public ChInstancesInfoRsponseInstance withNewVersionAvailable(Boolean newVersionAvailable) {
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

    public ChInstancesInfoRsponseInstance withSslOption(Boolean sslOption) {
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

    public ChInstancesInfoRsponseInstance withDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
        return this;
    }

    /**
     * 专属资源池ID。
     * @return dedicatedResourceId
     */
    public String getDedicatedResourceId() {
        return dedicatedResourceId;
    }

    public void setDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
    }

    public ChInstancesInfoRsponseInstance withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 支付模式。 取值范围： - 0：按需计费 - 1：包周期-
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
        ChInstancesInfoRsponseInstance that = (ChInstancesInfoRsponseInstance) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.canEnablePublicAccess, that.canEnablePublicAccess)
            && Objects.equals(this.currentBackupNodeId, that.currentBackupNodeId)
            && Objects.equals(this.clusterMode, that.clusterMode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.isFrozen, that.isFrozen) && Objects.equals(this.frozenTime, that.frozenTime)
            && Objects.equals(this.dbUser, that.dbUser) && Objects.equals(this.bakPeriod, that.bakPeriod)
            && Objects.equals(this.bakKeepDay, that.bakKeepDay)
            && Objects.equals(this.bakExpectedStartTime, that.bakExpectedStartTime)
            && Objects.equals(this.datastoreVersionId, that.datastoreVersionId)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion)
            && Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.deleteAt, that.deleteAt)
            && Objects.equals(this.dbPort, that.dbPort) && Objects.equals(this.paramGroup, that.paramGroup)
            && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.createFailErrorCode, that.createFailErrorCode)
            && Objects.equals(this.groups, that.groups) && Objects.equals(this.opsWindow, that.opsWindow)
            && Objects.equals(this.tagsInfo, that.tagsInfo) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.backupUsedSpace, that.backupUsedSpace) && Objects.equals(this.azMode, that.azMode)
            && Objects.equals(this.masterAzCode, that.masterAzCode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.portInfo, that.portInfo) && Objects.equals(this.volumeCode, that.volumeCode)
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
            datastoreVersionId,
            datastoreVersion,
            datastoreType,
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
            masterAzCode,
            enterpriseProjectId,
            portInfo,
            volumeCode,
            supportDataReplication,
            newVersionAvailable,
            sslOption,
            dedicatedResourceId,
            payModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChInstancesInfoRsponseInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
        sb.append("    datastoreVersionId: ").append(toIndentedString(datastoreVersionId)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
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
        sb.append("    masterAzCode: ").append(toIndentedString(masterAzCode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    portInfo: ").append(toIndentedString(portInfo)).append("\n");
        sb.append("    volumeCode: ").append(toIndentedString(volumeCode)).append("\n");
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
