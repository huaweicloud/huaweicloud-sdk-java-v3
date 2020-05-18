package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 *  
 */
public class OsExtend  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_size")
    
    private Integer newSize;

    public OsExtend withNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }

    


    /**
     * 扩容后的云硬盘大小，单位为GB。扩容的大小必须大于原有云硬盘容量且小于云硬盘最大容量。 云硬盘最大容量： * 数据盘：32768GB * 系统盘：1024GB
     * @return newSize
     */
    public Integer getNewSize() {
        return newSize;
    }

    public void setNewSize(Integer newSize) {
        this.newSize = newSize;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsExtend osExtend = (OsExtend) o;
        return Objects.equals(this.newSize, osExtend.newSize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(newSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsExtend {\n");
            sb.append("    newSize: ").append(toIndentedString(newSize)).append("\n");
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

