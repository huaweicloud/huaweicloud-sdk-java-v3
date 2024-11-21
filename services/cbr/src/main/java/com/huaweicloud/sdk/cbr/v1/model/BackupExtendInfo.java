package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BackupExtendInfo
 */
public class BackupExtendInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_trigger")

    private Boolean autoTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootable")

    private Boolean bootable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_lld")

    private Boolean supportLld;

    /**
     * 备份支持恢复的方式，当前取值包含na,snapshot和backup。如果该字段取值为snapshot，代表备份此时已经支持创建整机镜像；如果该字段取值为backup，备份支持通过云服务器上硬盘的备份进行恢复；如果该字段取值为na，备份不支持恢复。
     */
    public static final class SupportedRestoreModeEnum {

        /**
         * Enum NA for value: "na"
         */
        public static final SupportedRestoreModeEnum NA = new SupportedRestoreModeEnum("na");

        /**
         * Enum BACKUP for value: "backup"
         */
        public static final SupportedRestoreModeEnum BACKUP = new SupportedRestoreModeEnum("backup");

        /**
         * Enum SNAPSHOT for value: "snapshot"
         */
        public static final SupportedRestoreModeEnum SNAPSHOT = new SupportedRestoreModeEnum("snapshot");

        private static final Map<String, SupportedRestoreModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportedRestoreModeEnum> createStaticFields() {
            Map<String, SupportedRestoreModeEnum> map = new HashMap<>();
            map.put("na", NA);
            map.put("backup", BACKUP);
            map.put("snapshot", SNAPSHOT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportedRestoreModeEnum(String value) {
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
        public static SupportedRestoreModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportedRestoreModeEnum(value));
        }

        public static SupportedRestoreModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportedRestoreModeEnum) {
                return this.value.equals(((SupportedRestoreModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_restore_mode")

    private SupportedRestoreModeEnum supportedRestoreMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_images_data")

    private List<ImageData> osImagesData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contain_system_disk")

    private Boolean containSystemDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted")

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk")

    private Boolean systemDisk;

    public BackupExtendInfo withAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }

    /**
     * 是否是自动生成的备份副本
     * @return autoTrigger
     */
    public Boolean getAutoTrigger() {
        return autoTrigger;
    }

    public void setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    public BackupExtendInfo withBootable(Boolean bootable) {
        this.bootable = bootable;
        return this;
    }

    /**
     * 是否系统盘备份
     * @return bootable
     */
    public Boolean getBootable() {
        return bootable;
    }

    public void setBootable(Boolean bootable) {
        this.bootable = bootable;
    }

    public BackupExtendInfo withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * 卷备份副本的快照id
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public BackupExtendInfo withSupportLld(Boolean supportLld) {
        this.supportLld = supportLld;
        return this;
    }

    /**
     * 是否支持lazyloading快速恢复
     * @return supportLld
     */
    public Boolean getSupportLld() {
        return supportLld;
    }

    public void setSupportLld(Boolean supportLld) {
        this.supportLld = supportLld;
    }

    public BackupExtendInfo withSupportedRestoreMode(SupportedRestoreModeEnum supportedRestoreMode) {
        this.supportedRestoreMode = supportedRestoreMode;
        return this;
    }

    /**
     * 备份支持恢复的方式，当前取值包含na,snapshot和backup。如果该字段取值为snapshot，代表备份此时已经支持创建整机镜像；如果该字段取值为backup，备份支持通过云服务器上硬盘的备份进行恢复；如果该字段取值为na，备份不支持恢复。
     * @return supportedRestoreMode
     */
    public SupportedRestoreModeEnum getSupportedRestoreMode() {
        return supportedRestoreMode;
    }

    public void setSupportedRestoreMode(SupportedRestoreModeEnum supportedRestoreMode) {
        this.supportedRestoreMode = supportedRestoreMode;
    }

    public BackupExtendInfo withOsImagesData(List<ImageData> osImagesData) {
        this.osImagesData = osImagesData;
        return this;
    }

    public BackupExtendInfo addOsImagesDataItem(ImageData osImagesDataItem) {
        if (this.osImagesData == null) {
            this.osImagesData = new ArrayList<>();
        }
        this.osImagesData.add(osImagesDataItem);
        return this;
    }

    public BackupExtendInfo withOsImagesData(Consumer<List<ImageData>> osImagesDataSetter) {
        if (this.osImagesData == null) {
            this.osImagesData = new ArrayList<>();
        }
        osImagesDataSetter.accept(this.osImagesData);
        return this;
    }

    /**
     * 备份注册镜像ID列表
     * @return osImagesData
     */
    public List<ImageData> getOsImagesData() {
        return osImagesData;
    }

    public void setOsImagesData(List<ImageData> osImagesData) {
        this.osImagesData = osImagesData;
    }

    public BackupExtendInfo withContainSystemDisk(Boolean containSystemDisk) {
        this.containSystemDisk = containSystemDisk;
        return this;
    }

    /**
     * 整机备份是否包含系统盘
     * @return containSystemDisk
     */
    public Boolean getContainSystemDisk() {
        return containSystemDisk;
    }

    public void setContainSystemDisk(Boolean containSystemDisk) {
        this.containSystemDisk = containSystemDisk;
    }

    public BackupExtendInfo withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * 是否加密
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public BackupExtendInfo withSystemDisk(Boolean systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    /**
     * 是否是系统盘
     * @return systemDisk
     */
    public Boolean getSystemDisk() {
        return systemDisk;
    }

    public void setSystemDisk(Boolean systemDisk) {
        this.systemDisk = systemDisk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupExtendInfo that = (BackupExtendInfo) obj;
        return Objects.equals(this.autoTrigger, that.autoTrigger) && Objects.equals(this.bootable, that.bootable)
            && Objects.equals(this.snapshotId, that.snapshotId) && Objects.equals(this.supportLld, that.supportLld)
            && Objects.equals(this.supportedRestoreMode, that.supportedRestoreMode)
            && Objects.equals(this.osImagesData, that.osImagesData)
            && Objects.equals(this.containSystemDisk, that.containSystemDisk)
            && Objects.equals(this.encrypted, that.encrypted) && Objects.equals(this.systemDisk, that.systemDisk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTrigger,
            bootable,
            snapshotId,
            supportLld,
            supportedRestoreMode,
            osImagesData,
            containSystemDisk,
            encrypted,
            systemDisk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupExtendInfo {\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
        sb.append("    bootable: ").append(toIndentedString(bootable)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    supportLld: ").append(toIndentedString(supportLld)).append("\n");
        sb.append("    supportedRestoreMode: ").append(toIndentedString(supportedRestoreMode)).append("\n");
        sb.append("    osImagesData: ").append(toIndentedString(osImagesData)).append("\n");
        sb.append("    containSystemDisk: ").append(toIndentedString(containSystemDisk)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    systemDisk: ").append(toIndentedString(systemDisk)).append("\n");
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
