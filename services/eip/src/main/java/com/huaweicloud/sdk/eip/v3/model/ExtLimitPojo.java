package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtLimitPojo
 */
public class ExtLimitPojo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ingress_size")

    private Integer minIngressSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_ingress_size")

    private Integer maxIngressSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio_95peak")

    private Integer ratio95peak;

    public ExtLimitPojo withMinIngressSize(Integer minIngressSize) {
        this.minIngressSize = minIngressSize;
        return this;
    }

    /**
     * - 最小入云限速
     * @return minIngressSize
     */
    public Integer getMinIngressSize() {
        return minIngressSize;
    }

    public void setMinIngressSize(Integer minIngressSize) {
        this.minIngressSize = minIngressSize;
    }

    public ExtLimitPojo withMaxIngressSize(Integer maxIngressSize) {
        this.maxIngressSize = maxIngressSize;
        return this;
    }

    /**
     * - 最大入云限速
     * @return maxIngressSize
     */
    public Integer getMaxIngressSize() {
        return maxIngressSize;
    }

    public void setMaxIngressSize(Integer maxIngressSize) {
        this.maxIngressSize = maxIngressSize;
    }

    public ExtLimitPojo withRatio95peak(Integer ratio95peak) {
        this.ratio95peak = ratio95peak;
        return this;
    }

    /**
     * 95计费保底率
     * @return ratio95peak
     */
    public Integer getRatio95peak() {
        return ratio95peak;
    }

    public void setRatio95peak(Integer ratio95peak) {
        this.ratio95peak = ratio95peak;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtLimitPojo that = (ExtLimitPojo) obj;
        return Objects.equals(this.minIngressSize, that.minIngressSize)
            && Objects.equals(this.maxIngressSize, that.maxIngressSize)
            && Objects.equals(this.ratio95peak, that.ratio95peak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minIngressSize, maxIngressSize, ratio95peak);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtLimitPojo {\n");
        sb.append("    minIngressSize: ").append(toIndentedString(minIngressSize)).append("\n");
        sb.append("    maxIngressSize: ").append(toIndentedString(maxIngressSize)).append("\n");
        sb.append("    ratio95peak: ").append(toIndentedString(ratio95peak)).append("\n");
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
