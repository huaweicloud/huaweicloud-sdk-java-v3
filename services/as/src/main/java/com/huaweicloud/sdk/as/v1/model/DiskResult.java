package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 磁盘信息
 */
public class DiskResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 磁盘类型。
     */
    public static final class VolumeTypeEnum {

        /**
         * Enum SATA for value: "SATA"
         */
        public static final VolumeTypeEnum SATA = new VolumeTypeEnum("SATA");

        /**
         * Enum SAS for value: "SAS"
         */
        public static final VolumeTypeEnum SAS = new VolumeTypeEnum("SAS");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final VolumeTypeEnum SSD = new VolumeTypeEnum("SSD");

        /**
         * Enum CO_PL for value: "co-pl"
         */
        public static final VolumeTypeEnum CO_PL = new VolumeTypeEnum("co-pl");

        /**
         * Enum UH_11 for value: "uh-11"
         */
        public static final VolumeTypeEnum UH_11 = new VolumeTypeEnum("uh-11");

        /**
         * Enum GPSSD2 for value: "GPSSD2"
         */
        public static final VolumeTypeEnum GPSSD2 = new VolumeTypeEnum("GPSSD2");

        /**
         * Enum ESSD2 for value: "ESSD2"
         */
        public static final VolumeTypeEnum ESSD2 = new VolumeTypeEnum("ESSD2");

        private static final Map<String, VolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumeTypeEnum> createStaticFields() {
            Map<String, VolumeTypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("co-pl", CO_PL);
            map.put("uh-11", UH_11);
            map.put("GPSSD2", GPSSD2);
            map.put("ESSD2", ESSD2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumeTypeEnum(String value) {
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
        public static VolumeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VolumeTypeEnum(value));
        }

        public static VolumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumeTypeEnum) {
                return this.value.equals(((VolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private VolumeTypeEnum volumeType;

    /**
     * 系统盘还是数据盘，DATA表示为数据盘，SYS表示为系统盘。
     */
    public static final class DiskTypeEnum {

        /**
         * Enum SYS for value: "SYS"
         */
        public static final DiskTypeEnum SYS = new DiskTypeEnum("SYS");

        /**
         * Enum DATA for value: "DATA"
         */
        public static final DiskTypeEnum DATA = new DiskTypeEnum("DATA");

        private static final Map<String, DiskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DiskTypeEnum> createStaticFields() {
            Map<String, DiskTypeEnum> map = new HashMap<>();
            map.put("SYS", SYS);
            map.put("DATA", DATA);
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
    @JsonProperty(value = "dedicated_storage_id")

    private String dedicatedStorageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_image_id")

    private String dataDiskImageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private MetaData metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private Integer iops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throughput")

    private Integer throughput;

    public DiskResult withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘大小，容量单位为GB。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public DiskResult withVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型。
     * @return volumeType
     */
    public VolumeTypeEnum getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
    }

    public DiskResult withDiskType(DiskTypeEnum diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * 系统盘还是数据盘，DATA表示为数据盘，SYS表示为系统盘。
     * @return diskType
     */
    public DiskTypeEnum getDiskType() {
        return diskType;
    }

    public void setDiskType(DiskTypeEnum diskType) {
        this.diskType = diskType;
    }

    public DiskResult withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    /**
     * 磁盘所属的专属存储ID。
     * @return dedicatedStorageId
     */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    public DiskResult withDataDiskImageId(String dataDiskImageId) {
        this.dataDiskImageId = dataDiskImageId;
        return this;
    }

    /**
     * 导入数据盘的数据盘镜像ID。
     * @return dataDiskImageId
     */
    public String getDataDiskImageId() {
        return dataDiskImageId;
    }

    public void setDataDiskImageId(String dataDiskImageId) {
        this.dataDiskImageId = dataDiskImageId;
    }

    public DiskResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * 磁盘备份的快照ID。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public DiskResult withMetadata(MetaData metadata) {
        this.metadata = metadata;
        return this;
    }

    public DiskResult withMetadata(Consumer<MetaData> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetaData();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public DiskResult withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * 云硬盘iops
     * @return iops
     */
    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public DiskResult withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * 云硬盘吞吐量
     * @return throughput
     */
    public Integer getThroughput() {
        return throughput;
    }

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskResult that = (DiskResult) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.volumeType, that.volumeType)
            && Objects.equals(this.diskType, that.diskType)
            && Objects.equals(this.dedicatedStorageId, that.dedicatedStorageId)
            && Objects.equals(this.dataDiskImageId, that.dataDiskImageId)
            && Objects.equals(this.snapshotId, that.snapshotId) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.iops, that.iops) && Objects.equals(this.throughput, that.throughput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size,
            volumeType,
            diskType,
            dedicatedStorageId,
            dataDiskImageId,
            snapshotId,
            metadata,
            iops,
            throughput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskResult {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    diskType: ").append(toIndentedString(diskType)).append("\n");
        sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
        sb.append("    dataDiskImageId: ").append(toIndentedString(dataDiskImageId)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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
