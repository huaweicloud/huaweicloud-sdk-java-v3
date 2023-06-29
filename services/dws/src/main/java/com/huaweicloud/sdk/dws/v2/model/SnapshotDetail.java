package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 快照详情对象
 */
public class SnapshotDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started")

    private String started;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished")

    private String finished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Double size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_expected_start_time")

    private String bakExpectedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_keep_day")

    private Integer bakKeepDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_period")

    private String bakPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_key")

    private String backupKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prior_backup_key")

    private String priorBackupKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_backup_key")

    private String baseBackupKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_device")

    private String backupDevice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_backup_size")

    private Integer totalBackupSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_backup_name")

    private String baseBackupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_inplace_restore")

    private Boolean supportInplaceRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fine_grained_backup")

    private Boolean fineGrainedBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_level")

    private String backupLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fine_grained_backup_detail")

    private FineGrainedSnapshotDetail fineGrainedBackupDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guest_agent_version")

    private String guestAgentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_status")

    private String clusterStatus;

    public SnapshotDetail withId(String id) {
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

    public SnapshotDetail withName(String name) {
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

    public SnapshotDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 快照描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SnapshotDetail withStarted(String started) {
        this.started = started;
        return this;
    }

    /**
     * 快照创建的日期时间，格式为 ISO8601: YYYY-MM-DDThh:mm:ssZ。
     * @return started
     */
    public String getStarted() {
        return started;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    public SnapshotDetail withFinished(String finished) {
        this.finished = finished;
        return this;
    }

    /**
     * 快照完成的日期时间，格式为 ISO8601: YYYY-MM-DDThh:mm:ssZ。
     * @return finished
     */
    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }

    public SnapshotDetail withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * 快照大小，单位GB。
     * @return size
     */
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public SnapshotDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 快照状态： - CREATING：创建中。 - AVAILABLE：可用。 - UNAVAILABLE：不可用。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SnapshotDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 快照创建类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SnapshotDetail withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 快照对应的集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public SnapshotDetail withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public SnapshotDetail withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public SnapshotDetail withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 快照对应的集群名称。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public SnapshotDetail withBakExpectedStartTime(String bakExpectedStartTime) {
        this.bakExpectedStartTime = bakExpectedStartTime;
        return this;
    }

    /**
     * 快照预计开始时间。
     * @return bakExpectedStartTime
     */
    public String getBakExpectedStartTime() {
        return bakExpectedStartTime;
    }

    public void setBakExpectedStartTime(String bakExpectedStartTime) {
        this.bakExpectedStartTime = bakExpectedStartTime;
    }

    public SnapshotDetail withBakKeepDay(Integer bakKeepDay) {
        this.bakKeepDay = bakKeepDay;
        return this;
    }

    /**
     * 快照保留天数。
     * @return bakKeepDay
     */
    public Integer getBakKeepDay() {
        return bakKeepDay;
    }

    public void setBakKeepDay(Integer bakKeepDay) {
        this.bakKeepDay = bakKeepDay;
    }

    public SnapshotDetail withBakPeriod(String bakPeriod) {
        this.bakPeriod = bakPeriod;
        return this;
    }

    /**
     * 快照策略。
     * @return bakPeriod
     */
    public String getBakPeriod() {
        return bakPeriod;
    }

    public void setBakPeriod(String bakPeriod) {
        this.bakPeriod = bakPeriod;
    }

    public SnapshotDetail withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 数据库用户。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public SnapshotDetail withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 快照进度。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public SnapshotDetail withBackupKey(String backupKey) {
        this.backupKey = backupKey;
        return this;
    }

    /**
     * 快照BakcupKey。
     * @return backupKey
     */
    public String getBackupKey() {
        return backupKey;
    }

    public void setBackupKey(String backupKey) {
        this.backupKey = backupKey;
    }

    public SnapshotDetail withPriorBackupKey(String priorBackupKey) {
        this.priorBackupKey = priorBackupKey;
        return this;
    }

    /**
     * 增量快照，使用的前一个快照BakcupKey。
     * @return priorBackupKey
     */
    public String getPriorBackupKey() {
        return priorBackupKey;
    }

    public void setPriorBackupKey(String priorBackupKey) {
        this.priorBackupKey = priorBackupKey;
    }

    public SnapshotDetail withBaseBackupKey(String baseBackupKey) {
        this.baseBackupKey = baseBackupKey;
        return this;
    }

    /**
     * 对应全量快照BakcupKey。
     * @return baseBackupKey
     */
    public String getBaseBackupKey() {
        return baseBackupKey;
    }

    public void setBaseBackupKey(String baseBackupKey) {
        this.baseBackupKey = baseBackupKey;
    }

    public SnapshotDetail withBackupDevice(String backupDevice) {
        this.backupDevice = backupDevice;
        return this;
    }

    /**
     * 备份介质。
     * @return backupDevice
     */
    public String getBackupDevice() {
        return backupDevice;
    }

    public void setBackupDevice(String backupDevice) {
        this.backupDevice = backupDevice;
    }

    public SnapshotDetail withTotalBackupSize(Integer totalBackupSize) {
        this.totalBackupSize = totalBackupSize;
        return this;
    }

    /**
     * 累计快照大小。
     * @return totalBackupSize
     */
    public Integer getTotalBackupSize() {
        return totalBackupSize;
    }

    public void setTotalBackupSize(Integer totalBackupSize) {
        this.totalBackupSize = totalBackupSize;
    }

    public SnapshotDetail withBaseBackupName(String baseBackupName) {
        this.baseBackupName = baseBackupName;
        return this;
    }

    /**
     * 对应全量快照名称。
     * @return baseBackupName
     */
    public String getBaseBackupName() {
        return baseBackupName;
    }

    public void setBaseBackupName(String baseBackupName) {
        this.baseBackupName = baseBackupName;
    }

    public SnapshotDetail withSupportInplaceRestore(Boolean supportInplaceRestore) {
        this.supportInplaceRestore = supportInplaceRestore;
        return this;
    }

    /**
     * 是否支持就地恢复。
     * @return supportInplaceRestore
     */
    public Boolean getSupportInplaceRestore() {
        return supportInplaceRestore;
    }

    public void setSupportInplaceRestore(Boolean supportInplaceRestore) {
        this.supportInplaceRestore = supportInplaceRestore;
    }

    public SnapshotDetail withFineGrainedBackup(Boolean fineGrainedBackup) {
        this.fineGrainedBackup = fineGrainedBackup;
        return this;
    }

    /**
     * 是否是细粒度备份。
     * @return fineGrainedBackup
     */
    public Boolean getFineGrainedBackup() {
        return fineGrainedBackup;
    }

    public void setFineGrainedBackup(Boolean fineGrainedBackup) {
        this.fineGrainedBackup = fineGrainedBackup;
    }

    public SnapshotDetail withBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }

    /**
     * 备份级别。
     * @return backupLevel
     */
    public String getBackupLevel() {
        return backupLevel;
    }

    public void setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
    }

    public SnapshotDetail withFineGrainedBackupDetail(FineGrainedSnapshotDetail fineGrainedBackupDetail) {
        this.fineGrainedBackupDetail = fineGrainedBackupDetail;
        return this;
    }

    public SnapshotDetail withFineGrainedBackupDetail(
        Consumer<FineGrainedSnapshotDetail> fineGrainedBackupDetailSetter) {
        if (this.fineGrainedBackupDetail == null) {
            this.fineGrainedBackupDetail = new FineGrainedSnapshotDetail();
            fineGrainedBackupDetailSetter.accept(this.fineGrainedBackupDetail);
        }

        return this;
    }

    /**
     * Get fineGrainedBackupDetail
     * @return fineGrainedBackupDetail
     */
    public FineGrainedSnapshotDetail getFineGrainedBackupDetail() {
        return fineGrainedBackupDetail;
    }

    public void setFineGrainedBackupDetail(FineGrainedSnapshotDetail fineGrainedBackupDetail) {
        this.fineGrainedBackupDetail = fineGrainedBackupDetail;
    }

    public SnapshotDetail withGuestAgentVersion(String guestAgentVersion) {
        this.guestAgentVersion = guestAgentVersion;
        return this;
    }

    /**
     * guestAgent版本。
     * @return guestAgentVersion
     */
    public String getGuestAgentVersion() {
        return guestAgentVersion;
    }

    public void setGuestAgentVersion(String guestAgentVersion) {
        this.guestAgentVersion = guestAgentVersion;
    }

    public SnapshotDetail withClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    /**
     * 集群状态。
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return clusterStatus;
    }

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotDetail that = (SnapshotDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.started, that.started)
            && Objects.equals(this.finished, that.finished) && Objects.equals(this.size, that.size)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.bakExpectedStartTime, that.bakExpectedStartTime)
            && Objects.equals(this.bakKeepDay, that.bakKeepDay) && Objects.equals(this.bakPeriod, that.bakPeriod)
            && Objects.equals(this.dbUser, that.dbUser) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.backupKey, that.backupKey)
            && Objects.equals(this.priorBackupKey, that.priorBackupKey)
            && Objects.equals(this.baseBackupKey, that.baseBackupKey)
            && Objects.equals(this.backupDevice, that.backupDevice)
            && Objects.equals(this.totalBackupSize, that.totalBackupSize)
            && Objects.equals(this.baseBackupName, that.baseBackupName)
            && Objects.equals(this.supportInplaceRestore, that.supportInplaceRestore)
            && Objects.equals(this.fineGrainedBackup, that.fineGrainedBackup)
            && Objects.equals(this.backupLevel, that.backupLevel)
            && Objects.equals(this.fineGrainedBackupDetail, that.fineGrainedBackupDetail)
            && Objects.equals(this.guestAgentVersion, that.guestAgentVersion)
            && Objects.equals(this.clusterStatus, that.clusterStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            started,
            finished,
            size,
            status,
            type,
            clusterId,
            datastore,
            clusterName,
            bakExpectedStartTime,
            bakKeepDay,
            bakPeriod,
            dbUser,
            progress,
            backupKey,
            priorBackupKey,
            baseBackupKey,
            backupDevice,
            totalBackupSize,
            baseBackupName,
            supportInplaceRestore,
            fineGrainedBackup,
            backupLevel,
            fineGrainedBackupDetail,
            guestAgentVersion,
            clusterStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    started: ").append(toIndentedString(started)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    bakExpectedStartTime: ").append(toIndentedString(bakExpectedStartTime)).append("\n");
        sb.append("    bakKeepDay: ").append(toIndentedString(bakKeepDay)).append("\n");
        sb.append("    bakPeriod: ").append(toIndentedString(bakPeriod)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    backupKey: ").append(toIndentedString(backupKey)).append("\n");
        sb.append("    priorBackupKey: ").append(toIndentedString(priorBackupKey)).append("\n");
        sb.append("    baseBackupKey: ").append(toIndentedString(baseBackupKey)).append("\n");
        sb.append("    backupDevice: ").append(toIndentedString(backupDevice)).append("\n");
        sb.append("    totalBackupSize: ").append(toIndentedString(totalBackupSize)).append("\n");
        sb.append("    baseBackupName: ").append(toIndentedString(baseBackupName)).append("\n");
        sb.append("    supportInplaceRestore: ").append(toIndentedString(supportInplaceRestore)).append("\n");
        sb.append("    fineGrainedBackup: ").append(toIndentedString(fineGrainedBackup)).append("\n");
        sb.append("    backupLevel: ").append(toIndentedString(backupLevel)).append("\n");
        sb.append("    fineGrainedBackupDetail: ").append(toIndentedString(fineGrainedBackupDetail)).append("\n");
        sb.append("    guestAgentVersion: ").append(toIndentedString(guestAgentVersion)).append("\n");
        sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
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
