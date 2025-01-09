package com.huaweicloud.sdk.workspace.v2.model;

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
 * 批量创建快照请求体。
 */
public class BatchCreateDesktopSnapshotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    /**
     * 快照类型。 - SYSTEM_DISK 系统盘。 - DATA_DISKS 数据盘。 - ALL 系统盘和数据盘。
     */
    public static final class DiskTypeEnum {

        /**
         * Enum SYSTEM_DISK for value: "SYSTEM_DISK"
         */
        public static final DiskTypeEnum SYSTEM_DISK = new DiskTypeEnum("SYSTEM_DISK");

        /**
         * Enum DATA_DISKS for value: "DATA_DISKS"
         */
        public static final DiskTypeEnum DATA_DISKS = new DiskTypeEnum("DATA_DISKS");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final DiskTypeEnum ALL = new DiskTypeEnum("ALL");

        private static final Map<String, DiskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DiskTypeEnum> createStaticFields() {
            Map<String, DiskTypeEnum> map = new HashMap<>();
            map.put("SYSTEM_DISK", SYSTEM_DISK);
            map.put("DATA_DISKS", DATA_DISKS);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DiskTypeEnum(String value) {
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
        public static DiskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DiskTypeEnum(value));
        }

        public static DiskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DiskTypeEnum) {
                return this.value.equals(((DiskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_type")

    private DiskTypeEnum diskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk_snapshot")

    private DiskSnapshotInfo systemDiskSnapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_snapshot")

    private DiskSnapshotInfo dataDiskSnapshot;

    public BatchCreateDesktopSnapshotReq withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public BatchCreateDesktopSnapshotReq addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public BatchCreateDesktopSnapshotReq withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 桌面id数组，最多支持100。
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    public BatchCreateDesktopSnapshotReq withDiskType(DiskTypeEnum diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * 快照类型。 - SYSTEM_DISK 系统盘。 - DATA_DISKS 数据盘。 - ALL 系统盘和数据盘。
     * @return diskType
     */
    public DiskTypeEnum getDiskType() {
        return diskType;
    }

    public void setDiskType(DiskTypeEnum diskType) {
        this.diskType = diskType;
    }

    public BatchCreateDesktopSnapshotReq withSystemDiskSnapshot(DiskSnapshotInfo systemDiskSnapshot) {
        this.systemDiskSnapshot = systemDiskSnapshot;
        return this;
    }

    public BatchCreateDesktopSnapshotReq withSystemDiskSnapshot(Consumer<DiskSnapshotInfo> systemDiskSnapshotSetter) {
        if (this.systemDiskSnapshot == null) {
            this.systemDiskSnapshot = new DiskSnapshotInfo();
            systemDiskSnapshotSetter.accept(this.systemDiskSnapshot);
        }

        return this;
    }

    /**
     * Get systemDiskSnapshot
     * @return systemDiskSnapshot
     */
    public DiskSnapshotInfo getSystemDiskSnapshot() {
        return systemDiskSnapshot;
    }

    public void setSystemDiskSnapshot(DiskSnapshotInfo systemDiskSnapshot) {
        this.systemDiskSnapshot = systemDiskSnapshot;
    }

    public BatchCreateDesktopSnapshotReq withDataDiskSnapshot(DiskSnapshotInfo dataDiskSnapshot) {
        this.dataDiskSnapshot = dataDiskSnapshot;
        return this;
    }

    public BatchCreateDesktopSnapshotReq withDataDiskSnapshot(Consumer<DiskSnapshotInfo> dataDiskSnapshotSetter) {
        if (this.dataDiskSnapshot == null) {
            this.dataDiskSnapshot = new DiskSnapshotInfo();
            dataDiskSnapshotSetter.accept(this.dataDiskSnapshot);
        }

        return this;
    }

    /**
     * Get dataDiskSnapshot
     * @return dataDiskSnapshot
     */
    public DiskSnapshotInfo getDataDiskSnapshot() {
        return dataDiskSnapshot;
    }

    public void setDataDiskSnapshot(DiskSnapshotInfo dataDiskSnapshot) {
        this.dataDiskSnapshot = dataDiskSnapshot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateDesktopSnapshotReq that = (BatchCreateDesktopSnapshotReq) obj;
        return Objects.equals(this.desktopIds, that.desktopIds) && Objects.equals(this.diskType, that.diskType)
            && Objects.equals(this.systemDiskSnapshot, that.systemDiskSnapshot)
            && Objects.equals(this.dataDiskSnapshot, that.dataDiskSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopIds, diskType, systemDiskSnapshot, dataDiskSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDesktopSnapshotReq {\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
        sb.append("    diskType: ").append(toIndentedString(diskType)).append("\n");
        sb.append("    systemDiskSnapshot: ").append(toIndentedString(systemDiskSnapshot)).append("\n");
        sb.append("    dataDiskSnapshot: ").append(toIndentedString(dataDiskSnapshot)).append("\n");
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
