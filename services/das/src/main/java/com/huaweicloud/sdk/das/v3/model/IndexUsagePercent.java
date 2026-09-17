package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 索引使用百分比
 */
public class IndexUsagePercent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percent_le10_count")

    private Long percentLe10Count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percent10_to50_count")

    private Long percent10To50Count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percent50_to80_count")

    private Long percent50To80Count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percent_gl80_count")

    private Long percentGl80Count;

    public IndexUsagePercent withPercentLe10Count(Long percentLe10Count) {
        this.percentLe10Count = percentLe10Count;
        return this;
    }

    /**
     * 百分比小于等于10%的数量
     * @return percentLe10Count
     */
    public Long getPercentLe10Count() {
        return percentLe10Count;
    }

    public void setPercentLe10Count(Long percentLe10Count) {
        this.percentLe10Count = percentLe10Count;
    }

    public IndexUsagePercent withPercent10To50Count(Long percent10To50Count) {
        this.percent10To50Count = percent10To50Count;
        return this;
    }

    /**
     * 百分比大于10%小于等于50%的数量
     * @return percent10To50Count
     */
    public Long getPercent10To50Count() {
        return percent10To50Count;
    }

    public void setPercent10To50Count(Long percent10To50Count) {
        this.percent10To50Count = percent10To50Count;
    }

    public IndexUsagePercent withPercent50To80Count(Long percent50To80Count) {
        this.percent50To80Count = percent50To80Count;
        return this;
    }

    /**
     * 百分比大于50%小于等于80%的数量
     * @return percent50To80Count
     */
    public Long getPercent50To80Count() {
        return percent50To80Count;
    }

    public void setPercent50To80Count(Long percent50To80Count) {
        this.percent50To80Count = percent50To80Count;
    }

    public IndexUsagePercent withPercentGl80Count(Long percentGl80Count) {
        this.percentGl80Count = percentGl80Count;
        return this;
    }

    /**
     * 百分比大于80%的数量
     * @return percentGl80Count
     */
    public Long getPercentGl80Count() {
        return percentGl80Count;
    }

    public void setPercentGl80Count(Long percentGl80Count) {
        this.percentGl80Count = percentGl80Count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndexUsagePercent that = (IndexUsagePercent) obj;
        return Objects.equals(this.percentLe10Count, that.percentLe10Count)
            && Objects.equals(this.percent10To50Count, that.percent10To50Count)
            && Objects.equals(this.percent50To80Count, that.percent50To80Count)
            && Objects.equals(this.percentGl80Count, that.percentGl80Count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentLe10Count, percent10To50Count, percent50To80Count, percentGl80Count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndexUsagePercent {\n");
        sb.append("    percentLe10Count: ").append(toIndentedString(percentLe10Count)).append("\n");
        sb.append("    percent10To50Count: ").append(toIndentedString(percent10To50Count)).append("\n");
        sb.append("    percent50To80Count: ").append(toIndentedString(percent50To80Count)).append("\n");
        sb.append("    percentGl80Count: ").append(toIndentedString(percentGl80Count)).append("\n");
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
