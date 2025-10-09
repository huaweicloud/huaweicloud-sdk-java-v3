package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 快照对象。
 */
public class ListSnapshotBackupsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private ListSnapshotBackupsDatastoreResp datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterName")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backupType")

    private String backupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backupMethod")

    private String backupMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backupFrequency")

    private String backupFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices")

    private String indices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalShards")

    private Integer totalShards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedShards")

    private Integer failedShards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restoreStatus")

    private String restoreStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucketName")

    private String bucketName;

    public ListSnapshotBackupsResp withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 快照创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ListSnapshotBackupsResp withDatastore(ListSnapshotBackupsDatastoreResp datastore) {
        this.datastore = datastore;
        return this;
    }

    public ListSnapshotBackupsResp withDatastore(Consumer<ListSnapshotBackupsDatastoreResp> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new ListSnapshotBackupsDatastoreResp();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public ListSnapshotBackupsDatastoreResp getDatastore() {
        return datastore;
    }

    public void setDatastore(ListSnapshotBackupsDatastoreResp datastore) {
        this.datastore = datastore;
    }

    public ListSnapshotBackupsResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 快照描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListSnapshotBackupsResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 快照ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSnapshotBackupsResp withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListSnapshotBackupsResp withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名字。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListSnapshotBackupsResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 快照名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSnapshotBackupsResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 快照状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListSnapshotBackupsResp withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * 快照创建类型： - 0：表示自动创建。 - 1：表示手动创建。
     * @return backupType
     */
    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public ListSnapshotBackupsResp withBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }

    /**
     * 创建快照方式。
     * @return backupMethod
     */
    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    public ListSnapshotBackupsResp withBackupFrequency(String backupFrequency) {
        this.backupFrequency = backupFrequency;
        return this;
    }

    /**
     * 集群快照频率。
     * @return backupFrequency
     */
    public String getBackupFrequency() {
        return backupFrequency;
    }

    public void setBackupFrequency(String backupFrequency) {
        this.backupFrequency = backupFrequency;
    }

    public ListSnapshotBackupsResp withIndices(String indices) {
        this.indices = indices;
        return this;
    }

    /**
     * 要备份的索引。
     * @return indices
     */
    public String getIndices() {
        return indices;
    }

    public void setIndices(String indices) {
        this.indices = indices;
    }

    public ListSnapshotBackupsResp withTotalShards(Integer totalShards) {
        this.totalShards = totalShards;
        return this;
    }

    /**
     * 要备份的索引的总shard数。
     * @return totalShards
     */
    public Integer getTotalShards() {
        return totalShards;
    }

    public void setTotalShards(Integer totalShards) {
        this.totalShards = totalShards;
    }

    public ListSnapshotBackupsResp withFailedShards(Integer failedShards) {
        this.failedShards = failedShards;
        return this;
    }

    /**
     * 备份失败的shard数。
     * @return failedShards
     */
    public Integer getFailedShards() {
        return failedShards;
    }

    public void setFailedShards(Integer failedShards) {
        this.failedShards = failedShards;
    }

    public ListSnapshotBackupsResp withRestoreStatus(String restoreStatus) {
        this.restoreStatus = restoreStatus;
        return this;
    }

    /**
     * 快照恢复的状态。
     * @return restoreStatus
     */
    public String getRestoreStatus() {
        return restoreStatus;
    }

    public void setRestoreStatus(String restoreStatus) {
        this.restoreStatus = restoreStatus;
    }

    public ListSnapshotBackupsResp withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 快照开始执行的时间戳。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListSnapshotBackupsResp withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 快照执行结束的时间戳。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListSnapshotBackupsResp withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 保存快照数据的桶名。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotBackupsResp that = (ListSnapshotBackupsResp) obj;
        return Objects.equals(this.created, that.created) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.backupType, that.backupType) && Objects.equals(this.backupMethod, that.backupMethod)
            && Objects.equals(this.backupFrequency, that.backupFrequency) && Objects.equals(this.indices, that.indices)
            && Objects.equals(this.totalShards, that.totalShards)
            && Objects.equals(this.failedShards, that.failedShards)
            && Objects.equals(this.restoreStatus, that.restoreStatus) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.bucketName, that.bucketName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created,
            datastore,
            description,
            id,
            clusterId,
            clusterName,
            name,
            status,
            backupType,
            backupMethod,
            backupFrequency,
            indices,
            totalShards,
            failedShards,
            restoreStatus,
            startTime,
            endTime,
            bucketName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotBackupsResp {\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
        sb.append("    backupFrequency: ").append(toIndentedString(backupFrequency)).append("\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
        sb.append("    totalShards: ").append(toIndentedString(totalShards)).append("\n");
        sb.append("    failedShards: ").append(toIndentedString(failedShards)).append("\n");
        sb.append("    restoreStatus: ").append(toIndentedString(restoreStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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
