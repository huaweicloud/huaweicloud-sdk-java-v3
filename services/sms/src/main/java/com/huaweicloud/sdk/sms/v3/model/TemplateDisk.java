package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 磁盘模板
 */
public class TemplateDisk  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="index")
    
    private Integer index;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disktype")
    
    private String disktype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public TemplateDisk withIndex(Integer index) {
        this.index = index;
        return this;
    }

    


    /**
     * 磁盘序号，从0开始
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public TemplateDisk withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 磁盘名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateDisk withDisktype(String disktype) {
        this.disktype = disktype;
        return this;
    }

    


    /**
     * 磁盘类型，同volumetype字段
     * @return disktype
     */
    public String getDisktype() {
        return disktype;
    }

    public void setDisktype(String disktype) {
        this.disktype = disktype;
    }

    public TemplateDisk withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小，单位：GB
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateDisk templateDisk = (TemplateDisk) o;
        return Objects.equals(this.index, templateDisk.index) &&
            Objects.equals(this.name, templateDisk.name) &&
            Objects.equals(this.disktype, templateDisk.disktype) &&
            Objects.equals(this.size, templateDisk.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(index, name, disktype, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateDisk {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    disktype: ").append(toIndentedString(disktype)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

