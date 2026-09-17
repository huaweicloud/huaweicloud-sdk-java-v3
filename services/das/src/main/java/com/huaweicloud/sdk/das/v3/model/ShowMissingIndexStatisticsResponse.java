package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMissingIndexStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_missing_index_count")

    private Long totalMissingIndexCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_impact_gt80_count")

    private Long userImpactGt80Count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_day_accessed_count")

    private Long lastDayAccessedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_week_accessed_count")

    private Long lastWeekAccessedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_two_week_accessed_count")

    private Long lastTwoWeekAccessedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_month_accessed_count")

    private Long lastMonthAccessedCount;

    public ShowMissingIndexStatisticsResponse withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间（ms）
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public ShowMissingIndexStatisticsResponse withTotalMissingIndexCount(Long totalMissingIndexCount) {
        this.totalMissingIndexCount = totalMissingIndexCount;
        return this;
    }

    /**
     * 索引缺失总数
     * @return totalMissingIndexCount
     */
    public Long getTotalMissingIndexCount() {
        return totalMissingIndexCount;
    }

    public void setTotalMissingIndexCount(Long totalMissingIndexCount) {
        this.totalMissingIndexCount = totalMissingIndexCount;
    }

    public ShowMissingIndexStatisticsResponse withUserImpactGt80Count(Long userImpactGt80Count) {
        this.userImpactGt80Count = userImpactGt80Count;
        return this;
    }

    /**
     * 性能提示大于80%的数量
     * @return userImpactGt80Count
     */
    public Long getUserImpactGt80Count() {
        return userImpactGt80Count;
    }

    public void setUserImpactGt80Count(Long userImpactGt80Count) {
        this.userImpactGt80Count = userImpactGt80Count;
    }

    public ShowMissingIndexStatisticsResponse withLastDayAccessedCount(Long lastDayAccessedCount) {
        this.lastDayAccessedCount = lastDayAccessedCount;
        return this;
    }

    /**
     * 近1天用户访问条数
     * @return lastDayAccessedCount
     */
    public Long getLastDayAccessedCount() {
        return lastDayAccessedCount;
    }

    public void setLastDayAccessedCount(Long lastDayAccessedCount) {
        this.lastDayAccessedCount = lastDayAccessedCount;
    }

    public ShowMissingIndexStatisticsResponse withLastWeekAccessedCount(Long lastWeekAccessedCount) {
        this.lastWeekAccessedCount = lastWeekAccessedCount;
        return this;
    }

    /**
     * 近1周用户访问条数
     * @return lastWeekAccessedCount
     */
    public Long getLastWeekAccessedCount() {
        return lastWeekAccessedCount;
    }

    public void setLastWeekAccessedCount(Long lastWeekAccessedCount) {
        this.lastWeekAccessedCount = lastWeekAccessedCount;
    }

    public ShowMissingIndexStatisticsResponse withLastTwoWeekAccessedCount(Long lastTwoWeekAccessedCount) {
        this.lastTwoWeekAccessedCount = lastTwoWeekAccessedCount;
        return this;
    }

    /**
     * 近2周用户访问条数
     * @return lastTwoWeekAccessedCount
     */
    public Long getLastTwoWeekAccessedCount() {
        return lastTwoWeekAccessedCount;
    }

    public void setLastTwoWeekAccessedCount(Long lastTwoWeekAccessedCount) {
        this.lastTwoWeekAccessedCount = lastTwoWeekAccessedCount;
    }

    public ShowMissingIndexStatisticsResponse withLastMonthAccessedCount(Long lastMonthAccessedCount) {
        this.lastMonthAccessedCount = lastMonthAccessedCount;
        return this;
    }

    /**
     * 近1月用户访问条数
     * @return lastMonthAccessedCount
     */
    public Long getLastMonthAccessedCount() {
        return lastMonthAccessedCount;
    }

    public void setLastMonthAccessedCount(Long lastMonthAccessedCount) {
        this.lastMonthAccessedCount = lastMonthAccessedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMissingIndexStatisticsResponse that = (ShowMissingIndexStatisticsResponse) obj;
        return Objects.equals(this.collectTime, that.collectTime)
            && Objects.equals(this.totalMissingIndexCount, that.totalMissingIndexCount)
            && Objects.equals(this.userImpactGt80Count, that.userImpactGt80Count)
            && Objects.equals(this.lastDayAccessedCount, that.lastDayAccessedCount)
            && Objects.equals(this.lastWeekAccessedCount, that.lastWeekAccessedCount)
            && Objects.equals(this.lastTwoWeekAccessedCount, that.lastTwoWeekAccessedCount)
            && Objects.equals(this.lastMonthAccessedCount, that.lastMonthAccessedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectTime,
            totalMissingIndexCount,
            userImpactGt80Count,
            lastDayAccessedCount,
            lastWeekAccessedCount,
            lastTwoWeekAccessedCount,
            lastMonthAccessedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMissingIndexStatisticsResponse {\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    totalMissingIndexCount: ").append(toIndentedString(totalMissingIndexCount)).append("\n");
        sb.append("    userImpactGt80Count: ").append(toIndentedString(userImpactGt80Count)).append("\n");
        sb.append("    lastDayAccessedCount: ").append(toIndentedString(lastDayAccessedCount)).append("\n");
        sb.append("    lastWeekAccessedCount: ").append(toIndentedString(lastWeekAccessedCount)).append("\n");
        sb.append("    lastTwoWeekAccessedCount: ").append(toIndentedString(lastTwoWeekAccessedCount)).append("\n");
        sb.append("    lastMonthAccessedCount: ").append(toIndentedString(lastMonthAccessedCount)).append("\n");
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
