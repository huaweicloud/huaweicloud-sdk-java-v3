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
     * ID
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
     * 状态
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
     * 名称
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
     * 容灾类型
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
     * 主集群ID
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
     * 主集群名称
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
     * 备集群ID
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
     * 备集群名称
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
     * 主集群角色
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
     * 备集群角色
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
     * 主集群状态
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
     * 备集群状态
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
     * 主集群region
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
     * 备集群region
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
     * 主集群project_id
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
     * 备集群project_id
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
     * 最近同步时间
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
     * 启动时间
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
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisasterRecovery disasterRecovery = (DisasterRecovery) o;
        return Objects.equals(this.id, disasterRecovery.id) && Objects.equals(this.status, disasterRecovery.status)
            && Objects.equals(this.name, disasterRecovery.name) && Objects.equals(this.drType, disasterRecovery.drType)
            && Objects.equals(this.primaryClusterId, disasterRecovery.primaryClusterId)
            && Objects.equals(this.primaryClusterName, disasterRecovery.primaryClusterName)
            && Objects.equals(this.standbyClusterId, disasterRecovery.standbyClusterId)
            && Objects.equals(this.standbyClusterName, disasterRecovery.standbyClusterName)
            && Objects.equals(this.primaryClusterRole, disasterRecovery.primaryClusterRole)
            && Objects.equals(this.standbyClusterRole, disasterRecovery.standbyClusterRole)
            && Objects.equals(this.primaryClusterStatus, disasterRecovery.primaryClusterStatus)
            && Objects.equals(this.standbyClusterStatus, disasterRecovery.standbyClusterStatus)
            && Objects.equals(this.primaryClusterRegion, disasterRecovery.primaryClusterRegion)
            && Objects.equals(this.standbyClusterRegion, disasterRecovery.standbyClusterRegion)
            && Objects.equals(this.primaryClusterProjectId, disasterRecovery.primaryClusterProjectId)
            && Objects.equals(this.standbyClusterProjectId, disasterRecovery.standbyClusterProjectId)
            && Objects.equals(this.lastDisasterTime, disasterRecovery.lastDisasterTime)
            && Objects.equals(this.startTime, disasterRecovery.startTime)
            && Objects.equals(this.createTime, disasterRecovery.createTime);
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
