package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群容灾恢复详情
 */
public class ClusterDisasterRecovery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster")

    private ClusterRecoveryProgress primaryCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster")

    private ClusterRecoveryProgress standbyCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_barrier_time")

    private String latestBarrierTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_recovery_spend")

    private Long lastRecoverySpend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_point_object")

    private Long recoveryPointObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_time_object")

    private Long recoveryTimeObject;

    public ClusterDisasterRecovery withPrimaryCluster(ClusterRecoveryProgress primaryCluster) {
        this.primaryCluster = primaryCluster;
        return this;
    }

    public ClusterDisasterRecovery withPrimaryCluster(Consumer<ClusterRecoveryProgress> primaryClusterSetter) {
        if (this.primaryCluster == null) {
            this.primaryCluster = new ClusterRecoveryProgress();
            primaryClusterSetter.accept(this.primaryCluster);
        }

        return this;
    }

    /**
     * Get primaryCluster
     * @return primaryCluster
     */
    public ClusterRecoveryProgress getPrimaryCluster() {
        return primaryCluster;
    }

    public void setPrimaryCluster(ClusterRecoveryProgress primaryCluster) {
        this.primaryCluster = primaryCluster;
    }

    public ClusterDisasterRecovery withStandbyCluster(ClusterRecoveryProgress standbyCluster) {
        this.standbyCluster = standbyCluster;
        return this;
    }

    public ClusterDisasterRecovery withStandbyCluster(Consumer<ClusterRecoveryProgress> standbyClusterSetter) {
        if (this.standbyCluster == null) {
            this.standbyCluster = new ClusterRecoveryProgress();
            standbyClusterSetter.accept(this.standbyCluster);
        }

        return this;
    }

    /**
     * Get standbyCluster
     * @return standbyCluster
     */
    public ClusterRecoveryProgress getStandbyCluster() {
        return standbyCluster;
    }

    public void setStandbyCluster(ClusterRecoveryProgress standbyCluster) {
        this.standbyCluster = standbyCluster;
    }

    public ClusterDisasterRecovery withLatestBarrierTime(String latestBarrierTime) {
        this.latestBarrierTime = latestBarrierTime;
        return this;
    }

    /**
     * latest_barrier_time
     * @return latestBarrierTime
     */
    public String getLatestBarrierTime() {
        return latestBarrierTime;
    }

    public void setLatestBarrierTime(String latestBarrierTime) {
        this.latestBarrierTime = latestBarrierTime;
    }

    public ClusterDisasterRecovery withLastRecoverySpend(Long lastRecoverySpend) {
        this.lastRecoverySpend = lastRecoverySpend;
        return this;
    }

    /**
     * last_recovery_spend
     * @return lastRecoverySpend
     */
    public Long getLastRecoverySpend() {
        return lastRecoverySpend;
    }

    public void setLastRecoverySpend(Long lastRecoverySpend) {
        this.lastRecoverySpend = lastRecoverySpend;
    }

    public ClusterDisasterRecovery withRecoveryPointObject(Long recoveryPointObject) {
        this.recoveryPointObject = recoveryPointObject;
        return this;
    }

    /**
     * recovery_point_object
     * @return recoveryPointObject
     */
    public Long getRecoveryPointObject() {
        return recoveryPointObject;
    }

    public void setRecoveryPointObject(Long recoveryPointObject) {
        this.recoveryPointObject = recoveryPointObject;
    }

    public ClusterDisasterRecovery withRecoveryTimeObject(Long recoveryTimeObject) {
        this.recoveryTimeObject = recoveryTimeObject;
        return this;
    }

    /**
     * recovery_time_object
     * @return recoveryTimeObject
     */
    public Long getRecoveryTimeObject() {
        return recoveryTimeObject;
    }

    public void setRecoveryTimeObject(Long recoveryTimeObject) {
        this.recoveryTimeObject = recoveryTimeObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterDisasterRecovery that = (ClusterDisasterRecovery) obj;
        return Objects.equals(this.primaryCluster, that.primaryCluster)
            && Objects.equals(this.standbyCluster, that.standbyCluster)
            && Objects.equals(this.latestBarrierTime, that.latestBarrierTime)
            && Objects.equals(this.lastRecoverySpend, that.lastRecoverySpend)
            && Objects.equals(this.recoveryPointObject, that.recoveryPointObject)
            && Objects.equals(this.recoveryTimeObject, that.recoveryTimeObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryCluster,
            standbyCluster,
            latestBarrierTime,
            lastRecoverySpend,
            recoveryPointObject,
            recoveryTimeObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDisasterRecovery {\n");
        sb.append("    primaryCluster: ").append(toIndentedString(primaryCluster)).append("\n");
        sb.append("    standbyCluster: ").append(toIndentedString(standbyCluster)).append("\n");
        sb.append("    latestBarrierTime: ").append(toIndentedString(latestBarrierTime)).append("\n");
        sb.append("    lastRecoverySpend: ").append(toIndentedString(lastRecoverySpend)).append("\n");
        sb.append("    recoveryPointObject: ").append(toIndentedString(recoveryPointObject)).append("\n");
        sb.append("    recoveryTimeObject: ").append(toIndentedString(recoveryTimeObject)).append("\n");
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
