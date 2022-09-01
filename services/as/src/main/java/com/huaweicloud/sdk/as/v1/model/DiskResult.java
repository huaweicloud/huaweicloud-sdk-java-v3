package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "size")

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

        private static final Map<String, VolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumeTypeEnum> createStaticFields() {
            Map<String, VolumeTypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("co-pl", CO_PL);
            map.put("uh-11", UH_11);
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
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumeTypeEnum(value);
            }
            return result;
        }

        public static VolumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "volume_type")

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
            DiskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DiskTypeEnum(value);
            }
            return result;
        }

        public static DiskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DiskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "disk_type")

    private DiskTypeEnum diskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_id")

    @JacksonXmlProperty(localName = "dedicated_storage_id")

    private String dedicatedStorageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_image_id")

    @JacksonXmlProperty(localName = "data_disk_image_id")

    private String dataDiskImageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    @JacksonXmlProperty(localName = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private MetaData metadata;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskResult diskResult = (DiskResult) o;
        return Objects.equals(this.size, diskResult.size) && Objects.equals(this.volumeType, diskResult.volumeType)
            && Objects.equals(this.diskType, diskResult.diskType)
            && Objects.equals(this.dedicatedStorageId, diskResult.dedicatedStorageId)
            && Objects.equals(this.dataDiskImageId, diskResult.dataDiskImageId)
            && Objects.equals(this.snapshotId, diskResult.snapshotId)
            && Objects.equals(this.metadata, diskResult.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, volumeType, diskType, dedicatedStorageId, dataDiskImageId, snapshotId, metadata);
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
