package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 云硬盘每秒进行读写的操作次数。
 */
public class Iops {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_by_size")

    private BigDecimal rangeBySize;

    public Iops withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 产品ID。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public Iops withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 最小值。
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Iops withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 最大值。
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Iops withRangeBySize(BigDecimal rangeBySize) {
        this.rangeBySize = rangeBySize;
        return this;
    }

    /**
     * 可取值范围，<=rangeBySize乘size。
     * @return rangeBySize
     */
    public BigDecimal getRangeBySize() {
        return rangeBySize;
    }

    public void setRangeBySize(BigDecimal rangeBySize) {
        this.rangeBySize = rangeBySize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Iops that = (Iops) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode) && Objects.equals(this.min, that.min)
            && Objects.equals(this.max, that.max) && Objects.equals(this.rangeBySize, that.rangeBySize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, min, max, rangeBySize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Iops {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    rangeBySize: ").append(toIndentedString(rangeBySize)).append("\n");
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
