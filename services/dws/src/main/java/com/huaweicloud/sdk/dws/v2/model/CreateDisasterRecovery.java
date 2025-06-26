package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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
     * **参数解释**： 容灾类型。 **取值范围**： 不涉及。
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
            && Objects.equals(this.standbyObsBucket, that.standbyObsBucket);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, drType, primaryClusterId, standbyClusterId, drSyncPeriod, primaryObsBucket, standbyObsBucket);
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
