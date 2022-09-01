package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 系统盘参数
 */
public class RootVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    @JacksonXmlProperty(localName = "volume_type")

    private String volumeType;

    public RootVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 系统盘大小，容量单位为GB，输入大小范围为[40,100]。
     * minimum: 40
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public RootVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 边缘实例系统盘对应的磁盘类型，需要与站点所提供的磁盘类型相匹配。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RootVolume rootVolume = (RootVolume) o;
        return Objects.equals(this.size, rootVolume.size) && Objects.equals(this.volumeType, rootVolume.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RootVolume {\n");
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
