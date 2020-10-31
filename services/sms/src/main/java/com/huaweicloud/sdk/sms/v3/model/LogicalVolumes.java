package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 逻辑卷信息
 */
public class LogicalVolumes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="block_count")
    
    private Integer blockCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="block_size")
    
    private Integer blockSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_system")
    
    private String fileSystem;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inode_size")
    
    private Integer inodeSize;


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

    public LogicalVolumes withBlockCount(Integer blockCount) {
        this.blockCount = blockCount;
        return this;
    }

    


    /**
     * 块数量
     * minimum: 0
     * @return blockCount
     */
    public Integer getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(Integer blockCount) {
        this.blockCount = blockCount;
    }

    public LogicalVolumes withBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
        return this;
    }

    


    /**
     * 块大小
     * minimum: 0
     * @return blockSize
     */
    public Integer getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    public LogicalVolumes withFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    


    /**
     * 文件系统
     * @return fileSystem
     */
    public String getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }

    public LogicalVolumes withInodeSize(Integer inodeSize) {
        this.inodeSize = inodeSize;
        return this;
    }

    


    /**
     * inode数量
     * @return inodeSize
     */
    public Integer getInodeSize() {
        return inodeSize;
    }

    public void setInodeSize(Integer inodeSize) {
        this.inodeSize = inodeSize;
    }

    public LogicalVolumes withMountPoint(String mountPoint) {
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

    public LogicalVolumes withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LogicalVolumes withSize(Integer size) {
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

    public LogicalVolumes withUsedSize(Integer usedSize) {
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

    public LogicalVolumes withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    


    /**
     * uuid
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
        LogicalVolumes logicalVolumes = (LogicalVolumes) o;
        return Objects.equals(this.blockCount, logicalVolumes.blockCount) &&
            Objects.equals(this.blockSize, logicalVolumes.blockSize) &&
            Objects.equals(this.fileSystem, logicalVolumes.fileSystem) &&
            Objects.equals(this.inodeSize, logicalVolumes.inodeSize) &&
            Objects.equals(this.mountPoint, logicalVolumes.mountPoint) &&
            Objects.equals(this.name, logicalVolumes.name) &&
            Objects.equals(this.size, logicalVolumes.size) &&
            Objects.equals(this.usedSize, logicalVolumes.usedSize) &&
            Objects.equals(this.uuid, logicalVolumes.uuid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(blockCount, blockSize, fileSystem, inodeSize, mountPoint, name, size, usedSize, uuid);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalVolumes {\n");
        sb.append("    blockCount: ").append(toIndentedString(blockCount)).append("\n");
        sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
        sb.append("    fileSystem: ").append(toIndentedString(fileSystem)).append("\n");
        sb.append("    inodeSize: ").append(toIndentedString(inodeSize)).append("\n");
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

