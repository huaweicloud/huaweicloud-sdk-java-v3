package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 使用大小
 */
public class PhysicalVolumes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_use")
    
    private String deviceUse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_system")
    
    private String fileSystem;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="index")
    
    private Integer index;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mount_point")
    
    private String mountPoint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_size")
    
    private Integer usedSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uuid")
    
    private String uuid;

    public PhysicalVolumes withDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    


    /**
     * 分区类型，普通分区，启动分区，系统分区
     * @return deviceUse
     */
    public String getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
    }

    public PhysicalVolumes withFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    


    /**
     * 文件系统类型
     * @return fileSystem
     */
    public String getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }

    public PhysicalVolumes withIndex(Integer index) {
        this.index = index;
        return this;
    }

    


    /**
     * 顺序
     * minimum: 0
     * maximum: 1024
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public PhysicalVolumes withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    


    /**
     * 挂载点
     * @return mountPoint
     */
    public String getMountPoint() {
        return mountPoint;
    }

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    public PhysicalVolumes withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称，windows表示盘符，Linux表示设备号
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhysicalVolumes withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 大小
     * minimum: 0
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PhysicalVolumes withUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    


    /**
     * 使用大小
     * minimum: 0
     * @return usedSize
     */
    public Integer getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
    }

    public PhysicalVolumes withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    


    /**
     * GUID，可从源端查询
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhysicalVolumes physicalVolumes = (PhysicalVolumes) o;
        return Objects.equals(this.deviceUse, physicalVolumes.deviceUse) &&
            Objects.equals(this.fileSystem, physicalVolumes.fileSystem) &&
            Objects.equals(this.index, physicalVolumes.index) &&
            Objects.equals(this.mountPoint, physicalVolumes.mountPoint) &&
            Objects.equals(this.name, physicalVolumes.name) &&
            Objects.equals(this.size, physicalVolumes.size) &&
            Objects.equals(this.usedSize, physicalVolumes.usedSize) &&
            Objects.equals(this.uuid, physicalVolumes.uuid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceUse, fileSystem, index, mountPoint, name, size, usedSize, uuid);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhysicalVolumes {\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
        sb.append("    fileSystem: ").append(toIndentedString(fileSystem)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

