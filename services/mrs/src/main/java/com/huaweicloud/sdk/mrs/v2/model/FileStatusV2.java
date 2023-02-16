package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * FileStatusV2
 */
public class FileStatusV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path_suffix")
    
    
    private String pathSuffix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    
    private String group;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permission")
    
    
    private String permission;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication")
    
    
    private Integer replication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="block_size")
    
    
    private Integer blockSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="length")
    
    
    private Integer length;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="children_num")
    
    
    private Integer childrenNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_time")
    
    
    private Long accessTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modification_time")
    
    
    private Long modificationTime;

    public FileStatusV2 withPathSuffix(String pathSuffix) {
        this.pathSuffix = pathSuffix;
        return this;
    }

    


    /**
     * 文件在当前目录下的后缀，如获取“/tmp”目录，下面的“/tmp/test”文件，此处path_suffix内容为“test”。
     * @return pathSuffix
     */
    public String getPathSuffix() {
        return pathSuffix;
    }

    public void setPathSuffix(String pathSuffix) {
        this.pathSuffix = pathSuffix;
    }

    

    public FileStatusV2 withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 文件拥有者。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    

    public FileStatusV2 withGroup(String group) {
        this.group = group;
        return this;
    }

    


    /**
     * 文件属组。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    

    public FileStatusV2 withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    


    /**
     * 权限信息。
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    

    public FileStatusV2 withReplication(Integer replication) {
        this.replication = replication;
        return this;
    }

    


    /**
     * 副本数。
     * @return replication
     */
    public Integer getReplication() {
        return replication;
    }

    public void setReplication(Integer replication) {
        this.replication = replication;
    }

    

    public FileStatusV2 withBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
        return this;
    }

    


    /**
     * 块大小。
     * @return blockSize
     */
    public Integer getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    

    public FileStatusV2 withLength(Integer length) {
        this.length = length;
        return this;
    }

    


    /**
     * 文件长度。
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    

    public FileStatusV2 withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 文件类型： - FILE：文件 - DIRECTORY：目录
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public FileStatusV2 withChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
        return this;
    }

    


    /**
     * 该目录下的文件条目数。
     * @return childrenNum
     */
    public Integer getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
    }

    

    public FileStatusV2 withAccessTime(Long accessTime) {
        this.accessTime = accessTime;
        return this;
    }

    


    /**
     * 文件访问时间。
     * @return accessTime
     */
    public Long getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
    }

    

    public FileStatusV2 withModificationTime(Long modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }

    


    /**
     * 文件修改时间。
     * @return modificationTime
     */
    public Long getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Long modificationTime) {
        this.modificationTime = modificationTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileStatusV2 fileStatusV2 = (FileStatusV2) o;
        return Objects.equals(this.pathSuffix, fileStatusV2.pathSuffix) &&
            Objects.equals(this.owner, fileStatusV2.owner) &&
            Objects.equals(this.group, fileStatusV2.group) &&
            Objects.equals(this.permission, fileStatusV2.permission) &&
            Objects.equals(this.replication, fileStatusV2.replication) &&
            Objects.equals(this.blockSize, fileStatusV2.blockSize) &&
            Objects.equals(this.length, fileStatusV2.length) &&
            Objects.equals(this.type, fileStatusV2.type) &&
            Objects.equals(this.childrenNum, fileStatusV2.childrenNum) &&
            Objects.equals(this.accessTime, fileStatusV2.accessTime) &&
            Objects.equals(this.modificationTime, fileStatusV2.modificationTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pathSuffix, owner, group, permission, replication, blockSize, length, type, childrenNum, accessTime, modificationTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileStatusV2 {\n");
        sb.append("    pathSuffix: ").append(toIndentedString(pathSuffix)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    childrenNum: ").append(toIndentedString(childrenNum)).append("\n");
        sb.append("    accessTime: ").append(toIndentedString(accessTime)).append("\n");
        sb.append("    modificationTime: ").append(toIndentedString(modificationTime)).append("\n");
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

