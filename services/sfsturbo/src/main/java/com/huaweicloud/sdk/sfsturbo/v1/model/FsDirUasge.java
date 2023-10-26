package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目录资源使用情况(包含子目录)
 */
public class FsDirUasge {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_capacity")

    private Long usedCapacity;

    public FsDirUasge withUsedCapacity(Long usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    /**
     * 占用容量，单位：byte
     * minimum: 0
     * @return usedCapacity
     */
    public Long getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(Long usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FsDirUasge that = (FsDirUasge) obj;
        return Objects.equals(this.usedCapacity, that.usedCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usedCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FsDirUasge {\n");
        sb.append("    usedCapacity: ").append(toIndentedString(usedCapacity)).append("\n");
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
