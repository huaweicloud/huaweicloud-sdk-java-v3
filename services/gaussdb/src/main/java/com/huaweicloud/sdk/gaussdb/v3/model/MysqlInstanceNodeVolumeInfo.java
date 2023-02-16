package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 存储盘信息。
 */
public class MysqlInstanceNodeVolumeInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    
    private String used;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    
    private Long size;

    public MysqlInstanceNodeVolumeInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 磁盘类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public MysqlInstanceNodeVolumeInfo withUsed(String used) {
        this.used = used;
        return this;
    }

    


    /**
     * 已使用磁盘大小，单位GB。
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    

    public MysqlInstanceNodeVolumeInfo withSize(Long size) {
        this.size = size;
        return this;
    }

    


    /**
     * 包周期购买的存储空间大小，单位GB。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
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
        MysqlInstanceNodeVolumeInfo mysqlInstanceNodeVolumeInfo = (MysqlInstanceNodeVolumeInfo) o;
        return Objects.equals(this.type, mysqlInstanceNodeVolumeInfo.type) &&
            Objects.equals(this.used, mysqlInstanceNodeVolumeInfo.used) &&
            Objects.equals(this.size, mysqlInstanceNodeVolumeInfo.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, used, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlInstanceNodeVolumeInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

