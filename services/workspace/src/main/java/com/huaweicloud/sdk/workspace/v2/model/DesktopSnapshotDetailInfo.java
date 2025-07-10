package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 快照详情。
 */
public class DesktopSnapshotDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_name")

    private String snapshotName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_sid")

    private String desktopSid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_system_disk")

    private Boolean isSystemDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private Integer process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    /**
     * 快照创建类型。 - AUTO 定时任务自动创建。 - MANUALLY 手动创建。
     */
    public static final class CreateTypeEnum {

        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final CreateTypeEnum AUTO = new CreateTypeEnum("AUTO");

        /**
         * Enum MANUALLY for value: "MANUALLY"
         */
        public static final CreateTypeEnum MANUALLY = new CreateTypeEnum("MANUALLY");

        private static final Map<String, CreateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CreateTypeEnum> createStaticFields() {
            Map<String, CreateTypeEnum> map = new HashMap<>();
            map.put("AUTO", AUTO);
            map.put("MANUALLY", MANUALLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CreateTypeEnum(String value) {
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
        public static CreateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CreateTypeEnum(value));
        }

        public static CreateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CreateTypeEnum) {
                return this.value.equals(((CreateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_type")

    private CreateTypeEnum createType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_restore_time")

    private String lastRestoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_fail_reason")

    private String restoreFailReason;

    public DesktopSnapshotDetailInfo withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * 桌面快照ID。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public DesktopSnapshotDetailInfo withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * 桌面快照记录名称。
     * @return snapshotName
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public DesktopSnapshotDetailInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面快照对应的桌面id。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DesktopSnapshotDetailInfo withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面快照对应的桌面名称。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public DesktopSnapshotDetailInfo withDesktopSid(String desktopSid) {
        this.desktopSid = desktopSid;
        return this;
    }

    /**
     * 桌面快照对应的桌面sid。
     * @return desktopSid
     */
    public String getDesktopSid() {
        return desktopSid;
    }

    public void setDesktopSid(String desktopSid) {
        this.desktopSid = desktopSid;
    }

    public DesktopSnapshotDetailInfo withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面快照对应的桌面池id。
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public DesktopSnapshotDetailInfo withIsSystemDisk(Boolean isSystemDisk) {
        this.isSystemDisk = isSystemDisk;
        return this;
    }

    /**
     * 快照对应磁盘类型，true表示系统盘，false表示数据盘。
     * @return isSystemDisk
     */
    public Boolean getIsSystemDisk() {
        return isSystemDisk;
    }

    public void setIsSystemDisk(Boolean isSystemDisk) {
        this.isSystemDisk = isSystemDisk;
    }

    public DesktopSnapshotDetailInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 快照状态。 - creating：表示创建中。 - restoring：表示恢复中。 - create_success：表示创建成功。 - create_failed：表示创建快照失败。 - restore_success：表示快照恢复成功。 - restore_failed：表示快照恢复失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DesktopSnapshotDetailInfo withProcess(Integer process) {
        this.process = process;
        return this;
    }

    /**
     * 快照任务进度， 取值范围0-100以及null，null表示该快照无任务，0-100表明该任务进度的百分比。
     * @return process
     */
    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public DesktopSnapshotDetailInfo withDescription(String description) {
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

    public DesktopSnapshotDetailInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 快照的创建时间，UTC时间，格式为：yyyy-MM-dd'T'HH:mm:ss'Z。'
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DesktopSnapshotDetailInfo withCreateType(CreateTypeEnum createType) {
        this.createType = createType;
        return this;
    }

    /**
     * 快照创建类型。 - AUTO 定时任务自动创建。 - MANUALLY 手动创建。
     * @return createType
     */
    public CreateTypeEnum getCreateType() {
        return createType;
    }

    public void setCreateType(CreateTypeEnum createType) {
        this.createType = createType;
    }

    public DesktopSnapshotDetailInfo withLastRestoreTime(String lastRestoreTime) {
        this.lastRestoreTime = lastRestoreTime;
        return this;
    }

    /**
     * 快照的最近恢复时间，UTC时间，格式为：yyyy-MM-dd'T'HH:mm:ss'Z。'
     * @return lastRestoreTime
     */
    public String getLastRestoreTime() {
        return lastRestoreTime;
    }

    public void setLastRestoreTime(String lastRestoreTime) {
        this.lastRestoreTime = lastRestoreTime;
    }

    public DesktopSnapshotDetailInfo withRestoreFailReason(String restoreFailReason) {
        this.restoreFailReason = restoreFailReason;
        return this;
    }

    /**
     * 快照恢复失败原因。
     * @return restoreFailReason
     */
    public String getRestoreFailReason() {
        return restoreFailReason;
    }

    public void setRestoreFailReason(String restoreFailReason) {
        this.restoreFailReason = restoreFailReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopSnapshotDetailInfo that = (DesktopSnapshotDetailInfo) obj;
        return Objects.equals(this.snapshotId, that.snapshotId) && Objects.equals(this.snapshotName, that.snapshotName)
            && Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.desktopSid, that.desktopSid)
            && Objects.equals(this.desktopPoolId, that.desktopPoolId)
            && Objects.equals(this.isSystemDisk, that.isSystemDisk) && Objects.equals(this.status, that.status)
            && Objects.equals(this.process, that.process) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createType, that.createType)
            && Objects.equals(this.lastRestoreTime, that.lastRestoreTime)
            && Objects.equals(this.restoreFailReason, that.restoreFailReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotId,
            snapshotName,
            desktopId,
            desktopName,
            desktopSid,
            desktopPoolId,
            isSystemDisk,
            status,
            process,
            description,
            createTime,
            createType,
            lastRestoreTime,
            restoreFailReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopSnapshotDetailInfo {\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    desktopSid: ").append(toIndentedString(desktopSid)).append("\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    isSystemDisk: ").append(toIndentedString(isSystemDisk)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
        sb.append("    lastRestoreTime: ").append(toIndentedString(lastRestoreTime)).append("\n");
        sb.append("    restoreFailReason: ").append(toIndentedString(restoreFailReason)).append("\n");
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
