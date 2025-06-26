package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DisasterRecovery
 */
public class DisasterRecovery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_type")

    private String drType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_id")

    private String primaryClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_name")

    private String primaryClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster_id")

    private String standbyClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster_name")

    private String standbyClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_role")

    private String primaryClusterRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster_role")

    private String standbyClusterRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_status")

    private String primaryClusterStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster_status")

    private String standbyClusterStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_region")

    private String primaryClusterRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster_region")

    private String standbyClusterRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_project_id")

    private String primaryClusterProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster_project_id")

    private String standbyClusterProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_disaster_time")

    private String lastDisasterTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public DisasterRecovery withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 容灾ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DisasterRecovery withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DisasterRecovery withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DisasterRecovery withDrType(String drType) {
        this.drType = drType;
        return this;
    }

    /**
     * **参数解释**： 容灾类型。 **取值范围**： 不涉及。
     * @return drType
     */
    public String getDrType() {
        return drType;
    }

    public void setDrType(String drType) {
        this.drType = drType;
    }

    public DisasterRecovery withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * **参数解释**： 主集群ID。 **取值范围**： 不涉及。
     * @return primaryClusterId
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }

    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    public DisasterRecovery withPrimaryClusterName(String primaryClusterName) {
        this.primaryClusterName = primaryClusterName;
        return this;
    }

    /**
     * **参数解释**： 主集群名称。 **取值范围**： 不涉及。
     * @return primaryClusterName
     */
    public String getPrimaryClusterName() {
        return primaryClusterName;
    }

    public void setPrimaryClusterName(String primaryClusterName) {
        this.primaryClusterName = primaryClusterName;
    }

    public DisasterRecovery withStandbyClusterId(String standbyClusterId) {
        this.standbyClusterId = standbyClusterId;
        return this;
    }

    /**
     * **参数解释**： 备集群ID。 **取值范围**： 不涉及。
     * @return standbyClusterId
     */
    public String getStandbyClusterId() {
        return standbyClusterId;
    }

    public void setStandbyClusterId(String standbyClusterId) {
        this.standbyClusterId = standbyClusterId;
    }

    public DisasterRecovery withStandbyClusterName(String standbyClusterName) {
        this.standbyClusterName = standbyClusterName;
        return this;
    }

    /**
     * **参数解释**： 备集群名称。 **取值范围**： 不涉及。
     * @return standbyClusterName
     */
    public String getStandbyClusterName() {
        return standbyClusterName;
    }

    public void setStandbyClusterName(String standbyClusterName) {
        this.standbyClusterName = standbyClusterName;
    }

    public DisasterRecovery withPrimaryClusterRole(String primaryClusterRole) {
        this.primaryClusterRole = primaryClusterRole;
        return this;
    }

    /**
     * **参数解释**： 主集群角色。 **取值范围**： 不涉及。
     * @return primaryClusterRole
     */
    public String getPrimaryClusterRole() {
        return primaryClusterRole;
    }

    public void setPrimaryClusterRole(String primaryClusterRole) {
        this.primaryClusterRole = primaryClusterRole;
    }

    public DisasterRecovery withStandbyClusterRole(String standbyClusterRole) {
        this.standbyClusterRole = standbyClusterRole;
        return this;
    }

    /**
     * **参数解释**： 备集群角色。 **取值范围**： 不涉及。
     * @return standbyClusterRole
     */
    public String getStandbyClusterRole() {
        return standbyClusterRole;
    }

    public void setStandbyClusterRole(String standbyClusterRole) {
        this.standbyClusterRole = standbyClusterRole;
    }

    public DisasterRecovery withPrimaryClusterStatus(String primaryClusterStatus) {
        this.primaryClusterStatus = primaryClusterStatus;
        return this;
    }

    /**
     * **参数解释**： 主集群状态。 **取值范围**： 不涉及。
     * @return primaryClusterStatus
     */
    public String getPrimaryClusterStatus() {
        return primaryClusterStatus;
    }

    public void setPrimaryClusterStatus(String primaryClusterStatus) {
        this.primaryClusterStatus = primaryClusterStatus;
    }

    public DisasterRecovery withStandbyClusterStatus(String standbyClusterStatus) {
        this.standbyClusterStatus = standbyClusterStatus;
        return this;
    }

    /**
     * **参数解释**： 备集群状态。 **取值范围**： 不涉及。
     * @return standbyClusterStatus
     */
    public String getStandbyClusterStatus() {
        return standbyClusterStatus;
    }

    public void setStandbyClusterStatus(String standbyClusterStatus) {
        this.standbyClusterStatus = standbyClusterStatus;
    }

    public DisasterRecovery withPrimaryClusterRegion(String primaryClusterRegion) {
        this.primaryClusterRegion = primaryClusterRegion;
        return this;
    }

    /**
     * **参数解释**： 主集群region。 **取值范围**： 不涉及。
     * @return primaryClusterRegion
     */
    public String getPrimaryClusterRegion() {
        return primaryClusterRegion;
    }

    public void setPrimaryClusterRegion(String primaryClusterRegion) {
        this.primaryClusterRegion = primaryClusterRegion;
    }

    public DisasterRecovery withStandbyClusterRegion(String standbyClusterRegion) {
        this.standbyClusterRegion = standbyClusterRegion;
        return this;
    }

    /**
     * **参数解释**： 备集群region。 **取值范围**： 不涉及。
     * @return standbyClusterRegion
     */
    public String getStandbyClusterRegion() {
        return standbyClusterRegion;
    }

    public void setStandbyClusterRegion(String standbyClusterRegion) {
        this.standbyClusterRegion = standbyClusterRegion;
    }

    public DisasterRecovery withPrimaryClusterProjectId(String primaryClusterProjectId) {
        this.primaryClusterProjectId = primaryClusterProjectId;
        return this;
    }

    /**
     * **参数解释**： 主集群项目ID。 **取值范围**： 不涉及。
     * @return primaryClusterProjectId
     */
    public String getPrimaryClusterProjectId() {
        return primaryClusterProjectId;
    }

    public void setPrimaryClusterProjectId(String primaryClusterProjectId) {
        this.primaryClusterProjectId = primaryClusterProjectId;
    }

    public DisasterRecovery withStandbyClusterProjectId(String standbyClusterProjectId) {
        this.standbyClusterProjectId = standbyClusterProjectId;
        return this;
    }

    /**
     * **参数解释**： 备集群项目ID。 **取值范围**： 不涉及。
     * @return standbyClusterProjectId
     */
    public String getStandbyClusterProjectId() {
        return standbyClusterProjectId;
    }

    public void setStandbyClusterProjectId(String standbyClusterProjectId) {
        this.standbyClusterProjectId = standbyClusterProjectId;
    }

    public DisasterRecovery withLastDisasterTime(String lastDisasterTime) {
        this.lastDisasterTime = lastDisasterTime;
        return this;
    }

    /**
     * **参数解释**： 最近同步时间。 **取值范围**： 不涉及。
     * @return lastDisasterTime
     */
    public String getLastDisasterTime() {
        return lastDisasterTime;
    }

    public void setLastDisasterTime(String lastDisasterTime) {
        this.lastDisasterTime = lastDisasterTime;
    }

    public DisasterRecovery withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 启动时间。 **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DisasterRecovery withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisasterRecovery that = (DisasterRecovery) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.name, that.name) && Objects.equals(this.drType, that.drType)
            && Objects.equals(this.primaryClusterId, that.primaryClusterId)
            && Objects.equals(this.primaryClusterName, that.primaryClusterName)
            && Objects.equals(this.standbyClusterId, that.standbyClusterId)
            && Objects.equals(this.standbyClusterName, that.standbyClusterName)
            && Objects.equals(this.primaryClusterRole, that.primaryClusterRole)
            && Objects.equals(this.standbyClusterRole, that.standbyClusterRole)
            && Objects.equals(this.primaryClusterStatus, that.primaryClusterStatus)
            && Objects.equals(this.standbyClusterStatus, that.standbyClusterStatus)
            && Objects.equals(this.primaryClusterRegion, that.primaryClusterRegion)
            && Objects.equals(this.standbyClusterRegion, that.standbyClusterRegion)
            && Objects.equals(this.primaryClusterProjectId, that.primaryClusterProjectId)
            && Objects.equals(this.standbyClusterProjectId, that.standbyClusterProjectId)
            && Objects.equals(this.lastDisasterTime, that.lastDisasterTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            name,
            drType,
            primaryClusterId,
            primaryClusterName,
            standbyClusterId,
            standbyClusterName,
            primaryClusterRole,
            standbyClusterRole,
            primaryClusterStatus,
            standbyClusterStatus,
            primaryClusterRegion,
            standbyClusterRegion,
            primaryClusterProjectId,
            standbyClusterProjectId,
            lastDisasterTime,
            startTime,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisasterRecovery {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    drType: ").append(toIndentedString(drType)).append("\n");
        sb.append("    primaryClusterId: ").append(toIndentedString(primaryClusterId)).append("\n");
        sb.append("    primaryClusterName: ").append(toIndentedString(primaryClusterName)).append("\n");
        sb.append("    standbyClusterId: ").append(toIndentedString(standbyClusterId)).append("\n");
        sb.append("    standbyClusterName: ").append(toIndentedString(standbyClusterName)).append("\n");
        sb.append("    primaryClusterRole: ").append(toIndentedString(primaryClusterRole)).append("\n");
        sb.append("    standbyClusterRole: ").append(toIndentedString(standbyClusterRole)).append("\n");
        sb.append("    primaryClusterStatus: ").append(toIndentedString(primaryClusterStatus)).append("\n");
        sb.append("    standbyClusterStatus: ").append(toIndentedString(standbyClusterStatus)).append("\n");
        sb.append("    primaryClusterRegion: ").append(toIndentedString(primaryClusterRegion)).append("\n");
        sb.append("    standbyClusterRegion: ").append(toIndentedString(standbyClusterRegion)).append("\n");
        sb.append("    primaryClusterProjectId: ").append(toIndentedString(primaryClusterProjectId)).append("\n");
        sb.append("    standbyClusterProjectId: ").append(toIndentedString(standbyClusterProjectId)).append("\n");
        sb.append("    lastDisasterTime: ").append(toIndentedString(lastDisasterTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
