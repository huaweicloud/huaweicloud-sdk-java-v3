package com.huaweicloud.sdk.dds.v3.model;

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
 * volume信息。
 */
public class ListInstancesVolumeResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private String used;

    public ListInstancesVolumeResult withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小。单位：GB。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ListInstancesVolumeResult withUsed(String used) {
        this.used = used;
        return this;
    }

    


    /**
     * 磁盘使用量。单位：GB。
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesVolumeResult listInstancesVolumeResult = (ListInstancesVolumeResult) o;
        return Objects.equals(this.size, listInstancesVolumeResult.size) &&
            Objects.equals(this.used, listInstancesVolumeResult.used);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, used);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesVolumeResult {\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

