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
 * Request Object
 */
public class ListDesktopSnapshotRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_name")

    private String snapshotName;

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
    @JsonProperty(value = "status")

    private String status;

    /**
     * 排序字段名称，需要结合sort_type字段一起使用。 - create_time 创建时间。 - snapshot_name 快照名称。
     */
    public static final class SortFieldEnum {

        /**
         * Enum CREATE_TIME for value: "create_time"
         */
        public static final SortFieldEnum CREATE_TIME = new SortFieldEnum("create_time");

        /**
         * Enum SNAPSHOT_NAME for value: "snapshot_name"
         */
        public static final SortFieldEnum SNAPSHOT_NAME = new SortFieldEnum("snapshot_name");

        private static final Map<String, SortFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortFieldEnum> createStaticFields() {
            Map<String, SortFieldEnum> map = new HashMap<>();
            map.put("create_time", CREATE_TIME);
            map.put("snapshot_name", SNAPSHOT_NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortFieldEnum(String value) {
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
        public static SortFieldEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortFieldEnum(value));
        }

        public static SortFieldEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortFieldEnum) {
                return this.value.equals(((SortFieldEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private SortFieldEnum sortField;

    /**
     * 排序类型，默认升序，需要结合sort_field字段一起使用。 - ASC 升序。 - DESC 降序。
     */
    public static final class SortTypeEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final SortTypeEnum ASC = new SortTypeEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final SortTypeEnum DESC = new SortTypeEnum("DESC");

        private static final Map<String, SortTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortTypeEnum> createStaticFields() {
            Map<String, SortTypeEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortTypeEnum(String value) {
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
        public static SortTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortTypeEnum(value));
        }

        public static SortTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortTypeEnum) {
                return this.value.equals(((SortTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private SortTypeEnum sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListDesktopSnapshotRequest withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面id。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public ListDesktopSnapshotRequest withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面名称。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public ListDesktopSnapshotRequest withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * 快照名称。
     * @return snapshotName
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public ListDesktopSnapshotRequest withDiskType(DiskTypeEnum diskType) {
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

    public ListDesktopSnapshotRequest withCreateType(CreateTypeEnum createType) {
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

    public ListDesktopSnapshotRequest withStatus(String status) {
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

    public ListDesktopSnapshotRequest withSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段名称，需要结合sort_type字段一起使用。 - create_time 创建时间。 - snapshot_name 快照名称。
     * @return sortField
     */
    public SortFieldEnum getSortField() {
        return sortField;
    }

    public void setSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
    }

    public ListDesktopSnapshotRequest withSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 排序类型，默认升序，需要结合sort_field字段一起使用。 - ASC 升序。 - DESC 降序。
     * @return sortType
     */
    public SortTypeEnum getSortType() {
        return sortType;
    }

    public void setSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
    }

    public ListDesktopSnapshotRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
     * minimum: 0
     * maximum: 20000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDesktopSnapshotRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询。默认1000,取值范围1-1000。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopSnapshotRequest that = (ListDesktopSnapshotRequest) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.snapshotName, that.snapshotName) && Objects.equals(this.diskType, that.diskType)
            && Objects.equals(this.createType, that.createType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.sortType, that.sortType)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId,
            desktopName,
            snapshotName,
            diskType,
            createType,
            status,
            sortField,
            sortType,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopSnapshotRequest {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
        sb.append("    diskType: ").append(toIndentedString(diskType)).append("\n");
        sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
