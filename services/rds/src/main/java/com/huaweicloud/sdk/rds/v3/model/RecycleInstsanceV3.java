package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecycleInstsanceV3
 */
public class RecycleInstsanceV3 {

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
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_at")

    private String deletedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Integer volumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip_v6")

    private String dataVipV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retained_until")

    private String retainedUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_backup_id")

    private String recycleBackupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_status")

    private String recycleStatus;

    public RecycleInstsanceV3 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecycleInstsanceV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecycleInstsanceV3 withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 实例主备模式，取值：Ha（主备），不区分大小写。
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public RecycleInstsanceV3 withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public RecycleInstsanceV3 withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 数据库引擎版本
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public RecycleInstsanceV3 withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 计费方式
     * @return payModel
     */
    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    public RecycleInstsanceV3 withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间，格式为“yyyy-mm-ddThh:mm:ssZ”。  其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RecycleInstsanceV3 withDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * 删除时间，格式为“yyyy-mm-ddThh:mm:ssZ”。  其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return deletedAt
     */
    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public RecycleInstsanceV3 withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型。 取值范围如下，区分大小写： - COMMON，表示SATA。 - HIGH，表示SAS。 - ULTRAHIGH，表示SSD。 - ULTRAHIGHPRO，表示SSD尊享版，仅支持超高性能型尊享版（需申请权限）。 - CLOUDSSD，表示SSD云盘，仅支持通用型和独享型规格实例。 - LOCALSSD，表示本地SSD。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public RecycleInstsanceV3 withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 磁盘大小，单位为GB。 取值范围：40GB~4000GB，必须为10的整数倍。  部分用户支持40GB~6000GB，如果您想创建存储空间最大为6000GB的数据库实例，或提高扩容上限到10000GB，请联系客服开通。  说明：对于只读实例，该参数无效，磁盘大小，默认和主实例相同。
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public RecycleInstsanceV3 withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    /**
     * 内网地址
     * @return dataVip
     */
    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public RecycleInstsanceV3 withDataVipV6(String dataVipV6) {
        this.dataVipV6 = dataVipV6;
        return this;
    }

    /**
     * ipv6内网地址
     * @return dataVipV6
     */
    public String getDataVipV6() {
        return dataVipV6;
    }

    public void setDataVipV6(String dataVipV6) {
        this.dataVipV6 = dataVipV6;
    }

    public RecycleInstsanceV3 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RecycleInstsanceV3 withRetainedUntil(String retainedUntil) {
        this.retainedUntil = retainedUntil;
        return this;
    }

    /**
     * 保留时间，格式为“yyyy-mm-ddThh:mm:ssZ”。  其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return retainedUntil
     */
    public String getRetainedUntil() {
        return retainedUntil;
    }

    public void setRetainedUntil(String retainedUntil) {
        this.retainedUntil = retainedUntil;
    }

    public RecycleInstsanceV3 withRecycleBackupId(String recycleBackupId) {
        this.recycleBackupId = recycleBackupId;
        return this;
    }

    /**
     * 备份id
     * @return recycleBackupId
     */
    public String getRecycleBackupId() {
        return recycleBackupId;
    }

    public void setRecycleBackupId(String recycleBackupId) {
        this.recycleBackupId = recycleBackupId;
    }

    public RecycleInstsanceV3 withRecycleStatus(String recycleStatus) {
        this.recycleStatus = recycleStatus;
        return this;
    }

    /**
     * 备份状态 取值范围如下，区分大小写: - BUILDING 备份中，不能进行重建 - COMPLETED，标识备份完成，可以重建
     * @return recycleStatus
     */
    public String getRecycleStatus() {
        return recycleStatus;
    }

    public void setRecycleStatus(String recycleStatus) {
        this.recycleStatus = recycleStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecycleInstsanceV3 recycleInstsanceV3 = (RecycleInstsanceV3) o;
        return Objects.equals(this.id, recycleInstsanceV3.id) && Objects.equals(this.name, recycleInstsanceV3.name)
            && Objects.equals(this.haMode, recycleInstsanceV3.haMode)
            && Objects.equals(this.engineName, recycleInstsanceV3.engineName)
            && Objects.equals(this.engineVersion, recycleInstsanceV3.engineVersion)
            && Objects.equals(this.payModel, recycleInstsanceV3.payModel)
            && Objects.equals(this.createdAt, recycleInstsanceV3.createdAt)
            && Objects.equals(this.deletedAt, recycleInstsanceV3.deletedAt)
            && Objects.equals(this.volumeType, recycleInstsanceV3.volumeType)
            && Objects.equals(this.volumeSize, recycleInstsanceV3.volumeSize)
            && Objects.equals(this.dataVip, recycleInstsanceV3.dataVip)
            && Objects.equals(this.dataVipV6, recycleInstsanceV3.dataVipV6)
            && Objects.equals(this.enterpriseProjectId, recycleInstsanceV3.enterpriseProjectId)
            && Objects.equals(this.retainedUntil, recycleInstsanceV3.retainedUntil)
            && Objects.equals(this.recycleBackupId, recycleInstsanceV3.recycleBackupId)
            && Objects.equals(this.recycleStatus, recycleInstsanceV3.recycleStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            haMode,
            engineName,
            engineVersion,
            payModel,
            createdAt,
            deletedAt,
            volumeType,
            volumeSize,
            dataVip,
            dataVipV6,
            enterpriseProjectId,
            retainedUntil,
            recycleBackupId,
            recycleStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleInstsanceV3 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    dataVipV6: ").append(toIndentedString(dataVipV6)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    retainedUntil: ").append(toIndentedString(retainedUntil)).append("\n");
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
