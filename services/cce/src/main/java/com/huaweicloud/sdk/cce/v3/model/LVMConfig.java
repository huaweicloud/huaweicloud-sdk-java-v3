package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LVMConfig
 */
public class LVMConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lvType")
    
    private String lvType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;

    public LVMConfig withLvType(String lvType) {
        this.lvType = lvType;
        return this;
    }

    


    /**
     * LVM写入模式：linear、striped。linear：线性模式；striped：条带模式，使用多块磁盘组成条带模式，能够提升磁盘性能。
     * @return lvType
     */
    public String getLvType() {
        return lvType;
    }

    public void setLvType(String lvType) {
        this.lvType = lvType;
    }

    

    public LVMConfig withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 磁盘挂载路径。仅在用户配置中生效。支持包含：数字、大小写字母、点、中划线、下划线的绝对路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LVMConfig lvMConfig = (LVMConfig) o;
        return Objects.equals(this.lvType, lvMConfig.lvType) &&
            Objects.equals(this.path, lvMConfig.path);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lvType, path);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LVMConfig {\n");
        sb.append("    lvType: ").append(toIndentedString(lvType)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

