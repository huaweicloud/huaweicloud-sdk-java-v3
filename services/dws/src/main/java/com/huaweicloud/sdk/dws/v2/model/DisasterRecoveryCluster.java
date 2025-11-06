package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 容灾集群信息。 **取值范围**： 不涉及。
 */
public class DisasterRecoveryCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_az")

    private String clusterAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_success_time")

    private String lastSuccessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_capacity")

    private String diskCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_used")

    private String diskUsed;

    public DisasterRecoveryCluster withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 容灾集群信息ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DisasterRecoveryCluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 容灾集群名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DisasterRecoveryCluster withClusterAz(String clusterAz) {
        this.clusterAz = clusterAz;
        return this;
    }

    /**
     * **参数解释**： 容灾集群所在可用区。 **取值范围**： 不涉及。
     * @return clusterAz
     */
    public String getClusterAz() {
        return clusterAz;
    }

    public void setClusterAz(String clusterAz) {
        this.clusterAz = clusterAz;
    }

    public DisasterRecoveryCluster withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释**： 容灾集群角色。 **取值范围**： 不涉及。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DisasterRecoveryCluster withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 容灾集群所在region。 **取值范围**： 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DisasterRecoveryCluster withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 容灾集群状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DisasterRecoveryCluster withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释**： 容灾进度。 **取值范围**： 不涉及。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public DisasterRecoveryCluster withLastSuccessTime(String lastSuccessTime) {
        this.lastSuccessTime = lastSuccessTime;
        return this;
    }

    /**
     * **参数解释**： 上一次容灾时间。 **取值范围**： 不涉及。
     * @return lastSuccessTime
     */
    public String getLastSuccessTime() {
        return lastSuccessTime;
    }

    public void setLastSuccessTime(String lastSuccessTime) {
        this.lastSuccessTime = lastSuccessTime;
    }

    public DisasterRecoveryCluster withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * **参数解释**： OBS桶名称。 **取值范围**： 不涉及。
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public DisasterRecoveryCluster withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * **参数解释**： 数据库版本。 **取值范围**： 不涉及。
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public DisasterRecoveryCluster withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * **参数解释**： 数据库类型。 **取值范围**： 不涉及。
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public DisasterRecoveryCluster withDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
        return this;
    }

    /**
     * **参数解释**： 磁盘容量。 **取值范围**： 不涉及。
     * @return diskCapacity
     */
    public String getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public DisasterRecoveryCluster withDiskUsed(String diskUsed) {
        this.diskUsed = diskUsed;
        return this;
    }

    /**
     * **参数解释**： 磁盘使用率。 **取值范围**： 不涉及。
     * @return diskUsed
     */
    public String getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(String diskUsed) {
        this.diskUsed = diskUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisasterRecoveryCluster that = (DisasterRecoveryCluster) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.clusterAz, that.clusterAz) && Objects.equals(this.role, that.role)
            && Objects.equals(this.region, that.region) && Objects.equals(this.status, that.status)
            && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.lastSuccessTime, that.lastSuccessTime)
            && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion)
            && Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.diskCapacity, that.diskCapacity) && Objects.equals(this.diskUsed, that.diskUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            clusterAz,
            role,
            region,
            status,
            progress,
            lastSuccessTime,
            obsBucketName,
            datastoreVersion,
            datastoreType,
            diskCapacity,
            diskUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisasterRecoveryCluster {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    clusterAz: ").append(toIndentedString(clusterAz)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    lastSuccessTime: ").append(toIndentedString(lastSuccessTime)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    diskCapacity: ").append(toIndentedString(diskCapacity)).append("\n");
        sb.append("    diskUsed: ").append(toIndentedString(diskUsed)).append("\n");
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
