package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** VulnsLevel */
public class VulnsLevel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high")

    private Integer high;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle")

    private Integer middle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low")

    private Integer low;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hint")

    private Integer hint;

    public VulnsLevel withHigh(Integer high) {
        this.high = high;
        return this;
    }

    /** 高危漏洞数 minimum: 0 maximum: 1000
     * 
     * @return high */
    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public VulnsLevel withMiddle(Integer middle) {
        this.middle = middle;
        return this;
    }

    /** 中危漏洞数 minimum: 0 maximum: 1000
     * 
     * @return middle */
    public Integer getMiddle() {
        return middle;
    }

    public void setMiddle(Integer middle) {
        this.middle = middle;
    }

    public VulnsLevel withLow(Integer low) {
        this.low = low;
        return this;
    }

    /** 低危漏洞数 minimum: 0 maximum: 1000
     * 
     * @return low */
    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public VulnsLevel withHint(Integer hint) {
        this.hint = hint;
        return this;
    }

    /** 提示危漏洞数 minimum: 0 maximum: 1000
     * 
     * @return hint */
    public Integer getHint() {
        return hint;
    }

    public void setHint(Integer hint) {
        this.hint = hint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VulnsLevel vulnsLevel = (VulnsLevel) o;
        return Objects.equals(this.high, vulnsLevel.high) && Objects.equals(this.middle, vulnsLevel.middle)
            && Objects.equals(this.low, vulnsLevel.low) && Objects.equals(this.hint, vulnsLevel.hint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(high, middle, low, hint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulnsLevel {\n");
        sb.append("    high: ").append(toIndentedString(high)).append("\n");
        sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
        sb.append("    low: ").append(toIndentedString(low)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
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
