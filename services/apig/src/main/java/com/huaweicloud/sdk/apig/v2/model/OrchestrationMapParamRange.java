package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数区间编排配置。
 */
public class OrchestrationMapParamRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_start")

    private String rangeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_end")

    private String rangeEnd;

    public OrchestrationMapParamRange withRangeStart(String rangeStart) {
        this.rangeStart = rangeStart;
        return this;
    }

    /**
     * 区间起始值。  为可以转换成integer的string，转换后的range_start的范围为0-9223372036854775807， range_start不大于range_end。
     * @return rangeStart
     */
    public String getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(String rangeStart) {
        this.rangeStart = rangeStart;
    }

    public OrchestrationMapParamRange withRangeEnd(String rangeEnd) {
        this.rangeEnd = rangeEnd;
        return this;
    }

    /**
     * 区间终止值。  为可以转换成integer的string，转换后的range_end的范围为0-9223372036854775807， range_start不大于range_end。
     * @return rangeEnd
     */
    public String getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(String rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrchestrationMapParamRange that = (OrchestrationMapParamRange) obj;
        return Objects.equals(this.rangeStart, that.rangeStart) && Objects.equals(this.rangeEnd, that.rangeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rangeStart, rangeEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrchestrationMapParamRange {\n");
        sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
        sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
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
