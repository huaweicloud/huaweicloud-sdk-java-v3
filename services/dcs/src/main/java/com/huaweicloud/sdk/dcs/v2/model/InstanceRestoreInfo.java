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
 * InstanceRestoreInfo
 */
public class InstanceRestoreInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    @JacksonXmlProperty(localName = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_id")

    @JacksonXmlProperty(localName = "restore_id")

    private String restoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_name")

    @JacksonXmlProperty(localName = "backup_name")

    private String backupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_remark")

    @JacksonXmlProperty(localName = "restore_remark")

    private String restoreRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    @JacksonXmlProperty(localName = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_name")

    @JacksonXmlProperty(localName = "restore_name")

    private String restoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_remark")

    @JacksonXmlProperty(localName = "backup_remark")

    private String backupRemark;

    /**
     * 恢复状态。 - waiting：等待中 - restoring：恢复中 - succeed：恢复成功 - failed：恢复失败 
     */
    public static final class StatusEnum {

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StatusEnum WAITING = new StatusEnum("waiting");

        /**
         * Enum RESTORING for value: "restoring"
         */
        public static final StatusEnum RESTORING = new StatusEnum("restoring");

        /**
         * Enum SUCCEED for value: "succeed"
         */
        public static final StatusEnum SUCCEED = new StatusEnum("succeed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("waiting", WAITING);
            map.put("restoring", RESTORING);
            map.put("succeed", SUCCEED);
            map.put("failed", FAILED);
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

    public InstanceRestoreInfo withBackupId(String backupId) {
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

    public InstanceRestoreInfo withRestoreId(String restoreId) {
        this.restoreId = restoreId;
        return this;
    }

    /**
     * 恢复记录ID。
     * @return restoreId
     */
    public String getRestoreId() {
        return restoreId;
    }

    public void setRestoreId(String restoreId) {
        this.restoreId = restoreId;
    }

    public InstanceRestoreInfo withBackupName(String backupName) {
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

    public InstanceRestoreInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 恢复完成时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public InstanceRestoreInfo withRestoreRemark(String restoreRemark) {
        this.restoreRemark = restoreRemark;
        return this;
    }

    /**
     * 恢复备注信息。
     * @return restoreRemark
     */
    public String getRestoreRemark() {
        return restoreRemark;
    }

    public void setRestoreRemark(String restoreRemark) {
        this.restoreRemark = restoreRemark;
    }

    public InstanceRestoreInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 恢复任务创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public InstanceRestoreInfo withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 恢复进度。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public InstanceRestoreInfo withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 恢复失败后错误码 * `dcs.08.0001` - 启动备份恢复工具失败。 * `dcs.08.0002` - 执行超时。 * `dcs.08.0003` - 删除桶失败。 * `dcs.08.0004` - 获取ak/sk 失败。 * `dcs.08.0005` - 创建桶失败。 * `dcs.08.0006` - 查询备份数据大小失败。 * `dcs.08.0007` - 恢复时同步数据失败。 * `dcs.08.0008` - 自动备份任务未运行，实例正在运行其他任务。 
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public InstanceRestoreInfo withRestoreName(String restoreName) {
        this.restoreName = restoreName;
        return this;
    }

    /**
     * 恢复记录名称。
     * @return restoreName
     */
    public String getRestoreName() {
        return restoreName;
    }

    public void setRestoreName(String restoreName) {
        this.restoreName = restoreName;
    }

    public InstanceRestoreInfo withBackupRemark(String backupRemark) {
        this.backupRemark = backupRemark;
        return this;
    }

    /**
     * 备份备注信息。
     * @return backupRemark
     */
    public String getBackupRemark() {
        return backupRemark;
    }

    public void setBackupRemark(String backupRemark) {
        this.backupRemark = backupRemark;
    }

    public InstanceRestoreInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 恢复状态。 - waiting：等待中 - restoring：恢复中 - succeed：恢复成功 - failed：恢复失败 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceRestoreInfo instanceRestoreInfo = (InstanceRestoreInfo) o;
        return Objects.equals(this.backupId, instanceRestoreInfo.backupId)
            && Objects.equals(this.restoreId, instanceRestoreInfo.restoreId)
            && Objects.equals(this.backupName, instanceRestoreInfo.backupName)
            && Objects.equals(this.updatedAt, instanceRestoreInfo.updatedAt)
            && Objects.equals(this.restoreRemark, instanceRestoreInfo.restoreRemark)
            && Objects.equals(this.createdAt, instanceRestoreInfo.createdAt)
            && Objects.equals(this.progress, instanceRestoreInfo.progress)
            && Objects.equals(this.errorCode, instanceRestoreInfo.errorCode)
            && Objects.equals(this.restoreName, instanceRestoreInfo.restoreName)
            && Objects.equals(this.backupRemark, instanceRestoreInfo.backupRemark)
            && Objects.equals(this.status, instanceRestoreInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId,
            restoreId,
            backupName,
            updatedAt,
            restoreRemark,
            createdAt,
            progress,
            errorCode,
            restoreName,
            backupRemark,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRestoreInfo {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    restoreId: ").append(toIndentedString(restoreId)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    restoreRemark: ").append(toIndentedString(restoreRemark)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    restoreName: ").append(toIndentedString(restoreName)).append("\n");
        sb.append("    backupRemark: ").append(toIndentedString(backupRemark)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
