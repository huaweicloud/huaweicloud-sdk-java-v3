package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessTopStatisticsVO
 */
public class AccessTopStatisticsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agg_time")

    private Long aggTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_access_top_counts")

    private Long denyAccessTopCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit_access_top_counts")

    private Long permitAccessTopCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_access_top_counts")

    private Long totalAccessTopCounts;

    public AccessTopStatisticsVO withAggTime(Long aggTime) {
        this.aggTime = aggTime;
        return this;
    }

    /**
     * **参数解释**： 聚合时间 **取值范围**： 不涉及
     * @return aggTime
     */
    public Long getAggTime() {
        return aggTime;
    }

    public void setAggTime(Long aggTime) {
        this.aggTime = aggTime;
    }

    public AccessTopStatisticsVO withDenyAccessTopCounts(Long denyAccessTopCounts) {
        this.denyAccessTopCounts = denyAccessTopCounts;
        return this;
    }

    /**
     * **参数解释**： 阻断数量 **取值范围**： 不涉及
     * @return denyAccessTopCounts
     */
    public Long getDenyAccessTopCounts() {
        return denyAccessTopCounts;
    }

    public void setDenyAccessTopCounts(Long denyAccessTopCounts) {
        this.denyAccessTopCounts = denyAccessTopCounts;
    }

    public AccessTopStatisticsVO withPermitAccessTopCounts(Long permitAccessTopCounts) {
        this.permitAccessTopCounts = permitAccessTopCounts;
        return this;
    }

    /**
     * **参数解释**： 放行数量 **取值范围**： 不涉及
     * @return permitAccessTopCounts
     */
    public Long getPermitAccessTopCounts() {
        return permitAccessTopCounts;
    }

    public void setPermitAccessTopCounts(Long permitAccessTopCounts) {
        this.permitAccessTopCounts = permitAccessTopCounts;
    }

    public AccessTopStatisticsVO withTotalAccessTopCounts(Long totalAccessTopCounts) {
        this.totalAccessTopCounts = totalAccessTopCounts;
        return this;
    }

    /**
     * **参数解释**： 命中次数 **取值范围**： 不涉及
     * @return totalAccessTopCounts
     */
    public Long getTotalAccessTopCounts() {
        return totalAccessTopCounts;
    }

    public void setTotalAccessTopCounts(Long totalAccessTopCounts) {
        this.totalAccessTopCounts = totalAccessTopCounts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessTopStatisticsVO that = (AccessTopStatisticsVO) obj;
        return Objects.equals(this.aggTime, that.aggTime)
            && Objects.equals(this.denyAccessTopCounts, that.denyAccessTopCounts)
            && Objects.equals(this.permitAccessTopCounts, that.permitAccessTopCounts)
            && Objects.equals(this.totalAccessTopCounts, that.totalAccessTopCounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggTime, denyAccessTopCounts, permitAccessTopCounts, totalAccessTopCounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessTopStatisticsVO {\n");
        sb.append("    aggTime: ").append(toIndentedString(aggTime)).append("\n");
        sb.append("    denyAccessTopCounts: ").append(toIndentedString(denyAccessTopCounts)).append("\n");
        sb.append("    permitAccessTopCounts: ").append(toIndentedString(permitAccessTopCounts)).append("\n");
        sb.append("    totalAccessTopCounts: ").append(toIndentedString(totalAccessTopCounts)).append("\n");
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
