package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 变更磁盘类型
 */
public class RetypeVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_type")

    private String newType;

    public RetypeVolume withNewType(String newType) {
        this.newType = newType;
        return this;
    }

    /**
     * 磁盘变更至指定的磁盘类型
     * @return newType
     */
    public String getNewType() {
        return newType;
    }

    public void setNewType(String newType) {
        this.newType = newType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetypeVolume that = (RetypeVolume) obj;
        return Objects.equals(this.newType, that.newType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetypeVolume {\n");
        sb.append("    newType: ").append(toIndentedString(newType)).append("\n");
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
