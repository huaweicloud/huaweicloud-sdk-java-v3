package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.MetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 磁盘组信息，系统盘必选，数据盘可选。
 */
public class DiskInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;
    /**
     * 云服务器数据盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。磁盘类型枚举值：SATA：普通IO磁盘类型。SAS：高IO磁盘类型。SSD：超高IO磁盘类型。co-pl：高IO (性能优化Ⅰ型)磁盘类型。uh-l1：超高 IO (时延优化)磁盘类型。说明：对于HANA云服务器和HL1型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VolumeTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumeTypeEnum(value);
            }
            return result;
        }

        public static VolumeTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof VolumeTypeEnum) {
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
    @JsonProperty(value="volume_type")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DiskTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DiskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DiskTypeEnum(value);
            }
            return result;
        }

        public static DiskTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof DiskTypeEnum) {
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
    @JsonProperty(value="disk_type")
    
    private DiskTypeEnum diskType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_id")
    
    private String dedicatedStorageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_disk_image_id")
    
    private String dataDiskImageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshot_id")
    
    private String snapshotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private MetaData metadata;

    public DiskInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小，容量单位为GB。系统盘输入大小范围为40~32768，且不小于镜像中系统盘的最小(min_disk属性)值。数据盘输入大小范围为10~32768。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public DiskInfo withVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * 云服务器数据盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。磁盘类型枚举值：SATA：普通IO磁盘类型。SAS：高IO磁盘类型。SSD：超高IO磁盘类型。co-pl：高IO (性能优化Ⅰ型)磁盘类型。uh-l1：超高 IO (时延优化)磁盘类型。说明：对于HANA云服务器和HL1型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
     * @return volumeType
     */
    public VolumeTypeEnum getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
    }

    

    public DiskInfo withDiskType(DiskTypeEnum diskType) {
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

    

    public DiskInfo withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    


    /**
     * 云服务器的磁盘可指定创建在用户的专属存储中，需要指定专属存储ID。说明：同一个伸缩配置中的磁盘需统一指定或统一不指定专属存储，不支持混用；当指定专属存储时，所有专属存储需要属于同一个可用分区，且每个磁盘选择的专属存储支持的磁盘类型都需要和参数volume_type保持一致。
     * @return dedicatedStorageId
     */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    

    public DiskInfo withDataDiskImageId(String dataDiskImageId) {
        this.dataDiskImageId = dataDiskImageId;
        return this;
    }

    


    /**
     * 云服务器的数据盘可指定从数据盘镜像导出，需要指定数据盘镜像ID。
     * @return dataDiskImageId
     */
    public String getDataDiskImageId() {
        return dataDiskImageId;
    }

    public void setDataDiskImageId(String dataDiskImageId) {
        this.dataDiskImageId = dataDiskImageId;
    }

    

    public DiskInfo withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    


    /**
     * 当选择使用整机镜像时，云服务器的系统盘及数据盘将通过整机备份恢复，需要指定磁盘备份的快照ID。说明：磁盘备份的快照ID可通过镜像的整机备份ID在CSBS查询备份详情获得；一个伸缩配置中的每一个disk需要通过snapshot_id和整机备份中的磁盘备份一一对应。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    

    public DiskInfo withMetadata(MetaData metadata) {
        this.metadata = metadata;
        return this;
    }

    public DiskInfo withMetadata(Consumer<MetaData> metadataSetter) {
        if(this.metadata == null ){
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
        DiskInfo diskInfo = (DiskInfo) o;
        return Objects.equals(this.size, diskInfo.size) &&
            Objects.equals(this.volumeType, diskInfo.volumeType) &&
            Objects.equals(this.diskType, diskInfo.diskType) &&
            Objects.equals(this.dedicatedStorageId, diskInfo.dedicatedStorageId) &&
            Objects.equals(this.dataDiskImageId, diskInfo.dataDiskImageId) &&
            Objects.equals(this.snapshotId, diskInfo.snapshotId) &&
            Objects.equals(this.metadata, diskInfo.metadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, volumeType, diskType, dedicatedStorageId, dataDiskImageId, snapshotId, metadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskInfo {\n");
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

