package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云盘服务器操作系统盘信息，本地盘服务器不返回
 */
public class ServerModelExtendSpecOsVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    public ServerModelExtendSpecOsVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 操作系统盘大小
     * minimum: 0
     * maximum: 1024
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ServerModelExtendSpecOsVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 操作系统盘类型
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerModelExtendSpecOsVolume that = (ServerModelExtendSpecOsVolume) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.volumeType, that.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerModelExtendSpecOsVolume {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
