package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class UcbParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha")

    private Double alpha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_used_num")

    private Integer minUsedNum;

    public UcbParam withAlpha(Double alpha) {
        this.alpha = alpha;
        return this;
    }

    /** 折中参数。 minimum: 0 maximum: 1
     * 
     * @return alpha */
    public Double getAlpha() {
        return alpha;
    }

    public void setAlpha(Double alpha) {
        this.alpha = alpha;
    }

    public UcbParam withMinUsedNum(Integer minUsedNum) {
        this.minUsedNum = minUsedNum;
        return this;
    }

    /** 最小行为次数。 minimum: 30 maximum: 1000
     * 
     * @return minUsedNum */
    public Integer getMinUsedNum() {
        return minUsedNum;
    }

    public void setMinUsedNum(Integer minUsedNum) {
        this.minUsedNum = minUsedNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UcbParam ucbParam = (UcbParam) o;
        return Objects.equals(this.alpha, ucbParam.alpha) && Objects.equals(this.minUsedNum, ucbParam.minUsedNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alpha, minUsedNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UcbParam {\n");
        sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
        sb.append("    minUsedNum: ").append(toIndentedString(minUsedNum)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
