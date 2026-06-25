package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceFlavorSpecDataVolume
 */
public class ResourceFlavorSpecDataVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeType")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    public ResourceFlavorSpecDataVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * **参数解释**：磁盘类型[，具体内容可参考[磁盘类型及性能介绍](https://support.huaweicloud.com/productdesc-evs/zh-cn_topic_0044524691.html)](tag:hc)。 **取值范围**：可选值如下： - SSD：超高IO硬盘 - GPSSD：通用型SSD - SAS：高IO硬盘
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public ResourceFlavorSpecDataVolume withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：磁盘大小，单位为Gi。 **取值范围**：不涉及。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
        ResourceFlavorSpecDataVolume that = (ResourceFlavorSpecDataVolume) obj;
        return Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeType, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFlavorSpecDataVolume {\n");
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
