package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 磁盘组信息，系统盘必选，数据盘可选。
 */
public class Disk  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;
    /**
     * 云服务器数据盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。磁盘类型枚举值：SATA：普通IO磁盘类型。SAS：高IO磁盘类型。SSD：超高IO磁盘类型。co-pl：高IO (性能优化Ⅰ型)磁盘类型。uh-l1：超高 IO (时延优化)磁盘类型。说明：对于HANA云服务器和HL1型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
     */
    public static class VolumeTypeEnum {

        
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

        

        public static Map<String, VolumeTypeEnum> staticFields =
                new HashMap<String, VolumeTypeEnum>() {
                    { 
                        put("SATA", SATA);
                        put("SAS", SAS);
                        put("SSD", SSD);
                        put("co-pl", CO_PL);
                        put("uh-11", UH_11);
                    }
                };

        private String value;

        VolumeTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VolumeTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            VolumeTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new VolumeTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static VolumeTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VolumeTypeEnum result = staticFields.get(value);
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
    
    private VolumeTypeEnum volumeType = VolumeTypeEnum.SATA;
    /**
     * 系统盘还是数据盘，DATA表示为数据盘，SYS表示为系统盘。
     */
    public static class DiskTypeEnum {

        
        /**
         * Enum SYS for value: "SYS"
         */
        public static final DiskTypeEnum SYS = new DiskTypeEnum("SYS");

        
        /**
         * Enum DATA for value: "DATA"
         */
        public static final DiskTypeEnum DATA = new DiskTypeEnum("DATA");

        

        public static Map<String, DiskTypeEnum> staticFields =
                new HashMap<String, DiskTypeEnum>() {
                    { 
                        put("SYS", SYS);
                        put("DATA", DATA);
                    }
                };

        private String value;

        DiskTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DiskTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DiskTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DiskTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DiskTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DiskTypeEnum result = staticFields.get(value);
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
    
    private DiskTypeEnum diskType = DiskTypeEnum.SYS;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicate_storage_id")
    
    private String dedicateStorageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_disk_image_id")
    
    private String dataDiskImageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshot_id")
    
    private String snapshotId;

    public Disk withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小，容量单位为GB。系统盘输入大小范围为40~32768，且不小于镜像中系统盘的最小(min_disk属性)值。数据盘输入大小范围为10~32768。
     * minimum: 10
     * maximum: 32768
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Disk withVolumeType(VolumeTypeEnum volumeType) {
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

    public Disk withDiskType(DiskTypeEnum diskType) {
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

    public Disk withDedicateStorageId(String dedicateStorageId) {
        this.dedicateStorageId = dedicateStorageId;
        return this;
    }

    


    /**
     * 云服务器的磁盘可指定创建在用户的专属存储中，需要指定专属存储ID。说明：同一个伸缩配置中的磁盘需统一指定或统一不指定专属存储，不支持混用；当指定专属存储时，所有专属存储需要属于同一个可用分区，且每个磁盘选择的专属存储支持的磁盘类型都需要和参数volume_type保持一致。
     * @return dedicateStorageId
     */
    public String getDedicateStorageId() {
        return dedicateStorageId;
    }

    public void setDedicateStorageId(String dedicateStorageId) {
        this.dedicateStorageId = dedicateStorageId;
    }

    public Disk withDataDiskImageId(String dataDiskImageId) {
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

    public Disk withSnapshotId(String snapshotId) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Disk disk = (Disk) o;
        return Objects.equals(this.size, disk.size) &&
            Objects.equals(this.volumeType, disk.volumeType) &&
            Objects.equals(this.diskType, disk.diskType) &&
            Objects.equals(this.dedicateStorageId, disk.dedicateStorageId) &&
            Objects.equals(this.dataDiskImageId, disk.dataDiskImageId) &&
            Objects.equals(this.snapshotId, disk.snapshotId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, volumeType, diskType, dedicateStorageId, dataDiskImageId, snapshotId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Disk {\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
            sb.append("    diskType: ").append(toIndentedString(diskType)).append("\n");
            sb.append("    dedicateStorageId: ").append(toIndentedString(dedicateStorageId)).append("\n");
            sb.append("    dataDiskImageId: ").append(toIndentedString(dataDiskImageId)).append("\n");
            sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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

