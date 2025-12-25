package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDisasterRecovery
 */
public class CreateDisasterRecovery {

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
    @JsonProperty(value = "standby_cluster_id")

    private String standbyClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_sync_period")

    private String drSyncPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_obs_bucket")

    private String primaryObsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_obs_bucket")

    private String standbyObsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discovery_recovery_id")

    private String discoveryRecoveryId;

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
    @JsonProperty(value = "cluster_role")

    private String clusterRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_info")

    private CreateDrClusterDto primaryClusterInfo;

    public CreateDisasterRecovery withName(String name) {
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

    public CreateDisasterRecovery withDrType(String drType) {
        this.drType = drType;
        return this;
    }

    /**
     * **参数解释**： 容灾类型。 **取值范围**： - az，跨az容灾。 - region，跨region容灾。
     * @return drType
     */
    public String getDrType() {
        return drType;
    }

    public void setDrType(String drType) {
        this.drType = drType;
    }

    public CreateDisasterRecovery withPrimaryClusterId(String primaryClusterId) {
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

    public CreateDisasterRecovery withStandbyClusterId(String standbyClusterId) {
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

    public CreateDisasterRecovery withDrSyncPeriod(String drSyncPeriod) {
        this.drSyncPeriod = drSyncPeriod;
        return this;
    }

    /**
     * **参数解释**： 同步周期。 **取值范围**： 不涉及。
     * @return drSyncPeriod
     */
    public String getDrSyncPeriod() {
        return drSyncPeriod;
    }

    public void setDrSyncPeriod(String drSyncPeriod) {
        this.drSyncPeriod = drSyncPeriod;
    }

    public CreateDisasterRecovery withPrimaryObsBucket(String primaryObsBucket) {
        this.primaryObsBucket = primaryObsBucket;
        return this;
    }

    /**
     * **参数解释**： 主集群OBS桶。 **取值范围**： 不涉及。
     * @return primaryObsBucket
     */
    public String getPrimaryObsBucket() {
        return primaryObsBucket;
    }

    public void setPrimaryObsBucket(String primaryObsBucket) {
        this.primaryObsBucket = primaryObsBucket;
    }

    public CreateDisasterRecovery withStandbyObsBucket(String standbyObsBucket) {
        this.standbyObsBucket = standbyObsBucket;
        return this;
    }

    /**
     * **参数解释**： 备集群obs桶。 **取值范围**： 不涉及。
     * @return standbyObsBucket
     */
    public String getStandbyObsBucket() {
        return standbyObsBucket;
    }

    public void setStandbyObsBucket(String standbyObsBucket) {
        this.standbyObsBucket = standbyObsBucket;
    }

    public CreateDisasterRecovery withDiscoveryRecoveryId(String discoveryRecoveryId) {
        this.discoveryRecoveryId = discoveryRecoveryId;
        return this;
    }

    /**
     * **参数解释**： 容灾ID。 **取值范围**： 不涉及。
     * @return discoveryRecoveryId
     */
    public String getDiscoveryRecoveryId() {
        return discoveryRecoveryId;
    }

    public void setDiscoveryRecoveryId(String discoveryRecoveryId) {
        this.discoveryRecoveryId = discoveryRecoveryId;
    }

    public CreateDisasterRecovery withPrimaryClusterRegion(String primaryClusterRegion) {
        this.primaryClusterRegion = primaryClusterRegion;
        return this;
    }

    /**
     * **参数解释**： 容灾主Region。 **取值范围**： 不涉及。
     * @return primaryClusterRegion
     */
    public String getPrimaryClusterRegion() {
        return primaryClusterRegion;
    }

    public void setPrimaryClusterRegion(String primaryClusterRegion) {
        this.primaryClusterRegion = primaryClusterRegion;
    }

    public CreateDisasterRecovery withStandbyClusterRegion(String standbyClusterRegion) {
        this.standbyClusterRegion = standbyClusterRegion;
        return this;
    }

    /**
     * **参数解释**： 容灾备Region。 **取值范围**： 不涉及。
     * @return standbyClusterRegion
     */
    public String getStandbyClusterRegion() {
        return standbyClusterRegion;
    }

    public void setStandbyClusterRegion(String standbyClusterRegion) {
        this.standbyClusterRegion = standbyClusterRegion;
    }

    public CreateDisasterRecovery withPrimaryClusterProjectId(String primaryClusterProjectId) {
        this.primaryClusterProjectId = primaryClusterProjectId;
        return this;
    }

    /**
     * **参数解释**： 容灾主集群项目ID。 **取值范围**： 不涉及。
     * @return primaryClusterProjectId
     */
    public String getPrimaryClusterProjectId() {
        return primaryClusterProjectId;
    }

    public void setPrimaryClusterProjectId(String primaryClusterProjectId) {
        this.primaryClusterProjectId = primaryClusterProjectId;
    }

    public CreateDisasterRecovery withStandbyClusterProjectId(String standbyClusterProjectId) {
        this.standbyClusterProjectId = standbyClusterProjectId;
        return this;
    }

    /**
     * **参数解释**： 容灾备集群项目ID。 **取值范围**： 不涉及。
     * @return standbyClusterProjectId
     */
    public String getStandbyClusterProjectId() {
        return standbyClusterProjectId;
    }

    public void setStandbyClusterProjectId(String standbyClusterProjectId) {
        this.standbyClusterProjectId = standbyClusterProjectId;
    }

    public CreateDisasterRecovery withClusterRole(String clusterRole) {
        this.clusterRole = clusterRole;
        return this;
    }

    /**
     * **参数解释**： 集群角色。 **取值范围**： 不涉及。
     * @return clusterRole
     */
    public String getClusterRole() {
        return clusterRole;
    }

    public void setClusterRole(String clusterRole) {
        this.clusterRole = clusterRole;
    }

    public CreateDisasterRecovery withPrimaryClusterInfo(CreateDrClusterDto primaryClusterInfo) {
        this.primaryClusterInfo = primaryClusterInfo;
        return this;
    }

    public CreateDisasterRecovery withPrimaryClusterInfo(Consumer<CreateDrClusterDto> primaryClusterInfoSetter) {
        if (this.primaryClusterInfo == null) {
            this.primaryClusterInfo = new CreateDrClusterDto();
            primaryClusterInfoSetter.accept(this.primaryClusterInfo);
        }

        return this;
    }

    /**
     * Get primaryClusterInfo
     * @return primaryClusterInfo
     */
    public CreateDrClusterDto getPrimaryClusterInfo() {
        return primaryClusterInfo;
    }

    public void setPrimaryClusterInfo(CreateDrClusterDto primaryClusterInfo) {
        this.primaryClusterInfo = primaryClusterInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDisasterRecovery that = (CreateDisasterRecovery) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.drType, that.drType)
            && Objects.equals(this.primaryClusterId, that.primaryClusterId)
            && Objects.equals(this.standbyClusterId, that.standbyClusterId)
            && Objects.equals(this.drSyncPeriod, that.drSyncPeriod)
            && Objects.equals(this.primaryObsBucket, that.primaryObsBucket)
            && Objects.equals(this.standbyObsBucket, that.standbyObsBucket)
            && Objects.equals(this.discoveryRecoveryId, that.discoveryRecoveryId)
            && Objects.equals(this.primaryClusterRegion, that.primaryClusterRegion)
            && Objects.equals(this.standbyClusterRegion, that.standbyClusterRegion)
            && Objects.equals(this.primaryClusterProjectId, that.primaryClusterProjectId)
            && Objects.equals(this.standbyClusterProjectId, that.standbyClusterProjectId)
            && Objects.equals(this.clusterRole, that.clusterRole)
            && Objects.equals(this.primaryClusterInfo, that.primaryClusterInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            drType,
            primaryClusterId,
            standbyClusterId,
            drSyncPeriod,
            primaryObsBucket,
            standbyObsBucket,
            discoveryRecoveryId,
            primaryClusterRegion,
            standbyClusterRegion,
            primaryClusterProjectId,
            standbyClusterProjectId,
            clusterRole,
            primaryClusterInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDisasterRecovery {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    drType: ").append(toIndentedString(drType)).append("\n");
        sb.append("    primaryClusterId: ").append(toIndentedString(primaryClusterId)).append("\n");
        sb.append("    standbyClusterId: ").append(toIndentedString(standbyClusterId)).append("\n");
        sb.append("    drSyncPeriod: ").append(toIndentedString(drSyncPeriod)).append("\n");
        sb.append("    primaryObsBucket: ").append(toIndentedString(primaryObsBucket)).append("\n");
        sb.append("    standbyObsBucket: ").append(toIndentedString(standbyObsBucket)).append("\n");
        sb.append("    discoveryRecoveryId: ").append(toIndentedString(discoveryRecoveryId)).append("\n");
        sb.append("    primaryClusterRegion: ").append(toIndentedString(primaryClusterRegion)).append("\n");
        sb.append("    standbyClusterRegion: ").append(toIndentedString(standbyClusterRegion)).append("\n");
        sb.append("    primaryClusterProjectId: ").append(toIndentedString(primaryClusterProjectId)).append("\n");
        sb.append("    standbyClusterProjectId: ").append(toIndentedString(standbyClusterProjectId)).append("\n");
        sb.append("    clusterRole: ").append(toIndentedString(clusterRole)).append("\n");
        sb.append("    primaryClusterInfo: ").append(toIndentedString(primaryClusterInfo)).append("\n");
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
