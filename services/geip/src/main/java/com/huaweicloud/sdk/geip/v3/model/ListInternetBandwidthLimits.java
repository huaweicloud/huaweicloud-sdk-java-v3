package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListInternetBandwidthLimits
 */
public class ListInternetBandwidthLimits {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_size")

    private Integer minSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_limit")

    private ExtLimitPojo extLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_size")

    private Integer maxSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ListInternetBandwidthLimits withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 全域公网带宽限制的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInternetBandwidthLimits withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 全域公网带宽的计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ListInternetBandwidthLimits withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * 该类型全域公网带宽可购买的最小size
     * @return minSize
     */
    public Integer getMinSize() {
        return minSize;
    }

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    public ListInternetBandwidthLimits withExtLimit(ExtLimitPojo extLimit) {
        this.extLimit = extLimit;
        return this;
    }

    public ListInternetBandwidthLimits withExtLimit(Consumer<ExtLimitPojo> extLimitSetter) {
        if (this.extLimit == null) {
            this.extLimit = new ExtLimitPojo();
            extLimitSetter.accept(this.extLimit);
        }

        return this;
    }

    /**
     * Get extLimit
     * @return extLimit
     */
    public ExtLimitPojo getExtLimit() {
        return extLimit;
    }

    public void setExtLimit(ExtLimitPojo extLimit) {
        this.extLimit = extLimit;
    }

    public ListInternetBandwidthLimits withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * 该类型全域公网带宽可购买的最大size
     * @return maxSize
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public ListInternetBandwidthLimits withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 全域公网带宽类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInternetBandwidthLimits that = (ListInternetBandwidthLimits) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.minSize, that.minSize) && Objects.equals(this.extLimit, that.extLimit)
            && Objects.equals(this.maxSize, that.maxSize) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chargeMode, minSize, extLimit, maxSize, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInternetBandwidthLimits {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
        sb.append("    extLimit: ").append(toIndentedString(extLimit)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
