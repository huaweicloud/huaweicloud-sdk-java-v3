package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：磁盘信息。 **约束限制**：不涉及。
 */
public class VolumeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeType")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public VolumeVO withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * **参数解释**：磁盘类型[，具体内容可参考磁盘类型及性能介绍](tag:hc)。 **取值范围**：   - SSD：超高IO硬盘   - GPSSD：通用型SSD
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public VolumeVO withSize(String size) {
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

    public VolumeVO withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：磁盘个数。不指定默认值为1。 **取值范围**：不涉及。
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
        VolumeVO that = (VolumeVO) obj;
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
        sb.append("class VolumeVO {\n");
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
