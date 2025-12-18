package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceDetail
 */
public class InstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_mode")

    private String clusterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bpdomain_id")

    private String bpdomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_at")

    private String deleteAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_version_available")

    private Boolean newVersionAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_version_available")

    private Boolean rollbackVersionAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "degrade_version_available")

    private Boolean degradeVersionAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_fail_error_code")

    private String createFailErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private String payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private Boolean isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_time")

    private String frozenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ActionInfo> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_default_group")

    private Boolean onlyDefaultGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<DdmGroupInfo> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_map")

    private Map<String, String> extendMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_info")

    private List<TagsInfo> tagsInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_user_name")

    private String adminUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_binding_info")

    private Object eipBindingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Integer enableSsl;

    public InstanceDetail withId(String id) {
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

    public InstanceDetail withName(String name) {
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

    public InstanceDetail withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 实例别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public InstanceDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public InstanceDetail withClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * 集群模式。
     * @return clusterMode
     */
    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

    public InstanceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceDetail withBpdomainId(String bpdomainId) {
        this.bpdomainId = bpdomainId;
        return this;
    }

    /**
     * bpdomain_id
     * @return bpdomainId
     */
    public String getBpdomainId() {
        return bpdomainId;
    }

    public void setBpdomainId(String bpdomainId) {
        this.bpdomainId = bpdomainId;
    }

    public InstanceDetail withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 账户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InstanceDetail withDatastoreVersion(String datastoreVersion) {
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

    public InstanceDetail withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型。
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public InstanceDetail withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public InstanceDetail withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public InstanceDetail withDeleteAt(String deleteAt) {
        this.deleteAt = deleteAt;
        return this;
    }

    /**
     * 删除时间。
     * @return deleteAt
     */
    public String getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(String deleteAt) {
        this.deleteAt = deleteAt;
    }

    public InstanceDetail withNewVersionAvailable(Boolean newVersionAvailable) {
        this.newVersionAvailable = newVersionAvailable;
        return this;
    }

    /**
     * 是否有版本可升级。
     * @return newVersionAvailable
     */
    public Boolean getNewVersionAvailable() {
        return newVersionAvailable;
    }

    public void setNewVersionAvailable(Boolean newVersionAvailable) {
        this.newVersionAvailable = newVersionAvailable;
    }

    public InstanceDetail withRollbackVersionAvailable(Boolean rollbackVersionAvailable) {
        this.rollbackVersionAvailable = rollbackVersionAvailable;
        return this;
    }

    /**
     * 是否有版本可回滚。
     * @return rollbackVersionAvailable
     */
    public Boolean getRollbackVersionAvailable() {
        return rollbackVersionAvailable;
    }

    public void setRollbackVersionAvailable(Boolean rollbackVersionAvailable) {
        this.rollbackVersionAvailable = rollbackVersionAvailable;
    }

    public InstanceDetail withDegradeVersionAvailable(Boolean degradeVersionAvailable) {
        this.degradeVersionAvailable = degradeVersionAvailable;
        return this;
    }

    /**
     * 是否有版本可降级。
     * @return degradeVersionAvailable
     */
    public Boolean getDegradeVersionAvailable() {
        return degradeVersionAvailable;
    }

    public void setDegradeVersionAvailable(Boolean degradeVersionAvailable) {
        this.degradeVersionAvailable = degradeVersionAvailable;
    }

    public InstanceDetail withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 公共ip。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public InstanceDetail withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 端口。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public InstanceDetail withCreateFailErrorCode(String createFailErrorCode) {
        this.createFailErrorCode = createFailErrorCode;
        return this;
    }

    /**
     * 创建失败原因编码。
     * @return createFailErrorCode
     */
    public String getCreateFailErrorCode() {
        return createFailErrorCode;
    }

    public void setCreateFailErrorCode(String createFailErrorCode) {
        this.createFailErrorCode = createFailErrorCode;
    }

    public InstanceDetail withTimeZone(String timeZone) {
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

    public InstanceDetail withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 付费模式。
     * @return payModel
     */
    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    public InstanceDetail withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public InstanceDetail withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 周期。
     * minimum: 0
     * maximum: 2147483647
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public InstanceDetail withIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 是否冻结。
     * @return isFrozen
     */
    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public InstanceDetail withFrozenTime(String frozenTime) {
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

    public InstanceDetail withActions(List<ActionInfo> actions) {
        this.actions = actions;
        return this;
    }

    public InstanceDetail addActionsItem(ActionInfo actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public InstanceDetail withActions(Consumer<List<ActionInfo>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 锁状态。
     * @return actions
     */
    public List<ActionInfo> getActions() {
        return actions;
    }

    public void setActions(List<ActionInfo> actions) {
        this.actions = actions;
    }

    public InstanceDetail withOnlyDefaultGroup(Boolean onlyDefaultGroup) {
        this.onlyDefaultGroup = onlyDefaultGroup;
        return this;
    }

    /**
     * 是否只有默认组。
     * @return onlyDefaultGroup
     */
    public Boolean getOnlyDefaultGroup() {
        return onlyDefaultGroup;
    }

    public void setOnlyDefaultGroup(Boolean onlyDefaultGroup) {
        this.onlyDefaultGroup = onlyDefaultGroup;
    }

    public InstanceDetail withGroups(List<DdmGroupInfo> groups) {
        this.groups = groups;
        return this;
    }

    public InstanceDetail addGroupsItem(DdmGroupInfo groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public InstanceDetail withGroups(Consumer<List<DdmGroupInfo>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 组信息。
     * @return groups
     */
    public List<DdmGroupInfo> getGroups() {
        return groups;
    }

    public void setGroups(List<DdmGroupInfo> groups) {
        this.groups = groups;
    }

    public InstanceDetail withExtendMap(Map<String, String> extendMap) {
        this.extendMap = extendMap;
        return this;
    }

    public InstanceDetail putExtendMapItem(String key, String extendMapItem) {
        if (this.extendMap == null) {
            this.extendMap = new HashMap<>();
        }
        this.extendMap.put(key, extendMapItem);
        return this;
    }

    public InstanceDetail withExtendMap(Consumer<Map<String, String>> extendMapSetter) {
        if (this.extendMap == null) {
            this.extendMap = new HashMap<>();
        }
        extendMapSetter.accept(this.extendMap);
        return this;
    }

    /**
     * 其他信息。
     * @return extendMap
     */
    public Map<String, String> getExtendMap() {
        return extendMap;
    }

    public void setExtendMap(Map<String, String> extendMap) {
        this.extendMap = extendMap;
    }

    public InstanceDetail withTagsInfo(List<TagsInfo> tagsInfo) {
        this.tagsInfo = tagsInfo;
        return this;
    }

    public InstanceDetail addTagsInfoItem(TagsInfo tagsInfoItem) {
        if (this.tagsInfo == null) {
            this.tagsInfo = new ArrayList<>();
        }
        this.tagsInfo.add(tagsInfoItem);
        return this;
    }

    public InstanceDetail withTagsInfo(Consumer<List<TagsInfo>> tagsInfoSetter) {
        if (this.tagsInfo == null) {
            this.tagsInfo = new ArrayList<>();
        }
        tagsInfoSetter.accept(this.tagsInfo);
        return this;
    }

    /**
     * 标签信息。
     * @return tagsInfo
     */
    public List<TagsInfo> getTagsInfo() {
        return tagsInfo;
    }

    public void setTagsInfo(List<TagsInfo> tagsInfo) {
        this.tagsInfo = tagsInfo;
    }

    public InstanceDetail withAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
        return this;
    }

    /**
     * 管理员账号。
     * @return adminUserName
     */
    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public InstanceDetail withEipBindingInfo(Object eipBindingInfo) {
        this.eipBindingInfo = eipBindingInfo;
        return this;
    }

    /**
     * 绑定eip信息。
     * @return eipBindingInfo
     */
    public Object getEipBindingInfo() {
        return eipBindingInfo;
    }

    public void setEipBindingInfo(Object eipBindingInfo) {
        this.eipBindingInfo = eipBindingInfo;
    }

    public InstanceDetail withEnableSsl(Integer enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * 是否支持ssl。
     * minimum: 0
     * maximum: 2147483647
     * @return enableSsl
     */
    public Integer getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Integer enableSsl) {
        this.enableSsl = enableSsl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDetail that = (InstanceDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.clusterMode, that.clusterMode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.bpdomainId, that.bpdomainId) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion)
            && Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.deleteAt, that.deleteAt)
            && Objects.equals(this.newVersionAvailable, that.newVersionAvailable)
            && Objects.equals(this.rollbackVersionAvailable, that.rollbackVersionAvailable)
            && Objects.equals(this.degradeVersionAvailable, that.degradeVersionAvailable)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.port, that.port)
            && Objects.equals(this.createFailErrorCode, that.createFailErrorCode)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.payModel, that.payModel)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.period, that.period)
            && Objects.equals(this.isFrozen, that.isFrozen) && Objects.equals(this.frozenTime, that.frozenTime)
            && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.onlyDefaultGroup, that.onlyDefaultGroup) && Objects.equals(this.groups, that.groups)
            && Objects.equals(this.extendMap, that.extendMap) && Objects.equals(this.tagsInfo, that.tagsInfo)
            && Objects.equals(this.adminUserName, that.adminUserName)
            && Objects.equals(this.eipBindingInfo, that.eipBindingInfo)
            && Objects.equals(this.enableSsl, that.enableSsl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            alias,
            projectId,
            clusterMode,
            status,
            bpdomainId,
            userId,
            datastoreVersion,
            datastoreType,
            createAt,
            updateAt,
            deleteAt,
            newVersionAvailable,
            rollbackVersionAvailable,
            degradeVersionAvailable,
            publicIp,
            port,
            createFailErrorCode,
            timeZone,
            payModel,
            orderId,
            period,
            isFrozen,
            frozenTime,
            actions,
            onlyDefaultGroup,
            groups,
            extendMap,
            tagsInfo,
            adminUserName,
            eipBindingInfo,
            enableSsl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bpdomainId: ").append(toIndentedString(bpdomainId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
        sb.append("    newVersionAvailable: ").append(toIndentedString(newVersionAvailable)).append("\n");
        sb.append("    rollbackVersionAvailable: ").append(toIndentedString(rollbackVersionAvailable)).append("\n");
        sb.append("    degradeVersionAvailable: ").append(toIndentedString(degradeVersionAvailable)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    createFailErrorCode: ").append(toIndentedString(createFailErrorCode)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    frozenTime: ").append(toIndentedString(frozenTime)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    onlyDefaultGroup: ").append(toIndentedString(onlyDefaultGroup)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    extendMap: ").append(toIndentedString(extendMap)).append("\n");
        sb.append("    tagsInfo: ").append(toIndentedString(tagsInfo)).append("\n");
        sb.append("    adminUserName: ").append(toIndentedString(adminUserName)).append("\n");
        sb.append("    eipBindingInfo: ").append(toIndentedString(eipBindingInfo)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
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
