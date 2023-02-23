package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlVolume
 */
public class MysqlVolume  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    

    private String size;

    public MysqlVolume withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小。默认值为40，单位GB。 取值范围：40~128000，必须为10的整数倍。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
        MysqlVolume mysqlVolume = (MysqlVolume) o;
        return Objects.equals(this.size, mysqlVolume.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlVolume {\n");
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

