package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据盘信息。
 */
public class DataVolumeItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeType")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParams")

    private VolumeExtendParams extendParams;

    public DataVolumeItem withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * **参数解释**：磁盘类型[，具体内容可参考磁盘类型及性能介绍](tag:hc)。 **取值范围**：可选值如下： - SSD：超高IO硬盘 - GPSSD：通用型SSD - SAS：高IO硬盘
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public DataVolumeItem withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：磁盘大小，单位为GiB。 **取值范围**：不涉及。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public DataVolumeItem withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：磁盘个数。 **取值范围**：不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public DataVolumeItem withExtendParams(VolumeExtendParams extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    public DataVolumeItem withExtendParams(Consumer<VolumeExtendParams> extendParamsSetter) {
        if (this.extendParams == null) {
            this.extendParams = new VolumeExtendParams();
            extendParamsSetter.accept(this.extendParams);
        }

        return this;
    }

    /**
     * Get extendParams
     * @return extendParams
     */
    public VolumeExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(VolumeExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataVolumeItem that = (DataVolumeItem) obj;
        return Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.size, that.size)
            && Objects.equals(this.count, that.count) && Objects.equals(this.extendParams, that.extendParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeType, size, count, extendParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataVolumeItem {\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
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
