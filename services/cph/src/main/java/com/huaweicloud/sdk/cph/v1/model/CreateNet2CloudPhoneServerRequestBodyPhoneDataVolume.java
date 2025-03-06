package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 手机磁盘结构体，2.0规格必选。
 */
public class CreateNet2CloudPhoneServerRequestBodyPhoneDataVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public CreateNet2CloudPhoneServerRequestBodyPhoneDataVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型，只支持如下类型： - SSD - GPSSD
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public CreateNet2CloudPhoneServerRequestBodyPhoneDataVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 手机磁盘大小，单位GiB，取值范围[10，32768]。
     * minimum: 10
     * maximum: 32768
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNet2CloudPhoneServerRequestBodyPhoneDataVolume that =
            (CreateNet2CloudPhoneServerRequestBodyPhoneDataVolume) obj;
        return Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeType, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNet2CloudPhoneServerRequestBodyPhoneDataVolume {\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
