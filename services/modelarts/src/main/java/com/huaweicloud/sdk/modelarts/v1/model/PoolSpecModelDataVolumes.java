package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：自定义数据盘（云硬盘）列表信息，指定后不可修改。
 */
public class PoolSpecModelDataVolumes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeType")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParams")

    private PoolSpecModelDataVolumesExtendParams extendParams;

    public PoolSpecModelDataVolumes withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * **参数解释**：磁盘类型，具体内容可参考磁盘类型及性能介绍。 **取值范围**：可选值如下： - SSD：超高IO硬盘 - GPSSD：通用型SSD - SAS：高IO硬盘
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public PoolSpecModelDataVolumes withSize(String size) {
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

    public PoolSpecModelDataVolumes withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：磁盘个数。 **取值范围**：不涉及。
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public PoolSpecModelDataVolumes withExtendParams(PoolSpecModelDataVolumesExtendParams extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    public PoolSpecModelDataVolumes withExtendParams(
        Consumer<PoolSpecModelDataVolumesExtendParams> extendParamsSetter) {
        if (this.extendParams == null) {
            this.extendParams = new PoolSpecModelDataVolumesExtendParams();
            extendParamsSetter.accept(this.extendParams);
        }

        return this;
    }

    /**
     * Get extendParams
     * @return extendParams
     */
    public PoolSpecModelDataVolumesExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(PoolSpecModelDataVolumesExtendParams extendParams) {
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
        PoolSpecModelDataVolumes that = (PoolSpecModelDataVolumes) obj;
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
        sb.append("class PoolSpecModelDataVolumes {\n");
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
