package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecycleInstanceV3
 */
public class RecycleInstanceV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private String haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private String payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Integer createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_at")

    private Integer deletedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private String volumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip_ipv6")

    private String dataVipIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_level")

    private String backupLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_backup_id")

    private String recycleBackupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_status")

    private String recycleStatus;

    public RecycleInstanceV3 withId(String id) {
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

    public RecycleInstanceV3 withName(String name) {
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

    public RecycleInstanceV3 withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 实例类型。
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public RecycleInstanceV3 withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名称。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public RecycleInstanceV3 withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public RecycleInstanceV3 withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 计费模式。
     * @return payModel
     */
    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    public RecycleInstanceV3 withCreateAt(Integer createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createAt
     */
    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public RecycleInstanceV3 withDeletedAt(Integer deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * 删除时间。
     * @return deletedAt
     */
    public Integer getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Integer deletedAt) {
        this.deletedAt = deletedAt;
    }

    public RecycleInstanceV3 withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public RecycleInstanceV3 withVolumeSize(String volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 磁盘大小。
     * @return volumeSize
     */
    public String getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(String volumeSize) {
        this.volumeSize = volumeSize;
    }

    public RecycleInstanceV3 withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    /**
     * 数据面VIP。
     * @return dataVip
     */
    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public RecycleInstanceV3 withDataVipIpv6(String dataVipIpv6) {
        this.dataVipIpv6 = dataVipIpv6;
        return this;
    }

    /**
     * 数据面IPV6。
     * @return dataVipIpv6
     */
    public String getDataVipIpv6() {
        return dataVipIpv6;
    }

    public void setDataVipIpv6(String dataVipIpv6) {
        this.dataVipIpv6 = dataVipIpv6;
    }

    public RecycleInstanceV3 withEnterpriseProjectId(String enterpriseProjectId) {
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

    public RecycleInstanceV3 withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public RecycleInstanceV3 withBackupLevel(String backupLevel) {
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

    public RecycleInstanceV3 withRecycleBackupId(String recycleBackupId) {
        this.recycleBackupId = recycleBackupId;
        return this;
    }

    /**
     * 备份ID。
     * @return recycleBackupId
     */
    public String getRecycleBackupId() {
        return recycleBackupId;
    }

    public void setRecycleBackupId(String recycleBackupId) {
        this.recycleBackupId = recycleBackupId;
    }

    public RecycleInstanceV3 withRecycleStatus(String recycleStatus) {
        this.recycleStatus = recycleStatus;
        return this;
    }

    /**
     * 回收状态。
     * @return recycleStatus
     */
    public String getRecycleStatus() {
        return recycleStatus;
    }

    public void setRecycleStatus(String recycleStatus) {
        this.recycleStatus = recycleStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecycleInstanceV3 that = (RecycleInstanceV3) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.haMode, that.haMode) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.payModel, that.payModel)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.deletedAt, that.deletedAt)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.volumeSize, that.volumeSize)
            && Objects.equals(this.dataVip, that.dataVip) && Objects.equals(this.dataVipIpv6, that.dataVipIpv6)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.backupLevel, that.backupLevel)
            && Objects.equals(this.recycleBackupId, that.recycleBackupId)
            && Objects.equals(this.recycleStatus, that.recycleStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            haMode,
            engineName,
            engineVersion,
            payModel,
            createAt,
            deletedAt,
            volumeType,
            volumeSize,
            dataVip,
            dataVipIpv6,
            enterpriseProjectId,
            enterpriseProjectName,
            backupLevel,
            recycleBackupId,
            recycleStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleInstanceV3 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    dataVipIpv6: ").append(toIndentedString(dataVipIpv6)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    backupLevel: ").append(toIndentedString(backupLevel)).append("\n");
        sb.append("    recycleBackupId: ").append(toIndentedString(recycleBackupId)).append("\n");
        sb.append("    recycleStatus: ").append(toIndentedString(recycleStatus)).append("\n");
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
