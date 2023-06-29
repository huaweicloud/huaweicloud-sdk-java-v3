package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class RankETLFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_type")

    private String filterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_type")

    private String timeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_monday_first")

    private Boolean isMondayFirst;

    public RankETLFilter withFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * 行为去重方式： - abs_weight，权重绝对值 - date，日期
     * @return filterType
     */
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public RankETLFilter withTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }

    /**
     * 时间类型： - day，天 - week，周 - month，月 
     * @return timeType
     */
    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public RankETLFilter withIsMondayFirst(Boolean isMondayFirst) {
        this.isMondayFirst = isMondayFirst;
        return this;
    }

    /**
     * 周一是否是第一天。
     * @return isMondayFirst
     */
    public Boolean getIsMondayFirst() {
        return isMondayFirst;
    }

    public void setIsMondayFirst(Boolean isMondayFirst) {
        this.isMondayFirst = isMondayFirst;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RankETLFilter that = (RankETLFilter) obj;
        return Objects.equals(this.filterType, that.filterType) && Objects.equals(this.timeType, that.timeType)
            && Objects.equals(this.isMondayFirst, that.isMondayFirst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterType, timeType, isMondayFirst);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RankETLFilter {\n");
        sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
        sb.append("    timeType: ").append(toIndentedString(timeType)).append("\n");
        sb.append("    isMondayFirst: ").append(toIndentedString(isMondayFirst)).append("\n");
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
