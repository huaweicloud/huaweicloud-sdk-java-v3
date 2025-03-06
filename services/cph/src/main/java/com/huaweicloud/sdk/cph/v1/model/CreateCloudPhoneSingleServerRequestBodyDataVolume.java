package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据盘结构体。
 */
public class CreateCloudPhoneSingleServerRequestBodyDataVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public CreateCloudPhoneSingleServerRequestBodyDataVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 数据盘类型，只支持如下类型： SSD GPSSD
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public CreateCloudPhoneSingleServerRequestBodyDataVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 数据盘大小，单位GiB，取值范围[1，32768]
     * minimum: 0
     * maximum: 32768
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CreateCloudPhoneSingleServerRequestBodyDataVolume withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数据盘数量，默认值为1
     * minimum: 0
     * maximum: 1024
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudPhoneSingleServerRequestBodyDataVolume that =
            (CreateCloudPhoneSingleServerRequestBodyDataVolume) obj;
        return Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.size, that.size)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeType, size, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPhoneSingleServerRequestBodyDataVolume {\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
