package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩容磁盘请求。
 */
public class ExpandVolumeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_size")

    private Integer newSize;

    public ExpandVolumeReq withNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }

    /**
     * 扩容后的磁盘大小，单位为GB。
     * minimum: 10
     * maximum: 32768
     * @return newSize
     */
    public Integer getNewSize() {
        return newSize;
    }

    public void setNewSize(Integer newSize) {
        this.newSize = newSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandVolumeReq that = (ExpandVolumeReq) obj;
        return Objects.equals(this.newSize, that.newSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandVolumeReq {\n");
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
