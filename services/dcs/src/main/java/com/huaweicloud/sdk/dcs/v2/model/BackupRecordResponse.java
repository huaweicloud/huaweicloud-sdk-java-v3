package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 实例备份信息。
 */
public class BackupRecordResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    @JacksonXmlProperty(localName = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    @JacksonXmlProperty(localName = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_name")

    @JacksonXmlProperty(localName = "backup_name")

    private String backupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Long size;

    /**
     * 备份类型。 - manual：表示备份类型为手动备份 - auto：表示备份类型为自动备份 
     */
    public static final class BackupTypeEnum {

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final BackupTypeEnum MANUAL = new BackupTypeEnum("manual");

        /**
         * Enum AUTO for value: "auto"
         */
        public static final BackupTypeEnum AUTO = new BackupTypeEnum("auto");

        private static final Map<String, BackupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupTypeEnum> createStaticFields() {
            Map<String, BackupTypeEnum> map = new HashMap<>();
            map.put("manual", MANUAL);
            map.put("auto", AUTO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BackupTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BackupTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BackupTypeEnum(value);
            }
            return result;
        }

        public static BackupTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BackupTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackupTypeEnum) {
                return this.value.equals(((BackupTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_type")

    @JacksonXmlProperty(localName = "backup_type")

    private BackupTypeEnum backupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    @JacksonXmlProperty(localName = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    @JacksonXmlProperty(localName = "remark")

    private String remark;

    /**
     * 备份状态。 - waiting：等待中。 - backuping：备份中。 - succeed：备份成功。 - failed：备份失败。 - expired：备份文件过期。 - deleted：已手动删除备份文件。 
     */
    public static final class StatusEnum {

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StatusEnum WAITING = new StatusEnum("waiting");

        /**
         * Enum BACKUPING for value: "backuping"
         */
        public static final StatusEnum BACKUPING = new StatusEnum("backuping");

        /**
         * Enum SUCCEED for value: "succeed"
         */
        public static final StatusEnum SUCCEED = new StatusEnum("succeed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum EXPIRED for value: "expired"
         */
        public static final StatusEnum EXPIRED = new StatusEnum("expired");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("deleted");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("waiting", WAITING);
            map.put("backuping", BACKUPING);
            map.put("succeed", SUCCEED);
            map.put("failed", FAILED);
            map.put("expired", EXPIRED);
            map.put("deleted", DELETED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_restore")

    @JacksonXmlProperty(localName = "is_support_restore")

    private String isSupportRestore;

    public BackupRecordResponse withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份记录ID。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public BackupRecordResponse withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 备份执行时间段。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public BackupRecordResponse withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * 备份记录名称。
     * @return backupName
     */
    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public BackupRecordResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BackupRecordResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 备份文件大小（Byte）。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public BackupRecordResponse withBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * 备份类型。 - manual：表示备份类型为手动备份 - auto：表示备份类型为自动备份 
     * @return backupType
     */
    public BackupTypeEnum getBackupType() {
        return backupType;
    }

    public void setBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
    }

    public BackupRecordResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 备份任务创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public BackupRecordResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 备份完成时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BackupRecordResponse withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 备份进度。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public BackupRecordResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 备份失败后错误码 * `dcs.08.0001` - 启动备份恢复工具失败。 * `dcs.08.0002` - 执行超时。 * `dcs.08.0003` - 删除桶失败。 * `dcs.08.0004` - 获取ak/sk 失败。 * `dcs.08.0005` - 创建桶失败。 * `dcs.08.0006` - 查询备份数据大小失败。 * `dcs.08.0007` - 恢复时同步数据失败。 * `dcs.08.0008` - 自动备份任务未运行，实例正在运行其他任务。 
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BackupRecordResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备份缓存实例的备注信息。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BackupRecordResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 备份状态。 - waiting：等待中。 - backuping：备份中。 - succeed：备份成功。 - failed：备份失败。 - expired：备份文件过期。 - deleted：已手动删除备份文件。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BackupRecordResponse withIsSupportRestore(String isSupportRestore) {
        this.isSupportRestore = isSupportRestore;
        return this;
    }

    /**
     * 是否可以进行恢复操作，取值为TRUE或FALSE。
     * @return isSupportRestore
     */
    public String getIsSupportRestore() {
        return isSupportRestore;
    }

    public void setIsSupportRestore(String isSupportRestore) {
        this.isSupportRestore = isSupportRestore;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupRecordResponse backupRecordResponse = (BackupRecordResponse) o;
        return Objects.equals(this.backupId, backupRecordResponse.backupId)
            && Objects.equals(this.period, backupRecordResponse.period)
            && Objects.equals(this.backupName, backupRecordResponse.backupName)
            && Objects.equals(this.instanceId, backupRecordResponse.instanceId)
            && Objects.equals(this.size, backupRecordResponse.size)
            && Objects.equals(this.backupType, backupRecordResponse.backupType)
            && Objects.equals(this.createdAt, backupRecordResponse.createdAt)
            && Objects.equals(this.updatedAt, backupRecordResponse.updatedAt)
            && Objects.equals(this.progress, backupRecordResponse.progress)
            && Objects.equals(this.errorCode, backupRecordResponse.errorCode)
            && Objects.equals(this.remark, backupRecordResponse.remark)
            && Objects.equals(this.status, backupRecordResponse.status)
            && Objects.equals(this.isSupportRestore, backupRecordResponse.isSupportRestore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId,
            period,
            backupName,
            instanceId,
            size,
            backupType,
            createdAt,
            updatedAt,
            progress,
            errorCode,
            remark,
            status,
            isSupportRestore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupRecordResponse {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isSupportRestore: ").append(toIndentedString(isSupportRestore)).append("\n");
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
