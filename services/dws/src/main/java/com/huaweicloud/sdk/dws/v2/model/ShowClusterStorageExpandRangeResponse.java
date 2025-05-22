package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowClusterStorageExpandRangeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_size")

    private Integer minSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_size")

    private Integer maxSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_size")

    private Integer currentSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    public ShowClusterStorageExpandRangeResponse withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * **参数解释**： 扩容后单节点磁盘最小值（单位GB）。 **取值范围**： 不涉及。
     * @return minSize
     */
    public Integer getMinSize() {
        return minSize;
    }

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    public ShowClusterStorageExpandRangeResponse withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * **参数解释**： 扩容后单节点磁盘最大值（单位GB）。 **取值范围**： 不涉及。
     * @return maxSize
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public ShowClusterStorageExpandRangeResponse withCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
        return this;
    }

    /**
     * **参数解释**： 磁盘当前值（单位GB）。 **取值范围**： 不涉及。
     * @return currentSize
     */
    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public ShowClusterStorageExpandRangeResponse withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释**： 磁盘步长大小（单位GB）。比如当前单节点磁盘20GB，步长为20，则扩容后单节点磁盘大小至少为40GB。 **取值范围**： 大于等于10。
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterStorageExpandRangeResponse that = (ShowClusterStorageExpandRangeResponse) obj;
        return Objects.equals(this.minSize, that.minSize) && Objects.equals(this.maxSize, that.maxSize)
            && Objects.equals(this.currentSize, that.currentSize) && Objects.equals(this.step, that.step);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minSize, maxSize, currentSize, step);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterStorageExpandRangeResponse {\n");
        sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
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
